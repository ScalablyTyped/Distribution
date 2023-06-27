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

trait PortalUserProperties extends StObject {
  
  /**
  		 * Indicates the level of access of the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#access)
  		 */
  var access: js.UndefOr[`private` | org_ | public] = js.undefined
  
  /**
  		 * The date the user was created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#created)
  		 */
  var created: js.UndefOr[DateProperties] = js.undefined
  
  /**
  		 * The culture information for the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#culture)
  		 */
  var culture: js.UndefOr[String] = js.undefined
  
  /**
  		 * A description of the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#description)
  		 */
  var description: js.UndefOr[String] = js.undefined
  
  /**
  		 * The user's e-mail address.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#email)
  		 */
  var email: js.UndefOr[String] = js.undefined
  
  /**
  		 * The user's full name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fullName)
  		 */
  var fullName: js.UndefOr[String] = js.undefined
  
  /**
  		 * The date the user was last modified.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#modified)
  		 */
  var modified: js.UndefOr[DateProperties] = js.undefined
  
  /**
  		 * The ID of the organization the user belongs to.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#orgId)
  		 */
  var orgId: js.UndefOr[String] = js.undefined
  
  /**
  		 * The portal associated with the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#portal)
  		 */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  
  /**
  		 * The user's preferred view for content, either web or GIS.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#preferredView)
  		 */
  var preferredView: js.UndefOr[String] = js.undefined
  
  /**
  		 * The user preferred region, used to set the featured maps on the home page, content in the gallery, and the default extent of new maps in the Viewer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#region)
  		 */
  var region: js.UndefOr[String] = js.undefined
  
  /**
  		 * Defines the user's role in the organization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role)
  		 */
  var role: js.UndefOr[org_admin | org_publisher | org_user] = js.undefined
  
  /**
  		 * The ID of the user's role.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#roleId)
  		 */
  var roleId: js.UndefOr[String] = js.undefined
  
  /**
  		 * The JSON used to create the property values when the `PortalUser` is created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#sourceJSON)
  		 */
  var sourceJSON: js.UndefOr[Any] = js.undefined
  
  /**
  		 * The user's personal units of measure setting.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#units)
  		 */
  var units: js.UndefOr[english | metric] = js.undefined
  
  /**
  		 * The username of the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#username)
  		 */
  var username: js.UndefOr[String] = js.undefined
}
object PortalUserProperties {
  
  inline def apply(): PortalUserProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalUserProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortalUserProperties] (val x: Self) extends AnyVal {
    
    inline def setAccess(value: `private` | org_ | public): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setCreated(value: DateProperties): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setModified(value: DateProperties): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setOrgId(value: String): Self = StObject.set(x, "orgId", value.asInstanceOf[js.Any])
    
    inline def setOrgIdUndefined: Self = StObject.set(x, "orgId", js.undefined)
    
    inline def setPortal(value: PortalProperties): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    inline def setPreferredView(value: String): Self = StObject.set(x, "preferredView", value.asInstanceOf[js.Any])
    
    inline def setPreferredViewUndefined: Self = StObject.set(x, "preferredView", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRole(value: org_admin | org_publisher | org_user): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
    
    inline def setRoleIdUndefined: Self = StObject.set(x, "roleId", js.undefined)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSourceJSON(value: Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    inline def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    inline def setUnits(value: english | metric): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
