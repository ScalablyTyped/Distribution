package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ContentControls")
@js.native
class ContentControls protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.ContentControls_typekey`: ContentControls = js.native
  /** @param Word.WdContentControlType [Type=0] */
  def Add(): ContentControl = js.native
  def Add(Type: WdContentControlType): ContentControl = js.native
  def Add(Type: WdContentControlType, Range: js.Any): ContentControl = js.native
  def Item(Index: js.Any): ContentControl = js.native
}

