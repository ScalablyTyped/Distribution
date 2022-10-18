package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoSelectorSettings extends StObject {
  
  var VideoSelectorPid: js.UndefOr[typings.awsSdk.clientsMedialiveMod.VideoSelectorPid] = js.undefined
  
  var VideoSelectorProgramId: js.UndefOr[typings.awsSdk.clientsMedialiveMod.VideoSelectorProgramId] = js.undefined
}
object VideoSelectorSettings {
  
  inline def apply(): VideoSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelectorSettings]
  }
  
  extension [Self <: VideoSelectorSettings](x: Self) {
    
    inline def setVideoSelectorPid(value: VideoSelectorPid): Self = StObject.set(x, "VideoSelectorPid", value.asInstanceOf[js.Any])
    
    inline def setVideoSelectorPidUndefined: Self = StObject.set(x, "VideoSelectorPid", js.undefined)
    
    inline def setVideoSelectorProgramId(value: VideoSelectorProgramId): Self = StObject.set(x, "VideoSelectorProgramId", value.asInstanceOf[js.Any])
    
    inline def setVideoSelectorProgramIdUndefined: Self = StObject.set(x, "VideoSelectorProgramId", js.undefined)
  }
}
