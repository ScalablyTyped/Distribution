package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to perform cursor movements between pages. */
trait XPageCursor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the number of the page within the document of this cursor. */
  val Page: scala.Double
  /** @returns the number of the page within the document of this cursor. */
  def getPage(): scala.Double
  /**
    * moves the cursor to the end of the current page.
    * @see XPageCursor.jumpToEndOfPreviousPage
    */
  def jumpToEndOfPage(): scala.Boolean
  /** moves the cursor to the first page. */
  def jumpToFirstPage(): scala.Boolean
  /** moves the cursor to the last page. */
  def jumpToLastPage(): scala.Boolean
  /**
    * moves the cursor to the next page.
    * @see XPageCursor.jumpToPreviousPage
    */
  def jumpToNextPage(): scala.Boolean
  /** moves the cursor to the specified page. */
  def jumpToPage(nPage: scala.Double): scala.Boolean
  /**
    * moves the cursor to the previous page.
    * @see XPageCursor.jumpToNextPage
    */
  def jumpToPreviousPage(): scala.Boolean
  /** moves the cursor to the start of the current page. */
  def jumpToStartOfPage(): scala.Boolean
}

