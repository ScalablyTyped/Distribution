package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeEffectScheme extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.ThemeEffectScheme_typekey")
  var OfficeDotThemeEffectScheme_typekey: ThemeEffectScheme = js.native
  val Parent: js.Any = js.native
  def Load(FileName: String): Unit = js.native
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
  @scala.inline
  implicit class ThemeEffectSchemeOps[Self <: ThemeEffectScheme] (val x: Self) extends AnyVal {
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad(value: String => Unit): Self = this.set("Load", js.Any.fromFunction1(value))
    @scala.inline
    def setOfficeDotThemeEffectScheme_typekey(value: ThemeEffectScheme): Self = this.set("Office.ThemeEffectScheme_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
  
}

