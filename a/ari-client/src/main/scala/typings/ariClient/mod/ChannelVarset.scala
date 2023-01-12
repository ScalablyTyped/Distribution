package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelVarset
  extends StObject
     with Event {
  
  /**
    * The channel on which the variable was set. If missing, the variable is a global variable.
    */
  var channel: js.UndefOr[Channel] = js.undefined
  
  /**
    * The new value of the variable.
    */
  var value: String
  
  /**
    * The variable that changed.
    */
  var variable: String
}
object ChannelVarset {
  
  inline def apply(application: String, timestamp: js.Date, `type`: String, value: String, variable: String): ChannelVarset = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelVarset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelVarset] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
