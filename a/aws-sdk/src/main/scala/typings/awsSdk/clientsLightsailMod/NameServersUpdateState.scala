package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameServersUpdateState extends StObject {
  
  /**
    * The status code for the name servers update. Following are the possible values:    SUCCEEDED - The name server records were successfully updated.    PENDING - The name server record update is in progress.    FAILED - The name server record update failed.    STARTED - The automatic name server record update started.  
    */
  var code: js.UndefOr[NameServersUpdateStateCode] = js.undefined
  
  /**
    * The message that describes the reason for the status code.
    */
  var message: js.UndefOr[String] = js.undefined
}
object NameServersUpdateState {
  
  inline def apply(): NameServersUpdateState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameServersUpdateState]
  }
  
  extension [Self <: NameServersUpdateState](x: Self) {
    
    inline def setCode(value: NameServersUpdateStateCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
