package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowseRequestData extends StObject {
  
  /**
    * If available, should be used for browsing to the next page.
    */
  val cursor: js.UndefOr[String] = js.native
  
  /**
    * If cursor is not available, should be used for browsing to the next page.
    */
  val page: js.UndefOr[Double] = js.native
}
object BrowseRequestData {
  
  @scala.inline
  def apply(): BrowseRequestData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowseRequestData]
  }
  
  @scala.inline
  implicit class BrowseRequestDataMutableBuilder[Self <: BrowseRequestData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
