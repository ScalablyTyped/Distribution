package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.XSLTransforms")
@js.native
class XSLTransforms protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.XSLTransforms_typekey`: XSLTransforms = js.native
  /** @param boolean [InstallForAllUsers=false] */
  def Add(Location: java.lang.String, Alias: js.Any): XSLTransform = js.native
  def Add(Location: java.lang.String, Alias: js.Any, InstallForAllUsers: scala.Boolean): XSLTransform = js.native
  def Item(Index: js.Any): XSLTransform = js.native
}

