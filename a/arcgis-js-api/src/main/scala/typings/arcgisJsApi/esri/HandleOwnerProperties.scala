package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleOwnerProperties extends js.Object {
  /**
    * Handle registry to help manage `handles`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-HandleOwner.html#handles)
    */
  var handles: js.UndefOr[HandlesProperties] = js.native
}

object HandleOwnerProperties {
  @scala.inline
  def apply(): HandleOwnerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleOwnerProperties]
  }
  @scala.inline
  implicit class HandleOwnerPropertiesOps[Self <: HandleOwnerProperties] (val x: Self) extends AnyVal {
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
    def setHandles(value: HandlesProperties): Self = this.set("handles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandles: Self = this.set("handles", js.undefined)
  }
  
}

