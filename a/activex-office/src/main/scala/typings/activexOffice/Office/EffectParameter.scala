package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectParameter extends js.Object {
  val Application: js.Any
  val Creator: Double
  val Name: String
  @JSName("Office.EffectParameter_typekey")
  var OfficeDotEffectParameter_typekey: EffectParameter
  var Value: js.Any
}

object EffectParameter {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Name: String,
    OfficeDotEffectParameter_typekey: EffectParameter,
    Value: js.Any
  ): EffectParameter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.EffectParameter_typekey")(OfficeDotEffectParameter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectParameter]
  }
}

