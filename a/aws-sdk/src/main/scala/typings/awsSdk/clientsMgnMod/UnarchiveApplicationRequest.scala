package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnarchiveApplicationRequest extends StObject {
  
  /**
    * Application ID.
    */
  var applicationID: ApplicationID
}
object UnarchiveApplicationRequest {
  
  inline def apply(applicationID: ApplicationID): UnarchiveApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationID = applicationID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnarchiveApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnarchiveApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationID(value: ApplicationID): Self = StObject.set(x, "applicationID", value.asInstanceOf[js.Any])
  }
}
