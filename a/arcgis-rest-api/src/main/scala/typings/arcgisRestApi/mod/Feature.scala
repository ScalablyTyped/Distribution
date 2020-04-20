package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  var attributes: js.Any
  var geometry: Geometry
}

object Feature {
  @scala.inline
  def apply(attributes: js.Any, geometry: Geometry): Feature = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
}

