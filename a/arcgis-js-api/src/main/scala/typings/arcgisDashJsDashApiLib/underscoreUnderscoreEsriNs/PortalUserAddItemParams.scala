package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalUserAddItemParams
  extends stdLib.Object {
  /**
    * The component used to stream the data represented by the item to the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem)
    */
  var data: js.UndefOr[java.lang.String | js.Any] = js.undefined
  /**
    * The portal folder in which to store the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem)
    */
  var folder: js.UndefOr[PortalFolder] = js.undefined
  /**
    * The item to add to the user's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem)
    */
  var item: PortalItem
}

object PortalUserAddItemParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    item: PortalItem,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    data: java.lang.String | js.Any = null,
    folder: PortalFolder = null
  ): PortalUserAddItemParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder)
    __obj.asInstanceOf[PortalUserAddItemParams]
  }
}

