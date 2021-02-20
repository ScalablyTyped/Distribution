package typings.amplitudeJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Carrier extends StObject {
    
    var carrier: js.UndefOr[Boolean] = js.native
    
    var city: js.UndefOr[Boolean] = js.native
    
    var country: js.UndefOr[Boolean] = js.native
    
    var device_manufacturer: js.UndefOr[Boolean] = js.native
    
    var device_model: js.UndefOr[Boolean] = js.native
    
    var dma: js.UndefOr[Boolean] = js.native
    
    var ip_address: js.UndefOr[Boolean] = js.native
    
    var language: js.UndefOr[Boolean] = js.native
    
    var os_name: js.UndefOr[Boolean] = js.native
    
    var os_version: js.UndefOr[Boolean] = js.native
    
    var platform: js.UndefOr[Boolean] = js.native
    
    var region: js.UndefOr[Boolean] = js.native
    
    var version_name: js.UndefOr[Boolean] = js.native
  }
  object Carrier {
    
    @scala.inline
    def apply(): Carrier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Carrier]
    }
    
    @scala.inline
    implicit class CarrierMutableBuilder[Self <: Carrier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCarrier(value: Boolean): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
      
      @scala.inline
      def setCity(value: Boolean): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCountry(value: Boolean): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setDevice_manufacturer(value: Boolean): Self = StObject.set(x, "device_manufacturer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice_manufacturerUndefined: Self = StObject.set(x, "device_manufacturer", js.undefined)
      
      @scala.inline
      def setDevice_model(value: Boolean): Self = StObject.set(x, "device_model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice_modelUndefined: Self = StObject.set(x, "device_model", js.undefined)
      
      @scala.inline
      def setDma(value: Boolean): Self = StObject.set(x, "dma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDmaUndefined: Self = StObject.set(x, "dma", js.undefined)
      
      @scala.inline
      def setIp_address(value: Boolean): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp_addressUndefined: Self = StObject.set(x, "ip_address", js.undefined)
      
      @scala.inline
      def setLanguage(value: Boolean): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setOs_name(value: Boolean): Self = StObject.set(x, "os_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs_nameUndefined: Self = StObject.set(x, "os_name", js.undefined)
      
      @scala.inline
      def setOs_version(value: Boolean): Self = StObject.set(x, "os_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs_versionUndefined: Self = StObject.set(x, "os_version", js.undefined)
      
      @scala.inline
      def setPlatform(value: Boolean): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setRegion(value: Boolean): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setVersion_name(value: Boolean): Self = StObject.set(x, "version_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion_nameUndefined: Self = StObject.set(x, "version_name", js.undefined)
    }
  }
  
  @js.native
  trait Reason extends StObject {
    
    var reason: String = js.native
  }
  object Reason {
    
    @scala.inline
    def apply(reason: String): Reason = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reason]
    }
    
    @scala.inline
    implicit class ReasonMutableBuilder[Self <: Reason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
}
