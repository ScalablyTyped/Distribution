package typings.amqp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ApplicationName extends StObject {
    
    var applicationName: js.UndefOr[String] = js.native
    
    var capabilities: js.UndefOr[Consumercancelnotify] = js.native
    
    /** Default: 'node-' + process.version */
    var platform: js.UndefOr[String] = js.native
    
    /** Default: node-amqp */
    var product: js.UndefOr[String] = js.native
    
    /** Default: 'nodeAMQPVersion' */
    var version: js.UndefOr[String] = js.native
  }
  object ApplicationName {
    
    @scala.inline
    def apply(): ApplicationName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationName]
    }
    
    @scala.inline
    implicit class ApplicationNameMutableBuilder[Self <: ApplicationName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
      
      @scala.inline
      def setCapabilities(value: Consumercancelnotify): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait CaFile extends StObject {
    
    var caFile: js.UndefOr[String] = js.native
    
    var certFile: js.UndefOr[String] = js.native
    
    var enabled: Boolean = js.native
    
    var keyFile: js.UndefOr[String] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  }
  object CaFile {
    
    @scala.inline
    def apply(enabled: Boolean): CaFile = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaFile]
    }
    
    @scala.inline
    implicit class CaFileMutableBuilder[Self <: CaFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaFile(value: String): Self = StObject.set(x, "caFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaFileUndefined: Self = StObject.set(x, "caFile", js.undefined)
      
      @scala.inline
      def setCertFile(value: String): Self = StObject.set(x, "certFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertFileUndefined: Self = StObject.set(x, "certFile", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
  
  @js.native
  trait Consumercancelnotify extends StObject {
    
    var consumer_cancel_notify: js.UndefOr[Boolean] = js.native
  }
  object Consumercancelnotify {
    
    @scala.inline
    def apply(): Consumercancelnotify = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Consumercancelnotify]
    }
    
    @scala.inline
    implicit class ConsumercancelnotifyMutableBuilder[Self <: Consumercancelnotify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumer_cancel_notify(value: Boolean): Self = StObject.set(x, "consumer_cancel_notify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumer_cancel_notifyUndefined: Self = StObject.set(x, "consumer_cancel_notify", js.undefined)
    }
  }
}
