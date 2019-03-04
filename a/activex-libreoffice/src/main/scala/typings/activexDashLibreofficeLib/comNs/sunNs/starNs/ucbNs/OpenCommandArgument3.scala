package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extended argument for commands like "open"
  *
  * We're extending {@link OpenCommandArgument} even more, to provide some opening flags on to webdav.
  * @see XCommandProcessor
  */
trait OpenCommandArgument3 extends OpenCommandArgument2 {
  /**
    * Flags to use for opening.
    *
    * WebDav e.g. uses "KeepAlive" to enable/disable the respective http feature.
    */
  var OpeningFlags: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
}

object OpenCommandArgument3 {
  @scala.inline
  def apply(
    Mode: scala.Double,
    OpeningFlags: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    Priority: scala.Double,
    Properties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    Sink: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    SortingInfo: activexDashInteropLib.SafeArray[NumberedSortingInfo]
  ): OpenCommandArgument3 = {
    val __obj = js.Dynamic.literal(Mode = Mode, OpeningFlags = OpeningFlags, Priority = Priority, Properties = Properties, Sink = Sink, SortingInfo = SortingInfo)
  
    __obj.asInstanceOf[OpenCommandArgument3]
  }
}

