package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSOperations extends StObject {
  
  var DescribeFeatureType: WFSOperationsDescribeFeatureType
  
  var GetCapabilities: WFSOperationsGetCapabilities
  
  var GetFeature: WFSOperationsGetFeature
}
object WFSOperations {
  
  inline def apply(
    DescribeFeatureType: WFSOperationsDescribeFeatureType,
    GetCapabilities: WFSOperationsGetCapabilities,
    GetFeature: WFSOperationsGetFeature
  ): WFSOperations = {
    val __obj = js.Dynamic.literal(DescribeFeatureType = DescribeFeatureType.asInstanceOf[js.Any], GetCapabilities = GetCapabilities.asInstanceOf[js.Any], GetFeature = GetFeature.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSOperations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WFSOperations] (val x: Self) extends AnyVal {
    
    inline def setDescribeFeatureType(value: WFSOperationsDescribeFeatureType): Self = StObject.set(x, "DescribeFeatureType", value.asInstanceOf[js.Any])
    
    inline def setGetCapabilities(value: WFSOperationsGetCapabilities): Self = StObject.set(x, "GetCapabilities", value.asInstanceOf[js.Any])
    
    inline def setGetFeature(value: WFSOperationsGetFeature): Self = StObject.set(x, "GetFeature", value.asInstanceOf[js.Any])
  }
}
