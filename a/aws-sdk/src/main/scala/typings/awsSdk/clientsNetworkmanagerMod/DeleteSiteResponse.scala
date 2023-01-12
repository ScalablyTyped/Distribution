package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSiteResponse extends StObject {
  
  /**
    * Information about the site.
    */
  var Site: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Site] = js.undefined
}
object DeleteSiteResponse {
  
  inline def apply(): DeleteSiteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSiteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSiteResponse] (val x: Self) extends AnyVal {
    
    inline def setSite(value: Site): Self = StObject.set(x, "Site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "Site", js.undefined)
  }
}
