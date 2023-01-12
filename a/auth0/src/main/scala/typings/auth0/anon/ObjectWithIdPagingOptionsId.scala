package typings.auth0.anon

import typings.auth0.auth0Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined auth0.auth0.ObjectWithId & auth0.auth0.PagingOptions & {  include_totals :true} */
trait ObjectWithIdPagingOptionsId extends StObject {
  
  var id: String
  
  var include_totals: `true`
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
}
object ObjectWithIdPagingOptionsId {
  
  inline def apply(id: String): ObjectWithIdPagingOptionsId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], include_totals = true)
    __obj.asInstanceOf[ObjectWithIdPagingOptionsId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectWithIdPagingOptionsId] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInclude_totals(value: `true`): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
