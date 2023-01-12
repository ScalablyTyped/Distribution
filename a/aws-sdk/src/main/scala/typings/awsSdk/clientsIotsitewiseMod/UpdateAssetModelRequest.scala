package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssetModelRequest extends StObject {
  
  /**
    * The composite asset models that are part of this asset model. Composite asset models are asset models that contain specific properties. Each composite model has a type that defines the properties that the composite model supports. Use composite asset models to define alarms on this asset model.
    */
  var assetModelCompositeModels: js.UndefOr[AssetModelCompositeModels] = js.undefined
  
  /**
    * A description for the asset model.
    */
  var assetModelDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The updated hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be children of any other assets created from this asset model. For more information, see Asset hierarchies in the IoT SiteWise User Guide. You can specify up to 10 hierarchies per asset model. For more information, see Quotas in the IoT SiteWise User Guide.
    */
  var assetModelHierarchies: js.UndefOr[AssetModelHierarchies] = js.undefined
  
  /**
    * The ID of the asset model to update.
    */
  var assetModelId: ID
  
  /**
    * A unique, friendly name for the asset model.
    */
  var assetModelName: Name
  
  /**
    * The updated property definitions of the asset model. For more information, see Asset properties in the IoT SiteWise User Guide. You can specify up to 200 properties per asset model. For more information, see Quotas in the IoT SiteWise User Guide.
    */
  var assetModelProperties: js.UndefOr[AssetModelProperties] = js.undefined
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
}
object UpdateAssetModelRequest {
  
  inline def apply(assetModelId: ID, assetModelName: Name): UpdateAssetModelRequest = {
    val __obj = js.Dynamic.literal(assetModelId = assetModelId.asInstanceOf[js.Any], assetModelName = assetModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetModelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAssetModelRequest] (val x: Self) extends AnyVal {
    
    inline def setAssetModelCompositeModels(value: AssetModelCompositeModels): Self = StObject.set(x, "assetModelCompositeModels", value.asInstanceOf[js.Any])
    
    inline def setAssetModelCompositeModelsUndefined: Self = StObject.set(x, "assetModelCompositeModels", js.undefined)
    
    inline def setAssetModelCompositeModelsVarargs(value: AssetModelCompositeModel*): Self = StObject.set(x, "assetModelCompositeModels", js.Array(value*))
    
    inline def setAssetModelDescription(value: Description): Self = StObject.set(x, "assetModelDescription", value.asInstanceOf[js.Any])
    
    inline def setAssetModelDescriptionUndefined: Self = StObject.set(x, "assetModelDescription", js.undefined)
    
    inline def setAssetModelHierarchies(value: AssetModelHierarchies): Self = StObject.set(x, "assetModelHierarchies", value.asInstanceOf[js.Any])
    
    inline def setAssetModelHierarchiesUndefined: Self = StObject.set(x, "assetModelHierarchies", js.undefined)
    
    inline def setAssetModelHierarchiesVarargs(value: AssetModelHierarchy*): Self = StObject.set(x, "assetModelHierarchies", js.Array(value*))
    
    inline def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    inline def setAssetModelName(value: Name): Self = StObject.set(x, "assetModelName", value.asInstanceOf[js.Any])
    
    inline def setAssetModelProperties(value: AssetModelProperties): Self = StObject.set(x, "assetModelProperties", value.asInstanceOf[js.Any])
    
    inline def setAssetModelPropertiesUndefined: Self = StObject.set(x, "assetModelProperties", js.undefined)
    
    inline def setAssetModelPropertiesVarargs(value: AssetModelProperty*): Self = StObject.set(x, "assetModelProperties", js.Array(value*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
