package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalUser extends Accessor {
  /**
    * Indicates the level of access of the user. If private, the user descriptive information will not be available to others nor will the username be searchable.  **Possible Values:** private | org | public
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#access)
    */
  var access: java.lang.String = js.native
  /**
    * The date the user was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#created)
    */
  var created: stdLib.Date = js.native
  /**
    * The culture information for the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#culture)
    */
  var culture: java.lang.String = js.native
  /**
    * A description of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#description)
    */
  var description: java.lang.String = js.native
  /**
    * The user's e-mail address.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#email)
    */
  var email: java.lang.String = js.native
  /**
    * The user's full name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fullName)
    */
  var fullName: java.lang.String = js.native
  /**
    * The date the user was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#modified)
    */
  var modified: stdLib.Date = js.native
  /**
    * The ID of the organization the user belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#orgId)
    */
  var orgId: java.lang.String = js.native
  /**
    * The portal associated with the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#portal)
    */
  var portal: Portal = js.native
  /**
    * The user's preferred view for content, either web or GIS.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#preferredView)
    */
  var preferredView: java.lang.String = js.native
  /**
    * The user preferred region, used to set the featured maps on the home page, content in the gallery, and the default extent of new maps in the Viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#region)
    */
  var region: java.lang.String = js.native
  /**
    * Defines the user's role in the organization. See [roleId](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#roleId) for more details about when user has a custom role.  **Possible Values:** org_admin | org_publisher | org_user
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role)
    */
  var role: java.lang.String = js.native
  /**
    * The ID of the user's role.  Only set if the user is assigned a custom role.  When present, the [role](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role) will indicate the "base" role of the custom role based on the privileges the custom role contains. For example, if the custom role contains some publisher privileges, the [role](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role) will be set to `org_publisher`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#roleId)
    */
  var roleId: java.lang.String = js.native
  /**
    * The URL to the thumbnail image for the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#thumbnailUrl)
    */
  val thumbnailUrl: java.lang.String = js.native
  /**
    * The user's personal units of measure setting.  **Possible Values:** english | metric
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#units)
    */
  var units: java.lang.String = js.native
  /**
    * The URL for the user's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#userContentUrl)
    */
  val userContentUrl: java.lang.String = js.native
  /**
    * The username of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#username)
    */
  var username: java.lang.String = js.native
  /**
    * Adds an item to the user's portal content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem)
    *
    * @param params See the object specifications table below for the parameters that may be passed as properties in this object.
    * @param params.item The item to add to the user's content.
    * @param params.data The component used to stream the data represented by the item to the client.
    * @param params.folder The portal folder in which to store the item.
    *
    */
  def addItem(params: PortalUserAddItemParams): arcgisDashJsDashApiLib.IPromise[PortalItem] = js.native
  /**
    * Deletes an item from the user's portal content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#deleteItem)
    *
    * @param item The portal item to remove.
    *
    */
  def deleteItem(item: PortalItem): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Deletes items from the user's portal content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#deleteItems)
    *
    * @param items The portal items to remove.
    *
    */
  def deleteItems(items: js.Array[PortalItem]): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Fetches all of the user's folders used to organize portal content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchFolders)
    *
    *
    */
  def fetchFolders(): arcgisDashJsDashApiLib.IPromise[js.Array[PortalFolder]] = js.native
  /**
    * Fetches all the groups that the portal user has permission to access.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchGroups)
    *
    *
    */
  def fetchGroups(): arcgisDashJsDashApiLib.IPromise[js.Array[PortalGroup]] = js.native
  /**
    * Retrieves all the items in the specified folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchItems)
    *
    * @param params See the object specifications table below for the parameters that may be passed as properties in this object.
    * @param params.folder The folder to retrieve items from.
    * @param params.num The maximum number of results to be included in the result set response. The maximum value allowed is 100. The start property combined with the num property can be used to paginate the search results.
    * @param params.start The index of the first entry in the result set response. The index is 1-based.
    *
    */
  def fetchItems(): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def fetchItems(params: PortalUserFetchItemsParams): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Get the URL to the thumbnail image for the user.  Available width sizes: 150, 300 and 600.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#getThumbnailUrl)
    *
    * @param width The desired image width.
    *
    */
  def getThumbnailUrl(): java.lang.String = js.native
  def getThumbnailUrl(width: scala.Double): java.lang.String = js.native
  /**
    * Executes a query against the user's favorite group to return an array of [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) objects that match the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#queryFavorites)
    *
    * @param queryParams The input query parameters defined in [PortalQueryParams](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html). This object may be [autocast](https://developers.arcgis.com/javascript/latest/guide/autocasting/).
    *
    */
  def queryFavorites(): arcgisDashJsDashApiLib.IPromise[PortalQueryResult] = js.native
  def queryFavorites(queryParams: PortalQueryParams): arcgisDashJsDashApiLib.IPromise[PortalQueryResult] = js.native
}

