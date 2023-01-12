package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClientGrantsOptions extends StObject {
  
  /**
    * The audience.
    */
  var audience: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the client (application).
    */
  var client_id: js.UndefOr[String] = js.undefined
  
  /** @default 0 */
  var page: js.UndefOr[Double] = js.undefined
  
  /** @default 10 */
  var per_page: js.UndefOr[Double] = js.undefined
}
object GetClientGrantsOptions {
  
  inline def apply(): GetClientGrantsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClientGrantsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClientGrantsOptions] (val x: Self) extends AnyVal {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
