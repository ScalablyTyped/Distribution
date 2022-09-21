package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeVideoSourceChanged
  extends StObject
     with Event {
  
  /**
    * Bridge.
    */
  var bridge: Bridge
  
  /**
    * Old_video_source_id.
    */
  var old_video_source_id: js.UndefOr[String] = js.undefined
}
object BridgeVideoSourceChanged {
  
  inline def apply(application: String, bridge: Bridge, timestamp: js.Date, `type`: String): BridgeVideoSourceChanged = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeVideoSourceChanged]
  }
  
  extension [Self <: BridgeVideoSourceChanged](x: Self) {
    
    inline def setBridge(value: Bridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    inline def setOld_video_source_id(value: String): Self = StObject.set(x, "old_video_source_id", value.asInstanceOf[js.Any])
    
    inline def setOld_video_source_idUndefined: Self = StObject.set(x, "old_video_source_id", js.undefined)
  }
}
