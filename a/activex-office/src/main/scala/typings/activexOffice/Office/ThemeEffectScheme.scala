package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeEffectScheme extends js.Object {
  val Application: js.Any
  val Creator: Double
  @JSName("Office.ThemeEffectScheme_typekey")
  var OfficeDotThemeEffectScheme_typekey: ThemeEffectScheme
  val Parent: js.Any
  def Load(FileName: String): Unit
}

object ThemeEffectScheme {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Load: String => Unit,
    OfficeDotThemeEffectScheme_typekey: ThemeEffectScheme,
    Parent: js.Any
  ): ThemeEffectScheme = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Load = js.Any.fromFunction1(Load), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ThemeEffectScheme_typekey")(OfficeDotThemeEffectScheme_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeEffectScheme]
  }
}

