package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulerLevel extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var FirstMargin: Double = js.native
  var LeftMargin: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.RulerLevel_typekey")
  var PowerPointDotRulerLevel_typekey: RulerLevel = js.native
}

object RulerLevel {
  @scala.inline
  def apply(
    Application: Application,
    FirstMargin: Double,
    LeftMargin: Double,
    Parent: js.Any,
    PowerPointDotRulerLevel_typekey: RulerLevel
  ): RulerLevel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], FirstMargin = FirstMargin.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RulerLevel_typekey")(PowerPointDotRulerLevel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerLevel]
  }
  @scala.inline
  implicit class RulerLevelOps[Self <: RulerLevel] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstMargin(value: Double): Self = this.set("FirstMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftMargin(value: Double): Self = this.set("LeftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotRulerLevel_typekey(value: RulerLevel): Self = this.set("PowerPoint.RulerLevel_typekey", value.asInstanceOf[js.Any])
  }
  
}

