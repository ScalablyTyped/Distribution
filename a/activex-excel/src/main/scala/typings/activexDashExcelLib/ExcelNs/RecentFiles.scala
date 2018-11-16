package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecentFiles extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  var Maximum: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): RecentFile = js.native
  def Add(Name: java.lang.String): RecentFile = js.native
  def Item(Index: scala.Double): RecentFile = js.native
  def _Default(Index: scala.Double): RecentFile = js.native
}

