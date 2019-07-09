package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var access: java.lang.String = js.native
  /**
    * Information on the source of the item and its copyright status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#accessInformation)
    */
  var accessInformation: java.lang.String = js.native
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
  var avgRating: scala.Double = js.native
  /**
    * An array of organization categories that are set on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#categories)
    */
  var categories: js.Array[java.lang.String] = js.native
  /**
    * The date the item was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#created)
    */
  var created: stdLib.Date = js.native
  /**
    * The item's locale information (language and country).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#culture)
    */
  var culture: java.lang.String = js.native
  /**
    * The detailed description of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#description)
    */
  var description: java.lang.String = js.native
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
  var groupCategories: js.Array[java.lang.String] = js.native
  /**
    * The unique id for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#id)
    */
  var id: java.lang.String = js.native
  /**
    * Indicates whether a layer can be created from this item using [Layer.fromPortalItem()](esri-layers-Layer.html#fromPortalItem).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#isLayer)
    */
  val isLayer: scala.Boolean = js.native
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
  val itemControl: java.lang.String = js.native
  /**
    * The URL to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#itemUrl)
    */
  val itemUrl: java.lang.String = js.native
  /**
    * Information on license or restrictions related to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#licenseInfo)
    */
  var licenseInfo: java.lang.String = js.native
  /**
    * Indicates whether the item's resources have loaded from the portal. When `true`, all the properties of the object can be accessed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#loaded)
    *
    * @default false
    */
  val loaded: scala.Boolean = js.native
  /**
    * The date the item was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#modified)
    */
  var modified: stdLib.Date = js.native
  /**
    * The name of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#name)
    */
  var name: java.lang.String = js.native
  /**
    * Number of comments on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numComments)
    */
  var numComments: scala.Double = js.native
  /**
    * Number of ratings on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numRatings)
    */
  var numRatings: scala.Double = js.native
  /**
    * Number of views on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numViews)
    */
  var numViews: scala.Double = js.native
  /**
    * The username of the user who owns this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#owner)
    */
  var owner: java.lang.String = js.native
  /**
    * The ID of the folder in which the owner has stored the item. This is only returned to the item owner or the org administrator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#ownerFolder)
    */
  var ownerFolder: java.lang.String = js.native
  /**
    * The portal that contains the item. Defaults to the value in [config.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) (e.g. https://www.arcgis.com). Suggested to use [config.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) instead of this property.
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
  var screenshots: js.Array[java.lang.String] = js.native
  /**
    * The size of the item (in bytes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#size)
    */
  var size: scala.Double = js.native
  /**
    * A summary description of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#snippet)
    */
  var snippet: java.lang.String = js.native
  /**
    * User defined tags that describe the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#tags)
    */
  var tags: js.Array[java.lang.String] = js.native
  /**
    * The URL to the thumbnail used for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#thumbnailUrl)
    */
  val thumbnailUrl: java.lang.String = js.native
  /**
    * The title for the item. This is the name that is displayed to users and used to refer to the item. Every item must have a title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#title)
    */
  var title: java.lang.String = js.native
  /**
    * The GIS content type of this item. Example types include Web Map, Map Service, Shapefile, and Web Mapping Application. See the [ArcGIS REST API Items and Items Types Reference](https://developers.arcgis.com/rest/users-groups-and-items/items-and-item-types.htm) to get an understanding of the item type hierarchy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#type)
    */
  var `type`: java.lang.String = js.native
  /**
    * Type keywords that describe the type of content of this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#typeKeywords)
    */
  var typeKeywords: js.Array[java.lang.String] = js.native
  /**
    * The service URL of this item. Only certain layer item types such as "Feature Service", "Map Service", "Image Service", "Scene Service", "WMS" and "KML" have service URLs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#url)
    */
  var url: java.lang.String = js.native
  def addRating(rating: PortalRating): arcgisDashJsDashApiLib.IPromise[PortalRating] = js.native
  /**
    * Adds a rating to an accessible item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#addRating)
    *
    * @param rating Rating to set for the item. Rating must be a number between 1.0 and 5.0.
    *
    */
  def addRating(rating: scala.Double): arcgisDashJsDashApiLib.IPromise[PortalRating] = js.native
  /**
    * Deletes a rating for the specified item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#deleteRating)
    *
    *
    */
  def deleteRating(): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Requests a PortalItem in the format specified in `responseType`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchData)
    *
    * @param responseType The format of the response. **Possible Values:** json | xml | text | blob | array-buffer | document
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def fetchData(): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def fetchData(responseType: java.lang.String): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def fetchData(responseType: java.lang.String, options: PortalItemFetchDataOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Returns the rating (if any) given to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRating)
    *
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def fetchRating(): arcgisDashJsDashApiLib.IPromise[PortalRating] = js.native
  def fetchRating(options: PortalItemFetchRatingOptions): arcgisDashJsDashApiLib.IPromise[PortalRating] = js.native
  /**
    * Gets all the related items of a certain relationship type for the portal item. An optional direction can be specified if the direction of the relationship is ambiguous. Otherwise, the service will try to infer it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    *
    * @param params See the object specifications table below for the parameters that may be passed as properties in this object.
    * @param params.relationshipType The type of relationship between the two items. See [Relationship types](https://developers.arcgis.com/rest/users-groups-and-items/relationship-types.htm) for a complete listing of types.
    * @param params.direction The direction of the relationship. Can either be `forward` (from origin to destination) or `reverse` (from destination to origin). **Possible Values:** forward | reverse
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def fetchRelatedItems(params: PortalItemFetchRelatedItemsParams): arcgisDashJsDashApiLib.IPromise[js.Array[PortalItem]] = js.native
  def fetchRelatedItems(params: PortalItemFetchRelatedItemsParams, options: PortalItemFetchRelatedItemsOptions): arcgisDashJsDashApiLib.IPromise[js.Array[PortalItem]] = js.native
  /**
    * Get the URL to the thumbnail image for the item.  Available width sizes: 200, 400, 800 and 2400.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#getThumbnailUrl)
    *
    * @param width The desired image width.
    *
    */
  def getThumbnailUrl(): java.lang.String = js.native
  def getThumbnailUrl(width: scala.Double): java.lang.String = js.native
  /**
    * Updates the item's properties to the portal, and optionally its data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#update)
    *
    * @param params See the object specifications table below for the parameters that may be passed as properties in this object.
    * @param params.data **Optional**. The component used to stream the data represented by the item to the client.
    *
    */
  def update(): arcgisDashJsDashApiLib.IPromise[PortalItem] = js.native
  def update(params: PortalItemUpdateParams): arcgisDashJsDashApiLib.IPromise[PortalItem] = js.native
  /**
    * Updates the item's thumbnail on the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#updateThumbnail)
    *
    * @param params See the object specification table below for the parameters that may be passed as properties in this object.
    * @param params.thumbnail A URL, Data URI, Blob, or File. The accepted formats are `GIF`, `JPG`, and `PNG`.
    *
    */
  def updateThumbnail(params: PortalItemUpdateThumbnailParams): arcgisDashJsDashApiLib.IPromise[PortalItem] = js.native
}

@JSGlobal("__esri.PortalItem")
@js.native
class PortalItemCls () extends PortalItem {
  def this(properties: PortalItemProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

