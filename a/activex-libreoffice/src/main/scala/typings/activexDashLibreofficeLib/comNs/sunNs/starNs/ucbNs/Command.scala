package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

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
  var Handle: scala.Double
  /** contains the name of the command. */
  var Name: java.lang.String
}

object Command {
  @scala.inline
  def apply(Argument: js.Any, Handle: scala.Double, Name: java.lang.String): Command = {
    val __obj = js.Dynamic.literal(Argument = Argument, Handle = Handle, Name = Name)
  
    __obj.asInstanceOf[Command]
  }
}

