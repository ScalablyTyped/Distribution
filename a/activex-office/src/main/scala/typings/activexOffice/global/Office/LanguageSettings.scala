package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoAppLanguageID
import typings.activexOffice.Office.MsoLanguageID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.LanguageSettings")
@js.native
/* private */ open class LanguageSettings ()
  extends StObject
     with typings.activexOffice.Office.LanguageSettings {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def LanguageID(Id: MsoAppLanguageID): Double = js.native
  
  /* CompleteClass */
  override def LanguagePreferredForEditing(lid: MsoLanguageID): Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.LanguageSettings_typekey")
  var OfficeDotLanguageSettings_typekey: typings.activexOffice.Office.LanguageSettings = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
}
