package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomProperties extends StObject {
  
  def apply(Index: String): CustomProperty = js.native
  def apply(Index: Double): CustomProperty = js.native
  
  def Add(Name: String, Value: js.Any): CustomProperty = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): CustomProperty = js.native
  def Item(Index: Double): CustomProperty = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): CustomProperty = js.native
}
