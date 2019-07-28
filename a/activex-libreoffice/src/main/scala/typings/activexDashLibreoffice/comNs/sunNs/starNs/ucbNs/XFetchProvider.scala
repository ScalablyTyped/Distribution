package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the possibility to get the contents of the columns of several rows of a {@link ContentResultSet} with a single function call. */
trait XFetchProvider extends XInterface {
  /**
    * returns the contents of the columns of the indicated rows
    * @param nRowStartPosition the starting row of the result set
    * @param nRowCount the count of rows
    * @param bDirection `TRUE` , if you want the rows to be read in the same order, as they are contained in the result set ( `TRUE` <-> forward step; `FALSE`
    * @returns {@link FetchResult.Rows} contains a sequence of anys. Each of these anys contains a sequence of anys.
    */
  def fetch(nRowStartPosition: Double, nRowCount: Double, bDirection: Boolean): FetchResult
}

object XFetchProvider {
  @scala.inline
  def apply(
    acquire: () => Unit,
    fetch: (Double, Double, Boolean) => FetchResult,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFetchProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), fetch = js.Any.fromFunction3(fetch), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFetchProvider]
  }
}

