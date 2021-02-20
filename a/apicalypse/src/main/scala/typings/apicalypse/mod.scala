package typings.apicalypse

import typings.axios.mod.AxiosRequestConfig
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apicalypse", JSImport.Default)
  @js.native
  def default(): Apicalypse = js.native
  @JSImport("apicalypse", JSImport.Default)
  @js.native
  def default(options: ApicalypseConfig): Apicalypse = js.native
  @JSImport("apicalypse", JSImport.Default)
  @js.native
  def default(rawQueryString: String): Apicalypse = js.native
  @JSImport("apicalypse", JSImport.Default)
  @js.native
  def default(rawQueryString: String, options: ApicalypseConfig): Apicalypse = js.native
  
  @js.native
  trait Apicalypse extends StObject {
    
    def fields(fields: String): Apicalypse = js.native
    def fields(fields: js.Array[String]): Apicalypse = js.native
    
    def limit(limit: Double): Apicalypse = js.native
    
    def multi(queries: js.Array[Apicalypse]): Apicalypse = js.native
    
    def offset(offset: Double): Apicalypse = js.native
    
    def query(endpoint: String, name: String): Apicalypse = js.native
    
    def request(url: String): js.Promise[AxiosResponse[_]] = js.native
    
    def requestAll(url: String): js.Promise[js.Array[_]] = js.native
    def requestAll(url: String, options: RequestAllConfig): js.Promise[js.Array[_]] = js.native
    
    def search(search: String): Apicalypse = js.native
    
    def sort(field: String): Apicalypse = js.native
    def sort(field: String, direction: SortDirection): Apicalypse = js.native
    
    def where(filters: String): Apicalypse = js.native
    def where(filters: js.Array[String]): Apicalypse = js.native
  }
  
  @js.native
  trait ApicalypseConfig extends AxiosRequestConfig {
    
    var queryMethod: js.UndefOr[QueryMethod] = js.native
  }
  object ApicalypseConfig {
    
    @scala.inline
    def apply(): ApicalypseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApicalypseConfig]
    }
    
    @scala.inline
    implicit class ApicalypseConfigMutableBuilder[Self <: ApicalypseConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryMethod(value: QueryMethod): Self = StObject.set(x, "queryMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryMethodUndefined: Self = StObject.set(x, "queryMethod", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.apicalypse.apicalypseStrings.body
    - typings.apicalypse.apicalypseStrings.url
  */
  trait QueryMethod extends StObject
  object QueryMethod {
    
    @scala.inline
    def body: typings.apicalypse.apicalypseStrings.body = "body".asInstanceOf[typings.apicalypse.apicalypseStrings.body]
    
    @scala.inline
    def url: typings.apicalypse.apicalypseStrings.url = "url".asInstanceOf[typings.apicalypse.apicalypseStrings.url]
  }
  
  @js.native
  trait RequestAllConfig extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.native
    
    var delay: js.UndefOr[Double] = js.native
  }
  object RequestAllConfig {
    
    @scala.inline
    def apply(): RequestAllConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestAllConfig]
    }
    
    @scala.inline
    implicit class RequestAllConfigMutableBuilder[Self <: RequestAllConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.apicalypse.apicalypseStrings.asc
    - typings.apicalypse.apicalypseStrings.desc
  */
  trait SortDirection extends StObject
  object SortDirection {
    
    @scala.inline
    def asc: typings.apicalypse.apicalypseStrings.asc = "asc".asInstanceOf[typings.apicalypse.apicalypseStrings.asc]
    
    @scala.inline
    def desc: typings.apicalypse.apicalypseStrings.desc = "desc".asInstanceOf[typings.apicalypse.apicalypseStrings.desc]
  }
}
