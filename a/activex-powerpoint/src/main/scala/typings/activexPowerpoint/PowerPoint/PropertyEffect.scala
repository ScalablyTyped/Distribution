package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyEffect extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var From: js.Any
  val Parent: js.Any
  val Points: AnimationPoints
  @JSName("PowerPoint.PropertyEffect_typekey")
  var PowerPointDotPropertyEffect_typekey: PropertyEffect
  var Property: MsoAnimProperty
  var To: js.Any
}

object PropertyEffect {
  @scala.inline
  def apply(
    Application: Application,
    From: js.Any,
    Parent: js.Any,
    Points: AnimationPoints,
    PowerPointDotPropertyEffect_typekey: PropertyEffect,
    Property: MsoAnimProperty,
    To: js.Any
  ): PropertyEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PropertyEffect_typekey")(PowerPointDotPropertyEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyEffect]
  }
}

