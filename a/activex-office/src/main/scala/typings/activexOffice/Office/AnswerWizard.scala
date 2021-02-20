package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnswerWizard extends StObject {
  
  val Application: js.Any = js.native
  
  def ClearFileList(): Unit = js.native
  
  val Creator: Double = js.native
  
  def Files(Index: Double): String = js.native
  @JSName("Files")
  val Files_Original: AnswerWizardFiles = js.native
  
  @JSName("Office.AnswerWizard_typekey")
  var OfficeDotAnswerWizard_typekey: AnswerWizard = js.native
  
  val Parent: js.Any = js.native
  
  def ResetFileList(): Unit = js.native
}
