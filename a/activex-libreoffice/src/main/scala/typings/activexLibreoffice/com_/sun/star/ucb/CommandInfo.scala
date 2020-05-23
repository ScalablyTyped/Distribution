package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a command.
  * @see XCommandProcessor
  */
trait CommandInfo extends js.Object {
  /** contains the type of the command's argument. */
  var ArgType: `type`
  /**
    * contains an implementation specific handle for the command.
    *
    * It may be `-1` if the implementation has no handle.
    */
  var Handle: Double
  /** contains the name of a command. */
  var Name: String
}

object CommandInfo {
  @scala.inline
  def apply(ArgType: `type`, Handle: Double, Name: String): CommandInfo = {
    val __obj = js.Dynamic.literal(ArgType = ArgType.asInstanceOf[js.Any], Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandInfo]
  }
}

