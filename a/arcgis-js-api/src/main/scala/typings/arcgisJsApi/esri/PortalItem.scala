package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`array-buffer`
import typings.arcgisJsApi.arcgisJsApiStrings.`null`
import typings.arcgisJsApi.arcgisJsApiStrings.admin
import typings.arcgisJsApi.arcgisJsApiStrings.blob
import typings.arcgisJsApi.arcgisJsApiStrings.document
import typings.arcgisJsApi.arcgisJsApiStrings.json
import typings.arcgisJsApi.arcgisJsApiStrings.text
import typings.arcgisJsApi.arcgisJsApiStrings.update
import typings.arcgisJsApi.arcgisJsApiStrings.xml
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalItem
  extends Accessor
     with Loadable
     with JSONSupport {
  /**
    * Indicates the level of access to this item: `private`, `shared`, `org`, or `public`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#access)
    */
  var access: String = js.native
  /**
    * Information on the source of the item and its copyright status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#accessInformation)
    */
  var accessInformation: String = js.native
  /**
    * Contains an array of objects containing proxy information for premium platform services. This is most widely seen in registered applications that work with premium and subscriber services, e.g. routing and analysis services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#applicationProxies)
    */
  val applicationProxies: js.Array[PortalItemApplicationProxies] = js.native
  /**
    * Average rating. Uses a weighted average called "Bayesian average."
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#avgRating)
    */
  var avgRating: Double = js.native
  /**
    * An array of organization categories that are set on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#categories)
    */
  var categories: js.Array[String] = js.native
  /**
    * The date the item was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#created)
    */
  var created: Date = js.native
  /**
    * The item's locale information (language and country).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#culture)
    */
  var culture: String = js.native
  /**
    * The detailed description of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#description)
    */
  var description: String = js.native
  /**
    * The geographic extent, or bounding rectangle, of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#extent)
    */
  var extent: Extent = js.native
  /**
    * An array of group categories set on the item. This varies slightly from `categories` as it only returns categories in the group content returned from [PortalGroup.queryItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#queryItems).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#groupCategories)
    */
  var groupCategories: js.Array[String] = js.native
  /**
    * The unique id for the item. You can typically find the id for an item in its url.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#id)
    */
  var id: String = js.native
  /**
    * Indicates whether a layer can be created from this item using [Layer.fromPortalItem()](esri-layers-Layer.html#fromPortalItem).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#isLayer)
    */
  val isLayer: Boolean = js.native
  /**
    * Indicates whether an item can be updated and deleted.
    *
    * Possible Value | Description
    * ---------------|------------
    * admin | The item can be updated or deleted.
    * update | The item can be updated, but not deleted.
    * null | The item cannot be updated nor deleted.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#itemControl)
    */
  val itemControl: admin | update | `null` = js.native
  /**
    * The URL to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#itemUrl)
    */
  val itemUrl: String = js.native
  /**
    * Information on license or restrictions related to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#licenseInfo)
    */
  var licenseInfo: String = js.native
  /**
    * Indicates whether the item's resources have loaded from the portal. When `true`, all the properties of the object can be accessed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#loaded)
    *
    * @default false
    */
  val loaded: Boolean = js.native
  /**
    * The date the item was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#modified)
    */
  var modified: Date = js.native
  /**
    * The name of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#name)
    */
  var name: String = js.native
  /**
    * Number of comments on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numComments)
    */
  var numComments: Double = js.native
  /**
    * Number of ratings on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numRatings)
    */
  var numRatings: Double = js.native
  /**
    * Number of views on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numViews)
    */
  var numViews: Double = js.native
  /**
    * The username of the user who owns this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#owner)
    */
  var owner: String = js.native
  /**
    * The ID of the folder in which the owner has stored the item. This is only returned to the item owner or the org administrator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#ownerFolder)
    */
  var ownerFolder: String = js.native
  /**
    * The portal that contains the item. It uses Portal.getDefault(). This, in turn, obtains the URL from [config.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl). It's suggested to use [config.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) instead of this property. If needing to work with multiple portal instances, either set the portal's [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#url) directly within the PortalItem or create separate portal instances before passing them into the PortalItem.portal property. Both examples are shown below.
    * ```js
    * Layer.fromPortalItem({
    *   portalItem: {
    *     id: "e691172598f04ea8881cd2a4adaa45ba",
    *     // autocastable to Portal
    *     portal: {
    *       url: "https://thePortalUrl"
    *     }
    *   }
    * });
    * ```
    *
    * ```js
    * let portalA = new Portal({ url: "https://www.exampleA.com/arcgis" // First instance });  let portalB = new Portal({ url: "https://www.exampleB.com/arcgis" // Second instance });  let item = new PortalItem({ id: "e691172598f04ea8881cd2a4adaa45ba", portal: portalA // This loads the first portal instance set above });  item.load();
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#portal)
    */
  var portal: Portal = js.native
  /**
    * An array of string URLs. These URLs should point to screenshots (i.e. screen captures) associated with an application.  An example value could be something similar to `"screenshots/Basic.png"`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#screenshots)
    *
    * @default null
    */
  var screenshots: js.Array[String] = js.native
  /**
    * The size of the item (in bytes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#size)
    */
  var size: Double = js.native
  /**
    * A summary description of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#snippet)
    */
  var snippet: String = js.native
  /**
    * The JSON used to create the property values when the `PortalItem` is loaded. Although most commonly used properties are exposed on the `PortalItem` class directly, this provides access to all information returned by the portal item. This property is useful if working in an application built using an older version of the API which requires access to a portal's item properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#sourceJSON)
    */
  var sourceJSON: js.Any = js.native
  /**
    * User defined tags that describe the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#tags)
    */
  var tags: js.Array[String] = js.native
  /**
    * The URL to the thumbnail used for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#thumbnailUrl)
    */
  val thumbnailUrl: String = js.native
  /**
    * The title for the item. This is the name that is displayed to users and used to refer to the item. Every item must have a title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#title)
    */
  var title: String = js.native
  /**
    * The GIS content type of this item. Example types include Web Map, Map Service, Shapefile, and Web Mapping Application. See the [ArcGIS REST API Items and Items Types Reference](https://developers.arcgis.com/rest/users-groups-and-items/items-and-item-types.htm) to get an understanding of the item type hierarchy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#type)
    */
  var `type`: String = js.native
  /**
    * Type keywords that describe the type of content of this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#typeKeywords)
    */
  var typeKeywords: js.Array[String] = js.native
  /**
    * The service URL of this item. Only certain layer item types such as "Feature Service", "Map Service", "Image Service", "Scene Service", "WMS" and "KML" have service URLs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#url)
    */
  var url: String = js.native
  /**
    * Adds a rating to an accessible item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#addRating)
    *
    * @param rating Rating to set for the item. Rating must be a number between 1.0 and 5.0.
    *
    */
  def addRating(rating: Double): js.Promise[PortalRating] = js.native
  def addRating(rating: PortalRating): js.Promise[PortalRating] = js.native
  /**
    * Deletes a rating for the specified item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#deleteRating)
    *
    *
    */
  def deleteRating(): js.Promise[_] = js.native
  /**
    * Requests a PortalItem in the format specified in `responseType`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchData)
    *
    * @param responseType The format of the response.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def fetchData(): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_arraybuffer(responseType: `array-buffer`): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_arraybuffer(responseType: `array-buffer`, options: PortalItemFetchDataOptions): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_blob(responseType: blob): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_blob(responseType: blob, options: PortalItemFetchDataOptions): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_document(responseType: document): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_document(responseType: document, options: PortalItemFetchDataOptions): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_json(responseType: json): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_json(responseType: json, options: PortalItemFetchDataOptions): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_text(responseType: text): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_text(responseType: text, options: PortalItemFetchDataOptions): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_xml(responseType: xml): js.Promise[_] = js.native
  @JSName("fetchData")
  def fetchData_xml(responseType: xml, options: PortalItemFetchDataOptions): js.Promise[_] = js.native
  /**
    * Returns the rating (if any) given to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRating)
    *
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def fetchRating(): js.Promise[PortalRating] = js.native
  def fetchRating(options: PortalItemFetchRatingOptions): js.Promise[PortalRating] = js.native
  /**
    * Gets all the related items of a certain relationship type for the portal item. An optional direction can be specified if the direction of the relationship is ambiguous. Otherwise, the service will try to infer it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    *
    * @param params See the object specifications table below for the parameters that may be passed as properties in this object.
    * @param params.relationshipType The type of relationship between the two items. See [Relationship types](https://developers.arcgis.com/rest/users-groups-and-items/relationship-types.htm) for a complete listing of types.
    * @param params.direction The direction of the relationship. Can either be `forward` (from origin to destination) or `reverse` (from destination to origin).
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def fetchRelatedItems(params: PortalItemFetchRelatedItemsParams): js.Promise[js.Array[PortalItem]] = js.native
  def fetchRelatedItems(params: PortalItemFetchRelatedItemsParams, options: PortalItemFetchRelatedItemsOptions): js.Promise[js.Array[PortalItem]] = js.native
  /**
    * Get the URL to the thumbnail image for the item.  Available width sizes: 200, 400, 800 and 2400.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#getThumbnailUrl)
    *
    * @param width The desired image width.
    *
    */
  def getThumbnailUrl(): String = js.native
  def getThumbnailUrl(width: Double): String = js.native
  /**
    * Updates the item's properties to the portal, and optionally its data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#update)
    *
    * @param params See the object specifications table below for the parameters that may be passed as properties in this object.
    * @param params.data **Optional**. The component used to stream the data represented by the item to the client.
    *
    */
  def update(): js.Promise[PortalItem] = js.native
  def update(params: PortalItemUpdateParams): js.Promise[PortalItem] = js.native
  /**
    * Updates the item's thumbnail on the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#updateThumbnail)
    *
    * @param params See the object specification table below for the parameters that may be passed as properties in this object.
    * @param params.thumbnail A URL, Data URI, Blob, or File. The accepted formats are `GIF`, `JPG`, and `PNG`.
    * @param params.filename The file name used for the thumbnail in [thumbnailUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#thumbnailUrl).
    *
    */
  def updateThumbnail(params: PortalItemUpdateThumbnailParams): js.Promise[PortalItem] = js.native
}

