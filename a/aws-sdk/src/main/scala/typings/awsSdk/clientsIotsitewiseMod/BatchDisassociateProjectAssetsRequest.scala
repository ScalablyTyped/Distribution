package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateProjectAssetsRequest extends StObject {
  
  /**
    * The IDs of the assets to be disassociated from the project.
    */
  var assetIds: IDs
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The ID of the project from which to disassociate the assets.
    */
  var projectId: ID
}
object BatchDisassociateProjectAssetsRequest {
  
  inline def apply(assetIds: IDs, projectId: ID): BatchDisassociateProjectAssetsRequest = {
    val __obj = js.Dynamic.literal(assetIds = assetIds.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateProjectAssetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDisassociateProjectAssetsRequest] (val x: Self) extends AnyVal {
    
    inline def setAssetIds(value: IDs): Self = StObject.set(x, "assetIds", value.asInstanceOf[js.Any])
    
    inline def setAssetIdsVarargs(value: ID*): Self = StObject.set(x, "assetIds", js.Array(value*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setProjectId(value: ID): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
