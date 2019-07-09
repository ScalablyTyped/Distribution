package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalItemProperties extends LoadableProperties {
  /**
    * Indicates the level of access to this item: `private`, `shared`, `org`, or `public`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#access)
    */
  var access: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Information on the source of the item and its copyright status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#accessInformation)
    */
  var accessInformation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Average rating. Uses a weighted average called "Bayesian average."
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#avgRating)
    */
  var avgRating: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array of organization categories that are set on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#categories)
    */
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var culture: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The detailed description of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#description)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
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
  var groupCategories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The unique id for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#id)
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Information on license or restrictions related to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#licenseInfo)
    */
  var licenseInfo: js.UndefOr[java.lang.String] = js.undefined
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
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of comments on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numComments)
    */
  var numComments: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of ratings on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numRatings)
    */
  var numRatings: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of views on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numViews)
    */
  var numViews: js.UndefOr[scala.Double] = js.undefined
  /**
    * The username of the user who owns this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#owner)
    */
  var owner: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the folder in which the owner has stored the item. This is only returned to the item owner or the org administrator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#ownerFolder)
    */
  var ownerFolder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The portal that contains the item. Defaults to the value in [config.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) (e.g. https://www.arcgis.com). Suggested to use [config.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) instead of this property.
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
  var screenshots: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The size of the item (in bytes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#size)
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * A summary description of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#snippet)
    */
  var snippet: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User defined tags that describe the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#tags)
    */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The title for the item. This is the name that is displayed to users and used to refer to the item. Every item must have a title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#title)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The GIS content type of this item. Example types include Web Map, Map Service, Shapefile, and Web Mapping Application. See the [ArcGIS REST API Items and Items Types Reference](https://developers.arcgis.com/rest/users-groups-and-items/items-and-item-types.htm) to get an understanding of the item type hierarchy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#type)
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type keywords that describe the type of content of this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#typeKeywords)
    */
  var typeKeywords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The service URL of this item. Only certain layer item types such as "Feature Service", "Map Service", "Image Service", "Scene Service", "WMS" and "KML" have service URLs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#url)
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object PortalItemProperties {
  @scala.inline
  def apply(
    access: java.lang.String = null,
    accessInformation: java.lang.String = null,
    avgRating: scala.Int | scala.Double = null,
    categories: js.Array[java.lang.String] = null,
    created: DateProperties = null,
    culture: java.lang.String = null,
    description: java.lang.String = null,
    extent: ExtentProperties = null,
    groupCategories: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    licenseInfo: java.lang.String = null,
    modified: DateProperties = null,
    name: java.lang.String = null,
    numComments: scala.Int | scala.Double = null,
    numRatings: scala.Int | scala.Double = null,
    numViews: scala.Int | scala.Double = null,
    owner: java.lang.String = null,
    ownerFolder: java.lang.String = null,
    portal: PortalProperties = null,
    screenshots: js.Array[java.lang.String] = null,
    size: scala.Int | scala.Double = null,
    snippet: java.lang.String = null,
    tags: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    typeKeywords: js.Array[java.lang.String] = null,
    url: java.lang.String = null
  ): PortalItemProperties = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access)
    if (accessInformation != null) __obj.updateDynamic("accessInformation")(accessInformation)
    if (avgRating != null) __obj.updateDynamic("avgRating")(avgRating.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (groupCategories != null) __obj.updateDynamic("groupCategories")(groupCategories)
    if (id != null) __obj.updateDynamic("id")(id)
    if (licenseInfo != null) __obj.updateDynamic("licenseInfo")(licenseInfo)
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (numComments != null) __obj.updateDynamic("numComments")(numComments.asInstanceOf[js.Any])
    if (numRatings != null) __obj.updateDynamic("numRatings")(numRatings.asInstanceOf[js.Any])
    if (numViews != null) __obj.updateDynamic("numViews")(numViews.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (ownerFolder != null) __obj.updateDynamic("ownerFolder")(ownerFolder)
    if (portal != null) __obj.updateDynamic("portal")(portal)
    if (screenshots != null) __obj.updateDynamic("screenshots")(screenshots)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (typeKeywords != null) __obj.updateDynamic("typeKeywords")(typeKeywords)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PortalItemProperties]
  }
}

