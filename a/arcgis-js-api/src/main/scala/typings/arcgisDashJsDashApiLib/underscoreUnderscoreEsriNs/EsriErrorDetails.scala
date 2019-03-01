package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EsriErrorDetails
  extends stdLib.Object {
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
  var httpStatus: scala.Double = js.native
  /**
    * The error message code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var messageCode: java.lang.String = js.native
  /**
    * Additional error message(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var messages: js.Array[java.lang.String] = js.native
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
  var ssl: scala.Boolean = js.native
  /**
    * The error message subcode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var subCode: scala.Double = js.native
  /**
    * The URL of the request that returned an error message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  var url: java.lang.String = js.native
  /**
    * A function to retrieve headers sent from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails)
    */
  def getHeader(headerName: java.lang.String): java.lang.String = js.native
}

