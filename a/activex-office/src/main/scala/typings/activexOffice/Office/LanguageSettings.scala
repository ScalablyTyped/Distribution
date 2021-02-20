package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageSettings extends StObject {
  
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
  implicit class LanguageSettingsMutableBuilder[Self <: LanguageSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageID(value: MsoAppLanguageID => Double): Self = StObject.set(x, "LanguageID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLanguagePreferredForEditing(value: MsoLanguageID => Boolean): Self = StObject.set(x, "LanguagePreferredForEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOfficeDotLanguageSettings_typekey(value: LanguageSettings): Self = StObject.set(x, "Office.LanguageSettings_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
