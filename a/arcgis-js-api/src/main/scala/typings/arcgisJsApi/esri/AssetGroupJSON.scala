package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetGroupJSON extends StObject {
  
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
  
  inline def apply(assetGroupCode: Double, assetGroupName: String, assetTypes: js.Array[AssetTypeJSON]): AssetGroupJSON = {
    val __obj = js.Dynamic.literal(assetGroupCode = assetGroupCode.asInstanceOf[js.Any], assetGroupName = assetGroupName.asInstanceOf[js.Any], assetTypes = assetTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetGroupJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetGroupJSON] (val x: Self) extends AnyVal {
    
    inline def setAssetGroupCode(value: Double): Self = StObject.set(x, "assetGroupCode", value.asInstanceOf[js.Any])
    
    inline def setAssetGroupName(value: String): Self = StObject.set(x, "assetGroupName", value.asInstanceOf[js.Any])
    
    inline def setAssetTypes(value: js.Array[AssetTypeJSON]): Self = StObject.set(x, "assetTypes", value.asInstanceOf[js.Any])
    
    inline def setAssetTypesVarargs(value: AssetTypeJSON*): Self = StObject.set(x, "assetTypes", js.Array(value*))
  }
}
