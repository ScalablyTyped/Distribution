package typings.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChartObject extends js.Object {
  val chartObject: js.Any
  val drawObject: js.Any
}

object AnonChartObject {
  @scala.inline
  def apply(chartObject: js.Any, drawObject: js.Any): AnonChartObject = {
    val __obj = js.Dynamic.literal(chartObject = chartObject.asInstanceOf[js.Any], drawObject = drawObject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChartObject]
  }
}

