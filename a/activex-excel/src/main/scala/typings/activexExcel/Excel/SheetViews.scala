package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetViews extends js.Object {
  
  def apply(Index: js.Any): SheetView = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: js.Any): SheetView = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): js.Any = js.native
}
