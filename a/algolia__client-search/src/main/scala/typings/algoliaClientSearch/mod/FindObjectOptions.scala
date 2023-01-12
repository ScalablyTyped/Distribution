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
  
  inline def apply(): FindObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindObjectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindObjectOptions] (val x: Self) extends AnyVal {
    
    inline def setPaginate(value: Boolean): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    inline def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
