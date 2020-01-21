package typings.antd

import typings.antd.antdStrings.active
import typings.antd.antdStrings.circle
import typings.antd.antdStrings.dashboard
import typings.antd.antdStrings.exception
import typings.antd.antdStrings.line
import typings.antd.antdStrings.normal
import typings.antd.antdStrings.success
import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  var format: Requireable[js.Function1[/* repeated */ _, _]]
  var gapDegree: Requireable[Double]
  var percent: Requireable[Double]
  var showInfo: Requireable[Boolean]
  var status: Requireable[normal | active | success | exception]
  var strokeColor: Requireable[String | js.Object]
  var strokeLinecap: Requireable[String]
  var strokeWidth: Requireable[Double]
  var trailColor: Requireable[String]
  var `type`: Requireable[circle | line | dashboard]
  var width: Requireable[Double]
}

object AnonActive {
  @scala.inline
  def apply(
    format: Requireable[js.Function1[/* repeated */ _, _]],
    gapDegree: Requireable[Double],
    percent: Requireable[Double],
    showInfo: Requireable[Boolean],
    status: Requireable[normal | active | success | exception],
    strokeColor: Requireable[String | js.Object],
    strokeLinecap: Requireable[String],
    strokeWidth: Requireable[Double],
    trailColor: Requireable[String],
    `type`: Requireable[circle | line | dashboard],
    width: Requireable[Double]
  ): AnonActive = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], gapDegree = gapDegree.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], showInfo = showInfo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeLinecap = strokeLinecap.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], trailColor = trailColor.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
}

