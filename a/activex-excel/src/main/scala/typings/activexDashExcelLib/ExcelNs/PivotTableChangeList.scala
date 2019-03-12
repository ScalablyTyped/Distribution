package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotTableChangeList extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): ValueChange = js.native
  def apply(Index: scala.Double): ValueChange = js.native
  def Add(Tuple: java.lang.String, Value: scala.Double): ValueChange = js.native
  def Add(Tuple: java.lang.String, Value: scala.Double, AllocationValue: js.Any): ValueChange = js.native
  def Add(Tuple: java.lang.String, Value: scala.Double, AllocationValue: js.Any, AllocationMethod: js.Any): ValueChange = js.native
  def Add(
    Tuple: java.lang.String,
    Value: scala.Double,
    AllocationValue: js.Any,
    AllocationMethod: js.Any,
    AllocationWeightExpression: js.Any
  ): ValueChange = js.native
  def Item(Index: java.lang.String): ValueChange = js.native
  def Item(Index: scala.Double): ValueChange = js.native
  def _Default(Index: js.Any): ValueChange = js.native
}

