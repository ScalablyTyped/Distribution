package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoSelectorPid extends StObject {
  
  /**
    * Selects a specific PID from within a video source.
    */
  var Pid: js.UndefOr[integerMin0Max8191] = js.undefined
}
object VideoSelectorPid {
  
  inline def apply(): VideoSelectorPid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelectorPid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoSelectorPid] (val x: Self) extends AnyVal {
    
    inline def setPid(value: integerMin0Max8191): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "Pid", js.undefined)
  }
}
