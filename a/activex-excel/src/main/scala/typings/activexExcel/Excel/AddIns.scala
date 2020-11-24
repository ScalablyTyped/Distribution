package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddIns extends js.Object {
  
  def apply(Index: String): AddIn = js.native
  def apply(Index: Double): AddIn = js.native
  
  def Add(Filename: String): AddIn = js.native
  def Add(Filename: String, CopyFile: Boolean): AddIn = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): AddIn = js.native
  def Item(Index: Double): AddIn = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: String): AddIn = js.native
  def _Default(Index: Double): AddIn = js.native
}
