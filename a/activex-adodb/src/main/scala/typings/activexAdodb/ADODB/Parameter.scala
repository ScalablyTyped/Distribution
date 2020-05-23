package typings.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  @JSName("ADODB.Parameter_typekey")
  var ADODBDotParameter_typekey: Parameter = js.native
  /** Sum of one or more of the values in the **ParameterAttributesEnum** enum */
  var Attributes: ParameterAttributesEnum = js.native
  var Direction: ParameterDirectionEnum = js.native
  var Name: String = js.native
  var NumericScale: Double = js.native
  var Precision: Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Size: Double = js.native
  var Type: DataTypeEnum = js.native
  var Value: js.Any = js.native
  def AppendChunk(Val: js.Any): Unit = js.native
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
}

