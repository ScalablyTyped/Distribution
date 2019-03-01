package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalGroup extends Accessor {
  /**
    * The access privileges on the group which determines who can see and access the group.  **Possible Values:** private | org | public
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#access)
    */
  var access: java.lang.String = js.native
  /**
    * The date the group was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#created)
    */
  var created: stdLib.Date = js.native
  /**
    * A detailed description of the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#description)
    */
  var description: java.lang.String = js.native
  /**
    * The unique id for the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#id)
    */
  var id: java.lang.String = js.native
  /**
    * If set to `true`, then users will not be able to apply to join the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#isInvitationOnly)
    *
    * @default false
    */
  var isInvitationOnly: scala.Boolean = js.native
  /**
    * The date the group was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#modified)
    */
  var modified: stdLib.Date = js.native
  /**
    * The username of the group's owner.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#owner)
    */
  var owner: java.lang.String = js.native
  /**
    * The portal associated with the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#portal)
    */
  var portal: Portal = js.native
  /**
    * A short summary that describes the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#snippet)
    */
  var snippet: java.lang.String = js.native
  /**
    * User defined tags that describe the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#tags)
    */
  var tags: js.Array[java.lang.String] = js.native
  /**
    * The URL to the thumbnail used for the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#thumbnailUrl)
    */
  val thumbnailUrl: java.lang.String = js.native
  /**
    * The title of the group. This is the name that is displayed to users. It is also used to refer to the group. Every group must have a title and it must be unique.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#title)
    */
  var title: java.lang.String = js.native
  /**
    * The URL to the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#url)
    */
  val url: java.lang.String = js.native
  /**
    * If present, fetches the group's category schema.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#fetchCategorySchema)
    *
    *
    */
  def fetchCategorySchema(): arcgisDashJsDashApiLib.IPromise[js.Array[_]] = js.native
  /**
    * Fetches the current members of the group. This method is only available to members or administrators of the group. View the ArcGIS REST API documentation for the [Group Users](https://developers.arcgis.com/rest/users-groups-and-items/group-users.htm) for more details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#fetchMembers)
    *
    *
    */
  def fetchMembers(): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Get the URL to the thumbnail image for the group.  Available width sizes: 150, 300 and 600.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#getThumbnailUrl)
    *
    * @param width The desired image width.
    *
    */
  def getThumbnailUrl(): java.lang.String = js.native
  def getThumbnailUrl(width: scala.Double): java.lang.String = js.native
  /**
    * Executes a query against the group to return an array of [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) objects that match the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#queryItems)
    *
    * @param queryParams The input query parameters defined in [PortalQueryParams](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html).
    *
    */
  def queryItems(): arcgisDashJsDashApiLib.IPromise[PortalQueryResult] = js.native
  def queryItems(queryParams: PortalQueryParams): arcgisDashJsDashApiLib.IPromise[PortalQueryResult] = js.native
  def queryItems(queryParams: PortalQueryParamsProperties): arcgisDashJsDashApiLib.IPromise[PortalQueryResult] = js.native
}

