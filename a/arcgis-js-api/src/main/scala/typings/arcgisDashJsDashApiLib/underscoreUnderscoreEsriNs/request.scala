package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait request extends js.Object {
  /**
    * Retrieves data from a remote server or uploads a file from a user's computer. If the request returns an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html), the error object will include the details specified in [EsriErrorDetails](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#EsriErrorDetails).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest)
    *
    * @param url The request URL.
    * @param options The options specified by the user in the data request. See [RequestOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions) for available properties.
    *
    */
  def esriRequest(url: java.lang.String): arcgisDashJsDashApiLib.IPromise[RequestResponse] = js.native
  def esriRequest(url: java.lang.String, options: RequestOptions): arcgisDashJsDashApiLib.IPromise[RequestResponse] = js.native
}

