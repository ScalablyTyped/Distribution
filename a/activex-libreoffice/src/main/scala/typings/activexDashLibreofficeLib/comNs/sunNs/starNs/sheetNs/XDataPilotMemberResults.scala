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
  val Results: stdLib.SafeArray[MemberResult]
  /** returns the sequence of results for the regarding data pilot source level. */
  def getResults(): stdLib.SafeArray[MemberResult]
}

object XDataPilotMemberResults {
  @scala.inline
  def apply(
    Results: stdLib.SafeArray[MemberResult],
    acquire: () => scala.Unit,
    getResults: () => stdLib.SafeArray[MemberResult],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDataPilotMemberResults = {
    val __obj = js.Dynamic.literal(Results = Results, acquire = js.Any.fromFunction0(acquire), getResults = js.Any.fromFunction0(getResults), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataPilotMemberResults]
  }
}

