package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeSourceJSON
  extends StObject
     with Object {
  
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
  
  inline def apply(
    assetGroups: js.Array[AssetGroupJSON],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layerId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    sourceId: Double
  ): EdgeSourceJSON = {
    val __obj = js.Dynamic.literal(assetGroups = assetGroups.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layerId = layerId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeSourceJSON]
  }
  
  extension [Self <: EdgeSourceJSON](x: Self) {
    
    inline def setAssetGroups(value: js.Array[AssetGroupJSON]): Self = StObject.set(x, "assetGroups", value.asInstanceOf[js.Any])
    
    inline def setAssetGroupsVarargs(value: AssetGroupJSON*): Self = StObject.set(x, "assetGroups", js.Array(value*))
    
    inline def setLayerId(value: Double): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: Double): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
  }
}
