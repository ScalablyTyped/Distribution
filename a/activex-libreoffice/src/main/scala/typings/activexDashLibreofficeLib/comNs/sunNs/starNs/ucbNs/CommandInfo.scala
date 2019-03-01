package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a command.
  * @see XCommandProcessor
  */
trait CommandInfo extends js.Object {
  /** contains the type of the command's argument. */
  var ArgType: activexDashLibreofficeLib.`type`
  /**
    * contains an implementation specific handle for the command.
    *
    * It may be `-1` if the implementation has no handle.
    */
  var Handle: scala.Double
  /** contains the name of a command. */
  var Name: java.lang.String
}

object CommandInfo {
  @scala.inline
  def apply(ArgType: activexDashLibreofficeLib.`type`, Handle: scala.Double, Name: java.lang.String): CommandInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ArgType")(ArgType)
    __obj.updateDynamic("Handle")(Handle)
    __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[CommandInfo]
  }
}

