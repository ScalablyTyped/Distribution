package typings.awsSdk.clientsMediastoredataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObjectRequest extends StObject {
  
  /**
    * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt;
    */
  var Path: PathNaming
}
object DeleteObjectRequest {
  
  inline def apply(Path: PathNaming): DeleteObjectRequest = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteObjectRequest] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PathNaming): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
  }
}
