package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a command which can be send to a generic toolbar control.
  * @since OOo 2.0.3
  */
@js.native
trait ControlCommand extends js.Object {
  
  /**
    * specifies a sequence of named values which are used as argument for the command. The number and type of arguments depend on the the command and
    * control.
    */
  var Arguments: SafeArray[NamedValue] = js.native
  
  /** specifies the command which should be processed by the toolbar control. */
  var Command: String = js.native
}
object ControlCommand {
  
  @scala.inline
  def apply(Arguments: SafeArray[NamedValue], Command: String): ControlCommand = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlCommand]
  }
  
  @scala.inline
  implicit class ControlCommandOps[Self <: ControlCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArguments(value: SafeArray[NamedValue]): Self = this.set("Arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: String): Self = this.set("Command", value.asInstanceOf[js.Any])
  }
}
