package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateApplicationsRequest extends StObject {
  
  /**
    * Application IDs list.
    */
  var applicationIDs: ApplicationIDs
  
  /**
    * Wave ID.
    */
  var waveID: WaveID
}
object AssociateApplicationsRequest {
  
  inline def apply(applicationIDs: ApplicationIDs, waveID: WaveID): AssociateApplicationsRequest = {
    val __obj = js.Dynamic.literal(applicationIDs = applicationIDs.asInstanceOf[js.Any], waveID = waveID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateApplicationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateApplicationsRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationIDs(value: ApplicationIDs): Self = StObject.set(x, "applicationIDs", value.asInstanceOf[js.Any])
    
    inline def setApplicationIDsVarargs(value: ApplicationID*): Self = StObject.set(x, "applicationIDs", js.Array(value*))
    
    inline def setWaveID(value: WaveID): Self = StObject.set(x, "waveID", value.asInstanceOf[js.Any])
  }
}
