package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssetModelRequest extends StObject {
  
  /**
    * The ID of the asset model to delete.
    */
  var assetModelId: ID
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
}
object DeleteAssetModelRequest {
  
  inline def apply(assetModelId: ID): DeleteAssetModelRequest = {
    val __obj = js.Dynamic.literal(assetModelId = assetModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetModelRequest]
  }
  
  extension [Self <: DeleteAssetModelRequest](x: Self) {
    
    inline def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
