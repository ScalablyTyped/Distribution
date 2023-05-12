package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveApplicationRequest extends StObject {
  
  /**
    * Application ID.
    */
  var applicationID: ApplicationID
}
object ArchiveApplicationRequest {
  
  inline def apply(applicationID: ApplicationID): ArchiveApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationID = applicationID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArchiveApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationID(value: ApplicationID): Self = StObject.set(x, "applicationID", value.asInstanceOf[js.Any])
  }
}
