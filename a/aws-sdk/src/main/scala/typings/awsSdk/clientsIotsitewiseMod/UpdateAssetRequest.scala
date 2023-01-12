package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssetRequest extends StObject {
  
  /**
    * A description for the asset.
    */
  var assetDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the asset to update.
    */
  var assetId: ID
  
  /**
    * A friendly name for the asset.
    */
  var assetName: Name
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
}
object UpdateAssetRequest {
  
  inline def apply(assetId: ID, assetName: Name): UpdateAssetRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], assetName = assetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAssetRequest] (val x: Self) extends AnyVal {
    
    inline def setAssetDescription(value: Description): Self = StObject.set(x, "assetDescription", value.asInstanceOf[js.Any])
    
    inline def setAssetDescriptionUndefined: Self = StObject.set(x, "assetDescription", js.undefined)
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetName(value: Name): Self = StObject.set(x, "assetName", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
