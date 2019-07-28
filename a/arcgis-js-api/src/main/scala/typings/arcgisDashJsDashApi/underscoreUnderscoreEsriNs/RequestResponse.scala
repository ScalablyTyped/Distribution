package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestResponse extends Object {
  /**
    * The requested data. Should match the `responseType` with the data return type. Possible types are: [json](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object), [xml](https://developer.mozilla.org/en-US/docs/Web/API/XMLDocument), [text](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String), [blob](https://developer.mozilla.org/en-US/docs/Web/API/Blob), [array-buffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer), [document](https://developer.mozilla.org/en-US/docs/Web/API/HTMLDocument), and [image](https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement).
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
    * The options specified by the user in the data request. See [RequestOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions) for available properties.
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
    propertyIsEnumerable: PropertyKey => Boolean,
    data: js.Any = null,
    getHeader: GetHeader = null,
    requestOptions: RequestOptions = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): RequestResponse = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (data != null) __obj.updateDynamic("data")(data)
    if (getHeader != null) __obj.updateDynamic("getHeader")(getHeader)
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RequestResponse]
  }
}

