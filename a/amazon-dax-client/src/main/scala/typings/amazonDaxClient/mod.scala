package typings.amazonDaxClient

import typings.awsSdk.mod.Request
import typings.std.Date
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amazon-dax-client", JSImport.Namespace)
  @js.native
  class ^ protected () extends AmazonDaxClient {
    def this(options: AmazonDaxClientOptions) = this()
  }
  
  @js.native
  trait AmazonDaxClient extends StObject {
    
    def createCluster(): Request[js.Object, _] = js.native
    def createCluster(
      params: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* data */ js.Object, Unit]
    ): Request[js.Object, _] = js.native
    def createCluster(params: js.Object): Request[js.Object, _] = js.native
    def createCluster(params: js.Object, callback: js.Function2[/* err */ js.Any, /* data */ js.Object, Unit]): Request[js.Object, _] = js.native
  }
  
  @js.native
  trait AmazonDaxClientHttpOptions extends StObject {
    
    var agent: js.UndefOr[js.Any] = js.native
    
    var connectTimeout: js.UndefOr[Double] = js.native
    
    var proxy: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var xhrAsync: js.UndefOr[Boolean] = js.native
    
    var xhrWithCredentials: js.UndefOr[Boolean] = js.native
  }
  object AmazonDaxClientHttpOptions {
    
    @scala.inline
    def apply(): AmazonDaxClientHttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmazonDaxClientHttpOptions]
    }
    
    @scala.inline
    implicit class AmazonDaxClientHttpOptionsMutableBuilder[Self <: AmazonDaxClientHttpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: js.Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setXhrAsync(value: Boolean): Self = StObject.set(x, "xhrAsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrAsyncUndefined: Self = StObject.set(x, "xhrAsync", js.undefined)
      
      @scala.inline
      def setXhrWithCredentials(value: Boolean): Self = StObject.set(x, "xhrWithCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrWithCredentialsUndefined: Self = StObject.set(x, "xhrWithCredentials", js.undefined)
    }
  }
  
  @js.native
  trait AmazonDaxClientOptions extends StObject {
    
    var accessKeyId: js.UndefOr[String] = js.native
    
    var apiVersion: js.UndefOr[String | Date] = js.native
    
    var endpoint: js.UndefOr[String] = js.native
    
    var endpoints: js.UndefOr[js.Array[String]] = js.native
    
    var httpOptions: js.UndefOr[AmazonDaxClientHttpOptions] = js.native
    
    var maxRedirects: js.UndefOr[Double] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var params: js.UndefOr[Map[String, _]] = js.native
    
    var region: js.UndefOr[String] = js.native
    
    var secretAccessKey: js.UndefOr[String] = js.native
  }
  object AmazonDaxClientOptions {
    
    @scala.inline
    def apply(): AmazonDaxClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmazonDaxClientOptions]
    }
    
    @scala.inline
    implicit class AmazonDaxClientOptionsMutableBuilder[Self <: AmazonDaxClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      @scala.inline
      def setApiVersion(value: String | Date): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setEndpoints(value: js.Array[String]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
      
      @scala.inline
      def setEndpointsVarargs(value: String*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
      
      @scala.inline
      def setHttpOptions(value: AmazonDaxClientHttpOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setParams(value: Map[String, _]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    }
  }
}
