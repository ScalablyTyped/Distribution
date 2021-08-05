package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EsriErrorDetails
  extends StObject
     with Object {
  
  /**
    * A function to retrieve headers sent from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  def getHeader(headerName: String): String
  /**
    * A function to retrieve headers sent from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  @JSName("getHeader")
  var getHeader_Original: GetHeader
  
  /**
    * The status of the http request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var httpStatus: Double
  
  /**
    * The error message code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var messageCode: String
  
  /**
    * Additional error message(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var messages: js.Array[String]
  
  /**
    * The query parameters sent with the http request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var requestOptions: js.Any
  
  /**
    * Indicates if the request required https.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var ssl: Boolean
  
  /**
    * The error message subcode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var subCode: Double
  
  /**
    * The URL of the request that returned an error message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var url: String
}
object EsriErrorDetails {
  
  inline def apply(
    constructor: js.Function,
    getHeader: /* headerName */ String => String,
    hasOwnProperty: PropertyKey => Boolean,
    httpStatus: Double,
    messageCode: String,
    messages: js.Array[String],
    propertyIsEnumerable: PropertyKey => Boolean,
    requestOptions: js.Any,
    ssl: Boolean,
    subCode: Double,
    url: String
  ): EsriErrorDetails = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), httpStatus = httpStatus.asInstanceOf[js.Any], messageCode = messageCode.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), requestOptions = requestOptions.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any], subCode = subCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EsriErrorDetails]
  }
  
  extension [Self <: EsriErrorDetails](x: Self) {
    
    inline def setGetHeader(value: /* headerName */ String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    
    inline def setMessageCode(value: String): Self = StObject.set(x, "messageCode", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    inline def setRequestOptions(value: js.Any): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSubCode(value: Double): Self = StObject.set(x, "subCode", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
