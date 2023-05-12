package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelCardExportOutputConfig extends StObject {
  
  /**
    * The Amazon S3 output path to export your model card PDF.
    */
  var S3OutputPath: S3Uri
}
object ModelCardExportOutputConfig {
  
  inline def apply(S3OutputPath: S3Uri): ModelCardExportOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelCardExportOutputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelCardExportOutputConfig] (val x: Self) extends AnyVal {
    
    inline def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
  }
}
