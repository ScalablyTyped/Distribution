package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeSourceJSON extends StObject {
  
  /**
    * The asset group attribute values for the line layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#EdgeSourceJSON)
    */
  var assetGroups: js.Array[AssetGroupJSON]
  
  /**
    * The layer id of the line layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#EdgeSourceJSON)
    */
  var layerId: Double
  
  /**
    * The network source id of the line layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#EdgeSourceJSON)
    */
  var sourceId: Double
}
object EdgeSourceJSON {
  
  inline def apply(assetGroups: js.Array[AssetGroupJSON], layerId: Double, sourceId: Double): EdgeSourceJSON = {
    val __obj = js.Dynamic.literal(assetGroups = assetGroups.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeSourceJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdgeSourceJSON] (val x: Self) extends AnyVal {
    
    inline def setAssetGroups(value: js.Array[AssetGroupJSON]): Self = StObject.set(x, "assetGroups", value.asInstanceOf[js.Any])
    
    inline def setAssetGroupsVarargs(value: AssetGroupJSON*): Self = StObject.set(x, "assetGroups", js.Array(value*))
    
    inline def setLayerId(value: Double): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: Double): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
  }
}
