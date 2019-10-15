package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`private`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.anonymous
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.auto
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.english
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.immediate
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.metric
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.public
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Portal
  extends Accessor
     with Loadable {
  /**
    * The access level of the organization. When public, anonymous users can access the organization. When private, access is restricted to only members of the organization.
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
    * Possible Value | Description
    * ---------------|------------
    * anonymous | An error will be returned when a secure resource is requested.
    * auto | The user will be signed in when a secure resource is requested.
    * immediate | The user will be signed in when the Portal is loaded.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#authMode)
    *
    * @default auto
    */
  var authMode: anonymous | auto | immediate = js.native
  /**
    * Array of trusted servers to send credentials to when making Cross-Origin Resource Sharing (CORS) requests to access services secured with web-tier authentication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#authorizedCrossOriginDomains)
    */
  var authorizedCrossOriginDomains: js.Array[String] = js.native
  /**
    * The query that defines the basemaps that should be displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) when [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is not true. The [fetchBasemaps()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps) method does this automatically.
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
    * When `true`, the organization's public items, groups and users are included in search queries. When `false`, no public items outside of the organization are included. However, public items which are part of the organization are included.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSearchPublic)
    *
    * @default true
    */
  var canSearchPublic: Boolean = js.native
  /**
    * The Bing key can be shared to the public and is returned as part of a portal's description call (`/sharing/rest/portals/<orgid>`). This requires the access of the portal to be set to public. The canShareBingPublic property is not returned publicly but only shown to users within the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canShareBingPublic)
    *
    * @default false
    */
  var canShareBingPublic: Boolean = js.native
  /**
    * When `true`, members of the organization can share resources outside the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSharePublic)
    *
    * @default false
    */
  var canSharePublic: Boolean = js.native
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the ArcGIS sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInArcGIS)
    *
    * @default false
    */
  var canSignInArcGIS: Boolean = js.native
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the enterprise sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInIDP)
    *
    * @default false
    */
  var canSignInIDP: Boolean = js.native
  /**
    * The query that identifies the group containing the color sets used for rendering in the map viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#colorSetsGroupQuery)
    */
  var colorSetsGroupQuery: String = js.native
  /**
    * Indicates whether to allow the organization to disable commenting. When commentsEnabled is false, comments are hidden and not removed. numComments are set to zero for all items in the organization. Calls to add a comment and view comments will fail. If the organization re-enables comments, the comments display and numComments are restored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#commentsEnabled)
    *
    * @default false
    */
  var commentsEnabled: Boolean = js.native
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
    * The default basemap to use for the portal. Used in the map viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultBasemap)
    */
  var defaultBasemap: Basemap = js.native
  /**
    * The default extent to use for the portal. Used in the map viewer. The extent will be in the default basemap's spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultExtent)
    */
  var defaultExtent: Extent = js.native
  /**
    * The default vector basemap to use for the portal. Used in the map viewer.
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
    *
    * @default false
    */
  var eueiEnabled: Boolean = js.native
  /**
    * The featured groups for the portal. Returns an array of objects that provide access to the owner and title for each featured group. Each item in this array has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredGroups)
    */
  var featuredGroups: js.Array[PortalFeaturedGroups] = js.native
  /**
    * The query that defines the featured group. If null, then the most viewed items in the organization will be the featured items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredItemsGroupQuery)
    */
  var featuredItemsGroupQuery: String = js.native
  /**
    * The query that identifies the group containing features items for the gallery. Set a Group ID or, if null, then the most viewed items in your organization are displayed in the gallery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#galleryTemplatesGroupQuery)
    */
  var galleryTemplatesGroupQuery: String = js.native
  /**
    * Indicates whether the organization has content categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#hasCategorySchema)
    *
    * @default false
    */
  var hasCategorySchema: Boolean = js.native
  /**
    * Helper services provided by the portal. This is useful in instances where helper services are needed but may not be available using the given helper methods [createClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createClosestFacilityTask), [createElevationLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createElevationLayers), [createGeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createGeometryService), [createPrintTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createPrintTask), [createRouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createRouteTask), and [createServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createServiceAreaTask).  For additional information about helper services, see the [about utility services](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm) topic from the ArcGIS Server documentation.
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
    * The number of featured items that can be displayed on the home page. The max is 100. Accepts integers only.
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
    * The id of the organization that owns this portal. If `null` then this is the default portal for anonymous and non-organizational users.
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
    * The query that identifies the group containing editing templates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#layerTemplatesGroupQuery)
    */
  var layerTemplatesGroupQuery: String = js.native
  /**
    * Indicates whether the portal's resources have loaded. When `true`, all the properties of the object can be accessed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#loaded)
    *
    * @default false
    */
  val loaded: Boolean = js.native
  /**
    * The maximum validity in minutes of tokens issued for users of the organization. -1 is the default and is a special value that indicates infinite timeout or permanent tokens. For tokens granted using OAuth 2.0 authorization grant, it represents the maximum validity of refresh tokens. For access tokens, the maximum validity is the lower of two weeks or this value.
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
    * The portal mode.  **Possible Values:** multitenant | singletenant
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalMode)
    */
  var portalMode: String = js.native
  /**
    * Properties specific to the organization, for example the "contact us" link. If the organization is public, the properties are visible to the anonymous user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalProperties)
    */
  var portalProperties: js.Any = js.native
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
  var rotatorPanels: js.Array[_] = js.native
  /**
    * Indicates whether the description of your organization displays on the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#showHomePageDescription)
    */
  var showHomePageDescription: Boolean = js.native
  /**
    * The JSON used to create the property values when the `Portal` is loaded. Although most commonly used properties are exposed on the `Portal` class directly, this provides access to all information returned by the portal. This property is useful if working in an application built using an older version of the API which requires access to portal properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#sourceJSON)
    */
  var sourceJSON: js.Any = js.native
  /**
    * Indicates whether hosted services are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#supportsHostedServices)
    *
    * @default false
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
    * Sets the units of measure for the organization's users. The user default is derived from the organization's [region](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#region).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#units)
    */
  var units: english | metric = js.native
  /**
    * The URL to the portal instance. Setting the location of the portal instance via [esriConfig.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) should be used in favor of setting it directly on this property.  If using an on-premise portal, the syntax should look similar to: `https://www.example.com/arcgis`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#url)
    *
    * @default {@link module:esri/config#portalUrl esriConfig.portalUrl}
    */
  var url: String = js.native
  /**
    * The prefix selected by the organization's administrator to be used with the customBaseURL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#urlKey)
    */
  var urlKey: String = js.native
  /**
    * When `true`, only simple where clauses that are compliant with SQL92 can be used when querying layers and tables. The recommended security setting is true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useStandardizedQuery)
    */
  var useStandardizedQuery: Boolean = js.native
  /**
    * When `true`, the organization has opted in to use the vector tile basemaps, and (a) [vectorBasemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery) should be used instead of [basemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery), while (b) [defaultVectorBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultVectorBasemap) should be used instead of [defaultBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultBasemap). The [fetchBasemaps()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps) method automatically uses vectorBasemapGalleryGroupQuery.
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
    * The query that defines the vector tiles basemaps that should be displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) when [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is true. The [fetchBasemaps()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps) method does this automatically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery)
    */
  var vectorBasemapGalleryGroupQuery: String = js.native
  /**
    * A helper function that returns an instance of the portal's [ClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html) [helper service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createClosestFacilityTask)
    *
    *
    */
  def createClosestFacilityTask(): IPromise[ClosestFacilityTask] = js.native
  /**
    * A helper function that returns an array of [ElevationsLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html) derived from the Portal's [Limited Error Raster Compression (LERC) elevation helper service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createElevationLayers)
    *
    *
    */
  def createElevationLayers(): IPromise[js.Array[ElevationLayer]] = js.native
  /**
    * A helper function that returns an instance of the portal's [GeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html) [helper service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createGeometryService)
    *
    *
    */
  def createGeometryService(): IPromise[GeometryService] = js.native
  /**
    * A helper function that returns an instance of the portal's [PrintTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html) [helper service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createPrintTask)
    *
    *
    */
  def createPrintTask(): IPromise[PrintTask] = js.native
  /**
    * A helper function that returns an instance of the portal's [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) [helper service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createRouteTask)
    *
    *
    */
  def createRouteTask(): IPromise[RouteTask] = js.native
  /**
    * A helper function that returns an instance of the portal's [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html) [helper service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#createServiceAreaTask)
    *
    *
    */
  def createServiceAreaTask(): IPromise[ServiceAreaTask] = js.native
  /**
    * Fetches the [basemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) that are displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html). When [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is `true`, the basemaps will be based on [vectorBasemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery).  Otherwise, it is based on [basemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps)
    *
    * @param basemapGalleryGroupQuery When provided, this argument is used to fetch basemaps based on input query parameters.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def fetchBasemaps(): IPromise[js.Array[Basemap]] = js.native
  def fetchBasemaps(basemapGalleryGroupQuery: String): IPromise[js.Array[Basemap]] = js.native
  def fetchBasemaps(basemapGalleryGroupQuery: String, options: PortalFetchBasemapsOptions): IPromise[js.Array[Basemap]] = js.native
  /**
    * If present, fetches the organization's category schema.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchCategorySchema)
    *
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def fetchCategorySchema(): IPromise[js.Array[_]] = js.native
  def fetchCategorySchema(options: PortalFetchCategorySchemaOptions): IPromise[js.Array[_]] = js.native
  /**
    * Fetches the featured groups in the Portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchFeaturedGroups)
    *
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def fetchFeaturedGroups(): IPromise[js.Array[PortalGroup]] = js.native
  def fetchFeaturedGroups(options: PortalFetchFeaturedGroupsOptions): IPromise[js.Array[PortalGroup]] = js.native
  /**
    * Fetches and returns the associated regions with the portal instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchRegions)
    *
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def fetchRegions(): IPromise[js.Array[_]] = js.native
  def fetchRegions(options: PortalFetchRegionsOptions): IPromise[js.Array[_]] = js.native
  /**
    * Executes a query against the Portal to return an array of [PortalGroup](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html) objects that match the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#queryGroups)
    *
    * @param queryParams The input query parameters defined in [PortalQueryParams](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html).
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryGroups(queryParams: PortalQueryParams): IPromise[PortalQueryResult] = js.native
  def queryGroups(queryParams: PortalQueryParamsProperties): IPromise[PortalQueryResult] = js.native
  def queryGroups(queryParams: PortalQueryParamsProperties, options: PortalQueryGroupsOptions): IPromise[PortalQueryResult] = js.native
  def queryGroups(queryParams: PortalQueryParams, options: PortalQueryGroupsOptions): IPromise[PortalQueryResult] = js.native
  /**
    * Executes a query against the Portal to return an array of [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) objects that match the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#queryItems)
    *
    * @param queryParams The input query parameters defined in [PortalQueryParams](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html).
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryItems(queryParams: PortalQueryParams): IPromise[PortalQueryResult] = js.native
  def queryItems(queryParams: PortalQueryParamsProperties): IPromise[PortalQueryResult] = js.native
  def queryItems(queryParams: PortalQueryParamsProperties, options: PortalQueryItemsOptions): IPromise[PortalQueryResult] = js.native
  def queryItems(queryParams: PortalQueryParams, options: PortalQueryItemsOptions): IPromise[PortalQueryResult] = js.native
  /**
    * Executes a query against the Portal to return an array of [PortalUser](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html) objects that match the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#queryUsers)
    *
    * @param queryParams The input query parameters defined in [PortalQueryParams](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html).
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryUsers(queryParams: PortalQueryParams): IPromise[PortalQueryResult] = js.native
  def queryUsers(queryParams: PortalQueryParamsProperties): IPromise[PortalQueryResult] = js.native
  def queryUsers(queryParams: PortalQueryParamsProperties, options: PortalQueryUsersOptions): IPromise[PortalQueryResult] = js.native
  def queryUsers(queryParams: PortalQueryParams, options: PortalQueryUsersOptions): IPromise[PortalQueryResult] = js.native
}

@JSGlobal("__esri.Portal")
@js.native
object Portal extends TopLevel[PortalConstructor]

