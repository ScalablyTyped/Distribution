package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelCardExportJobRequest extends StObject {
  
  /**
    * The name of the model card export job.
    */
  var ModelCardExportJobName: EntityName
  
  /**
    * The name of the model card to export.
    */
  var ModelCardName: EntityName
  
  /**
    * The version of the model card to export. If a version is not provided, then the latest version of the model card is exported.
    */
  var ModelCardVersion: js.UndefOr[Integer] = js.undefined
  
  /**
    * The model card output configuration that specifies the Amazon S3 path for exporting.
    */
  var OutputConfig: ModelCardExportOutputConfig
}
object CreateModelCardExportJobRequest {
  
  inline def apply(
    ModelCardExportJobName: EntityName,
    ModelCardName: EntityName,
    OutputConfig: ModelCardExportOutputConfig
  ): CreateModelCardExportJobRequest = {
    val __obj = js.Dynamic.literal(ModelCardExportJobName = ModelCardExportJobName.asInstanceOf[js.Any], ModelCardName = ModelCardName.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelCardExportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateModelCardExportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setModelCardExportJobName(value: EntityName): Self = StObject.set(x, "ModelCardExportJobName", value.asInstanceOf[js.Any])
    
    inline def setModelCardName(value: EntityName): Self = StObject.set(x, "ModelCardName", value.asInstanceOf[js.Any])
    
    inline def setModelCardVersion(value: Integer): Self = StObject.set(x, "ModelCardVersion", value.asInstanceOf[js.Any])
    
    inline def setModelCardVersionUndefined: Self = StObject.set(x, "ModelCardVersion", js.undefined)
    
    inline def setOutputConfig(value: ModelCardExportOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
  }
}
