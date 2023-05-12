package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelCardExportArtifacts extends StObject {
  
  /**
    * The Amazon S3 URI of the exported model artifacts.
    */
  var S3ExportArtifacts: S3Uri
}
object ModelCardExportArtifacts {
  
  inline def apply(S3ExportArtifacts: S3Uri): ModelCardExportArtifacts = {
    val __obj = js.Dynamic.literal(S3ExportArtifacts = S3ExportArtifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelCardExportArtifacts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelCardExportArtifacts] (val x: Self) extends AnyVal {
    
    inline def setS3ExportArtifacts(value: S3Uri): Self = StObject.set(x, "S3ExportArtifacts", value.asInstanceOf[js.Any])
  }
}
