package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineGroups extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): SparklineGroup = js.native
  def Add(Type: XlSparkType, SourceData: java.lang.String): SparklineGroup = js.native
  def Clear(): scala.Unit = js.native
  def ClearGroups(): scala.Unit = js.native
  def Group(Location: Range): scala.Unit = js.native
  def Item(Index: scala.Double): SparklineGroup = js.native
  def Ungroup(): scala.Unit = js.native
  def _Default(Index: js.Any): SparklineGroup = js.native
}

