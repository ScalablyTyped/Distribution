package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGapDegree extends js.Object {
  var gapDegree: Double
  var percent: Double
  var showInfo: Boolean
  var size: String
  var strokeLinecap: String
  var trailColor: Null
  var `type`: String
}

object AnonGapDegree {
  @scala.inline
  def apply(
    gapDegree: Double,
    percent: Double,
    showInfo: Boolean,
    size: String,
    strokeLinecap: String,
    trailColor: Null,
    `type`: String
  ): AnonGapDegree = {
    val __obj = js.Dynamic.literal(gapDegree = gapDegree.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], showInfo = showInfo.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeLinecap = strokeLinecap.asInstanceOf[js.Any], trailColor = trailColor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGapDegree]
  }
}

