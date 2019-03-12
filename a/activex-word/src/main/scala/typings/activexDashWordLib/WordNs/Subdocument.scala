package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Subdocument")
@js.native
class Subdocument protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Creator: scala.Double = js.native
  val HasFile: scala.Boolean = js.native
  val Level: scala.Double = js.native
  var Locked: scala.Boolean = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  val Path: java.lang.String = js.native
  val Range: activexDashWordLib.WordNs.Range = js.native
  var `Word.Subdocument_typekey`: Subdocument = js.native
  def Delete(): scala.Unit = js.native
  def Open(): Document = js.native
  def Split(Range: Range): scala.Unit = js.native
}

