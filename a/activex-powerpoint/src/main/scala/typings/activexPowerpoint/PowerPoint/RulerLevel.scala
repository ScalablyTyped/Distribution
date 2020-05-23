package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulerLevel extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var FirstMargin: Double
  var LeftMargin: Double
  val Parent: js.Any
  @JSName("PowerPoint.RulerLevel_typekey")
  var PowerPointDotRulerLevel_typekey: RulerLevel
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
}

