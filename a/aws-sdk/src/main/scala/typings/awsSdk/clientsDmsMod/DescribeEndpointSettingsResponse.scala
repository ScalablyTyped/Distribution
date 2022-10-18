package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointSettingsResponse extends StObject {
  
  /**
    * Descriptions of the endpoint settings available for your source or target database engine.
    */
  var EndpointSettings: js.UndefOr[EndpointSettingsList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DescribeEndpointSettingsResponse {
  
  inline def apply(): DescribeEndpointSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointSettingsResponse]
  }
  
  extension [Self <: DescribeEndpointSettingsResponse](x: Self) {
    
    inline def setEndpointSettings(value: EndpointSettingsList): Self = StObject.set(x, "EndpointSettings", value.asInstanceOf[js.Any])
    
    inline def setEndpointSettingsUndefined: Self = StObject.set(x, "EndpointSettings", js.undefined)
    
    inline def setEndpointSettingsVarargs(value: EndpointSetting*): Self = StObject.set(x, "EndpointSettings", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
