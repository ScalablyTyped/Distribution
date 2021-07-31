package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dialog extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val CommandBarId: Double = js.native
  
  val CommandName: String = js.native
  
  val Creator: Double = js.native
  
  var DefaultTab: WdWordDialogTab = js.native
  
  def Display(): Double = js.native
  def Display(TimeOut: Double): Double = js.native
  
  def Execute(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  def Show(): Double = js.native
  def Show(TimeOut: js.Any): Double = js.native
  
  val Type: WdWordDialog = js.native
  
  def Update(): Unit = js.native
  
  @JSName("Word.Dialog_typekey")
  var WordDotDialog_typekey: Dialog = js.native
}
