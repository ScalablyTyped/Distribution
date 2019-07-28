package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GapDegree extends js.Object {
  var gapDegree: Double
  var percent: Double
  var showInfo: Boolean
  var size: String
  var strokeLinecap: String
  var trailColor: String
  var `type`: String
}

object Anon_GapDegree {
  @scala.inline
  def apply(
    gapDegree: Double,
    percent: Double,
    showInfo: Boolean,
    size: String,
    strokeLinecap: String,
    trailColor: String,
    `type`: String
  ): Anon_GapDegree = {
    val __obj = js.Dynamic.literal(gapDegree = gapDegree, percent = percent, showInfo = showInfo, size = size, strokeLinecap = strokeLinecap, trailColor = trailColor)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_GapDegree]
  }
}

