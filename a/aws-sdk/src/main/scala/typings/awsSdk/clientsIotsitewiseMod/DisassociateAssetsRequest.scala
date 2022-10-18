package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateAssetsRequest extends StObject {
  
  /**
    * The ID of the parent asset from which to disassociate the child asset.
    */
  var assetId: ID
  
  /**
    * The ID of the child asset to disassociate.
    */
  var childAssetId: ID
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The ID of a hierarchy in the parent asset's model. Hierarchies allow different groupings of assets to be formed that all come from the same asset model. You can use the hierarchy ID to identify the correct asset to disassociate. For more information, see Asset hierarchies in the IoT SiteWise User Guide.
    */
  var hierarchyId: ID
}
object DisassociateAssetsRequest {
  
  inline def apply(assetId: ID, childAssetId: ID, hierarchyId: ID): DisassociateAssetsRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], childAssetId = childAssetId.asInstanceOf[js.Any], hierarchyId = hierarchyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateAssetsRequest]
  }
  
  extension [Self <: DisassociateAssetsRequest](x: Self) {
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setChildAssetId(value: ID): Self = StObject.set(x, "childAssetId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setHierarchyId(value: ID): Self = StObject.set(x, "hierarchyId", value.asInstanceOf[js.Any])
  }
}
