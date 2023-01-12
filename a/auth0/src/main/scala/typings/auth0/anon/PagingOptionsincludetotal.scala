package typings.auth0.anon

import typings.auth0.auth0Booleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined auth0.auth0.PagingOptions & {  include_totals :false | undefined} */
trait PagingOptionsincludetotal extends StObject {
  
  var include_totals: js.UndefOr[`false`] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
}
object PagingOptionsincludetotal {
  
  inline def apply(): PagingOptionsincludetotal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagingOptionsincludetotal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PagingOptionsincludetotal] (val x: Self) extends AnyVal {
    
    inline def setInclude_totals(value: `false`): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
    
    inline def setInclude_totalsUndefined: Self = StObject.set(x, "include_totals", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
