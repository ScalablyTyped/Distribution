package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioLogSetting extends StObject {
  
  var destination: AudioLogDestination
  
  /**
    * Determines whether audio logging in enabled for the bot.
    */
  var enabled: Boolean
}
object AudioLogSetting {
  
  inline def apply(destination: AudioLogDestination, enabled: Boolean): AudioLogSetting = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioLogSetting]
  }
  
  extension [Self <: AudioLogSetting](x: Self) {
    
    inline def setDestination(value: AudioLogDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
