package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.XSLTransform")
@js.native
class XSLTransform protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val ID: String = js.native
  val Parent: js.Any = js.native
  @JSName("Word.XSLTransform_typekey")
  var WordDotXSLTransform_typekey: XSLTransform = js.native
  /** @param boolean [AllUsers=false] */
  def Alias(): String = js.native
  def Alias(AllUsers: Boolean): String = js.native
  def Delete(): Unit = js.native
  /** @param boolean [AllUsers=false] */
  def Location(): String = js.native
  def Location(AllUsers: Boolean): String = js.native
}

