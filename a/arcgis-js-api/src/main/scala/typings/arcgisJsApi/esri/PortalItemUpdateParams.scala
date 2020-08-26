package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalItemUpdateParams extends Object {
  /**
    * **Optional**. The component used to stream the data represented by the item to the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#update)
    */
  var data: String | js.Any = js.native
}

object PortalItemUpdateParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    data: String | js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PortalItemUpdateParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PortalItemUpdateParams]
  }
  @scala.inline
  implicit class PortalItemUpdateParamsOps[Self <: PortalItemUpdateParams] (val x: Self) extends AnyVal {
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
    def setData(value: String | js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

