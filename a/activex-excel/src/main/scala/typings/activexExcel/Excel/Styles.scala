package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styles extends StObject {
  
  def apply(Index: js.Any): Style = js.native
  
  def Add(Name: String): Style = js.native
  def Add(Name: String, BasedOn: js.Any): Style = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): Style = js.native
  def Item(Index: Double): Style = js.native
  
  def Merge(Workbook: Workbook): js.Any = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): Style = js.native
}
