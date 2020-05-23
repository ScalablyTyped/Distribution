package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoScriptLanguage
import typings.activexOffice.Office.MsoScriptLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.Script")
@js.native
class Script protected ()
  extends typings.activexOffice.Office.Script {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Extended: String = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /* CompleteClass */
  override var Language: MsoScriptLanguage = js.native
  /* CompleteClass */
  override val Location: MsoScriptLocation = js.native
  /* CompleteClass */
  @JSName("Office.Script_typekey")
  override var OfficeDotScript_typekey: typings.activexOffice.Office.Script = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var ScriptText: String = js.native
  /* CompleteClass */
  override val Shape: js.Any = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

