package typings.awsSdk.clientsQldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSessionResult extends StObject {
  
  /**
    * Session token of the started session. This SessionToken is required for every subsequent command that is issued during the current session.
    */
  var SessionToken: js.UndefOr[typings.awsSdk.clientsQldbsessionMod.SessionToken] = js.undefined
  
  /**
    * Contains server-side performance information for the command.
    */
  var TimingInformation: js.UndefOr[typings.awsSdk.clientsQldbsessionMod.TimingInformation] = js.undefined
}
object StartSessionResult {
  
  inline def apply(): StartSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSessionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSessionResult] (val x: Self) extends AnyVal {
    
    inline def setSessionToken(value: SessionToken): Self = StObject.set(x, "SessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "SessionToken", js.undefined)
    
    inline def setTimingInformation(value: TimingInformation): Self = StObject.set(x, "TimingInformation", value.asInstanceOf[js.Any])
    
    inline def setTimingInformationUndefined: Self = StObject.set(x, "TimingInformation", js.undefined)
  }
}
