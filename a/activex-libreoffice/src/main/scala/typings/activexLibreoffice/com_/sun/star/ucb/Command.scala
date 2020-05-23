package typings.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains a command.
  * @see XCommandProcessor
  */
trait Command extends js.Object {
  /** contains the argument of the command */
  var Argument: js.Any
  /**
    * contains an implementation specific handle for the command.
    *
    * It must be `-1` if the implementation has no handle. `0` is a valid command handle.
    */
  var Handle: Double
  /** contains the name of the command. */
  var Name: String
}

object Command {
  @scala.inline
  def apply(Argument: js.Any, Handle: Double, Name: String): Command = {
    val __obj = js.Dynamic.literal(Argument = Argument.asInstanceOf[js.Any], Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

