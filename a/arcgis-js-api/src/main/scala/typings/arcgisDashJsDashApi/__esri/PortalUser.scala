package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`private`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.english
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.metric
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.org_admin
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.org_publisher
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.org_user
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.public
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalUser extends Accessor {
  /**
    * Indicates the level of access of the user. If private, the user descriptive information will not be available to others nor will the username be searchable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#access)
    */
  var access: `private` | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.org | public = js.native
  /**
    * The date the user was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#created)
    */
  var created: Date = js.native
  /**
    * The culture information for the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#culture)
    */
  var culture: String = js.native
  /**
    * A description of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#description)
    */
  var description: String = js.native
  /**
    * The user's e-mail address.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#email)
    */
  var email: String = js.native
  /**
    * The user's full name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fullName)
    */
  var fullName: String = js.native
  /**
    * The date the user was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#modified)
    */
  var modified: Date = js.native
  /**
    * The ID of the organization the user belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#orgId)
    */
  var orgId: String = js.native
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
  var preferredView: String = js.native
  /**
    * The user preferred region, used to set the featured maps on the home page, content in the gallery, and the default extent of new maps in the Viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#region)
    */
  var region: String = js.native
  /**
    * Defines the user's role in the organization. See [roleId](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#roleId) for more details about when user has a custom role.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role)
    */
  var role: org_admin | org_publisher | org_user = js.native
  /**
    * The ID of the user's role.  Only set if the user is assigned a custom role.  When present, the [role](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role) will indicate the "base" role of the custom role based on the privileges the custom role contains. For example, if the custom role contains some publisher privileges, the [role](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role) will be set to `org_publisher`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#roleId)
    */
  var roleId: String = js.native
  /**
    * The JSON used to create the property values when the `PortalUser` is created. Although most commonly used properties are exposed on the `PortalUser` class directly, this provides access to all information returned for the portal user. This property is useful if working in an application built using an older version of the API which requires access to a portal's user properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#sourceJSON)
    */
  var sourceJSON: js.Any = js.native
  /**
    * The URL to the thumbnail image for the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#thumbnailUrl)
    */
  val thumbnailUrl: String = js.native
  /**
    * The user's personal units of measure setting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#units)
    */
  var units: english | metric = js.native
  /**
    * The URL for the user's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#userContentUrl)
    */
  val userContentUrl: String = js.native
  /**
    * The username of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#username)
    */
  var username: String = js.native
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
  def addItem(params: PortalUserAddItemParams): js.Promise[PortalItem] = js.native
  /**
    * Deletes an item from the user's portal content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#deleteItem)
    *
    * @param item The portal item to remove.
    *
    */
  def deleteItem(item: PortalItem): js.Promise[_] = js.native
  /**
    * Deletes items from the user's portal content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#deleteItems)
    *
    * @param items The portal items to remove.
    *
    */
  def deleteItems(items: js.Array[PortalItem]): js.Promise[_] = js.native
  /**
    * Fetches all of the user's folders used to organize portal content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchFolders)
    *
    *
    */
  def fetchFolders(): js.Promise[js.Array[PortalFolder]] = js.native
  /**
    * Fetches all the groups that the portal user has permission to access.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchGroups)
    *
    *
    */
  def fetchGroups(): js.Promise[js.Array[PortalGroup]] = js.native
  /**
    * Retrieves all the items in the specified folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchItems)
    *
    * @param params See the object specifications table below for the parameters that may be passed as properties in this object.
    * @param params.folder The folder to retrieve items from.
    * @param params.num The maximum number of results to be included in the result set response. The maximum value allowed is 100. The start property combined with the num property can be used to paginate the search results.
    * @param params.sortField A comma-delimited list of fields to sort by. Allowed values are `created`, `modified`, `size`, and `type`.
    * @param params.sortOrder The order in which to sort the results. Allowed values are `asc` for ascending order and `desc` for descending order.
    * @param params.start The index of the first entry in the result set response. The index is 1-based.
    *
    */
  def fetchItems(): js.Promise[_] = js.native
  def fetchItems(params: PortalUserFetchItemsParams): js.Promise[_] = js.native
  /**
    * Fetches the tag objects that have been created by the portal user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchTags)
    *
    *
    */
  def fetchTags(): js.Promise[js.Array[_]] = js.native
  /**
    * Get the URL to the thumbnail image for the user.  Available width sizes: 150, 300 and 600.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#getThumbnailUrl)
    *
    * @param width The desired image width.
    *
    */
  def getThumbnailUrl(): String = js.native
  def getThumbnailUrl(width: Double): String = js.native
  /**
    * Executes a query against the user's favorite group to return an array of [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) objects that match the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#queryFavorites)
    *
    * @param queryParams The input query parameters defined in [PortalQueryParams](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html). This object may be [autocast](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#autocasting).
    *
    */
  def queryFavorites(): js.Promise[PortalQueryResult] = js.native
  def queryFavorites(queryParams: PortalQueryParams): js.Promise[PortalQueryResult] = js.native
}

@JSGlobal("__esri.PortalUser")
@js.native
object PortalUser extends TopLevel[PortalUserConstructor]

