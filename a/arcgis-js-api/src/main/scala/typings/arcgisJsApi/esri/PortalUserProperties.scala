package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`private`
import typings.arcgisJsApi.arcgisJsApiStrings.english
import typings.arcgisJsApi.arcgisJsApiStrings.metric
import typings.arcgisJsApi.arcgisJsApiStrings.org_
import typings.arcgisJsApi.arcgisJsApiStrings.org_admin
import typings.arcgisJsApi.arcgisJsApiStrings.org_publisher
import typings.arcgisJsApi.arcgisJsApiStrings.org_user
import typings.arcgisJsApi.arcgisJsApiStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalUserProperties extends js.Object {
  /**
    * Indicates the level of access of the user. If private, the user descriptive information will not be available to others nor will the username be searchable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#access)
    */
  var access: js.UndefOr[`private` | org_ | public] = js.native
  /**
    * The date the user was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.native
  /**
    * The culture information for the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#culture)
    */
  var culture: js.UndefOr[String] = js.native
  /**
    * A description of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The user's e-mail address.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#email)
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The user's full name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fullName)
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * The date the user was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#modified)
    */
  var modified: js.UndefOr[DateProperties] = js.native
  /**
    * The ID of the organization the user belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#orgId)
    */
  var orgId: js.UndefOr[String] = js.native
  /**
    * The portal associated with the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.native
  /**
    * The user's preferred view for content, either web or GIS.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#preferredView)
    */
  var preferredView: js.UndefOr[String] = js.native
  /**
    * The user preferred region, used to set the featured maps on the home page, content in the gallery, and the default extent of new maps in the Viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#region)
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Defines the user's role in the organization. See [roleId](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#roleId) for more details about when user has a custom role.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role)
    */
  var role: js.UndefOr[org_admin | org_publisher | org_user] = js.native
  /**
    * The ID of the user's role.  Only set if the user is assigned a custom role.  When present, the [role](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role) will indicate the "base" role of the custom role based on the privileges the custom role contains. For example, if the custom role contains some publisher privileges, the [role](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role) will be set to `org_publisher`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#roleId)
    */
  var roleId: js.UndefOr[String] = js.native
  /**
    * The JSON used to create the property values when the `PortalUser` is created. Although most commonly used properties are exposed on the `PortalUser` class directly, this provides access to all information returned for the portal user. This property is useful if working in an application built using an older version of the API which requires access to a portal's user properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.native
  /**
    * The user's personal units of measure setting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#units)
    */
  var units: js.UndefOr[english | metric] = js.native
  /**
    * The username of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#username)
    */
  var username: js.UndefOr[String] = js.native
}

object PortalUserProperties {
  @scala.inline
  def apply(): PortalUserProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalUserProperties]
  }
  @scala.inline
  implicit class PortalUserPropertiesOps[Self <: PortalUserProperties] (val x: Self) extends AnyVal {
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
    def setAccess(value: `private` | org_ | public): Self = this.set("access", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    @scala.inline
    def setCreated(value: DateProperties): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullName: Self = this.set("fullName", js.undefined)
    @scala.inline
    def setModified(value: DateProperties): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModified: Self = this.set("modified", js.undefined)
    @scala.inline
    def setOrgId(value: String): Self = this.set("orgId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrgId: Self = this.set("orgId", js.undefined)
    @scala.inline
    def setPortal(value: PortalProperties): Self = this.set("portal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortal: Self = this.set("portal", js.undefined)
    @scala.inline
    def setPreferredView(value: String): Self = this.set("preferredView", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredView: Self = this.set("preferredView", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setRole(value: org_admin | org_publisher | org_user): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRoleId(value: String): Self = this.set("roleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleId: Self = this.set("roleId", js.undefined)
    @scala.inline
    def setSourceJSON(value: js.Any): Self = this.set("sourceJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceJSON: Self = this.set("sourceJSON", js.undefined)
    @scala.inline
    def setUnits(value: english | metric): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

