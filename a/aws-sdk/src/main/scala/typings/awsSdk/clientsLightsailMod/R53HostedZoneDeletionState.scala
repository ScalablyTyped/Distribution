package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R53HostedZoneDeletionState extends StObject {
  
  /**
    * The status code for the deletion state. Following are the possible values:    SUCCEEDED - The hosted zone was successfully deleted.    PENDING - The hosted zone deletion is in progress.    FAILED - The hosted zone deletion failed.    STARTED - The hosted zone deletion started.  
    */
  var code: js.UndefOr[R53HostedZoneDeletionStateCode] = js.undefined
  
  /**
    * The message that describes the reason for the status code.
    */
  var message: js.UndefOr[String] = js.undefined
}
object R53HostedZoneDeletionState {
  
  inline def apply(): R53HostedZoneDeletionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[R53HostedZoneDeletionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R53HostedZoneDeletionState] (val x: Self) extends AnyVal {
    
    inline def setCode(value: R53HostedZoneDeletionStateCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
