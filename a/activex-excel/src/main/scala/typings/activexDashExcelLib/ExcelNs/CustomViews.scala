package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomViews extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(ViewName: java.lang.String): CustomView = js.native
  def apply(ViewName: scala.Double): CustomView = js.native
  def Add(ViewName: java.lang.String): CustomView = js.native
  def Add(ViewName: java.lang.String, PrintSettings: scala.Boolean): CustomView = js.native
  def Add(ViewName: java.lang.String, PrintSettings: scala.Boolean, RowColSettings: scala.Boolean): CustomView = js.native
  def Item(ViewName: java.lang.String): CustomView = js.native
  def Item(ViewName: scala.Double): CustomView = js.native
  def _Default(ViewName: js.Any): CustomView = js.native
}

