package typings.auth0.anon

import typings.auth0.auth0Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined auth0.auth0.ObjectWithId & auth0.auth0.PagingOptions & {  user_id :string,   include_totals :true} */
trait ObjectWithIdPagingOptionsPage extends StObject {
  
  var id: String
  
  var include_totals: `true`
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  var user_id: String
}
object ObjectWithIdPagingOptionsPage {
  
  inline def apply(id: String, user_id: String): ObjectWithIdPagingOptionsPage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], include_totals = true, user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithIdPagingOptionsPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectWithIdPagingOptionsPage] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInclude_totals(value: `true`): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
