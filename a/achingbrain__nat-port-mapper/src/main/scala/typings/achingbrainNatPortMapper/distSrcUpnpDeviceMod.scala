package typings.achingbrainNatPortMapper

import typings.achingbrainNatPortMapper.anon.ControlURL
import typings.achingbrainNatPortMapper.anon.Devices
import typings.achingbrainSsdp.mod.Service
import typings.std.AbortSignal
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUpnpDeviceMod {
  
  @JSImport("@achingbrain/nat-port-mapper/dist/src/upnp/device", "Device")
  @js.native
  open class Device protected () extends StObject {
    def this(service: Service[InternetGatewayDevice]) = this()
    
    def getNamespace(data: Any, uri: String): String = js.native
    
    def getService(types: js.Array[String]): ControlURL = js.native
    
    def parseDescription(info: Record[String, Any]): Devices = js.native
    
    def run(action: String, args: js.Array[js.Tuple2[String, String | Double]], signal: AbortSignal): js.Promise[Any] = js.native
    
    /* private */ val service: Any = js.native
    
    /* private */ val services: Any = js.native
  }
  
  trait GatewayDevice extends StObject {
    
    var deviceList: typings.achingbrainNatPortMapper.anon.Device
    
    var serviceList: typings.achingbrainNatPortMapper.anon.Service
  }
  object GatewayDevice {
    
    inline def apply(
      deviceList: typings.achingbrainNatPortMapper.anon.Device,
      serviceList: typings.achingbrainNatPortMapper.anon.Service
    ): GatewayDevice = {
      val __obj = js.Dynamic.literal(deviceList = deviceList.asInstanceOf[js.Any], serviceList = serviceList.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayDevice]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GatewayDevice] (val x: Self) extends AnyVal {
      
      inline def setDeviceList(value: typings.achingbrainNatPortMapper.anon.Device): Self = StObject.set(x, "deviceList", value.asInstanceOf[js.Any])
      
      inline def setServiceList(value: typings.achingbrainNatPortMapper.anon.Service): Self = StObject.set(x, "serviceList", value.asInstanceOf[js.Any])
    }
  }
  
  trait GatewayService extends StObject {
    
    var SCPDURL: String
    
    var controlURL: String
    
    var eventSubURL: String
    
    var serviceId: String
    
    var serviceType: String
  }
  object GatewayService {
    
    inline def apply(SCPDURL: String, controlURL: String, eventSubURL: String, serviceId: String, serviceType: String): GatewayService = {
      val __obj = js.Dynamic.literal(SCPDURL = SCPDURL.asInstanceOf[js.Any], controlURL = controlURL.asInstanceOf[js.Any], eventSubURL = eventSubURL.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayService]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GatewayService] (val x: Self) extends AnyVal {
      
      inline def setControlURL(value: String): Self = StObject.set(x, "controlURL", value.asInstanceOf[js.Any])
      
      inline def setEventSubURL(value: String): Self = StObject.set(x, "eventSubURL", value.asInstanceOf[js.Any])
      
      inline def setSCPDURL(value: String): Self = StObject.set(x, "SCPDURL", value.asInstanceOf[js.Any])
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternetGatewayDevice extends StObject {
    
    var device: GatewayDevice
  }
  object InternetGatewayDevice {
    
    inline def apply(device: GatewayDevice): InternetGatewayDevice = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternetGatewayDevice]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternetGatewayDevice] (val x: Self) extends AnyVal {
      
      inline def setDevice(value: GatewayDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    }
  }
}
