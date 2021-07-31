package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`private`
import typings.arcgisJsApi.arcgisJsApiStrings.org_
import typings.arcgisJsApi.arcgisJsApiStrings.public
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalGroup
  extends StObject
     with Accessor {
  
  /**
    * The access privileges on the group which determines who can see and access the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#access)
    */
  var access: `private` | org_ | public = js.native
  
  /**
    * The date the group was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#created)
    */
  var created: Date = js.native
  
  /**
    * A detailed description of the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#description)
    */
  var description: String = js.native
  
  /**
    * If present, fetches the group's category schema.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#fetchCategorySchema)
    */
  def fetchCategorySchema(): js.Promise[js.Array[js.Any]] = js.native
  def fetchCategorySchema(options: PortalGroupFetchCategorySchemaOptions): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Fetches the current members of the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#fetchMembers)
    */
  def fetchMembers(): js.Promise[js.Any] = js.native
  def fetchMembers(options: PortalGroupFetchMembersOptions): js.Promise[js.Any] = js.native
  
  /**
    * Get the URL to the thumbnail image for the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#getThumbnailUrl)
    */
  def getThumbnailUrl(): String = js.native
  def getThumbnailUrl(width: Double): String = js.native
  
  /**
    * The unique id for the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#id)
    */
  var id: String = js.native
  
  /**
    * If set to `true`, then users will not be able to apply to join the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#isInvitationOnly)
    */
  var isInvitationOnly: Boolean = js.native
  
  /**
    * The date the group was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#modified)
    */
  var modified: Date = js.native
  
  /**
    * The username of the group's owner.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#owner)
    */
  var owner: String = js.native
  
  /**
    * The portal associated with the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#portal)
    */
  var portal: Portal = js.native
  
  /**
    * Executes a query against the group to return an array of [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) objects that match the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#queryItems)
    */
  def queryItems(): js.Promise[PortalQueryResult] = js.native
  def queryItems(queryParams: Unit, options: PortalGroupQueryItemsOptions): js.Promise[PortalQueryResult] = js.native
  def queryItems(queryParams: PortalQueryParams): js.Promise[PortalQueryResult] = js.native
  def queryItems(queryParams: PortalQueryParamsProperties): js.Promise[PortalQueryResult] = js.native
  def queryItems(queryParams: PortalQueryParamsProperties, options: PortalGroupQueryItemsOptions): js.Promise[PortalQueryResult] = js.native
  def queryItems(queryParams: PortalQueryParams, options: PortalGroupQueryItemsOptions): js.Promise[PortalQueryResult] = js.native
  
  /**
    * A short summary that describes the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#snippet)
    */
  var snippet: String = js.native
  
  /**
    * User defined tags that describe the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#tags)
    */
  var tags: js.Array[String] = js.native
  
  /**
    * The URL to the thumbnail used for the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#thumbnailUrl)
    */
  val thumbnailUrl: String = js.native
  
  /**
    * The title of the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#title)
    */
  var title: String = js.native
  
  /**
    * The URL to the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#url)
    */
  val url: String = js.native
}
