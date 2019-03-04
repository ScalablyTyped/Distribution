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
    acquire: js.Function0[scala.Unit],
    getPage: js.Function0[scala.Double],
    jumpToEndOfPage: js.Function0[scala.Boolean],
    jumpToFirstPage: js.Function0[scala.Boolean],
    jumpToLastPage: js.Function0[scala.Boolean],
    jumpToNextPage: js.Function0[scala.Boolean],
    jumpToPage: js.Function1[scala.Double, scala.Boolean],
    jumpToPreviousPage: js.Function0[scala.Boolean],
    jumpToStartOfPage: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPageCursor = {
    val __obj = js.Dynamic.literal(Page = Page, acquire = acquire, getPage = getPage, jumpToEndOfPage = jumpToEndOfPage, jumpToFirstPage = jumpToFirstPage, jumpToLastPage = jumpToLastPage, jumpToNextPage = jumpToNextPage, jumpToPage = jumpToPage, jumpToPreviousPage = jumpToPreviousPage, jumpToStartOfPage = jumpToStartOfPage, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XPageCursor]
  }
}

