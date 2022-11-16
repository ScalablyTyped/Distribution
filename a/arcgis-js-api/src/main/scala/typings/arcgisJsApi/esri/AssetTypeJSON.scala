package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetTypeJSON extends StObject {
  
  /**
    * The asset type code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#AssetTypeJSON)
    */
  var assetTypeCode: Double
  
  /**
    * The asset type name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#AssetTypeJSON)
    */
  var assetTypeName: String
  
  /**
    * The id of the terminal configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#AssetTypeJSON)
    */
  var terminalConfigurationId: Double
}
object AssetTypeJSON {
  
  inline def apply(assetTypeCode: Double, assetTypeName: String, terminalConfigurationId: Double): AssetTypeJSON = {
    val __obj = js.Dynamic.literal(assetTypeCode = assetTypeCode.asInstanceOf[js.Any], assetTypeName = assetTypeName.asInstanceOf[js.Any], terminalConfigurationId = terminalConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetTypeJSON]
  }
  
  extension [Self <: AssetTypeJSON](x: Self) {
    
    inline def setAssetTypeCode(value: Double): Self = StObject.set(x, "assetTypeCode", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeName(value: String): Self = StObject.set(x, "assetTypeName", value.asInstanceOf[js.Any])
    
    inline def setTerminalConfigurationId(value: Double): Self = StObject.set(x, "terminalConfigurationId", value.asInstanceOf[js.Any])
  }
}
