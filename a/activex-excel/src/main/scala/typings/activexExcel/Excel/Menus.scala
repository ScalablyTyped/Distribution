package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menus extends js.Object {
  
  def apply(Index: js.Any): Menu = js.native
  
  def Add(Caption: String): Menu = js.native
  def Add(Caption: String, Before: js.UndefOr[scala.Nothing], Restore: js.Any): Menu = js.native
  def Add(Caption: String, Before: js.Any): Menu = js.native
  def Add(Caption: String, Before: js.Any, Restore: js.Any): Menu = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: js.Any): Menu = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): Menu = js.native
}
