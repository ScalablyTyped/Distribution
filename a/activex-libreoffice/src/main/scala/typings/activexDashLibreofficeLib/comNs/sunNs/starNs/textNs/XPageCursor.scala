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

object XPageCursor {
  @scala.inline
  def apply(
    Page: scala.Double,
    acquire: () => scala.Unit,
    getPage: () => scala.Double,
    jumpToEndOfPage: () => scala.Boolean,
    jumpToFirstPage: () => scala.Boolean,
    jumpToLastPage: () => scala.Boolean,
    jumpToNextPage: () => scala.Boolean,
    jumpToPage: scala.Double => scala.Boolean,
    jumpToPreviousPage: () => scala.Boolean,
    jumpToStartOfPage: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XPageCursor = {
    val __obj = js.Dynamic.literal(Page = Page, acquire = js.Any.fromFunction0(acquire), getPage = js.Any.fromFunction0(getPage), jumpToEndOfPage = js.Any.fromFunction0(jumpToEndOfPage), jumpToFirstPage = js.Any.fromFunction0(jumpToFirstPage), jumpToLastPage = js.Any.fromFunction0(jumpToLastPage), jumpToNextPage = js.Any.fromFunction0(jumpToNextPage), jumpToPage = js.Any.fromFunction1(jumpToPage), jumpToPreviousPage = js.Any.fromFunction0(jumpToPreviousPage), jumpToStartOfPage = js.Any.fromFunction0(jumpToStartOfPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPageCursor]
  }
}

