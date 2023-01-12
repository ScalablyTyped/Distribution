package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProvisioningArtifactsForServiceActionOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * An array of objects with information about product views and provisioning artifacts.
    */
  var ProvisioningArtifactViews: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProvisioningArtifactViews] = js.undefined
}
object ListProvisioningArtifactsForServiceActionOutput {
  
  inline def apply(): ListProvisioningArtifactsForServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisioningArtifactsForServiceActionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProvisioningArtifactsForServiceActionOutput] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setProvisioningArtifactViews(value: ProvisioningArtifactViews): Self = StObject.set(x, "ProvisioningArtifactViews", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactViewsUndefined: Self = StObject.set(x, "ProvisioningArtifactViews", js.undefined)
    
    inline def setProvisioningArtifactViewsVarargs(value: ProvisioningArtifactView*): Self = StObject.set(x, "ProvisioningArtifactViews", js.Array(value*))
  }
}
