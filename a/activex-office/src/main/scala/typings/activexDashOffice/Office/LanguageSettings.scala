package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.LanguageSettings")
@js.native
class LanguageSettings protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.LanguageSettings_typekey")
  var OfficeDotLanguageSettings_typekey: LanguageSettings = js.native
  val Parent: js.Any = js.native
  def LanguageID(Id: MsoAppLanguageID): Double = js.native
  def LanguagePreferredForEditing(lid: MsoLanguageID): Boolean = js.native
}

