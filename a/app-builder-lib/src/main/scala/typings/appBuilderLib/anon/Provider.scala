package typings.appBuilderLib.anon

import typings.builderUtilRuntime.publishOptionsMod.PublishProvider
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider extends StObject {
  
  var provider: PublishProvider
  
  var publishAutoUpdate: js.UndefOr[Boolean] = js.undefined
  
  var publisherName: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var requestHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  
  var timeout: js.UndefOr[Double | Null] = js.undefined
  
  var updaterCacheDirName: String
}
object Provider {
  
  inline def apply(provider: PublishProvider, updaterCacheDirName: String): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], updaterCacheDirName = updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  
  extension [Self <: Provider](x: Self) {
    
    inline def setProvider(value: PublishProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setPublishAutoUpdate(value: Boolean): Self = StObject.set(x, "publishAutoUpdate", value.asInstanceOf[js.Any])
    
    inline def setPublishAutoUpdateUndefined: Self = StObject.set(x, "publishAutoUpdate", js.undefined)
    
    inline def setPublisherName(value: js.Array[String]): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    inline def setPublisherNameNull: Self = StObject.set(x, "publisherName", null)
    
    inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
    
    inline def setPublisherNameVarargs(value: String*): Self = StObject.set(x, "publisherName", js.Array(value*))
    
    inline def setRequestHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUpdaterCacheDirName(value: String): Self = StObject.set(x, "updaterCacheDirName", value.asInstanceOf[js.Any])
  }
}
