package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomViews extends js.Object {
  
  def apply(ViewName: String): CustomView = js.native
  def apply(ViewName: Double): CustomView = js.native
  
  def Add(ViewName: String): CustomView = js.native
  def Add(ViewName: String, PrintSettings: js.UndefOr[scala.Nothing], RowColSettings: Boolean): CustomView = js.native
  def Add(ViewName: String, PrintSettings: Boolean): CustomView = js.native
  def Add(ViewName: String, PrintSettings: Boolean, RowColSettings: Boolean): CustomView = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(ViewName: String): CustomView = js.native
  def Item(ViewName: Double): CustomView = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(ViewName: js.Any): CustomView = js.native
}
