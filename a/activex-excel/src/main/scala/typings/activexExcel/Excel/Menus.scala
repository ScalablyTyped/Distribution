package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menus extends StObject {
  
  def apply(Index: Any): Menu = js.native
  
  def Add(Caption: String): Menu = js.native
  def Add(Caption: String, Before: Any): Menu = js.native
  def Add(Caption: String, Before: Any, Restore: Any): Menu = js.native
  def Add(Caption: String, Before: Unit, Restore: Any): Menu = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: Any): Menu = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): Menu = js.native
}
