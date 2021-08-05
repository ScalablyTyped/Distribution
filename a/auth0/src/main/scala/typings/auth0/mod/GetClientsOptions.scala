package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClientsOptions extends StObject {
  
  var app_type: js.UndefOr[js.Array[ClientAppType]] = js.undefined
  
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  var include_fields: js.UndefOr[Boolean] = js.undefined
  
  var include_totals: js.UndefOr[Boolean] = js.undefined
  
  var is_first_party: js.UndefOr[Boolean] = js.undefined
  
  var is_global: js.UndefOr[Boolean] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
}
object GetClientsOptions {
  
  inline def apply(): GetClientsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClientsOptions]
  }
  
  extension [Self <: GetClientsOptions](x: Self) {
    
    inline def setApp_type(value: js.Array[ClientAppType]): Self = StObject.set(x, "app_type", value.asInstanceOf[js.Any])
    
    inline def setApp_typeUndefined: Self = StObject.set(x, "app_type", js.undefined)
    
    inline def setApp_typeVarargs(value: ClientAppType*): Self = StObject.set(x, "app_type", js.Array(value :_*))
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setInclude_fields(value: Boolean): Self = StObject.set(x, "include_fields", value.asInstanceOf[js.Any])
    
    inline def setInclude_fieldsUndefined: Self = StObject.set(x, "include_fields", js.undefined)
    
    inline def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
    
    inline def setInclude_totalsUndefined: Self = StObject.set(x, "include_totals", js.undefined)
    
    inline def setIs_first_party(value: Boolean): Self = StObject.set(x, "is_first_party", value.asInstanceOf[js.Any])
    
    inline def setIs_first_partyUndefined: Self = StObject.set(x, "is_first_party", js.undefined)
    
    inline def setIs_global(value: Boolean): Self = StObject.set(x, "is_global", value.asInstanceOf[js.Any])
    
    inline def setIs_globalUndefined: Self = StObject.set(x, "is_global", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
