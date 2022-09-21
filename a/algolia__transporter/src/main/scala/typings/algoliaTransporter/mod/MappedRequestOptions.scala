package typings.algoliaTransporter.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappedRequestOptions extends StObject {
  
  /**
    * If the request should be cached.
    */
  val cacheable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The data to be transfered to the server.
    */
  val data: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * The headers of the request.
    */
  val headers: Record[String, String]
  
  /**
    * The query parameters of the request.
    */
  val queryParameters: Record[String, Any]
  
  /**
    * The `read` or `write` timeout of the request.
    */
  val timeout: js.UndefOr[Double] = js.undefined
}
object MappedRequestOptions {
  
  inline def apply(headers: Record[String, String], queryParameters: Record[String, Any]): MappedRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], queryParameters = queryParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedRequestOptions]
  }
  
  extension [Self <: MappedRequestOptions](x: Self) {
    
    inline def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    inline def setCacheableUndefined: Self = StObject.set(x, "cacheable", js.undefined)
    
    inline def setData(value: Record[String, String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setQueryParameters(value: Record[String, Any]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
