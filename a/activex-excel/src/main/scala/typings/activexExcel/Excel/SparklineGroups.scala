package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklineGroups extends StObject {
  
  def apply(Index: Double): SparklineGroup = js.native
  
  def Add(Type: XlSparkType, SourceData: String): SparklineGroup = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def Clear(): Unit = js.native
  
  def ClearGroups(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Group(Location: Range): Unit = js.native
  
  def Item(Index: Double): SparklineGroup = js.native
  
  val Parent: js.Any = js.native
  
  def Ungroup(): Unit = js.native
  
  def _Default(Index: js.Any): SparklineGroup = js.native
}
