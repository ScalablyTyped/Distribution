package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageSettings extends js.Object {
  val Application: js.Any
  val Creator: Double
  @JSName("Office.LanguageSettings_typekey")
  var OfficeDotLanguageSettings_typekey: LanguageSettings
  val Parent: js.Any
  def LanguageID(Id: MsoAppLanguageID): Double
  def LanguagePreferredForEditing(lid: MsoLanguageID): Boolean
}

object LanguageSettings {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    LanguageID: MsoAppLanguageID => Double,
    LanguagePreferredForEditing: MsoLanguageID => Boolean,
    OfficeDotLanguageSettings_typekey: LanguageSettings,
    Parent: js.Any
  ): LanguageSettings = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LanguageID = js.Any.fromFunction1(LanguageID), LanguagePreferredForEditing = js.Any.fromFunction1(LanguagePreferredForEditing), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.LanguageSettings_typekey")(OfficeDotLanguageSettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageSettings]
  }
}

