package typings.amazonDaxClient

import typings.awsSdk.mod.Request
import typings.std.Date
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amazon-dax-client", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with AmazonDaxClient {
    def this(options: AmazonDaxClientOptions) = this()
  }
  
  @js.native
  trait AmazonDaxClient extends StObject {
    
    def createCluster(): Request[js.Object, js.Any] = js.native
    def createCluster(params: js.Object): Request[js.Object, js.Any] = js.native
    def createCluster(params: js.Object, callback: js.Function2[/* err */ js.Any, /* data */ js.Object, Unit]): Request[js.Object, js.Any] = js.native
    def createCluster(params: Unit, callback: js.Function2[/* err */ js.Any, /* data */ js.Object, Unit]): Request[js.Object, js.Any] = js.native
  }
  
  trait AmazonDaxClientHttpOptions extends StObject {
    
    var agent: js.UndefOr[js.Any] = js.undefined
    
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    var proxy: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var xhrAsync: js.UndefOr[Boolean] = js.undefined
    
    var xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object AmazonDaxClientHttpOptions {
    
    inline def apply(): AmazonDaxClientHttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmazonDaxClientHttpOptions]
    }
    
    extension [Self <: AmazonDaxClientHttpOptions](x: Self) {
      
      inline def setAgent(value: js.Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setXhrAsync(value: Boolean): Self = StObject.set(x, "xhrAsync", value.asInstanceOf[js.Any])
      
      inline def setXhrAsyncUndefined: Self = StObject.set(x, "xhrAsync", js.undefined)
      
      inline def setXhrWithCredentials(value: Boolean): Self = StObject.set(x, "xhrWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setXhrWithCredentialsUndefined: Self = StObject.set(x, "xhrWithCredentials", js.undefined)
    }
  }
  
  trait AmazonDaxClientOptions extends StObject {
    
    var accessKeyId: js.UndefOr[String] = js.undefined
    
    var apiVersion: js.UndefOr[String | Date] = js.undefined
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var endpoints: js.UndefOr[js.Array[String]] = js.undefined
    
    var httpOptions: js.UndefOr[AmazonDaxClientHttpOptions] = js.undefined
    
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var params: js.UndefOr[Map[String, js.Any]] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var secretAccessKey: js.UndefOr[String] = js.undefined
  }
  object AmazonDaxClientOptions {
    
    inline def apply(): AmazonDaxClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmazonDaxClientOptions]
    }
    
    extension [Self <: AmazonDaxClientOptions](x: Self) {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      inline def setApiVersion(value: String | Date): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setEndpoints(value: js.Array[String]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
      
      inline def setEndpointsVarargs(value: String*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
      
      inline def setHttpOptions(value: AmazonDaxClientHttpOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setParams(value: Map[String, js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    }
  }
}
