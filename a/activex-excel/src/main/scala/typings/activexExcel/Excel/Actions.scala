package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions extends js.Object {
  
  def apply(Index: String): Action = js.native
  def apply(Index: Double): Action = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): Action = js.native
  def Item(Index: Double): Action = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: String): Action = js.native
  def _Default(Index: Double): Action = js.native
}
