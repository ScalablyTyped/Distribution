package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecentFiles extends StObject {
  
  def apply(Index: Double): RecentFile = js.native
  
  def Add(Name: String): RecentFile = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: Double): RecentFile = js.native
  
  var Maximum: Double = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: Double): RecentFile = js.native
}
