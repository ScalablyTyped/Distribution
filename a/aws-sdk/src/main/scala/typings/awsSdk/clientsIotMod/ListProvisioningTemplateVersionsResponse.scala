package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProvisioningTemplateVersionsResponse extends StObject {
  
  /**
    * A token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The list of provisioning template versions.
    */
  var versions: js.UndefOr[ProvisioningTemplateVersionListing] = js.undefined
}
object ListProvisioningTemplateVersionsResponse {
  
  inline def apply(): ListProvisioningTemplateVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisioningTemplateVersionsResponse]
  }
  
  extension [Self <: ListProvisioningTemplateVersionsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVersions(value: ProvisioningTemplateVersionListing): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: ProvisioningTemplateVersionSummary*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
