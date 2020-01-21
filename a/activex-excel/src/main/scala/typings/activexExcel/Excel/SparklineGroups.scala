package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineGroups extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): SparklineGroup = js.native
  def Add(Type: XlSparkType, SourceData: String): SparklineGroup = js.native
  def Clear(): Unit = js.native
  def ClearGroups(): Unit = js.native
  def Group(Location: Range): Unit = js.native
  def Item(Index: Double): SparklineGroup = js.native
  def Ungroup(): Unit = js.native
  def _Default(Index: js.Any): SparklineGroup = js.native
}

