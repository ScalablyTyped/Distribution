package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoAppLanguageID
import typings.activexOffice.Office.MsoLanguageID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.LanguageSettings")
@js.native
class LanguageSettings protected ()
  extends typings.activexOffice.Office.LanguageSettings {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  @JSName("Office.LanguageSettings_typekey")
  override var OfficeDotLanguageSettings_typekey: typings.activexOffice.Office.LanguageSettings = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override def LanguageID(Id: MsoAppLanguageID): Double = js.native
  /* CompleteClass */
  override def LanguagePreferredForEditing(lid: MsoLanguageID): Boolean = js.native
}

