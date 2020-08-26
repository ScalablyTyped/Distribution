package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`array-buffer`
import typings.arcgisJsApi.arcgisJsApiStrings.blob
import typings.arcgisJsApi.arcgisJsApiStrings.document
import typings.arcgisJsApi.arcgisJsApiStrings.json
import typings.arcgisJsApi.arcgisJsApiStrings.text
import typings.arcgisJsApi.arcgisJsApiStrings.xml
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalItemResource extends Accessor {
  /**
    * Path of the resource relative to `{ITEM}/resources/`. Resource paths may include subfolders, but are always specified relative to the item resources endpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#path)
    */
  var path: String = js.native
  /**
    * The [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) that owns the resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  /**
    * The absolute url to the item resource. This is computed from the [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) and the [resource path](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#path).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#url)
    */
  val url: String = js.native
  /**
    * Requests the PortalItemResource data in the format specified for the `responseType`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#fetch)
    *
    * @param responseType The format of the response.
    * @param options An object wih the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def fetch(): js.Promise[_] = js.native
  def fetch(responseType: js.UndefOr[scala.Nothing], options: PortalItemResourceFetchOptions): js.Promise[_] = js.native
  @JSName("fetch")
  def fetch_arraybuffer(responseType: `array-buffer`): js.Promise[_] = js.native
  @JSName("fetch")
  def fetch_arraybuffer(responseType: `array-buffer`, options: PortalItemResourceFetchOptions): js.Promise[_] = js.native
  @JSName("fetch")
  def fetch_blob(responseType: blob): js.Promise[_] = js.native
  @JSName("fetch")
  def fetch_blob(responseType: blob, options: PortalItemResourceFetchOptions): js.Promise[_] = js.native
  @JSName("fetch")
  def fetch_document(responseType: document): js.Promise[_] = js.native
  @JSName("fetch")
  def fetch_document(responseType: document, options: PortalItemResourceFetchOptions): js.Promise[_] = js.native
  @JSName("fetch")
  def fetch_json(responseType: json): js.Promise[_] = js.native
  @JSName("fetch")
  def fetch_json(responseType: json, options: PortalItemResourceFetchOptions): js.Promise[_] = js.native
  @JSName("fetch")
  def fetch_text(responseType: text): js.Promise[_] = js.native
  @JSName("fetch")
  def fetch_text(responseType: text, options: PortalItemResourceFetchOptions): js.Promise[_] = js.native
  @JSName("fetch")
  def fetch_xml(responseType: xml): js.Promise[_] = js.native
  @JSName("fetch")
  def fetch_xml(responseType: xml, options: PortalItemResourceFetchOptions): js.Promise[_] = js.native
  /**
    * Updates an existing resource with new content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#update)
    *
    * @param content The resource content.
    * @param options An object wih the following properties.
    * @param options.access Indicates the level of access to the resource. The default is "inherit" which causes the resource to have the same access level as the owning item.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def update(content: Blob): js.Promise[_] = js.native
  def update(content: Blob, options: PortalItemResourceUpdateOptions): js.Promise[_] = js.native
}

