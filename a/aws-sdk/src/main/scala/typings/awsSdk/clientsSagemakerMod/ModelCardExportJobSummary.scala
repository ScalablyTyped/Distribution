package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelCardExportJobSummary extends StObject {
  
  /**
    * The date and time that the model card export job was created.
    */
  var CreatedAt: js.Date
  
  /**
    * The date and time that the model card export job was last modified..
    */
  var LastModifiedAt: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the model card export job.
    */
  var ModelCardExportJobArn: typings.awsSdk.clientsSagemakerMod.ModelCardExportJobArn
  
  /**
    * The name of the model card export job.
    */
  var ModelCardExportJobName: EntityName
  
  /**
    * The name of the model card that the export job exports.
    */
  var ModelCardName: EntityName
  
  /**
    * The version of the model card that the export job exports.
    */
  var ModelCardVersion: Integer
  
  /**
    * The completion status of the model card export job.
    */
  var Status: ModelCardExportJobStatus
}
object ModelCardExportJobSummary {
  
  inline def apply(
    CreatedAt: js.Date,
    LastModifiedAt: js.Date,
    ModelCardExportJobArn: ModelCardExportJobArn,
    ModelCardExportJobName: EntityName,
    ModelCardName: EntityName,
    ModelCardVersion: Integer,
    Status: ModelCardExportJobStatus
  ): ModelCardExportJobSummary = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], LastModifiedAt = LastModifiedAt.asInstanceOf[js.Any], ModelCardExportJobArn = ModelCardExportJobArn.asInstanceOf[js.Any], ModelCardExportJobName = ModelCardExportJobName.asInstanceOf[js.Any], ModelCardName = ModelCardName.asInstanceOf[js.Any], ModelCardVersion = ModelCardVersion.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelCardExportJobSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelCardExportJobSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "LastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setModelCardExportJobArn(value: ModelCardExportJobArn): Self = StObject.set(x, "ModelCardExportJobArn", value.asInstanceOf[js.Any])
    
    inline def setModelCardExportJobName(value: EntityName): Self = StObject.set(x, "ModelCardExportJobName", value.asInstanceOf[js.Any])
    
    inline def setModelCardName(value: EntityName): Self = StObject.set(x, "ModelCardName", value.asInstanceOf[js.Any])
    
    inline def setModelCardVersion(value: Integer): Self = StObject.set(x, "ModelCardVersion", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ModelCardExportJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
