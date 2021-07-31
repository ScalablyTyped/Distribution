package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameters extends StObject {
  
  def apply(Index: String): Parameter = js.native
  def apply(Index: Double): Parameter = js.native
  
  def Add(Name: String): Parameter = js.native
  def Add(Name: String, iDataType: XlParameterDataType): Parameter = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  def Item(Index: String): Parameter = js.native
  def Item(Index: Double): Parameter = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): Parameter = js.native
}
