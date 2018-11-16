package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADODB.Field")
@js.native
class Field protected () extends js.Object {
  var `ADODB.Field_typekey`: Field = js.native
  val ActualSize: scala.Double = js.native
  /** Sum of one or more of the values in the **FieldAttributeEnum** enum */
  var Attributes: FieldAttributeEnum = js.native
  var DataFormat: js.Any = js.native
  var DefinedSize: scala.Double = js.native
  val Name: java.lang.String = js.native
  var NumericScale: scala.Double = js.native
  val OriginalValue: js.Any = js.native
  var Precision: scala.Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val Status: scala.Double = js.native
  var Type: DataTypeEnum = js.native
  val UnderlyingValue: js.Any = js.native
  var Value: js.Any = js.native
  def AppendChunk(Data: js.Any): scala.Unit = js.native
  def GetChunk(Length: scala.Double): js.Any = js.native
  def Properties(Index: java.lang.String): Property = js.native
  def Properties(Index: scala.Double): Property = js.native
}

