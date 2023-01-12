package typings.androidDeviceList

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("android-device-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def brandList(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("brandList")().asInstanceOf[js.Array[String]]
  
  inline def deviceList(): js.Array[Device] = ^.asInstanceOf[js.Dynamic].applyDynamic("deviceList")().asInstanceOf[js.Array[Device]]
  
  inline def getDevicesByBrand(brand: String): js.Array[Device] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevicesByBrand")(brand.asInstanceOf[js.Any]).asInstanceOf[js.Array[Device]]
  inline def getDevicesByBrand(brand: String, options: Options): js.Array[Device] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDevicesByBrand")(brand.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Device]]
  
  inline def getDevicesByDeviceId(deviceId: String): js.Array[Device] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevicesByDeviceId")(deviceId.asInstanceOf[js.Any]).asInstanceOf[js.Array[Device]]
  inline def getDevicesByDeviceId(deviceId: String, options: Options): js.Array[Device] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDevicesByDeviceId")(deviceId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Device]]
  
  inline def getDevicesByModel(model: String): js.Array[Device] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevicesByModel")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[Device]]
  inline def getDevicesByModel(model: String, Options: Options): js.Array[Device] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDevicesByModel")(model.asInstanceOf[js.Any], Options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Device]]
  
  inline def getDevicesByName(name: String): js.Array[Device] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevicesByName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Device]]
  inline def getDevicesByName(name: String, options: Options): js.Array[Device] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDevicesByName")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Device]]
  
  trait Device extends StObject {
    
    var brand: String
    
    var device: String
    
    var model: String
    
    var name: String
  }
  object Device {
    
    inline def apply(brand: String, device: String, model: String, name: String): Device = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * do not care of case type
      * @default false
      */
    var caseInsensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * return partial (substring) results too
      * @default false
      */
    var contains: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
      
      inline def setContains(value: Boolean): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    }
  }
}
