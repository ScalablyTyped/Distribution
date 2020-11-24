package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListColumns extends js.Object {
  
  def apply(Index: String): ListColumn = js.native
  def apply(Index: Double): ListColumn = js.native
  
  def Add(): ListColumn = js.native
  def Add(Position: Double): ListColumn = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): ListColumn = js.native
  def Item(Index: Double): ListColumn = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): ListColumn = js.native
}
