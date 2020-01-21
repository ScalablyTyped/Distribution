package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalItemProperties extends LoadableProperties {
  /**
    * Indicates the level of access to this item: `private`, `shared`, `org`, or `public`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#access)
    */
  var access: js.UndefOr[String] = js.undefined
  /**
    * Information on the source of the item and its copyright status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#accessInformation)
    */
  var accessInformation: js.UndefOr[String] = js.undefined
  /**
    * Average rating. Uses a weighted average called "Bayesian average."
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#avgRating)
    */
  var avgRating: js.UndefOr[Double] = js.undefined
  /**
    * An array of organization categories that are set on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#categories)
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The date the item was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.undefined
  /**
    * The item's locale information (language and country).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#culture)
    */
  var culture: js.UndefOr[String] = js.undefined
  /**
    * The detailed description of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The geographic extent, or bounding rectangle, of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * An array of group categories set on the item. This varies slightly from `categories` as it only returns categories in the group content returned from [PortalGroup.queryItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#queryItems).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#groupCategories)
    */
  var groupCategories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The unique id for the item. You can typically find the id for an item in its url.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#id)
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Information on license or restrictions related to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#licenseInfo)
    */
  var licenseInfo: js.UndefOr[String] = js.undefined
  /**
    * The date the item was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#modified)
    */
  var modified: js.UndefOr[DateProperties] = js.undefined
  /**
    * The name of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Number of comments on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numComments)
    */
  var numComments: js.UndefOr[Double] = js.undefined
  /**
    * Number of ratings on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numRatings)
    */
  var numRatings: js.UndefOr[Double] = js.undefined
  /**
    * Number of views on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numViews)
    */
  var numViews: js.UndefOr[Double] = js.undefined
  /**
    * The username of the user who owns this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#owner)
    */
  var owner: js.UndefOr[String] = js.undefined
  /**
    * The ID of the folder in which the owner has stored the item. This is only returned to the item owner or the org administrator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#ownerFolder)
    */
  var ownerFolder: js.UndefOr[String] = js.undefined
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
  var portal: js.UndefOr[PortalProperties] = js.undefined
  /**
    * An array of string URLs. These URLs should point to screenshots (i.e. screen captures) associated with an application.  An example value could be something similar to `"screenshots/Basic.png"`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#screenshots)
    *
    * @default null
    */
  var screenshots: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The size of the item (in bytes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#size)
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * A summary description of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#snippet)
    */
  var snippet: js.UndefOr[String] = js.undefined
  /**
    * The JSON used to create the property values when the `PortalItem` is loaded. Although most commonly used properties are exposed on the `PortalItem` class directly, this provides access to all information returned by the portal item. This property is useful if working in an application built using an older version of the API which requires access to a portal's item properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.undefined
  /**
    * User defined tags that describe the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#tags)
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The title for the item. This is the name that is displayed to users and used to refer to the item. Every item must have a title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The GIS content type of this item. Example types include Web Map, Map Service, Shapefile, and Web Mapping Application. See the [ArcGIS REST API Items and Items Types Reference](https://developers.arcgis.com/rest/users-groups-and-items/items-and-item-types.htm) to get an understanding of the item type hierarchy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#type)
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Type keywords that describe the type of content of this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#typeKeywords)
    */
  var typeKeywords: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The service URL of this item. Only certain layer item types such as "Feature Service", "Map Service", "Image Service", "Scene Service", "WMS" and "KML" have service URLs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}

object PortalItemProperties {
  @scala.inline
  def apply(
    access: String = null,
    accessInformation: String = null,
    avgRating: Int | Double = null,
    categories: js.Array[String] = null,
    created: DateProperties = null,
    culture: String = null,
    description: String = null,
    extent: ExtentProperties = null,
    groupCategories: js.Array[String] = null,
    id: String = null,
    licenseInfo: String = null,
    modified: DateProperties = null,
    name: String = null,
    numComments: Int | Double = null,
    numRatings: Int | Double = null,
    numViews: Int | Double = null,
    owner: String = null,
    ownerFolder: String = null,
    portal: PortalProperties = null,
    screenshots: js.Array[String] = null,
    size: Int | Double = null,
    snippet: String = null,
    sourceJSON: js.Any = null,
    tags: js.Array[String] = null,
    title: String = null,
    `type`: String = null,
    typeKeywords: js.Array[String] = null,
    url: String = null
  ): PortalItemProperties = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessInformation != null) __obj.updateDynamic("accessInformation")(accessInformation.asInstanceOf[js.Any])
    if (avgRating != null) __obj.updateDynamic("avgRating")(avgRating.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (groupCategories != null) __obj.updateDynamic("groupCategories")(groupCategories.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (licenseInfo != null) __obj.updateDynamic("licenseInfo")(licenseInfo.asInstanceOf[js.Any])
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numComments != null) __obj.updateDynamic("numComments")(numComments.asInstanceOf[js.Any])
    if (numRatings != null) __obj.updateDynamic("numRatings")(numRatings.asInstanceOf[js.Any])
    if (numViews != null) __obj.updateDynamic("numViews")(numViews.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (ownerFolder != null) __obj.updateDynamic("ownerFolder")(ownerFolder.asInstanceOf[js.Any])
    if (portal != null) __obj.updateDynamic("portal")(portal.asInstanceOf[js.Any])
    if (screenshots != null) __obj.updateDynamic("screenshots")(screenshots.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (sourceJSON != null) __obj.updateDynamic("sourceJSON")(sourceJSON.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeKeywords != null) __obj.updateDynamic("typeKeywords")(typeKeywords.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalItemProperties]
  }
}

