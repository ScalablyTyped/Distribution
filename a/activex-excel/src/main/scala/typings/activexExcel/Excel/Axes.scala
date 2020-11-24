package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Axes extends js.Object {
  
  /** @param AxisGroup [AxisGroup=1] */
  def apply(Type: XlAxisType): Axis = js.native
  def apply(Type: XlAxisType, AxisGroup: XlAxisGroup): Axis = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  /** @param AxisGroup [AxisGroup=1] */
  def Item(Type: XlAxisType): Axis = js.native
  def Item(Type: XlAxisType, AxisGroup: XlAxisGroup): Axis = js.native
  
  val Parent: js.Any = js.native
  
  /** @param AxisGroup [AxisGroup=1] */
  def _Default(Type: XlAxisType): Axis = js.native
  def _Default(Type: XlAxisType, AxisGroup: XlAxisGroup): Axis = js.native
}
