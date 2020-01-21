package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueMeshColorProperties extends js.Object {
  /**
    * The color value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ValueMeshColor.html#value)
    */
  var value: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
}

object ValueMeshColorProperties {
  @scala.inline
  def apply(value: Color_ | js.Array[Double] | String = null): ValueMeshColorProperties = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueMeshColorProperties]
  }
}

