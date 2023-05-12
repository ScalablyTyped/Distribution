package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelCardExportJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model card export job.
    */
  var ModelCardExportJobArn: typings.awsSdk.clientsSagemakerMod.ModelCardExportJobArn
}
object CreateModelCardExportJobResponse {
  
  inline def apply(ModelCardExportJobArn: ModelCardExportJobArn): CreateModelCardExportJobResponse = {
    val __obj = js.Dynamic.literal(ModelCardExportJobArn = ModelCardExportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelCardExportJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateModelCardExportJobResponse] (val x: Self) extends AnyVal {
    
    inline def setModelCardExportJobArn(value: ModelCardExportJobArn): Self = StObject.set(x, "ModelCardExportJobArn", value.asInstanceOf[js.Any])
  }
}
