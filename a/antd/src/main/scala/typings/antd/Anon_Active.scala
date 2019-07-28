package typings.antd

import typings.antd.antdStrings.active
import typings.antd.antdStrings.circle
import typings.antd.antdStrings.dashboard
import typings.antd.antdStrings.exception
import typings.antd.antdStrings.line
import typings.antd.antdStrings.normal
import typings.antd.antdStrings.success
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
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

object Anon_Active {
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
  ): Anon_Active = {
    val __obj = js.Dynamic.literal(format = format, gapDegree = gapDegree, percent = percent, showInfo = showInfo, status = status, strokeColor = strokeColor, strokeLinecap = strokeLinecap, strokeWidth = strokeWidth, trailColor = trailColor, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Active]
  }
}

