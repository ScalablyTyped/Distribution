package typings.activexDashWord.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Field")
@js.native
class Field protected () extends js.Object {
  val Application: typings.activexDashWord.WordNs.Application = js.native
  var Code: Range = js.native
  val Creator: Double = js.native
  var Data: String = js.native
  val Index: Double = js.native
  val InlineShape: typings.activexDashWord.WordNs.InlineShape = js.native
  val Kind: WdFieldKind = js.native
  val LinkFormat: typings.activexDashWord.WordNs.LinkFormat = js.native
  var Locked: Boolean = js.native
  val Next: Field = js.native
  val OLEFormat: typings.activexDashWord.WordNs.OLEFormat = js.native
  val Parent: js.Any = js.native
  val Previous: Field = js.native
  var Result: Range = js.native
  var ShowCodes: Boolean = js.native
  val Type: WdFieldType = js.native
  var `Word.Field_typekey`: Field = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def DoClick(): Unit = js.native
  def Select(): Unit = js.native
  def Unlink(): Unit = js.native
  def Update(): Boolean = js.native
  def UpdateSource(): Unit = js.native
}

