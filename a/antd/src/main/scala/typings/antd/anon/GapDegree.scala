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

@js.native
trait GapDegree extends js.Object {
  var gapDegree: js.UndefOr[scala.Nothing] = js.native
  var percent: Double = js.native
  var showInfo: Boolean = js.native
  var size: js.UndefOr[small | default] = js.native
  var strokeLinecap: js.UndefOr[round | butt | square] = js.native
  var trailColor: Null = js.native
  var `type`: js.UndefOr[circle | line | dashboard] = js.native
}

object GapDegree {
  @scala.inline
  def apply(percent: Double, showInfo: Boolean, trailColor: Null): GapDegree = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], showInfo = showInfo.asInstanceOf[js.Any], trailColor = trailColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GapDegree]
  }
  @scala.inline
  implicit class GapDegreeOps[Self <: GapDegree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowInfo(value: Boolean): Self = this.set("showInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrailColor(value: Null): Self = this.set("trailColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: small | default): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStrokeLinecap(value: round | butt | square): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    @scala.inline
    def setType(value: circle | line | dashboard): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

