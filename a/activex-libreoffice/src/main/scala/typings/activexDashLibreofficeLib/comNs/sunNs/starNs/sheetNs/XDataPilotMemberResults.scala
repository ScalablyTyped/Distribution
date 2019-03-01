package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a sequence of results of a data pilot source level.
  *
  * These results are used to fill the data area for the level in a data pilot table.
  * @see com.sun.star.sheet.DataPilotSourceLevel
  * @see com.sun.star.sheet.DataPilotSource
  * @see com.sun.star.sheet.XDataPilotResults
  */
trait XDataPilotMemberResults
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the sequence of results for the regarding data pilot source level. */
  val Results: activexDashInteropLib.SafeArray[MemberResult]
  /** returns the sequence of results for the regarding data pilot source level. */
  def getResults(): activexDashInteropLib.SafeArray[MemberResult]
}

object XDataPilotMemberResults {
  @scala.inline
  def apply(
    Results: activexDashInteropLib.SafeArray[MemberResult],
    acquire: js.Function0[scala.Unit],
    getResults: js.Function0[activexDashInteropLib.SafeArray[MemberResult]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDataPilotMemberResults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Results")(Results)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getResults")(getResults)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDataPilotMemberResults]
  }
}

