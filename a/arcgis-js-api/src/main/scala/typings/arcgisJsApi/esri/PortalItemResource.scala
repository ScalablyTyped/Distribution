package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`array-buffer`
import typings.arcgisJsApi.arcgisJsApiStrings.blob
import typings.arcgisJsApi.arcgisJsApiStrings.document
import typings.arcgisJsApi.arcgisJsApiStrings.json
import typings.arcgisJsApi.arcgisJsApiStrings.text
import typings.arcgisJsApi.arcgisJsApiStrings.xml
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalItemResource extends Accessor {
  
  /**
    * Requests the PortalItemResource data in the format specified for the `responseType`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#fetch)
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
    * Path of the resource relative to `{ITEM}/resources/`.
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
    * Updates an existing resource with new content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#update)
    */
  def update(content: Blob): js.Promise[_] = js.native
  def update(content: Blob, options: PortalItemResourceUpdateOptions): js.Promise[_] = js.native
  
  /**
    * The absolute url to the item resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#url)
    */
  val url: String = js.native
}
