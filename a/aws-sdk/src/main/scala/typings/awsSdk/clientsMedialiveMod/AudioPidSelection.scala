package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioPidSelection extends StObject {
  
  /**
    * Selects a specific PID from within a source.
    */
  var Pid: integerMin0Max8191
}
object AudioPidSelection {
  
  inline def apply(Pid: integerMin0Max8191): AudioPidSelection = {
    val __obj = js.Dynamic.literal(Pid = Pid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPidSelection]
  }
  
  extension [Self <: AudioPidSelection](x: Self) {
    
    inline def setPid(value: integerMin0Max8191): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
  }
}
