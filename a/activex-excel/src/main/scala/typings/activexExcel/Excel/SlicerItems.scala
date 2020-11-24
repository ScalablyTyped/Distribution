package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlicerItems extends js.Object {
  
  def apply(Index: String): SlicerItem = js.native
  def apply(Index: Double): SlicerItem = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): SlicerItem = js.native
  def Item(Index: Double): SlicerItem = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): SlicerItem = js.native
}
