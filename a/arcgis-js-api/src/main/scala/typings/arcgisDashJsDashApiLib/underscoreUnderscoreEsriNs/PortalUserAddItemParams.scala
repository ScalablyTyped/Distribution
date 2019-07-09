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
  var folder: js.UndefOr[java.lang.String | PortalFolder] = js.undefined
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
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    item: PortalItem,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    data: java.lang.String | js.Any = null,
    folder: java.lang.String | PortalFolder = null
  ): PortalUserAddItemParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), item = item, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalUserAddItemParams]
  }
}

