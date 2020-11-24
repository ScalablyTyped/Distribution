package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerViewableItems extends js.Object {
  
  def apply(Index: Double): js.Any = js.native
  
  def Add(Obj: js.Any): js.Any = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(Index: Double): Unit = js.native
  
  def DeleteAll(): Unit = js.native
  
  def Item(Index: Double): js.Any = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): js.Any = js.native
}
