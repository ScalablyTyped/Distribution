package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageSettings extends js.Object {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  def LanguageID(Id: MsoAppLanguageID): Double = js.native
  
  def LanguagePreferredForEditing(lid: MsoLanguageID): Boolean = js.native
  
  @JSName("Office.LanguageSettings_typekey")
  var OfficeDotLanguageSettings_typekey: LanguageSettings = js.native
  
  val Parent: js.Any = js.native
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
  
  @scala.inline
  implicit class LanguageSettingsOps[Self <: LanguageSettings] (val x: Self) extends AnyVal {
    
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
    def setLanguageID(value: MsoAppLanguageID => Double): Self = this.set("LanguageID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLanguagePreferredForEditing(value: MsoLanguageID => Boolean): Self = this.set("LanguagePreferredForEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOfficeDotLanguageSettings_typekey(value: LanguageSettings): Self = this.set("Office.LanguageSettings_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
}
