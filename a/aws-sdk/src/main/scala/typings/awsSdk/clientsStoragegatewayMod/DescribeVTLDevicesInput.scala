package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVTLDevicesInput extends StObject {
  
  var GatewayARN: typings.awsSdk.clientsStoragegatewayMod.GatewayARN
  
  /**
    * Specifies that the number of VTL devices described be limited to the specified number.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  
  /**
    * An opaque string that indicates the position at which to begin describing the VTL devices.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.Marker] = js.undefined
  
  /**
    * An array of strings, where each string represents the Amazon Resource Name (ARN) of a VTL device.  All of the specified VTL devices must be from the same gateway. If no VTL devices are specified, the result will contain all devices on the specified gateway. 
    */
  var VTLDeviceARNs: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.VTLDeviceARNs] = js.undefined
}
object DescribeVTLDevicesInput {
  
  inline def apply(GatewayARN: GatewayARN): DescribeVTLDevicesInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVTLDevicesInput]
  }
  
  extension [Self <: DescribeVTLDevicesInput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: PositiveIntObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setVTLDeviceARNs(value: VTLDeviceARNs): Self = StObject.set(x, "VTLDeviceARNs", value.asInstanceOf[js.Any])
    
    inline def setVTLDeviceARNsUndefined: Self = StObject.set(x, "VTLDeviceARNs", js.undefined)
    
    inline def setVTLDeviceARNsVarargs(value: VTLDeviceARN*): Self = StObject.set(x, "VTLDeviceARNs", js.Array(value*))
  }
}
