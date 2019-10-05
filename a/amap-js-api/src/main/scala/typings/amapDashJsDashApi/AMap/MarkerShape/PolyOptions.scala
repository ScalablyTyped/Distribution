package typings.amapDashJsDashApi.AMap.MarkerShape

import typings.amapDashJsDashApi.amapDashJsDashApiStrings.poly
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
    val __obj = js.Dynamic.literal(coords = coords)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PolyOptions]
  }
}

