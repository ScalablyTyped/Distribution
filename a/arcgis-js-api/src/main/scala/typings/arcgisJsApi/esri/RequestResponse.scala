package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestResponse extends Object {
  /**
    * The requested data. Should match the `responseType` with the data return type. Possible types are: [json](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object), [xml](https://developer.mozilla.org/en-US/docs/Web/API/XMLDocument), [text](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String), [blob](https://developer.mozilla.org/en-US/docs/Web/API/Blob), [array-buffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer), [document](https://developer.mozilla.org/en-US/docs/Web/API/HTMLDocument), and [image](https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Method for getting a header sent from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var getHeader: js.UndefOr[GetHeader] = js.native
  /**
    * The options specified by the user in the data request. See [RequestOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions) for available properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var requestOptions: js.UndefOr[RequestOptions] = js.native
  /**
    * Indicates if the request required https.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var ssl: js.UndefOr[Boolean] = js.native
  /**
    * The URL used to request the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse)
    */
  var url: js.UndefOr[String] = js.native
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
  implicit class RequestResponseOps[Self <: RequestResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setGetHeader(value: /* headerName */ String => String): Self = this.set("getHeader", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetHeader: Self = this.set("getHeader", js.undefined)
    @scala.inline
    def setRequestOptions(value: RequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

