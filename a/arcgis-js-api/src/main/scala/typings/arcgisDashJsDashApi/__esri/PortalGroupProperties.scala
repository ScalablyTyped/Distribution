package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalGroupProperties extends js.Object {
  /**
    * The access privileges on the group which determines who can see and access the group.  **Possible Values:** private | org | public
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#access)
    */
  var access: js.UndefOr[String] = js.undefined
  /**
    * The date the group was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.undefined
  /**
    * A detailed description of the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The unique id for the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#id)
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * If set to `true`, then users will not be able to apply to join the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#isInvitationOnly)
    *
    * @default false
    */
  var isInvitationOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The date the group was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#modified)
    */
  var modified: js.UndefOr[DateProperties] = js.undefined
  /**
    * The username of the group's owner.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#owner)
    */
  var owner: js.UndefOr[String] = js.undefined
  /**
    * The portal associated with the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  /**
    * A short summary that describes the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#snippet)
    */
  var snippet: js.UndefOr[String] = js.undefined
  /**
    * User defined tags that describe the group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#tags)
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The title of the group. This is the name that is displayed to users. It is also used to refer to the group. Every group must have a title and it must be unique.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
}

object PortalGroupProperties {
  @scala.inline
  def apply(
    access: String = null,
    created: DateProperties = null,
    description: String = null,
    id: String = null,
    isInvitationOnly: js.UndefOr[Boolean] = js.undefined,
    modified: DateProperties = null,
    owner: String = null,
    portal: PortalProperties = null,
    snippet: String = null,
    tags: js.Array[String] = null,
    title: String = null
  ): PortalGroupProperties = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access)
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isInvitationOnly)) __obj.updateDynamic("isInvitationOnly")(isInvitationOnly)
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (portal != null) __obj.updateDynamic("portal")(portal)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PortalGroupProperties]
  }
}

