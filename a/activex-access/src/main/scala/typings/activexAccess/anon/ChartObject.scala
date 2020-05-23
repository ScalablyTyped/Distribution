package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartObject extends js.Object {
  val chartObject: js.Any
  val drawObject: js.Any
}

object ChartObject {
  @scala.inline
  def apply(chartObject: js.Any, drawObject: js.Any): ChartObject = {
    val __obj = js.Dynamic.literal(chartObject = chartObject.asInstanceOf[js.Any], drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartObject]
  }
}

