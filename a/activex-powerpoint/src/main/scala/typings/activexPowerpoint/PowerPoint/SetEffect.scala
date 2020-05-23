package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetEffect extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Parent: js.Any
  @JSName("PowerPoint.SetEffect_typekey")
  var PowerPointDotSetEffect_typekey: SetEffect
  var Property: MsoAnimProperty
  var To: js.Any
}

object SetEffect {
  @scala.inline
  def apply(
    Application: Application,
    Parent: js.Any,
    PowerPointDotSetEffect_typekey: SetEffect,
    Property: MsoAnimProperty,
    To: js.Any
  ): SetEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SetEffect_typekey")(PowerPointDotSetEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEffect]
  }
}

