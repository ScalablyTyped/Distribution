package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables an object to search in its content. */
trait XTextSearch extends XInterface {
  /**
    * search backward in the searchStr, starts at startPos and ends by endpos. The endpos must be lower then the startpos, because the function searches
    * backward! The result is returned in the {@link SearchResult} .
    */
  def searchBackward(searchStr: String, startPos: Double, endPos: Double): SearchResult
  /** search forward in the searchStr, starts at startPos and ends by endpos. The result is returned in the {@link SearchResult} . */
  def searchForward(searchStr: String, startPos: Double, endPos: Double): SearchResult
  /** set the options for the forward or backward search. */
  def setOptions(options: SearchOptions): Unit
}

object XTextSearch {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    searchBackward: (String, Double, Double) => SearchResult,
    searchForward: (String, Double, Double) => SearchResult,
    setOptions: SearchOptions => Unit
  ): XTextSearch = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), searchBackward = js.Any.fromFunction3(searchBackward), searchForward = js.Any.fromFunction3(searchForward), setOptions = js.Any.fromFunction1(setOptions))
  
    __obj.asInstanceOf[XTextSearch]
  }
}

