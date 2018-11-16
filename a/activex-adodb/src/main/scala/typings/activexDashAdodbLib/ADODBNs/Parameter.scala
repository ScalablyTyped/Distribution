package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADODB.Parameter")
@js.native
class Parameter protected () extends js.Object {
  var `ADODB.Parameter_typekey`: Parameter = js.native
  /** Sum of one or more of the values in the **ParameterAttributesEnum** enum */
  var Attributes: ParameterAttributesEnum = js.native
  var Direction: ParameterDirectionEnum = js.native
  var Name: java.lang.String = js.native
  var NumericScale: scala.Double = js.native
  var Precision: scala.Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Size: scala.Double = js.native
  var Type: DataTypeEnum = js.native
  var Value: js.Any = js.native
  def AppendChunk(Val: js.Any): scala.Unit = js.native
  def Properties(Index: java.lang.String): Property = js.native
  def Properties(Index: scala.Double): Property = js.native
}

