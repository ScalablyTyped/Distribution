package typings.achingbrainNatPortMapper

import typings.achingbrainNatPortMapper.achingbrainNatPortMapperStrings.TCP
import typings.achingbrainNatPortMapper.achingbrainNatPortMapperStrings.UDP
import typings.achingbrainNatPortMapper.distSrcUpnpDeviceMod.GatewayDevice
import typings.achingbrainNatPortMapper.distSrcUpnpDeviceMod.GatewayService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ControlURL extends StObject {
    
    var SCPDURL: String
    
    var controlURL: String
    
    var service: String
  }
  object ControlURL {
    
    inline def apply(SCPDURL: String, controlURL: String, service: String): ControlURL = {
      val __obj = js.Dynamic.literal(SCPDURL = SCPDURL.asInstanceOf[js.Any], controlURL = controlURL.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlURL]
    }
    
    extension [Self <: ControlURL](x: Self) {
      
      inline def setControlURL(value: String): Self = StObject.set(x, "controlURL", value.asInstanceOf[js.Any])
      
      inline def setSCPDURL(value: String): Self = StObject.set(x, "SCPDURL", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  trait Device extends StObject {
    
    var device: js.Array[GatewayDevice]
  }
  object Device {
    
    inline def apply(device: js.Array[GatewayDevice]): Device = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    extension [Self <: Device](x: Self) {
      
      inline def setDevice(value: js.Array[GatewayDevice]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceVarargs(value: GatewayDevice*): Self = StObject.set(x, "device", js.Array(value*))
    }
  }
  
  trait Devices extends StObject {
    
    var devices: js.Array[GatewayDevice]
    
    var services: js.Array[GatewayService]
  }
  object Devices {
    
    inline def apply(devices: js.Array[GatewayDevice], services: js.Array[GatewayService]): Devices = {
      val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
      __obj.asInstanceOf[Devices]
    }
    
    extension [Self <: Devices](x: Self) {
      
      inline def setDevices(value: js.Array[GatewayDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      inline def setDevicesVarargs(value: GatewayDevice*): Self = StObject.set(x, "devices", js.Array(value*))
      
      inline def setServices(value: js.Array[GatewayService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesVarargs(value: GatewayService*): Self = StObject.set(x, "services", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@achingbrain/nat-port-mapper.@achingbrain/nat-port-mapper.MapPortOptions> */
  trait PartialMapPortOptions extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var gateway: js.UndefOr[String] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var localPort: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[TCP | UDP] = js.undefined
    
    var publicPort: js.UndefOr[Double] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object PartialMapPortOptions {
    
    inline def apply(): PartialMapPortOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMapPortOptions]
    }
    
    extension [Self <: PartialMapPortOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      inline def setProtocol(value: TCP | UDP): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setPublicPort(value: Double): Self = StObject.set(x, "publicPort", value.asInstanceOf[js.Any])
      
      inline def setPublicPortUndefined: Self = StObject.set(x, "publicPort", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@achingbrain/nat-port-mapper.@achingbrain/nat-port-mapper.NatAPIOptions> */
  trait PartialNatAPIOptions extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var gateway: js.UndefOr[String] = js.undefined
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object PartialNatAPIOptions {
    
    inline def apply(): PartialNatAPIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialNatAPIOptions]
    }
    
    extension [Self <: PartialNatAPIOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@achingbrain/nat-port-mapper.@achingbrain/nat-port-mapper.UnmapPortOptions> */
  trait PartialUnmapPortOptions extends StObject {
    
    var localPort: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[TCP | UDP] = js.undefined
    
    var publicPort: js.UndefOr[Double] = js.undefined
  }
  object PartialUnmapPortOptions {
    
    inline def apply(): PartialUnmapPortOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialUnmapPortOptions]
    }
    
    extension [Self <: PartialUnmapPortOptions](x: Self) {
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      inline def setProtocol(value: TCP | UDP): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setPublicPort(value: Double): Self = StObject.set(x, "publicPort", value.asInstanceOf[js.Any])
      
      inline def setPublicPortUndefined: Self = StObject.set(x, "publicPort", js.undefined)
    }
  }
  
  trait Service extends StObject {
    
    var service: js.Array[GatewayService]
  }
  object Service {
    
    inline def apply(service: js.Array[GatewayService]): Service = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    extension [Self <: Service](x: Self) {
      
      inline def setService(value: js.Array[GatewayService]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceVarargs(value: GatewayService*): Self = StObject.set(x, "service", js.Array(value*))
    }
  }
}
