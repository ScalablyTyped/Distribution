package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.XSLTransforms")
@js.native
class XSLTransforms protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var `Word.XSLTransforms_typekey`: XSLTransforms = js.native
  /** @param boolean [InstallForAllUsers=false] */
  def Add(Location: String, Alias: js.Any): XSLTransform = js.native
  def Add(Location: String, Alias: js.Any, InstallForAllUsers: Boolean): XSLTransform = js.native
  def Item(Index: js.Any): XSLTransform = js.native
}

