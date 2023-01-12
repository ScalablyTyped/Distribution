package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssetPropertyResponse extends StObject {
  
  /**
    * The ID of the asset.
    */
  var assetId: ID
  
  /**
    * The ID of the asset model.
    */
  var assetModelId: ID
  
  /**
    * The name of the asset.
    */
  var assetName: Name
  
  /**
    * The asset property's definition, alias, and notification state. This response includes this object for normal asset properties. If you describe an asset property in a composite model, this response includes the asset property information in compositeModel.
    */
  var assetProperty: js.UndefOr[Property] = js.undefined
  
  /**
    * The composite asset model that declares this asset property, if this asset property exists in a composite model.
    */
  var compositeModel: js.UndefOr[CompositeModelProperty] = js.undefined
}
object DescribeAssetPropertyResponse {
  
  inline def apply(assetId: ID, assetModelId: ID, assetName: Name): DescribeAssetPropertyResponse = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], assetModelId = assetModelId.asInstanceOf[js.Any], assetName = assetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetPropertyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAssetPropertyResponse] (val x: Self) extends AnyVal {
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    inline def setAssetName(value: Name): Self = StObject.set(x, "assetName", value.asInstanceOf[js.Any])
    
    inline def setAssetProperty(value: Property): Self = StObject.set(x, "assetProperty", value.asInstanceOf[js.Any])
    
    inline def setAssetPropertyUndefined: Self = StObject.set(x, "assetProperty", js.undefined)
    
    inline def setCompositeModel(value: CompositeModelProperty): Self = StObject.set(x, "compositeModel", value.asInstanceOf[js.Any])
    
    inline def setCompositeModelUndefined: Self = StObject.set(x, "compositeModel", js.undefined)
  }
}
