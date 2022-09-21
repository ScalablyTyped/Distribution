package typings.amplitudeJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Branch extends StObject {
    
    var branch: js.UndefOr[String] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Branch {
    
    inline def apply(): Branch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Branch]
    }
    
    extension [Self <: Branch](x: Self) {
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Carrier extends StObject {
    
    var carrier: js.UndefOr[Boolean] = js.undefined
    
    var city: js.UndefOr[Boolean] = js.undefined
    
    var country: js.UndefOr[Boolean] = js.undefined
    
    var device_manufacturer: js.UndefOr[Boolean] = js.undefined
    
    var device_model: js.UndefOr[Boolean] = js.undefined
    
    var dma: js.UndefOr[Boolean] = js.undefined
    
    var ip_address: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[Boolean] = js.undefined
    
    var os_name: js.UndefOr[Boolean] = js.undefined
    
    var os_version: js.UndefOr[Boolean] = js.undefined
    
    var platform: js.UndefOr[Boolean] = js.undefined
    
    var region: js.UndefOr[Boolean] = js.undefined
    
    var version_name: js.UndefOr[Boolean] = js.undefined
  }
  object Carrier {
    
    inline def apply(): Carrier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Carrier]
    }
    
    extension [Self <: Carrier](x: Self) {
      
      inline def setCarrier(value: Boolean): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
      
      inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
      
      inline def setCity(value: Boolean): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCountry(value: Boolean): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setDevice_manufacturer(value: Boolean): Self = StObject.set(x, "device_manufacturer", value.asInstanceOf[js.Any])
      
      inline def setDevice_manufacturerUndefined: Self = StObject.set(x, "device_manufacturer", js.undefined)
      
      inline def setDevice_model(value: Boolean): Self = StObject.set(x, "device_model", value.asInstanceOf[js.Any])
      
      inline def setDevice_modelUndefined: Self = StObject.set(x, "device_model", js.undefined)
      
      inline def setDma(value: Boolean): Self = StObject.set(x, "dma", value.asInstanceOf[js.Any])
      
      inline def setDmaUndefined: Self = StObject.set(x, "dma", js.undefined)
      
      inline def setIp_address(value: Boolean): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      inline def setIp_addressUndefined: Self = StObject.set(x, "ip_address", js.undefined)
      
      inline def setLanguage(value: Boolean): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setOs_name(value: Boolean): Self = StObject.set(x, "os_name", value.asInstanceOf[js.Any])
      
      inline def setOs_nameUndefined: Self = StObject.set(x, "os_name", js.undefined)
      
      inline def setOs_version(value: Boolean): Self = StObject.set(x, "os_version", value.asInstanceOf[js.Any])
      
      inline def setOs_versionUndefined: Self = StObject.set(x, "os_version", js.undefined)
      
      inline def setPlatform(value: Boolean): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setRegion(value: Boolean): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setVersion_name(value: Boolean): Self = StObject.set(x, "version_name", value.asInstanceOf[js.Any])
      
      inline def setVersion_nameUndefined: Self = StObject.set(x, "version_name", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Reason extends StObject {
    
    var reason: String
  }
  object Reason {
    
    inline def apply(reason: String): Reason = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reason]
    }
    
    extension [Self <: Reason](x: Self) {
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
}
