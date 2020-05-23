package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnswerWizard extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Files")
  val Files_Original: AnswerWizardFiles = js.native
  @JSName("Office.AnswerWizard_typekey")
  var OfficeDotAnswerWizard_typekey: AnswerWizard = js.native
  val Parent: js.Any = js.native
  def ClearFileList(): Unit = js.native
  def Files(Index: Double): String = js.native
  def ResetFileList(): Unit = js.native
}

