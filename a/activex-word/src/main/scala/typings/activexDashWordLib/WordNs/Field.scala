package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Field")
@js.native
class Field protected () extends js.Object {
  val Application: Application = js.native
  var Code: Range = js.native
  val Creator: scala.Double = js.native
  var Data: java.lang.String = js.native
  val Index: scala.Double = js.native
  val InlineShape: InlineShape = js.native
  val Kind: WdFieldKind = js.native
  val LinkFormat: LinkFormat = js.native
  var Locked: scala.Boolean = js.native
  val Next: Field = js.native
  val OLEFormat: OLEFormat = js.native
  val Parent: js.Any = js.native
  val Previous: Field = js.native
  var Result: Range = js.native
  var ShowCodes: scala.Boolean = js.native
  val Type: WdFieldType = js.native
  var `Word.Field_typekey`: Field = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def DoClick(): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def Unlink(): scala.Unit = js.native
  def Update(): scala.Boolean = js.native
  def UpdateSource(): scala.Unit = js.native
}

