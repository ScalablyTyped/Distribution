package typings.auth0.mod

import typings.auth0.auth0Strings.public_key
import typings.auth0.auth0Strings.refresh_token
import typings.auth0.auth0Strings.rotating_refresh_token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceCredentialsParams extends StObject {
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var fields: js.UndefOr[String] = js.undefined
  
  var include_fields: js.UndefOr[Boolean] = js.undefined
  
  var include_totals: js.UndefOr[Boolean] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[public_key | refresh_token | rotating_refresh_token] = js.undefined
  
  var user_id: String
}
object GetDeviceCredentialsParams {
  
  inline def apply(user_id: String): GetDeviceCredentialsParams = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceCredentialsParams]
  }
  
  extension [Self <: GetDeviceCredentialsParams](x: Self) {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setInclude_fields(value: Boolean): Self = StObject.set(x, "include_fields", value.asInstanceOf[js.Any])
    
    inline def setInclude_fieldsUndefined: Self = StObject.set(x, "include_fields", js.undefined)
    
    inline def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
    
    inline def setInclude_totalsUndefined: Self = StObject.set(x, "include_totals", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setType(value: public_key | refresh_token | rotating_refresh_token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
