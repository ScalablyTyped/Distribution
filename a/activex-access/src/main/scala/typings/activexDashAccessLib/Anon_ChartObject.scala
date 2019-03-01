package typings
package activexDashAccessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartObject extends js.Object {
  val chartObject: js.Any
  val drawObject: js.Any
}

object Anon_ChartObject {
  @scala.inline
  def apply(chartObject: js.Any, drawObject: js.Any): Anon_ChartObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chartObject")(chartObject)
    __obj.updateDynamic("drawObject")(drawObject)
    __obj.asInstanceOf[Anon_ChartObject]
  }
}

