package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobManifestResult extends StObject {
  
  /**
    * The Amazon S3 presigned URL for the manifest file associated with the specified JobId value.
    */
  var ManifestURI: js.UndefOr[String] = js.undefined
}
object GetJobManifestResult {
  
  inline def apply(): GetJobManifestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobManifestResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJobManifestResult] (val x: Self) extends AnyVal {
    
    inline def setManifestURI(value: String): Self = StObject.set(x, "ManifestURI", value.asInstanceOf[js.Any])
    
    inline def setManifestURIUndefined: Self = StObject.set(x, "ManifestURI", js.undefined)
  }
}
