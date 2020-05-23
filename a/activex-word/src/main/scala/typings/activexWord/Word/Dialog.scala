package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val CommandBarId: Double = js.native
  val CommandName: String = js.native
  val Creator: Double = js.native
  var DefaultTab: WdWordDialogTab = js.native
  val Parent: js.Any = js.native
  val Type: WdWordDialog = js.native
  @JSName("Word.Dialog_typekey")
  var WordDotDialog_typekey: Dialog = js.native
  def Display(): Double = js.native
  def Display(TimeOut: Double): Double = js.native
  def Execute(): Unit = js.native
  def Show(): Double = js.native
  def Show(TimeOut: js.Any): Double = js.native
  def Update(): Unit = js.native
}

