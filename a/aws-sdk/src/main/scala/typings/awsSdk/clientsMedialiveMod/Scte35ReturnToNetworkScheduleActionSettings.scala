package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scte35ReturnToNetworkScheduleActionSettings extends StObject {
  
  /**
    * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
    */
  var SpliceEventId: longMin0Max4294967295
}
object Scte35ReturnToNetworkScheduleActionSettings {
  
  inline def apply(SpliceEventId: longMin0Max4294967295): Scte35ReturnToNetworkScheduleActionSettings = {
    val __obj = js.Dynamic.literal(SpliceEventId = SpliceEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35ReturnToNetworkScheduleActionSettings]
  }
  
  extension [Self <: Scte35ReturnToNetworkScheduleActionSettings](x: Self) {
    
    inline def setSpliceEventId(value: longMin0Max4294967295): Self = StObject.set(x, "SpliceEventId", value.asInstanceOf[js.Any])
  }
}
