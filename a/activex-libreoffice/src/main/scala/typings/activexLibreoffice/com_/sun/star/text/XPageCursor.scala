package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to perform cursor movements between pages. */
trait XPageCursor
  extends StObject
     with XInterface {
  
  /** @returns the number of the page within the document of this cursor. */
  val Page: Double
  
  /** @returns the number of the page within the document of this cursor. */
  def getPage(): Double
  
  /**
    * moves the cursor to the end of the current page.
    * @see XPageCursor.jumpToEndOfPreviousPage
    */
  def jumpToEndOfPage(): Boolean
  
  /** moves the cursor to the first page. */
  def jumpToFirstPage(): Boolean
  
  /** moves the cursor to the last page. */
  def jumpToLastPage(): Boolean
  
  /**
    * moves the cursor to the next page.
    * @see XPageCursor.jumpToPreviousPage
    */
  def jumpToNextPage(): Boolean
  
  /** moves the cursor to the specified page. */
  def jumpToPage(nPage: Double): Boolean
  
  /**
    * moves the cursor to the previous page.
    * @see XPageCursor.jumpToNextPage
    */
  def jumpToPreviousPage(): Boolean
  
  /** moves the cursor to the start of the current page. */
  def jumpToStartOfPage(): Boolean
}
object XPageCursor {
  
  inline def apply(
    Page: Double,
    acquire: () => Unit,
    getPage: () => Double,
    jumpToEndOfPage: () => Boolean,
    jumpToFirstPage: () => Boolean,
    jumpToLastPage: () => Boolean,
    jumpToNextPage: () => Boolean,
    jumpToPage: Double => Boolean,
    jumpToPreviousPage: () => Boolean,
    jumpToStartOfPage: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPageCursor = {
    val __obj = js.Dynamic.literal(Page = Page.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPage = js.Any.fromFunction0(getPage), jumpToEndOfPage = js.Any.fromFunction0(jumpToEndOfPage), jumpToFirstPage = js.Any.fromFunction0(jumpToFirstPage), jumpToLastPage = js.Any.fromFunction0(jumpToLastPage), jumpToNextPage = js.Any.fromFunction0(jumpToNextPage), jumpToPage = js.Any.fromFunction1(jumpToPage), jumpToPreviousPage = js.Any.fromFunction0(jumpToPreviousPage), jumpToStartOfPage = js.Any.fromFunction0(jumpToStartOfPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPageCursor]
  }
  
  extension [Self <: XPageCursor](x: Self) {
    
    inline def setGetPage(value: () => Double): Self = StObject.set(x, "getPage", js.Any.fromFunction0(value))
    
    inline def setJumpToEndOfPage(value: () => Boolean): Self = StObject.set(x, "jumpToEndOfPage", js.Any.fromFunction0(value))
    
    inline def setJumpToFirstPage(value: () => Boolean): Self = StObject.set(x, "jumpToFirstPage", js.Any.fromFunction0(value))
    
    inline def setJumpToLastPage(value: () => Boolean): Self = StObject.set(x, "jumpToLastPage", js.Any.fromFunction0(value))
    
    inline def setJumpToNextPage(value: () => Boolean): Self = StObject.set(x, "jumpToNextPage", js.Any.fromFunction0(value))
    
    inline def setJumpToPage(value: Double => Boolean): Self = StObject.set(x, "jumpToPage", js.Any.fromFunction1(value))
    
    inline def setJumpToPreviousPage(value: () => Boolean): Self = StObject.set(x, "jumpToPreviousPage", js.Any.fromFunction0(value))
    
    inline def setJumpToStartOfPage(value: () => Boolean): Self = StObject.set(x, "jumpToStartOfPage", js.Any.fromFunction0(value))
    
    inline def setPage(value: Double): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
  }
}
