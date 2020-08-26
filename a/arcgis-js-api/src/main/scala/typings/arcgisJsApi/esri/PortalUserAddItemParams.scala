package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalUserAddItemParams extends Object {
  /**
    * The component used to stream the data represented by the item to the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem)
    */
  var data: js.UndefOr[String | js.Any] = js.native
  /**
    * The portal folder in which to store the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem)
    */
  var folder: js.UndefOr[String | PortalFolder] = js.native
  /**
    * The item to add to the user's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem)
    */
  var item: PortalItem = js.native
}

object PortalUserAddItemParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    item: PortalItem,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PortalUserAddItemParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), item = item.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PortalUserAddItemParams]
  }
  @scala.inline
  implicit class PortalUserAddItemParamsOps[Self <: PortalUserAddItemParams] (val x: Self) extends AnyVal {
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
    def setItem(value: PortalItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String | js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFolder(value: String | PortalFolder): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
  }
  
}

