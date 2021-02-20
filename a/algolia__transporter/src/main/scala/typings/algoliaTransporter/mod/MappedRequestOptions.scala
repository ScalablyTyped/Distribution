package typings.algoliaTransporter.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappedRequestOptions extends StObject {
  
  /**
    * If the request should be cached.
    */
  val cacheable: js.UndefOr[Boolean] = js.native
  
  /**
    * The data to be transfered to the server.
    */
  val data: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * The headers of the request.
    */
  val headers: Record[String, String] = js.native
  
  /**
    * The query parameters of the request.
    */
  val queryParameters: Record[String, _] = js.native
  
  /**
    * The `read` or `write` timeout of the request.
    */
  val timeout: js.UndefOr[Double] = js.native
}
object MappedRequestOptions {
  
  @scala.inline
  def apply(headers: Record[String, String], queryParameters: Record[String, _]): MappedRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], queryParameters = queryParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedRequestOptions]
  }
  
  @scala.inline
  implicit class MappedRequestOptionsMutableBuilder[Self <: MappedRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheableUndefined: Self = StObject.set(x, "cacheable", js.undefined)
    
    @scala.inline
    def setData(value: Record[String, String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParameters(value: Record[String, _]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
