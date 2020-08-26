package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feature extends js.Object {
  var attributes: js.Any = js.native
  var geometry: Geometry = js.native
}

object Feature {
  @scala.inline
  def apply(attributes: js.Any, geometry: Geometry): Feature = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  @scala.inline
  implicit class FeatureOps[Self <: Feature] (val x: Self) extends AnyVal {
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
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeometry(value: Geometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
  }
  
}

