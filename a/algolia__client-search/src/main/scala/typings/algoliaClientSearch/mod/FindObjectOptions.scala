package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindObjectOptions extends StObject {
  
  /**
    * If the underlying find object options should paginate
    * over a search method.
    */
  val paginate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The query used by the underlying find object to
    * find the object.
    */
  val query: js.UndefOr[String] = js.undefined
}
object FindObjectOptions {
  
  @scala.inline
  def apply(): FindObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindObjectOptions]
  }
  
  @scala.inline
  implicit class FindObjectOptionsMutableBuilder[Self <: FindObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaginate(value: Boolean): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
