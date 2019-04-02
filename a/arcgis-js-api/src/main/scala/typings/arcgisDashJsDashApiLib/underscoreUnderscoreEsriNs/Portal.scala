package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Portal
  extends Accessor
     with Loadable {
  /**
    * The access level of the organization. When public, anonymous users can access the organization. When private, access is restricted to only members of the organization.  **Possible Values:** public | private
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#access)
    */
  var access: java.lang.String = js.native
  /**
    * When `true`, access to the organization's Portal resources must occur over SSL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#allSSL)
    */
  var allSSL: scala.Boolean = js.native
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
  var authMode: java.lang.String = js.native
  /**
    * Array of trusted servers to send credentials to when making Cross-Origin Resource Sharing (CORS) requests to access services secured with web-tier authentication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#authorizedCrossOriginDomains)
    */
  var authorizedCrossOriginDomains: js.Array[java.lang.String] = js.native
  /**
    * The query that defines the basemaps that should be displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) when [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is not true. The [fetchBasemaps()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps) method does this automatically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery)
    */
  var basemapGalleryGroupQuery: java.lang.String = js.native
  /**
    * The Bing key to use for web maps using Bing Maps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#bingKey)
    */
  var bingKey: java.lang.String = js.native
  /**
    * Indicates whether an organization can list applications in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListApps)
    */
  var canListApps: scala.Boolean = js.native
  /**
    * Indicates whether an organization can list data services in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListData)
    */
  var canListData: scala.Boolean = js.native
  /**
    * Indicates whether an organization can list pre-provisioned items in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListPreProvisionedItems)
    */
  var canListPreProvisionedItems: scala.Boolean = js.native
  /**
    * Indicates whether an organization can provision direct purchases in the marketplace without customer request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canProvisionDirectPurchase)
    */
  var canProvisionDirectPurchase: scala.Boolean = js.native
  /**
    * When `true`, the organization's public items, groups and users are included in search queries. When `false`, no public items outside of the organization are included. However, public items which are part of the organization are included.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSearchPublic)
    *
    * @default true
    */
  var canSearchPublic: scala.Boolean = js.native
  /**
    * The Bing key can be shared to the public and is returned as part of a portal's description call (`/sharing/rest/portals/<orgid>`). This requires the access of the portal to be set to public. The canShareBingPublic property is not returned publicly but only shown to users within the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canShareBingPublic)
    *
    * @default false
    */
  var canShareBingPublic: scala.Boolean = js.native
  /**
    * When `true`, members of the organization can share resources outside the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSharePublic)
    *
    * @default false
    */
  var canSharePublic: scala.Boolean = js.native
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the ArcGIS sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInArcGIS)
    *
    * @default false
    */
  var canSignInArcGIS: scala.Boolean = js.native
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the enterprise sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInIDP)
    *
    * @default false
    */
  var canSignInIDP: scala.Boolean = js.native
  /**
    * The query that identifies the group containing the color sets used for rendering in the map viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#colorSetsGroupQuery)
    */
  var colorSetsGroupQuery: java.lang.String = js.native
  /**
    * Indicates whether to allow the organization to disable commenting. When commentsEnabled is false, comments are hidden and not removed. numComments are set to zero for all items in the organization. Calls to add a comment and view comments will fail. If the organization re-enables comments, the comments display and numComments are restored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#commentsEnabled)
    *
    * @default false
    */
  var commentsEnabled: scala.Boolean = js.native
  /**
    * Date the organization was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#created)
    */
  var created: stdLib.Date = js.native
  /**
    * The default locale (language and country) information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#culture)
    */
  var culture: java.lang.String = js.native
  /**
    * The custom base URL for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#customBaseUrl)
    */
  var customBaseUrl: java.lang.String = js.native
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
  var description: java.lang.String = js.native
  /**
    * Boolean value indicating whether to opt-in to the [Esri User Experience Improvement (EUEI) program](https://doc.arcgis.com/en/arcgis-online/reference/faq.htm#ESRI_QUESTIONANSWER_AED97F28DCD84F7682623C2FA9E5CE49).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#eueiEnabled)
    *
    * @default false
    */
  var eueiEnabled: scala.Boolean = js.native
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
  var featuredItemsGroupQuery: java.lang.String = js.native
  /**
    * The query that identifies the group containing features items for the gallery. Set a Group ID or, if null, then the most viewed items in your organization are displayed in the gallery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#galleryTemplatesGroupQuery)
    */
  var galleryTemplatesGroupQuery: java.lang.String = js.native
  /**
    * Indicates whether the organization has content categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#hasCategorySchema)
    *
    * @default false
    */
  var hasCategorySchema: scala.Boolean = js.native
  /**
    * Helper services provided by the portal. For the detailed information about these services, see the [about utility services](https://server.arcgis.com/en/portal/latest/administer/windows/about-utility-services.htm) topic from the ArcGIS Server documentation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#helperServices)
    */
  var helperServices: js.Any = js.native
  /**
    * The group that contains featured content to be displayed on the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#homePageFeaturedContent)
    */
  var homePageFeaturedContent: java.lang.String = js.native
  /**
    * The number of featured items that can be displayed on the home page. The max is 100. Accepts integers only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#homePageFeaturedContentCount)
    */
  var homePageFeaturedContentCount: scala.Double = js.native
  /**
    * The port used by the portal for HTTP communication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#httpPort)
    */
  var httpPort: scala.Double = js.native
  /**
    * The port used by the portal for HTTPS communication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#httpsPort)
    */
  var httpsPort: scala.Double = js.native
  /**
    * The id of the organization that owns this portal. If `null` then this is the default portal for anonymous and non-organizational users.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#id)
    */
  var id: java.lang.String = js.native
  /**
    * The country code of the calling IP (ArcGIS Online only).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#ipCntryCode)
    */
  var ipCntryCode: java.lang.String = js.native
  /**
    * Indicates whether the portal is an organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#isOrganization)
    */
  val isOrganization: scala.Boolean = js.native
  /**
    * Indicates if the portal is on-premises.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#isPortal)
    */
  var isPortal: scala.Boolean = js.native
  /**
    * The query that identifies the group containing editing templates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#layerTemplatesGroupQuery)
    */
  var layerTemplatesGroupQuery: java.lang.String = js.native
  /**
    * Indicates whether the portal's resources have loaded. When `true`, all the properties of the object can be accessed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#loaded)
    *
    * @default false
    */
  val loaded: scala.Boolean = js.native
  /**
    * The maximum validity in minutes of tokens issued for users of the organization. -1 is the default and is a special value that indicates infinite timeout or permanent tokens. For tokens granted using OAuth 2.0 authorization grant, it represents the maximum validity of refresh tokens. For access tokens, the maximum validity is the lower of two weeks or this value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#maxTokenExpirationMinutes)
    */
  var maxTokenExpirationMinutes: scala.Double = js.native
  /**
    * Date the organization was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#modified)
    */
  var modified: stdLib.Date = js.native
  /**
    * Name of the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#name)
    */
  var name: java.lang.String = js.native
  /**
    * URL of the portal host.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalHostname)
    */
  var portalHostname: java.lang.String = js.native
  /**
    * The portal mode.  **Possible Values:** multitenant | singletenant
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalMode)
    */
  var portalMode: java.lang.String = js.native
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
  var region: java.lang.String = js.native
  /**
    * The REST URL for the portal, for example "https://www.arcgis.com/sharing/rest" for ArcGIS Online and "https://www.example.com/arcgis/sharing/rest" for your in-house portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#restUrl)
    */
  val restUrl: java.lang.String = js.native
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
  var showHomePageDescription: scala.Boolean = js.native
  /**
    * Indicates whether hosted services are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#supportsHostedServices)
    *
    * @default false
    */
  var supportsHostedServices: scala.Boolean = js.native
  /**
    * The query that defines the symbols sets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#symbolSetsGroupQuery)
    */
  var symbolSetsGroupQuery: java.lang.String = js.native
  /**
    * The query that defines the collection of templates that will appear in the template gallery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#templatesGroupQuery)
    */
  var templatesGroupQuery: java.lang.String = js.native
  /**
    * The URL to the thumbnail of the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#thumbnailUrl)
    */
  val thumbnailUrl: java.lang.String = js.native
  /**
    * Sets the units of measure for the organization's users. The user default is derived from the organization's [region](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#region).  **Possible Values:** english | metric
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#units)
    */
  var units: java.lang.String = js.native
  /**
    * The URL to the portal instance. Setting the location of the portal instance via [esriConfig.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) should be used in favor of setting it directly on this property.  If using an on-premise portal, the syntax should look similar to: `https://www.example.com/arcgis`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#url)
    *
    * @default {@link module:esri/config#portalUrl esriConfig.portalUrl}
    */
  var url: java.lang.String = js.native
  /**
    * The prefix selected by the organization's administrator to be used with the customBaseURL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#urlKey)
    */
  var urlKey: java.lang.String = js.native
  /**
    * When `true`, only simple where clauses that are compliant with SQL92 can be used when querying layers and tables. The recommended security setting is true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useStandardizedQuery)
    */
  var useStandardizedQuery: scala.Boolean = js.native
  /**
    * When `true`, the organization has opted in to use the vector tile basemaps, and (a) [vectorBasemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery) should be used instead of [basemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery), while (b) [defaultVectorBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultVectorBasemap) should be used instead of [defaultBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultBasemap). The [fetchBasemaps()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps) method automatically uses vectorBasemapGalleryGroupQuery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps)
    */
  var useVectorBasemaps: scala.Boolean = js.native
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
  var vectorBasemapGalleryGroupQuery: java.lang.String = js.native
  /**
    * Fetches the [basemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) that are displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html). When [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is `true`, the basemaps will be based on [vectorBasemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery), and otherwise on [basemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchBasemaps)
    *
    * @param basemapGalleryGroupQuery When provided, this argument is used to fetch basemaps based on input query parameters.
    *
    */
  def fetchBasemaps(): arcgisDashJsDashApiLib.IPromise[js.Array[Basemap]] = js.native
  def fetchBasemaps(basemapGalleryGroupQuery: java.lang.String): arcgisDashJsDashApiLib.IPromise[js.Array[Basemap]] = js.native
  /**
    * If present, fetches the organization's category schema.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchCategorySchema)
    *
    *
    */
  def fetchCategorySchema(): arcgisDashJsDashApiLib.IPromise[js.Array[_]] = js.native
  /**
    * Fetches the featured groups in the Portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchFeaturedGroups)
    *
    *
    */
  def fetchFeaturedGroups(): arcgisDashJsDashApiLib.IPromise[js.Array[PortalGroup]] = js.native
  /**
    * Fetches and returns the associated regions with the portal instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchRegions)
    *
    *
    */
  def fetchRegions(): arcgisDashJsDashApiLib.IPromise[js.Array[_]] = js.native
  /**
    * Executes a query against the Portal to return an array of [PortalGroup](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html) objects that match the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#queryGroups)
    *
    * @param queryParams The input query parameters defined in [PortalQueryParams](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html).
    *
    */
  def queryGroups(queryParams: PortalQueryParams): arcgisDashJsDashApiLib.IPromise[PortalQueryResult] = js.native
  def queryGroups(queryParams: PortalQueryParamsProperties): arcgisDashJsDashApiLib.IPromise[PortalQueryResult] = js.native
  /**
    * Executes a query against the Portal to return an array of [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) objects that match the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#queryItems)
    *
    * @param queryParams The input query parameters defined in [PortalQueryParams](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html).
    *
    */
  def queryItems(queryParams: PortalQueryParams): arcgisDashJsDashApiLib.IPromise[PortalQueryResult] = js.native
  def queryItems(queryParams: PortalQueryParamsProperties): arcgisDashJsDashApiLib.IPromise[PortalQueryResult] = js.native
  /**
    * Executes a query against the Portal to return an array of [PortalUser](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html) objects that match the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#queryUsers)
    *
    * @param queryParams The input query parameters defined in [PortalQueryParams](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html).
    *
    */
  def queryUsers(queryParams: PortalQueryParams): arcgisDashJsDashApiLib.IPromise[PortalQueryResult] = js.native
  def queryUsers(queryParams: PortalQueryParamsProperties): arcgisDashJsDashApiLib.IPromise[PortalQueryResult] = js.native
}

@JSGlobal("__esri.Portal")
@js.native
/**
  * The Portal class is part of the [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/) that provides a way to build applications that work with content from [ArcGIS Online](http://www.arcgis.com/home/) or an [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/). [ArcGIS Enterprise](https://enterprise.arcgis.com/en/portal/) is software from Esri that customers can deploy either on-premises or in the cloud. [ArcGIS Online](http://www.arcgis.com/home/) is Esri's Software as a Service offering that represents GIS as a Service and is implemented using the same technology as ArcGIS Enterprise.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html)
  */
class PortalCls () extends Portal {
  def this(properties: PortalProperties) = this()
}

