package typings.amapJsApi.AMap.MarkerShape

import typings.amapJsApi.amapJsApiStrings.poly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolyOptions extends Options {
  var coords: js.Array[Double] = js.native
  var `type`: poly = js.native
}

object PolyOptions {
  @scala.inline
  def apply(coords: js.Array[Double], `type`: poly): PolyOptions = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyOptions]
  }
  @scala.inline
  implicit class PolyOptionsOps[Self <: PolyOptions] (val x: Self) extends AnyVal {
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
    def setCoordsVarargs(value: Double*): Self = this.set("coords", js.Array(value :_*))
    @scala.inline
    def setCoords(value: js.Array[Double]): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: poly): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

