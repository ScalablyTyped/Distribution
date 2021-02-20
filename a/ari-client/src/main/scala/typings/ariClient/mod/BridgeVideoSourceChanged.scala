package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BridgeVideoSourceChanged extends Event {
  
  /**
    * Bridge.
    */
  var bridge: Bridge = js.native
  
  /**
    * Old_video_source_id.
    */
  var old_video_source_id: js.UndefOr[String] = js.native
}
object BridgeVideoSourceChanged {
  
  @scala.inline
  def apply(application: String, bridge: Bridge, timestamp: Date, `type`: String): BridgeVideoSourceChanged = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeVideoSourceChanged]
  }
  
  @scala.inline
  implicit class BridgeVideoSourceChangedMutableBuilder[Self <: BridgeVideoSourceChanged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridge(value: Bridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOld_video_source_id(value: String): Self = StObject.set(x, "old_video_source_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOld_video_source_idUndefined: Self = StObject.set(x, "old_video_source_id", js.undefined)
  }
}
