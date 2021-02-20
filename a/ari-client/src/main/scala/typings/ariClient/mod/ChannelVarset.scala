package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelVarset extends Event {
  
  /**
    * The channel on which the variable was set. If missing, the variable is a global variable.
    */
  var channel: js.UndefOr[Channel] = js.native
  
  /**
    * The new value of the variable.
    */
  var value: String = js.native
  
  /**
    * The variable that changed.
    */
  var variable: String = js.native
}
object ChannelVarset {
  
  @scala.inline
  def apply(application: String, timestamp: Date, `type`: String, value: String, variable: String): ChannelVarset = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelVarset]
  }
  
  @scala.inline
  implicit class ChannelVarsetMutableBuilder[Self <: ChannelVarset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
