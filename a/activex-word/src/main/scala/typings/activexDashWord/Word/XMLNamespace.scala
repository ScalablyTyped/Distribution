package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.XMLNamespace")
@js.native
class XMLNamespace protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  val URI: String = js.native
  var `Word.XMLNamespace_typekey`: XMLNamespace = js.native
  val XSLTransforms: typings.activexDashWord.Word.XSLTransforms = js.native
  /** @param boolean [AllUsers=false] */
  def Alias(): String = js.native
  def Alias(AllUsers: Boolean): String = js.native
  def AttachToDocument(Document: js.Any): Unit = js.native
  /** @param boolean [AllUsers=false] */
  def DefaultTransform(): XSLTransform = js.native
  def DefaultTransform(AllUsers: Boolean): XSLTransform = js.native
  def Delete(): Unit = js.native
  /** @param boolean [AllUsers=false] */
  def Location(): String = js.native
  def Location(AllUsers: Boolean): String = js.native
}

