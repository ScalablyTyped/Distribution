package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugSession extends StObject {
  
  /**
    * Specifies if session debugging is enabled for this build.
    */
  var sessionEnabled: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * Contains the identifier of the Session Manager session used for the build. To work with the paused build, you open this session to examine, control, and resume the build.
    */
  var sessionTarget: js.UndefOr[NonEmptyString] = js.undefined
}
object DebugSession {
  
  inline def apply(): DebugSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugSession]
  }
  
  extension [Self <: DebugSession](x: Self) {
    
    inline def setSessionEnabled(value: WrapperBoolean): Self = StObject.set(x, "sessionEnabled", value.asInstanceOf[js.Any])
    
    inline def setSessionEnabledUndefined: Self = StObject.set(x, "sessionEnabled", js.undefined)
    
    inline def setSessionTarget(value: NonEmptyString): Self = StObject.set(x, "sessionTarget", value.asInstanceOf[js.Any])
    
    inline def setSessionTargetUndefined: Self = StObject.set(x, "sessionTarget", js.undefined)
  }
}
