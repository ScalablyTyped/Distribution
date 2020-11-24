package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuBars extends js.Object {
  
  def apply(Index: js.Any): MenuBar = js.native
  
  def Add(): MenuBar = js.native
  def Add(Name: js.Any): MenuBar = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: js.Any): MenuBar = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): MenuBar = js.native
}
