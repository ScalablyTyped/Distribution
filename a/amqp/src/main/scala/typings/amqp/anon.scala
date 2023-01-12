package typings.amqp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ApplicationName extends StObject {
    
    var applicationName: js.UndefOr[String] = js.undefined
    
    var capabilities: js.UndefOr[Consumercancelnotify] = js.undefined
    
    /** Default: 'node-' + process.version */
    var platform: js.UndefOr[String] = js.undefined
    
    /** Default: node-amqp */
    var product: js.UndefOr[String] = js.undefined
    
    /** Default: 'nodeAMQPVersion' */
    var version: js.UndefOr[String] = js.undefined
  }
  object ApplicationName {
    
    inline def apply(): ApplicationName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplicationName] (val x: Self) extends AnyVal {
      
      inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
      
      inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
      
      inline def setCapabilities(value: Consumercancelnotify): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait CaFile extends StObject {
    
    var caFile: js.UndefOr[String] = js.undefined
    
    var certFile: js.UndefOr[String] = js.undefined
    
    var enabled: Boolean
    
    var keyFile: js.UndefOr[String] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  }
  object CaFile {
    
    inline def apply(enabled: Boolean): CaFile = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaFile] (val x: Self) extends AnyVal {
      
      inline def setCaFile(value: String): Self = StObject.set(x, "caFile", value.asInstanceOf[js.Any])
      
      inline def setCaFileUndefined: Self = StObject.set(x, "caFile", js.undefined)
      
      inline def setCertFile(value: String): Self = StObject.set(x, "certFile", value.asInstanceOf[js.Any])
      
      inline def setCertFileUndefined: Self = StObject.set(x, "certFile", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      inline def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
  
  trait Consumercancelnotify extends StObject {
    
    var consumer_cancel_notify: js.UndefOr[Boolean] = js.undefined
  }
  object Consumercancelnotify {
    
    inline def apply(): Consumercancelnotify = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Consumercancelnotify]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Consumercancelnotify] (val x: Self) extends AnyVal {
      
      inline def setConsumer_cancel_notify(value: Boolean): Self = StObject.set(x, "consumer_cancel_notify", value.asInstanceOf[js.Any])
      
      inline def setConsumer_cancel_notifyUndefined: Self = StObject.set(x, "consumer_cancel_notify", js.undefined)
    }
  }
}
