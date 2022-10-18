package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSiteToSiteVpnAttachmentResponse extends StObject {
  
  /**
    * Describes the site-to-site attachment.
    */
  var SiteToSiteVpnAttachment: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.SiteToSiteVpnAttachment] = js.undefined
}
object GetSiteToSiteVpnAttachmentResponse {
  
  inline def apply(): GetSiteToSiteVpnAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSiteToSiteVpnAttachmentResponse]
  }
  
  extension [Self <: GetSiteToSiteVpnAttachmentResponse](x: Self) {
    
    inline def setSiteToSiteVpnAttachment(value: SiteToSiteVpnAttachment): Self = StObject.set(x, "SiteToSiteVpnAttachment", value.asInstanceOf[js.Any])
    
    inline def setSiteToSiteVpnAttachmentUndefined: Self = StObject.set(x, "SiteToSiteVpnAttachment", js.undefined)
  }
}
