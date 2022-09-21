package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotTableChangeList extends StObject {
  
  def apply(Index: String): ValueChange = js.native
  def apply(Index: Double): ValueChange = js.native
  
  def Add(Tuple: String, Value: Double): ValueChange = js.native
  def Add(Tuple: String, Value: Double, AllocationValue: Any): ValueChange = js.native
  def Add(Tuple: String, Value: Double, AllocationValue: Any, AllocationMethod: Any): ValueChange = js.native
  def Add(
    Tuple: String,
    Value: Double,
    AllocationValue: Any,
    AllocationMethod: Any,
    AllocationWeightExpression: Any
  ): ValueChange = js.native
  def Add(
    Tuple: String,
    Value: Double,
    AllocationValue: Any,
    AllocationMethod: Unit,
    AllocationWeightExpression: Any
  ): ValueChange = js.native
  def Add(Tuple: String, Value: Double, AllocationValue: Unit, AllocationMethod: Any): ValueChange = js.native
  def Add(
    Tuple: String,
    Value: Double,
    AllocationValue: Unit,
    AllocationMethod: Any,
    AllocationWeightExpression: Any
  ): ValueChange = js.native
  def Add(
    Tuple: String,
    Value: Double,
    AllocationValue: Unit,
    AllocationMethod: Unit,
    AllocationWeightExpression: Any
  ): ValueChange = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): ValueChange = js.native
  def Item(Index: Double): ValueChange = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): ValueChange = js.native
}
