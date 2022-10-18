package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssetRequest extends StObject {
  
  /**
    * A description for the asset.
    */
  var assetDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the asset model from which to create the asset.
    */
  var assetModelId: ID
  
  /**
    * A friendly name for the asset.
    */
  var assetName: Name
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A list of key-value pairs that contain metadata for the asset. For more information, see Tagging your IoT SiteWise resources in the IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateAssetRequest {
  
  inline def apply(assetModelId: ID, assetName: Name): CreateAssetRequest = {
    val __obj = js.Dynamic.literal(assetModelId = assetModelId.asInstanceOf[js.Any], assetName = assetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetRequest]
  }
  
  extension [Self <: CreateAssetRequest](x: Self) {
    
    inline def setAssetDescription(value: Description): Self = StObject.set(x, "assetDescription", value.asInstanceOf[js.Any])
    
    inline def setAssetDescriptionUndefined: Self = StObject.set(x, "assetDescription", js.undefined)
    
    inline def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    inline def setAssetName(value: Name): Self = StObject.set(x, "assetName", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
