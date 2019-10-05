package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EsriErrorDetails extends Object {
  /**
    * A function to retrieve headers sent from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  @JSName("getHeader")
  var getHeader_Original: GetHeader = js.native
  /**
    * The status of the http request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var httpStatus: Double = js.native
  /**
    * The error message code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var messageCode: String = js.native
  /**
    * Additional error message(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var messages: js.Array[String] = js.native
  /**
    * The query parameters sent with the http request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var requestOptions: js.Any = js.native
  /**
    * Indicates if the request required https.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var ssl: Boolean = js.native
  /**
    * The error message subcode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var subCode: Double = js.native
  /**
    * The URL of the request that returned an error message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var url: String = js.native
  /**
    * A function to retrieve headers sent from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  def getHeader(headerName: String): String = js.native
}

