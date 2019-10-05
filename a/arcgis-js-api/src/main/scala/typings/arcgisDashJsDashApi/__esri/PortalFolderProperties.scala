package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalFolderProperties extends js.Object {
  /**
    * The date the folder was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.undefined
  /**
    * The unique id of the folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#id)
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The portal associated with the folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  /**
    * The title of the folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
}

object PortalFolderProperties {
  @scala.inline
  def apply(
    created: DateProperties = null,
    id: String = null,
    portal: PortalProperties = null,
    title: String = null
  ): PortalFolderProperties = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (portal != null) __obj.updateDynamic("portal")(portal)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PortalFolderProperties]
  }
}

