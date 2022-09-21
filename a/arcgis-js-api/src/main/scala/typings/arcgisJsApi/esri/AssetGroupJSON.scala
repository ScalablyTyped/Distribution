package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetGroupJSON
  extends StObject
     with Object {
  
  /**
    * The asset group code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#AssetGroupJSON)
    */
  var assetGroupCode: Double
  
  /**
    * The asset group name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#AssetGroupJSON)
    */
  var assetGroupName: String
  
  /**
    * The asset type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#AssetGroupJSON)
    */
  var assetTypes: js.Array[AssetTypeJSON]
}
object AssetGroupJSON {
  
  inline def apply(
    assetGroupCode: Double,
    assetGroupName: String,
    assetTypes: js.Array[AssetTypeJSON],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): AssetGroupJSON = {
    val __obj = js.Dynamic.literal(assetGroupCode = assetGroupCode.asInstanceOf[js.Any], assetGroupName = assetGroupName.asInstanceOf[js.Any], assetTypes = assetTypes.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[AssetGroupJSON]
  }
  
  extension [Self <: AssetGroupJSON](x: Self) {
    
    inline def setAssetGroupCode(value: Double): Self = StObject.set(x, "assetGroupCode", value.asInstanceOf[js.Any])
    
    inline def setAssetGroupName(value: String): Self = StObject.set(x, "assetGroupName", value.asInstanceOf[js.Any])
    
    inline def setAssetTypes(value: js.Array[AssetTypeJSON]): Self = StObject.set(x, "assetTypes", value.asInstanceOf[js.Any])
    
    inline def setAssetTypesVarargs(value: AssetTypeJSON*): Self = StObject.set(x, "assetTypes", js.Array(value*))
  }
}
