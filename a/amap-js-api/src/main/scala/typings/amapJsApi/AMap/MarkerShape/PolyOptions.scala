package typings.amapJsApi.AMap.MarkerShape

import typings.amapJsApi.amapJsApiStrings.poly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolyOptions extends Options {
  var coords: js.Array[Double]
  var `type`: poly
}

object PolyOptions {
  @scala.inline
  def apply(coords: js.Array[Double], `type`: poly): PolyOptions = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyOptions]
  }
}

