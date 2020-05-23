package typings.antd.anon

import typings.antd.antdStrings.butt
import typings.antd.antdStrings.circle
import typings.antd.antdStrings.dashboard
import typings.antd.antdStrings.default
import typings.antd.antdStrings.line
import typings.antd.antdStrings.round
import typings.antd.antdStrings.small
import typings.antd.antdStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GapDegree extends js.Object {
  var gapDegree: js.UndefOr[scala.Nothing] = js.undefined
  var percent: Double
  var showInfo: Boolean
  var size: js.UndefOr[small | default] = js.undefined
  var strokeLinecap: js.UndefOr[round | butt | square] = js.undefined
  var trailColor: Null
  var `type`: js.UndefOr[circle | line | dashboard] = js.undefined
}

object GapDegree {
  @scala.inline
  def apply(
    percent: Double,
    showInfo: Boolean,
    trailColor: Null,
    size: small | default = null,
    strokeLinecap: round | butt | square = null,
    `type`: circle | line | dashboard = null
  ): GapDegree = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], showInfo = showInfo.asInstanceOf[js.Any], trailColor = trailColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GapDegree]
  }
}

