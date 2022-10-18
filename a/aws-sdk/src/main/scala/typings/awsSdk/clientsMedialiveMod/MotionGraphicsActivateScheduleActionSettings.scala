package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionGraphicsActivateScheduleActionSettings extends StObject {
  
  /**
    * Duration (in milliseconds) that motion graphics should render on to the video stream. Leaving out this property or setting to 0 will result in rendering continuing until a deactivate action is processed.
    */
  var Duration: js.UndefOr[longMin0Max86400000] = js.undefined
  
  /**
    * Key used to extract the password from EC2 Parameter store
    */
  var PasswordParam: js.UndefOr[string] = js.undefined
  
  /**
    * URI of the HTML5 content to be rendered into the live stream.
    */
  var Url: js.UndefOr[string] = js.undefined
  
  /**
    * Documentation update needed
    */
  var Username: js.UndefOr[string] = js.undefined
}
object MotionGraphicsActivateScheduleActionSettings {
  
  inline def apply(): MotionGraphicsActivateScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionGraphicsActivateScheduleActionSettings]
  }
  
  extension [Self <: MotionGraphicsActivateScheduleActionSettings](x: Self) {
    
    inline def setDuration(value: longMin0Max86400000): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setPasswordParam(value: string): Self = StObject.set(x, "PasswordParam", value.asInstanceOf[js.Any])
    
    inline def setPasswordParamUndefined: Self = StObject.set(x, "PasswordParam", js.undefined)
    
    inline def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    inline def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
