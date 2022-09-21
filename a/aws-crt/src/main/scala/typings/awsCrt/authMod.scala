package typings.awsCrt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  trait AwsSigningConfigBase extends StObject {
    
    /**
      * Date and time to use during the signing process. If not provided then
      * the current time in UTC is used. Naive dates (lacking timezone info)
      * are assumed to be in local time
      */
    var date: js.UndefOr[js.Date] = js.undefined
    
    /** The region to sign against */
    var region: String
    
    /** Name of service to sign a request for */
    var service: js.UndefOr[String] = js.undefined
  }
  object AwsSigningConfigBase {
    
    inline def apply(region: String): AwsSigningConfigBase = {
      val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwsSigningConfigBase]
    }
    
    extension [Self <: AwsSigningConfigBase](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    }
  }
  
  trait WebsocketOptionsBase extends StObject {
    
    /**
      * (Optional) factory function to create the configuration used to sign the websocket handshake.  Leave null
      * to use the default settings.
      */
    var create_signing_config: js.UndefOr[js.Function0[AwsSigningConfigBase]] = js.undefined
    
    /**
      * (Optional) override for the service name used in signing the websocket handshake.  Leave null to use the
      * default (iotdevicegateway)
      */
    var service: js.UndefOr[String] = js.undefined
  }
  object WebsocketOptionsBase {
    
    inline def apply(): WebsocketOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebsocketOptionsBase]
    }
    
    extension [Self <: WebsocketOptionsBase](x: Self) {
      
      inline def setCreate_signing_config(value: () => AwsSigningConfigBase): Self = StObject.set(x, "create_signing_config", js.Any.fromFunction0(value))
      
      inline def setCreate_signing_configUndefined: Self = StObject.set(x, "create_signing_config", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    }
  }
}
