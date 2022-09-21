package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSOperations
  extends StObject
     with Object {
  
  var DescribeFeatureType: WFSOperationsDescribeFeatureType
  
  var GetCapabilities: WFSOperationsGetCapabilities
  
  var GetFeature: WFSOperationsGetFeature
}
object WFSOperations {
  
  inline def apply(
    DescribeFeatureType: WFSOperationsDescribeFeatureType,
    GetCapabilities: WFSOperationsGetCapabilities,
    GetFeature: WFSOperationsGetFeature,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WFSOperations = {
    val __obj = js.Dynamic.literal(DescribeFeatureType = DescribeFeatureType.asInstanceOf[js.Any], GetCapabilities = GetCapabilities.asInstanceOf[js.Any], GetFeature = GetFeature.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WFSOperations]
  }
  
  extension [Self <: WFSOperations](x: Self) {
    
    inline def setDescribeFeatureType(value: WFSOperationsDescribeFeatureType): Self = StObject.set(x, "DescribeFeatureType", value.asInstanceOf[js.Any])
    
    inline def setGetCapabilities(value: WFSOperationsGetCapabilities): Self = StObject.set(x, "GetCapabilities", value.asInstanceOf[js.Any])
    
    inline def setGetFeature(value: WFSOperationsGetFeature): Self = StObject.set(x, "GetFeature", value.asInstanceOf[js.Any])
  }
}
