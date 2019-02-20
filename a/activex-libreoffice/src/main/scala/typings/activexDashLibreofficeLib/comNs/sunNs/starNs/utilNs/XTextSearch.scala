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

