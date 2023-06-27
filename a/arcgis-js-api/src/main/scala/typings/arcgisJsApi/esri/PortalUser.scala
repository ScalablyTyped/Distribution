package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`private`
import typings.arcgisJsApi.arcgisJsApiStrings.english
import typings.arcgisJsApi.arcgisJsApiStrings.metric
import typings.arcgisJsApi.arcgisJsApiStrings.org_
import typings.arcgisJsApi.arcgisJsApiStrings.org_admin
import typings.arcgisJsApi.arcgisJsApiStrings.org_publisher
import typings.arcgisJsApi.arcgisJsApiStrings.org_user
import typings.arcgisJsApi.arcgisJsApiStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalUser
  extends StObject
     with Accessor {
  
  /**
  		 * Indicates the level of access of the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#access)
  		 */
  var access: `private` | org_ | public = js.native
  
  /**
  		 * Adds an item to the user's portal content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem)
  		 */
  def addItem(params: PortalUserAddItemParams): js.Promise[PortalItem] = js.native
  
  /**
  		 * The date the user was created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#created)
  		 */
  var created: js.Date = js.native
  
  /**
  		 * The culture information for the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#culture)
  		 */
  var culture: String = js.native
  
  /**
  		 * Deletes an item from the user's portal content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#deleteItem)
  		 */
  def deleteItem(item: PortalItem): js.Promise[Any] = js.native
  
  /**
  		 * Deletes items from the user's portal content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#deleteItems)
  		 */
  def deleteItems(items: js.Array[PortalItem]): js.Promise[Any] = js.native
  
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
  		 * Fetches all of the user's folders used to organize portal content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchFolders)
  		 */
  def fetchFolders(): js.Promise[js.Array[PortalFolder]] = js.native
  
  /**
  		 * Fetches all the groups that the portal user has permission to access.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchGroups)
  		 */
  def fetchGroups(): js.Promise[js.Array[PortalGroup]] = js.native
  
  /**
  		 * Retrieves all the items in the specified folder.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchItems)
  		 */
  def fetchItems(): js.Promise[Any] = js.native
  def fetchItems(params: PortalUserFetchItemsParams): js.Promise[Any] = js.native
  
  /**
  		 * Fetches the tag objects that have been created by the portal user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fetchTags)
  		 */
  def fetchTags(): js.Promise[js.Array[Any]] = js.native
  
  /**
  		 * The user's full name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fullName)
  		 */
  var fullName: String = js.native
  
  /**
  		 * Get the URL to the thumbnail image for the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#getThumbnailUrl)
  		 */
  def getThumbnailUrl(): String = js.native
  def getThumbnailUrl(width: Double): String = js.native
  
  /**
  		 * The date the user was last modified.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#modified)
  		 */
  var modified: js.Date = js.native
  
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
  		 * Executes a query against the user's favorite group to return an array of [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) objects that match the input query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#queryFavorites)
  		 */
  def queryFavorites(): js.Promise[PortalQueryResult] = js.native
  def queryFavorites(queryParams: PortalQueryParams): js.Promise[PortalQueryResult] = js.native
  
  /**
  		 * The user preferred region, used to set the featured maps on the home page, content in the gallery, and the default extent of new maps in the Viewer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#region)
  		 */
  var region: String = js.native
  
  /**
  		 * Defines the user's role in the organization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role)
  		 */
  var role: org_admin | org_publisher | org_user = js.native
  
  /**
  		 * The ID of the user's role.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#roleId)
  		 */
  var roleId: String = js.native
  
  /**
  		 * The JSON used to create the property values when the `PortalUser` is created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#sourceJSON)
  		 */
  var sourceJSON: Any = js.native
  
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
}
