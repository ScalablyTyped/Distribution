package typings.activexDashAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADODB.Field")
@js.native
class Field protected () extends js.Object {
  var `ADODB.Field_typekey`: Field = js.native
  val ActualSize: Double = js.native
  /** Sum of one or more of the values in the **FieldAttributeEnum** enum */
  var Attributes: FieldAttributeEnum = js.native
  var DataFormat: js.Any = js.native
  var DefinedSize: Double = js.native
  val Name: String = js.native
  var NumericScale: Double = js.native
  val OriginalValue: js.Any = js.native
  var Precision: Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val Status: Double = js.native
  var Type: DataTypeEnum = js.native
  val UnderlyingValue: js.Any = js.native
  var Value: js.Any = js.native
  def AppendChunk(Data: js.Any): Unit = js.native
  def GetChunk(Length: Double): js.Any = js.native
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
}

