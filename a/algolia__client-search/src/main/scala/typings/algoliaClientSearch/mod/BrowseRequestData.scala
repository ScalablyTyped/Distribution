package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowseRequestData extends StObject {
  
  /**
    * If available, should be used for browsing to the next page.
    */
  val cursor: js.UndefOr[String] = js.undefined
  
  /**
    * If cursor is not available, should be used for browsing to the next page.
    */
  val page: js.UndefOr[Double] = js.undefined
}
object BrowseRequestData {
  
  inline def apply(): BrowseRequestData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowseRequestData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowseRequestData] (val x: Self) extends AnyVal {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
