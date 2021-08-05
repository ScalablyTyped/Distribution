package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`private`
import typings.arcgisJsApi.arcgisJsApiStrings.org_
import typings.arcgisJsApi.arcgisJsApiStrings.public
import typings.arcgisJsApi.arcgisJsApiStrings.shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalItemProperties
  extends StObject
     with LoadableProperties {
  
  /**
    * Indicates the level of access to this item: `private`, `shared`, `org`, or `public`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#access)
    */
  var access: js.UndefOr[`private` | shared | org_ | public] = js.undefined
  
  /**
    * Information on the source of the item and its copyright status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#accessInformation)
    */
  var accessInformation: js.UndefOr[String] = js.undefined
  
  /**
    * Average rating.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#avgRating)
    */
  var avgRating: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of organization categories that are set on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#categories)
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  
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
  var culture: js.UndefOr[String] = js.undefined
  
  /**
    * The detailed description of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The geographic extent, or bounding rectangle, of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * An array of group categories set on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#groupCategories)
    */
  var groupCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The unique id for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#id)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Information on license or restrictions related to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#licenseInfo)
    */
  var licenseInfo: js.UndefOr[String] = js.undefined
  
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
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Number of comments on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numComments)
    */
  var numComments: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of ratings on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numRatings)
    */
  var numRatings: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of views on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#numViews)
    */
  var numViews: js.UndefOr[Double] = js.undefined
  
  /**
    * The username of the user who owns this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#owner)
    */
  var owner: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the folder in which the owner has stored the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#ownerFolder)
    */
  var ownerFolder: js.UndefOr[String] = js.undefined
  
  /**
    * The portal that contains the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  
  /**
    * An array of string URLs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#screenshots)
    */
  var screenshots: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The size of the item (in bytes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#size)
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * A summary description of the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#snippet)
    */
  var snippet: js.UndefOr[String] = js.undefined
  
  /**
    * The JSON used to create the property values when the `PortalItem` is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.undefined
  
  /**
    * User defined tags that describe the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#tags)
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The title for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The GIS content type of this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#type)
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Type keywords that describe the type of content of this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#typeKeywords)
    */
  var typeKeywords: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The service URL of this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}
object PortalItemProperties {
  
  inline def apply(): PortalItemProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalItemProperties]
  }
  
  extension [Self <: PortalItemProperties](x: Self) {
    
    inline def setAccess(value: `private` | shared | org_ | public): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessInformation(value: String): Self = StObject.set(x, "accessInformation", value.asInstanceOf[js.Any])
    
    inline def setAccessInformationUndefined: Self = StObject.set(x, "accessInformation", js.undefined)
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setAvgRating(value: Double): Self = StObject.set(x, "avgRating", value.asInstanceOf[js.Any])
    
    inline def setAvgRatingUndefined: Self = StObject.set(x, "avgRating", js.undefined)
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    inline def setCreated(value: DateProperties): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setGroupCategories(value: js.Array[String]): Self = StObject.set(x, "groupCategories", value.asInstanceOf[js.Any])
    
    inline def setGroupCategoriesUndefined: Self = StObject.set(x, "groupCategories", js.undefined)
    
    inline def setGroupCategoriesVarargs(value: String*): Self = StObject.set(x, "groupCategories", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLicenseInfo(value: String): Self = StObject.set(x, "licenseInfo", value.asInstanceOf[js.Any])
    
    inline def setLicenseInfoUndefined: Self = StObject.set(x, "licenseInfo", js.undefined)
    
    inline def setModified(value: DateProperties): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumComments(value: Double): Self = StObject.set(x, "numComments", value.asInstanceOf[js.Any])
    
    inline def setNumCommentsUndefined: Self = StObject.set(x, "numComments", js.undefined)
    
    inline def setNumRatings(value: Double): Self = StObject.set(x, "numRatings", value.asInstanceOf[js.Any])
    
    inline def setNumRatingsUndefined: Self = StObject.set(x, "numRatings", js.undefined)
    
    inline def setNumViews(value: Double): Self = StObject.set(x, "numViews", value.asInstanceOf[js.Any])
    
    inline def setNumViewsUndefined: Self = StObject.set(x, "numViews", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerFolder(value: String): Self = StObject.set(x, "ownerFolder", value.asInstanceOf[js.Any])
    
    inline def setOwnerFolderUndefined: Self = StObject.set(x, "ownerFolder", js.undefined)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPortal(value: PortalProperties): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    inline def setScreenshots(value: js.Array[String]): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    inline def setScreenshotsUndefined: Self = StObject.set(x, "screenshots", js.undefined)
    
    inline def setScreenshotsVarargs(value: String*): Self = StObject.set(x, "screenshots", js.Array(value :_*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setSourceJSON(value: js.Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    inline def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeKeywords(value: js.Array[String]): Self = StObject.set(x, "typeKeywords", value.asInstanceOf[js.Any])
    
    inline def setTypeKeywordsUndefined: Self = StObject.set(x, "typeKeywords", js.undefined)
    
    inline def setTypeKeywordsVarargs(value: String*): Self = StObject.set(x, "typeKeywords", js.Array(value :_*))
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
