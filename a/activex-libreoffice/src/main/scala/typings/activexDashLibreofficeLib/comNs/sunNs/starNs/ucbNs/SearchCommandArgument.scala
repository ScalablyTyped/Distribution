package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument for the command "search".
  * @see XCommandProcessor
  */
trait SearchCommandArgument extends js.Object {
  /** the search criteria. */
  var Info: SearchInfo
  /** the properties for which values shall be provided through the {@link ContentResultSet} returned by the search command. */
  var Properties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property]
}

object SearchCommandArgument {
  @scala.inline
  def apply(
    Info: SearchInfo,
    Properties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property]
  ): SearchCommandArgument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Info")(Info)
    __obj.updateDynamic("Properties")(Properties)
    __obj.asInstanceOf[SearchCommandArgument]
  }
}

