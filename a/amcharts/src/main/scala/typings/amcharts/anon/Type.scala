package typings.amcharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
   // Either "dataUpdated" or "init".
  var chart: this.type
  var `type`: String
}

object Type {
  @scala.inline
  def apply(chart: Type, `type`: String): Type = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

