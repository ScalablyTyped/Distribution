package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a command which can be send to a generic toolbar control.
  * @since OOo 2.0.3
  */
trait ControlCommand extends js.Object {
  /**
    * specifies a sequence of named values which are used as argument for the command. The number and type of arguments depend on the the command and
    * control.
    */
  var Arguments: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  /** specifies the command which should be processed by the toolbar control. */
  var Command: java.lang.String
}

object ControlCommand {
  @scala.inline
  def apply(
    Arguments: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    Command: java.lang.String
  ): ControlCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Arguments")(Arguments)
    __obj.updateDynamic("Command")(Command)
    __obj.asInstanceOf[ControlCommand]
  }
}

