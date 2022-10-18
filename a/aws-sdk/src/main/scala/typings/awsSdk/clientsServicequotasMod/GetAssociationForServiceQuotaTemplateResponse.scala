package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssociationForServiceQuotaTemplateResponse extends StObject {
  
  /**
    * The association status. If the status is ASSOCIATED, the quota increase requests in the template are automatically applied to new accounts in your organization.
    */
  var ServiceQuotaTemplateAssociationStatus: js.UndefOr[typings.awsSdk.clientsServicequotasMod.ServiceQuotaTemplateAssociationStatus] = js.undefined
}
object GetAssociationForServiceQuotaTemplateResponse {
  
  inline def apply(): GetAssociationForServiceQuotaTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociationForServiceQuotaTemplateResponse]
  }
  
  extension [Self <: GetAssociationForServiceQuotaTemplateResponse](x: Self) {
    
    inline def setServiceQuotaTemplateAssociationStatus(value: ServiceQuotaTemplateAssociationStatus): Self = StObject.set(x, "ServiceQuotaTemplateAssociationStatus", value.asInstanceOf[js.Any])
    
    inline def setServiceQuotaTemplateAssociationStatusUndefined: Self = StObject.set(x, "ServiceQuotaTemplateAssociationStatus", js.undefined)
  }
}
