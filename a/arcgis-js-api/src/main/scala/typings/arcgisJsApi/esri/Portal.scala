package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`private`
import typings.arcgisJsApi.arcgisJsApiStrings.anonymous
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.english
import typings.arcgisJsApi.arcgisJsApiStrings.immediate
import typings.arcgisJsApi.arcgisJsApiStrings.metric
import typings.arcgisJsApi.arcgisJsApiStrings.multitenant
import typings.arcgisJsApi.arcgisJsApiStrings.public
import typings.arcgisJsApi.arcgisJsApiStrings.singletenant
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Portal
  extends StObject
     with Accessor
     with Loadable {
  
  /**
    * The access level of the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#access)
    */
  var access: public | `private` = js.native
  
  /**
    * When `true`, access to the organization's Portal resources must occur over SSL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#allSSL)
    */
  var allSSL: Boolean = js.native
  
  /**
    * The authentication mode for handling authentication when the user attempts to access a secure resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#authMode)
    */
  var authMode: anonymous | auto | immediate = js.native
  
  /**
    * Array of trusted servers to send credentials to when making Cross-Origin Resource Sharing (CORS) requests to access services secured with web-tier authentication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#authorizedCrossOriginDomains)
    */
  var authorizedCrossOriginDomains: js.Array[String] = js.native
  
  /**
    * The query that defines the basemaps that should be displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) when [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is not true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery)
    */
  var basemapGalleryGroupQuery: String = js.native
  
  /**
    * The Bing key to use for web maps using Bing Maps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#bingKey)
    */
  var bingKey: String = js.native
  
  /**
    * Indicates whether an organization can list applications in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListApps)
    */
  var canListApps: Boolean = js.native
  
  /**
    * Indicates whether an organization can list data services in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListData)
    */
  var canListData: Boolean = js.native
  
  /**
    * Indicates whether an organization can list pre-provisioned items in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListPreProvisionedItems)
    */
  var canListPreProvisionedItems: Boolean = js.native
  
  /**
    * Indicates whether an organization can provision direct purchases in the marketplace without customer request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canProvisionDirectPurchase)
    */
  var canProvisionDirectPurchase: Boolean = js.native
  
  /**
    * When `true`, the organization's public items, groups and users are included in search queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSearchPublic)
    */
  var canSearchPublic: Boolean = js.native
  
  /**
    * The Bing key can be shared to the public and is returned as part of a portal's description call (`/sharing/rest/portals/<orgid>`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canShareBingPublic)
    */
  var canShareBingPublic: Boolean = js.native
  
  /**
    * When `true`, members of the organization can share resources outside the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSharePublic)
    */
  var canSharePublic: Boolean = js.native
  
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the ArcGIS sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInArcGIS)
    */
  var canSignInArcGIS: Boolean = js.native
  
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the enterprise sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInIDP)
    */
  var canSignInIDP: Boolean = js.native
  
  /**
    * The query that identifies the group containing the color sets used for rendering in the map viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#colorSetsGroupQuery)
    */
  var colorSetsGroupQuery: String = js.native
  
  /**
    * Indicates whether to allow the organization to disable commenting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#commentsEnabled)
    */
  var commentsEnabled: Boolean = js.native
  
  /**
    * A helper function that returns an instance of the portal's [ClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html) [helper service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createClosestFacilityTask)
    */
  def createClosestFacilityTask(): js.Promise[ClosestFacilityTask] = js.native
  
  /**
    * A helper function that returns an array of [ElevationsLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html) derived from the Portal's [Limited Error Raster Compression (LERC) elevation helper service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createElevationLayers)
    */
  def createElevationLayers(): js.Promise[js.Array[ElevationLayer]] = js.native
  
  /**
    * A helper function that returns an instance of the portal's [GeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html) [helper service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createGeometryService)
    */
  def createGeometryService(): js.Promise[GeometryService] = js.native
  
  /**
    * A helper function that returns an instance of the portal's [PrintTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html) [helper service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createPrintTask)
    */
  def createPrintTask(): js.Promise[PrintTask] = js.native
  
  /**
    * A helper function that returns an instance of the portal's [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) [helper service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createRouteTask)
    */
  def createRouteTask(): js.Promise[RouteTask] = js.native
  
  /**
    * A helper function that returns an instance of the portal's [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html) [helper service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createServiceAreaTask)
    */
  def createServiceAreaTask(): js.Promise[ServiceAreaTask] = js.native
  
  /**
    * Date the organization was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#created)
    */
  var created: Date = js.native
  
  /**
    * The default locale (language and country) information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#culture)
    */
  var culture: String = js.native
  
  /**
    * The custom base URL for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#customBaseUrl)
    */
  var customBaseUrl: String = js.native
  
  /**
    * The default basemap to use for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultBasemap)
    */
  var defaultBasemap: Basemap = js.native
  
  /**
    * The default extent to use for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultExtent)
    */
  var defaultExtent: Extent = js.native
  
  /**
    * The default vector basemap to use for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultVectorBasemap)
    */
  var defaultVectorBasemap: Basemap = js.native
  
  /**
    * A description of the organization/portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#description)
    */
  var description: String = js.native
  
  /**
    * Boolean value indicating whether to opt-in to the [Esri User Experience Improvement (EUEI) program](https://doc.arcgis.com/en/arcgis-online/reference/faq.htm#ESRI_QUESTIONANSWER_AED97F28DCD84F7682623C2FA9E5CE49).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#eueiEnabled)
    */
  var eueiEnabled: Boolean = js.native
  
  /**
    * The featured groups for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredGroups)
    */
  var featuredGroups: js.Array[PortalFeaturedGroups] = js.native
  
  /**
    * The query that defines the featured group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredItemsGroupQuery)
    */
  var featuredItemsGroupQuery: String = js.native
  
  /**
    * Fetches the [basemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) that are displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps)
    */
  def fetchBasemaps(): js.Promise[js.Array[Basemap]] = js.native
  def fetchBasemaps(basemapGalleryGroupQuery: String): js.Promise[js.Array[Basemap]] = js.native
  def fetchBasemaps(basemapGalleryGroupQuery: String, options: PortalFetchBasemapsOptions): js.Promise[js.Array[Basemap]] = js.native
  def fetchBasemaps(basemapGalleryGroupQuery: Unit, options: PortalFetchBasemapsOptions): js.Promise[js.Array[Basemap]] = js.native
  
  /**
    * If present, fetches the organization's category schema.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchCategorySchema)
    */
  def fetchCategorySchema(): js.Promise[js.Array[js.Any]] = js.native
  def fetchCategorySchema(options: PortalFetchCategorySchemaOptions): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Fetches the featured groups in the Portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchFeaturedGroups)
    */
  def fetchFeaturedGroups(): js.Promise[js.Array[PortalGroup]] = js.native
  def fetchFeaturedGroups(options: PortalFetchFeaturedGroupsOptions): js.Promise[js.Array[PortalGroup]] = js.native
  
  /**
    * Fetches and returns the associated regions with the portal instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchRegions)
    */
  def fetchRegions(): js.Promise[js.Array[js.Any]] = js.native
  def fetchRegions(options: PortalFetchRegionsOptions): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * The query that identifies the group containing features items for the gallery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#galleryTemplatesGroupQuery)
    */
  var galleryTemplatesGroupQuery: String = js.native
  
  /**
    * Indicates whether the organization has content categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#hasCategorySchema)
    */
  var hasCategorySchema: Boolean = js.native
  
  /**
    * Helper services provided by the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#helperServices)
    */
  var helperServices: js.Any = js.native
  
  /**
    * The group that contains featured content to be displayed on the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#homePageFeaturedContent)
    */
  var homePageFeaturedContent: String = js.native
  
  /**
    * The number of featured items that can be displayed on the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#homePageFeaturedContentCount)
    */
  var homePageFeaturedContentCount: Double = js.native
  
  /**
    * The port used by the portal for HTTP communication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#httpPort)
    */
  var httpPort: Double = js.native
  
  /**
    * The port used by the portal for HTTPS communication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#httpsPort)
    */
  var httpsPort: Double = js.native
  
  /**
    * The id of the organization that owns this portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#id)
    */
  var id: String = js.native
  
  /**
    * The country code of the calling IP (ArcGIS Online only).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#ipCntryCode)
    */
  var ipCntryCode: String = js.native
  
  /**
    * Indicates whether the portal is an organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#isOrganization)
    */
  val isOrganization: Boolean = js.native
  
  /**
    * Indicates if the portal is on-premises.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#isPortal)
    */
  var isPortal: Boolean = js.native
  
  /**
    * Indicates if the portal is in read-only mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#isReadOnly)
    */
  var isReadOnly: Boolean = js.native
  
  /**
    * The query that identifies the group containing editing templates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#layerTemplatesGroupQuery)
    */
  var layerTemplatesGroupQuery: String = js.native
  
  /**
    * Indicates whether the portal's resources have loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#loaded)
    */
  val loaded: Boolean = js.native
  
  /**
    * The maximum validity in minutes of tokens issued for users of the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#maxTokenExpirationMinutes)
    */
  var maxTokenExpirationMinutes: Double = js.native
  
  /**
    * Date the organization was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#modified)
    */
  var modified: Date = js.native
  
  /**
    * Name of the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#name)
    */
  var name: String = js.native
  
  /**
    * URL of the portal host.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalHostname)
    */
  var portalHostname: String = js.native
  
  /**
    * The portal mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalMode)
    */
  var portalMode: multitenant | singletenant = js.native
  
  /**
    * Properties specific to the organization, for example the "contact us" link.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalProperties)
    */
  var portalProperties: js.Any = js.native
  
  /**
    * Executes a query against the Portal to return an array of [PortalGroup](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html) objects that match the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#queryGroups)
    */
  def queryGroups(queryParams: PortalQueryParams): js.Promise[PortalQueryResult] = js.native
  def queryGroups(queryParams: PortalQueryParamsProperties): js.Promise[PortalQueryResult] = js.native
  def queryGroups(queryParams: PortalQueryParamsProperties, options: PortalQueryGroupsOptions): js.Promise[PortalQueryResult] = js.native
  def queryGroups(queryParams: PortalQueryParams, options: PortalQueryGroupsOptions): js.Promise[PortalQueryResult] = js.native
  
  /**
    * Executes a query against the Portal to return an array of [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) objects that match the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#queryItems)
    */
  def queryItems(queryParams: PortalQueryParams): js.Promise[PortalQueryResult] = js.native
  def queryItems(queryParams: PortalQueryParamsProperties): js.Promise[PortalQueryResult] = js.native
  def queryItems(queryParams: PortalQueryParamsProperties, options: PortalQueryItemsOptions): js.Promise[PortalQueryResult] = js.native
  def queryItems(queryParams: PortalQueryParams, options: PortalQueryItemsOptions): js.Promise[PortalQueryResult] = js.native
  
  /**
    * Executes a query against the Portal to return an array of [PortalUser](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html) objects that match the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#queryUsers)
    */
  def queryUsers(queryParams: PortalQueryParams): js.Promise[PortalQueryResult] = js.native
  def queryUsers(queryParams: PortalQueryParamsProperties): js.Promise[PortalQueryResult] = js.native
  def queryUsers(queryParams: PortalQueryParamsProperties, options: PortalQueryUsersOptions): js.Promise[PortalQueryResult] = js.native
  def queryUsers(queryParams: PortalQueryParams, options: PortalQueryUsersOptions): js.Promise[PortalQueryResult] = js.native
  
  /**
    * The region for the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#region)
    */
  var region: String = js.native
  
  /**
    * The REST URL for the portal, for example "https://www.arcgis.com/sharing/rest" for ArcGIS Online and "https://www.example.com/arcgis/sharing/rest" for your in-house portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#restUrl)
    */
  val restUrl: String = js.native
  
  /**
    * Custom HTML for the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#rotatorPanels)
    */
  var rotatorPanels: js.Array[js.Any] = js.native
  
  /**
    * Indicates whether the description of your organization displays on the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#showHomePageDescription)
    */
  var showHomePageDescription: Boolean = js.native
  
  /**
    * The JSON used to create the property values when the `Portal` is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#sourceJSON)
    */
  var sourceJSON: js.Any = js.native
  
  /**
    * Indicates whether hosted services are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#supportsHostedServices)
    */
  var supportsHostedServices: Boolean = js.native
  
  /**
    * The query that defines the symbols sets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#symbolSetsGroupQuery)
    */
  var symbolSetsGroupQuery: String = js.native
  
  /**
    * The query that defines the collection of templates that will appear in the template gallery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#templatesGroupQuery)
    */
  var templatesGroupQuery: String = js.native
  
  /**
    * The URL to the thumbnail of the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#thumbnailUrl)
    */
  val thumbnailUrl: String = js.native
  
  /**
    * Sets the units of measure for the organization's users.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#units)
    */
  var units: english | metric = js.native
  
  /**
    * The URL to the portal instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#url)
    */
  var url: String = js.native
  
  /**
    * The prefix selected by the organization's administrator to be used with the customBaseURL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#urlKey)
    */
  var urlKey: String = js.native
  
  /**
    * When `true`, only simple where clauses that are compliant with SQL92 can be used when querying layers and tables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useStandardizedQuery)
    */
  var useStandardizedQuery: Boolean = js.native
  
  /**
    * When `true`, the organization has opted in to use the vector tile basemaps, and (a) [vectorBasemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery) should be used instead of [basemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery), while (b) [defaultVectorBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultVectorBasemap) should be used instead of [defaultBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultBasemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps)
    */
  var useVectorBasemaps: Boolean = js.native
  
  /**
    * Information representing a registered user of the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#user)
    */
  var user: PortalUser = js.native
  
  /**
    * The query that defines the vector tiles basemaps that should be displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) when [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery)
    */
  var vectorBasemapGalleryGroupQuery: String = js.native
}
