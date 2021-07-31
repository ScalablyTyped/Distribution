package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestResponse
  extends StObject
     with Object {
  
  /**
    * The requested data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var data: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Method for getting a header sent from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var getHeader: js.UndefOr[GetHeader] = js.undefined
  
  /**
    * The options specified by the user in the data request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var requestOptions: js.UndefOr[RequestOptions] = js.undefined
  
  /**
    * Indicates if the request required https.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var ssl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The URL used to request the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var url: js.UndefOr[String] = js.undefined
}
object RequestResponse {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RequestResponse = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RequestResponse]
  }
  
  @scala.inline
  implicit class RequestResponseMutableBuilder[Self <: RequestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setGetHeader(value: /* headerName */ String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHeaderUndefined: Self = StObject.set(x, "getHeader", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
