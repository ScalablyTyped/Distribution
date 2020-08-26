package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a command.
  * @see XCommandProcessor
  */
@js.native
trait CommandInfo extends js.Object {
  /** contains the type of the command's argument. */
  var ArgType: `type` = js.native
  /**
    * contains an implementation specific handle for the command.
    *
    * It may be `-1` if the implementation has no handle.
    */
  var Handle: Double = js.native
  /** contains the name of a command. */
  var Name: String = js.native
}

object CommandInfo {
  @scala.inline
  def apply(ArgType: `type`, Handle: Double, Name: String): CommandInfo = {
    val __obj = js.Dynamic.literal(ArgType = ArgType.asInstanceOf[js.Any], Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandInfo]
  }
  @scala.inline
  implicit class CommandInfoOps[Self <: CommandInfo] (val x: Self) extends AnyVal {
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
    def setArgType(value: `type`): Self = this.set("ArgType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandle(value: Double): Self = this.set("Handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

