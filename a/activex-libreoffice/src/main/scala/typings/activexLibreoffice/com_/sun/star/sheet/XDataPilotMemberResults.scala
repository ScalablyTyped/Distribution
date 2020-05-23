package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
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
trait XDataPilotMemberResults extends XInterface {
  /** returns the sequence of results for the regarding data pilot source level. */
  val Results: SafeArray[MemberResult]
  /** returns the sequence of results for the regarding data pilot source level. */
  def getResults(): SafeArray[MemberResult]
}

object XDataPilotMemberResults {
  @scala.inline
  def apply(
    Results: SafeArray[MemberResult],
    acquire: () => Unit,
    getResults: () => SafeArray[MemberResult],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataPilotMemberResults = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getResults = js.Any.fromFunction0(getResults), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataPilotMemberResults]
  }
}

