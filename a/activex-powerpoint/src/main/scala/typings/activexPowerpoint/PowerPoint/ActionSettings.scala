package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSettings extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.ActionSettings_typekey")
  var PowerPointDotActionSettings_typekey: ActionSettings
  def Item(Index: PpMouseActivation): ActionSetting
}

object ActionSettings {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: PpMouseActivation => ActionSetting,
    Parent: js.Any,
    PowerPointDotActionSettings_typekey: ActionSettings
  ): ActionSettings = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ActionSettings_typekey")(PowerPointDotActionSettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSettings]
  }
}

