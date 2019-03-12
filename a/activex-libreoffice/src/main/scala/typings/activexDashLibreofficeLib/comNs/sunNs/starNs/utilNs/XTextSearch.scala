package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables an object to search in its content. */
trait XTextSearch
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * search backward in the searchStr, starts at startPos and ends by endpos. The endpos must be lower then the startpos, because the function searches
    * backward! The result is returned in the {@link SearchResult} .
    */
  def searchBackward(searchStr: java.lang.String, startPos: scala.Double, endPos: scala.Double): SearchResult
  /** search forward in the searchStr, starts at startPos and ends by endpos. The result is returned in the {@link SearchResult} . */
  def searchForward(searchStr: java.lang.String, startPos: scala.Double, endPos: scala.Double): SearchResult
  /** set the options for the forward or backward search. */
  def setOptions(options: SearchOptions): scala.Unit
}

object XTextSearch {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    searchBackward: (java.lang.String, scala.Double, scala.Double) => SearchResult,
    searchForward: (java.lang.String, scala.Double, scala.Double) => SearchResult,
    setOptions: SearchOptions => scala.Unit
  ): XTextSearch = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), searchBackward = js.Any.fromFunction3(searchBackward), searchForward = js.Any.fromFunction3(searchForward), setOptions = js.Any.fromFunction1(setOptions))
  
    __obj.asInstanceOf[XTextSearch]
  }
}

