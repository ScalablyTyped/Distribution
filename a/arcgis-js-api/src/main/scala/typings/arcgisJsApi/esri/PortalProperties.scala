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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalProperties extends LoadableProperties {
  
  /**
    * The access level of the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#access)
    */
  var access: js.UndefOr[public | `private`] = js.native
  
  /**
    * When `true`, access to the organization's Portal resources must occur over SSL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#allSSL)
    */
  var allSSL: js.UndefOr[Boolean] = js.native
  
  /**
    * The authentication mode for handling authentication when the user attempts to access a secure resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#authMode)
    */
  var authMode: js.UndefOr[anonymous | auto | immediate] = js.native
  
  /**
    * Array of trusted servers to send credentials to when making Cross-Origin Resource Sharing (CORS) requests to access services secured with web-tier authentication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#authorizedCrossOriginDomains)
    */
  var authorizedCrossOriginDomains: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The query that defines the basemaps that should be displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) when [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is not true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery)
    */
  var basemapGalleryGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * The Bing key to use for web maps using Bing Maps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#bingKey)
    */
  var bingKey: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether an organization can list applications in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListApps)
    */
  var canListApps: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether an organization can list data services in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListData)
    */
  var canListData: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether an organization can list pre-provisioned items in the marketplace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canListPreProvisionedItems)
    */
  var canListPreProvisionedItems: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether an organization can provision direct purchases in the marketplace without customer request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canProvisionDirectPurchase)
    */
  var canProvisionDirectPurchase: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, the organization's public items, groups and users are included in search queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSearchPublic)
    */
  var canSearchPublic: js.UndefOr[Boolean] = js.native
  
  /**
    * The Bing key can be shared to the public and is returned as part of a portal's description call (`/sharing/rest/portals/<orgid>`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canShareBingPublic)
    */
  var canShareBingPublic: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, members of the organization can share resources outside the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSharePublic)
    */
  var canSharePublic: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the ArcGIS sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInArcGIS)
    */
  var canSignInArcGIS: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to allow an organization with an enterprise IDP configured to be able to turn on or off the enterprise sign in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#canSignInIDP)
    */
  var canSignInIDP: js.UndefOr[Boolean] = js.native
  
  /**
    * The query that identifies the group containing the color sets used for rendering in the map viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#colorSetsGroupQuery)
    */
  var colorSetsGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether to allow the organization to disable commenting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#commentsEnabled)
    */
  var commentsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Date the organization was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.native
  
  /**
    * The default locale (language and country) information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#culture)
    */
  var culture: js.UndefOr[String] = js.native
  
  /**
    * The custom base URL for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#customBaseUrl)
    */
  var customBaseUrl: js.UndefOr[String] = js.native
  
  /**
    * The default basemap to use for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultBasemap)
    */
  var defaultBasemap: js.UndefOr[BasemapProperties] = js.native
  
  /**
    * The default extent to use for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultExtent)
    */
  var defaultExtent: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * The default vector basemap to use for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultVectorBasemap)
    */
  var defaultVectorBasemap: js.UndefOr[BasemapProperties] = js.native
  
  /**
    * A description of the organization/portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#description)
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Boolean value indicating whether to opt-in to the [Esri User Experience Improvement (EUEI) program](https://doc.arcgis.com/en/arcgis-online/reference/faq.htm#ESRI_QUESTIONANSWER_AED97F28DCD84F7682623C2FA9E5CE49).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#eueiEnabled)
    */
  var eueiEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The featured groups for the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredGroups)
    */
  var featuredGroups: js.UndefOr[js.Array[PortalFeaturedGroups]] = js.native
  
  /**
    * The query that defines the featured group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredItemsGroupQuery)
    */
  var featuredItemsGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * The query that identifies the group containing features items for the gallery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#galleryTemplatesGroupQuery)
    */
  var galleryTemplatesGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the organization has content categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#hasCategorySchema)
    */
  var hasCategorySchema: js.UndefOr[Boolean] = js.native
  
  /**
    * Helper services provided by the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#helperServices)
    */
  var helperServices: js.UndefOr[js.Any] = js.native
  
  /**
    * The group that contains featured content to be displayed on the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#homePageFeaturedContent)
    */
  var homePageFeaturedContent: js.UndefOr[String] = js.native
  
  /**
    * The number of featured items that can be displayed on the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#homePageFeaturedContentCount)
    */
  var homePageFeaturedContentCount: js.UndefOr[Double] = js.native
  
  /**
    * The port used by the portal for HTTP communication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#httpPort)
    */
  var httpPort: js.UndefOr[Double] = js.native
  
  /**
    * The port used by the portal for HTTPS communication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#httpsPort)
    */
  var httpsPort: js.UndefOr[Double] = js.native
  
  /**
    * The id of the organization that owns this portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#id)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The country code of the calling IP (ArcGIS Online only).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#ipCntryCode)
    */
  var ipCntryCode: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the portal is on-premises.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#isPortal)
    */
  var isPortal: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the portal is in read-only mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#isReadOnly)
    */
  var isReadOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The query that identifies the group containing editing templates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#layerTemplatesGroupQuery)
    */
  var layerTemplatesGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * The maximum validity in minutes of tokens issued for users of the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#maxTokenExpirationMinutes)
    */
  var maxTokenExpirationMinutes: js.UndefOr[Double] = js.native
  
  /**
    * Date the organization was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#modified)
    */
  var modified: js.UndefOr[DateProperties] = js.native
  
  /**
    * Name of the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * URL of the portal host.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalHostname)
    */
  var portalHostname: js.UndefOr[String] = js.native
  
  /**
    * The portal mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalMode)
    */
  var portalMode: js.UndefOr[multitenant | singletenant] = js.native
  
  /**
    * Properties specific to the organization, for example the "contact us" link.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#portalProperties)
    */
  var portalProperties: js.UndefOr[js.Any] = js.native
  
  /**
    * The region for the organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#region)
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Custom HTML for the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#rotatorPanels)
    */
  var rotatorPanels: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Indicates whether the description of your organization displays on the home page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#showHomePageDescription)
    */
  var showHomePageDescription: js.UndefOr[Boolean] = js.native
  
  /**
    * The JSON used to create the property values when the `Portal` is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.native
  
  /**
    * Indicates whether hosted services are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#supportsHostedServices)
    */
  var supportsHostedServices: js.UndefOr[Boolean] = js.native
  
  /**
    * The query that defines the symbols sets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#symbolSetsGroupQuery)
    */
  var symbolSetsGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * The query that defines the collection of templates that will appear in the template gallery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#templatesGroupQuery)
    */
  var templatesGroupQuery: js.UndefOr[String] = js.native
  
  /**
    * Sets the units of measure for the organization's users.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#units)
    */
  var units: js.UndefOr[english | metric] = js.native
  
  /**
    * The URL to the portal instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#url)
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * The prefix selected by the organization's administrator to be used with the customBaseURL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#urlKey)
    */
  var urlKey: js.UndefOr[String] = js.native
  
  /**
    * When `true`, only simple where clauses that are compliant with SQL92 can be used when querying layers and tables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useStandardizedQuery)
    */
  var useStandardizedQuery: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, the organization has opted in to use the vector tile basemaps, and (a) [vectorBasemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery) should be used instead of [basemapGalleryGroupQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#basemapGalleryGroupQuery), while (b) [defaultVectorBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultVectorBasemap) should be used instead of [defaultBasemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#defaultBasemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps)
    */
  var useVectorBasemaps: js.UndefOr[Boolean] = js.native
  
  /**
    * Information representing a registered user of the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#user)
    */
  var user: js.UndefOr[PortalUserProperties] = js.native
  
  /**
    * The query that defines the vector tiles basemaps that should be displayed in the [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) when [useVectorBasemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#useVectorBasemaps) is true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#vectorBasemapGalleryGroupQuery)
    */
  var vectorBasemapGalleryGroupQuery: js.UndefOr[String] = js.native
}
object PortalProperties {
  
  @scala.inline
  def apply(): PortalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalProperties]
  }
  
  @scala.inline
  implicit class PortalPropertiesOps[Self <: PortalProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccess(value: public | `private`): Self = this.set("access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    
    @scala.inline
    def setAllSSL(value: Boolean): Self = this.set("allSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllSSL: Self = this.set("allSSL", js.undefined)
    
    @scala.inline
    def setAuthMode(value: anonymous | auto | immediate): Self = this.set("authMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthMode: Self = this.set("authMode", js.undefined)
    
    @scala.inline
    def setAuthorizedCrossOriginDomainsVarargs(value: String*): Self = this.set("authorizedCrossOriginDomains", js.Array(value :_*))
    
    @scala.inline
    def setAuthorizedCrossOriginDomains(value: js.Array[String]): Self = this.set("authorizedCrossOriginDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedCrossOriginDomains: Self = this.set("authorizedCrossOriginDomains", js.undefined)
    
    @scala.inline
    def setBasemapGalleryGroupQuery(value: String): Self = this.set("basemapGalleryGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasemapGalleryGroupQuery: Self = this.set("basemapGalleryGroupQuery", js.undefined)
    
    @scala.inline
    def setBingKey(value: String): Self = this.set("bingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBingKey: Self = this.set("bingKey", js.undefined)
    
    @scala.inline
    def setCanListApps(value: Boolean): Self = this.set("canListApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanListApps: Self = this.set("canListApps", js.undefined)
    
    @scala.inline
    def setCanListData(value: Boolean): Self = this.set("canListData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanListData: Self = this.set("canListData", js.undefined)
    
    @scala.inline
    def setCanListPreProvisionedItems(value: Boolean): Self = this.set("canListPreProvisionedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanListPreProvisionedItems: Self = this.set("canListPreProvisionedItems", js.undefined)
    
    @scala.inline
    def setCanProvisionDirectPurchase(value: Boolean): Self = this.set("canProvisionDirectPurchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanProvisionDirectPurchase: Self = this.set("canProvisionDirectPurchase", js.undefined)
    
    @scala.inline
    def setCanSearchPublic(value: Boolean): Self = this.set("canSearchPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSearchPublic: Self = this.set("canSearchPublic", js.undefined)
    
    @scala.inline
    def setCanShareBingPublic(value: Boolean): Self = this.set("canShareBingPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanShareBingPublic: Self = this.set("canShareBingPublic", js.undefined)
    
    @scala.inline
    def setCanSharePublic(value: Boolean): Self = this.set("canSharePublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSharePublic: Self = this.set("canSharePublic", js.undefined)
    
    @scala.inline
    def setCanSignInArcGIS(value: Boolean): Self = this.set("canSignInArcGIS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSignInArcGIS: Self = this.set("canSignInArcGIS", js.undefined)
    
    @scala.inline
    def setCanSignInIDP(value: Boolean): Self = this.set("canSignInIDP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSignInIDP: Self = this.set("canSignInIDP", js.undefined)
    
    @scala.inline
    def setColorSetsGroupQuery(value: String): Self = this.set("colorSetsGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSetsGroupQuery: Self = this.set("colorSetsGroupQuery", js.undefined)
    
    @scala.inline
    def setCommentsEnabled(value: Boolean): Self = this.set("commentsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentsEnabled: Self = this.set("commentsEnabled", js.undefined)
    
    @scala.inline
    def setCreated(value: DateProperties): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    
    @scala.inline
    def setCustomBaseUrl(value: String): Self = this.set("customBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomBaseUrl: Self = this.set("customBaseUrl", js.undefined)
    
    @scala.inline
    def setDefaultBasemap(value: BasemapProperties): Self = this.set("defaultBasemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBasemap: Self = this.set("defaultBasemap", js.undefined)
    
    @scala.inline
    def setDefaultExtent(value: ExtentProperties): Self = this.set("defaultExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultExtent: Self = this.set("defaultExtent", js.undefined)
    
    @scala.inline
    def setDefaultVectorBasemap(value: BasemapProperties): Self = this.set("defaultVectorBasemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVectorBasemap: Self = this.set("defaultVectorBasemap", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEueiEnabled(value: Boolean): Self = this.set("eueiEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEueiEnabled: Self = this.set("eueiEnabled", js.undefined)
    
    @scala.inline
    def setFeaturedGroupsVarargs(value: PortalFeaturedGroups*): Self = this.set("featuredGroups", js.Array(value :_*))
    
    @scala.inline
    def setFeaturedGroups(value: js.Array[PortalFeaturedGroups]): Self = this.set("featuredGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeaturedGroups: Self = this.set("featuredGroups", js.undefined)
    
    @scala.inline
    def setFeaturedItemsGroupQuery(value: String): Self = this.set("featuredItemsGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeaturedItemsGroupQuery: Self = this.set("featuredItemsGroupQuery", js.undefined)
    
    @scala.inline
    def setGalleryTemplatesGroupQuery(value: String): Self = this.set("galleryTemplatesGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGalleryTemplatesGroupQuery: Self = this.set("galleryTemplatesGroupQuery", js.undefined)
    
    @scala.inline
    def setHasCategorySchema(value: Boolean): Self = this.set("hasCategorySchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasCategorySchema: Self = this.set("hasCategorySchema", js.undefined)
    
    @scala.inline
    def setHelperServices(value: js.Any): Self = this.set("helperServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelperServices: Self = this.set("helperServices", js.undefined)
    
    @scala.inline
    def setHomePageFeaturedContent(value: String): Self = this.set("homePageFeaturedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomePageFeaturedContent: Self = this.set("homePageFeaturedContent", js.undefined)
    
    @scala.inline
    def setHomePageFeaturedContentCount(value: Double): Self = this.set("homePageFeaturedContentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomePageFeaturedContentCount: Self = this.set("homePageFeaturedContentCount", js.undefined)
    
    @scala.inline
    def setHttpPort(value: Double): Self = this.set("httpPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpPort: Self = this.set("httpPort", js.undefined)
    
    @scala.inline
    def setHttpsPort(value: Double): Self = this.set("httpsPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpsPort: Self = this.set("httpsPort", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIpCntryCode(value: String): Self = this.set("ipCntryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpCntryCode: Self = this.set("ipCntryCode", js.undefined)
    
    @scala.inline
    def setIsPortal(value: Boolean): Self = this.set("isPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPortal: Self = this.set("isPortal", js.undefined)
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReadOnly: Self = this.set("isReadOnly", js.undefined)
    
    @scala.inline
    def setLayerTemplatesGroupQuery(value: String): Self = this.set("layerTemplatesGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerTemplatesGroupQuery: Self = this.set("layerTemplatesGroupQuery", js.undefined)
    
    @scala.inline
    def setMaxTokenExpirationMinutes(value: Double): Self = this.set("maxTokenExpirationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTokenExpirationMinutes: Self = this.set("maxTokenExpirationMinutes", js.undefined)
    
    @scala.inline
    def setModified(value: DateProperties): Self = this.set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModified: Self = this.set("modified", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPortalHostname(value: String): Self = this.set("portalHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalHostname: Self = this.set("portalHostname", js.undefined)
    
    @scala.inline
    def setPortalMode(value: multitenant | singletenant): Self = this.set("portalMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalMode: Self = this.set("portalMode", js.undefined)
    
    @scala.inline
    def setPortalProperties(value: js.Any): Self = this.set("portalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalProperties: Self = this.set("portalProperties", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRotatorPanelsVarargs(value: js.Any*): Self = this.set("rotatorPanels", js.Array(value :_*))
    
    @scala.inline
    def setRotatorPanels(value: js.Array[_]): Self = this.set("rotatorPanels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotatorPanels: Self = this.set("rotatorPanels", js.undefined)
    
    @scala.inline
    def setShowHomePageDescription(value: Boolean): Self = this.set("showHomePageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHomePageDescription: Self = this.set("showHomePageDescription", js.undefined)
    
    @scala.inline
    def setSourceJSON(value: js.Any): Self = this.set("sourceJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceJSON: Self = this.set("sourceJSON", js.undefined)
    
    @scala.inline
    def setSupportsHostedServices(value: Boolean): Self = this.set("supportsHostedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsHostedServices: Self = this.set("supportsHostedServices", js.undefined)
    
    @scala.inline
    def setSymbolSetsGroupQuery(value: String): Self = this.set("symbolSetsGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolSetsGroupQuery: Self = this.set("symbolSetsGroupQuery", js.undefined)
    
    @scala.inline
    def setTemplatesGroupQuery(value: String): Self = this.set("templatesGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplatesGroupQuery: Self = this.set("templatesGroupQuery", js.undefined)
    
    @scala.inline
    def setUnits(value: english | metric): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlKey(value: String): Self = this.set("urlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlKey: Self = this.set("urlKey", js.undefined)
    
    @scala.inline
    def setUseStandardizedQuery(value: Boolean): Self = this.set("useStandardizedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseStandardizedQuery: Self = this.set("useStandardizedQuery", js.undefined)
    
    @scala.inline
    def setUseVectorBasemaps(value: Boolean): Self = this.set("useVectorBasemaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseVectorBasemaps: Self = this.set("useVectorBasemaps", js.undefined)
    
    @scala.inline
    def setUser(value: PortalUserProperties): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setVectorBasemapGalleryGroupQuery(value: String): Self = this.set("vectorBasemapGalleryGroupQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVectorBasemapGalleryGroupQuery: Self = this.set("vectorBasemapGalleryGroupQuery", js.undefined)
  }
}
