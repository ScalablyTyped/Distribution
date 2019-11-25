package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalUserAddItemParams extends Object {
  /**
    * The component used to stream the data represented by the item to the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem)
    */
  var data: js.UndefOr[String | js.Any] = js.undefined
  /**
    * The portal folder in which to store the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem)
    */
  var folder: js.UndefOr[String | PortalFolder] = js.undefined
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
    hasOwnProperty: PropertyKey => Boolean,
    item: PortalItem,
    propertyIsEnumerable: PropertyKey => Boolean,
    data: String | js.Any = null,
    folder: String | PortalFolder = null
  ): PortalUserAddItemParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), item = item.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalUserAddItemParams]
  }
}

