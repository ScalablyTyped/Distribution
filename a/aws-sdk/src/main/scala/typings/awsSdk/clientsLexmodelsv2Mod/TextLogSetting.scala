package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextLogSetting extends StObject {
  
  var destination: TextLogDestination
  
  /**
    * Determines whether conversation logs should be stored for an alias.
    */
  var enabled: Boolean
}
object TextLogSetting {
  
  inline def apply(destination: TextLogDestination, enabled: Boolean): TextLogSetting = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLogSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextLogSetting] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: TextLogDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
