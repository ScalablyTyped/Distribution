package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupShapes extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): Shape = js.native
  def apply(Index: scala.Double): Shape = js.native
  def Item(Index: java.lang.String): Shape = js.native
  def Item(Index: scala.Double): Shape = js.native
  def Range(Index: activexDashInteropLib.SafeArray[scala.Double | java.lang.String]): ShapeRange = js.native
  def Range(Index: java.lang.String): ShapeRange = js.native
  def Range(Index: scala.Double): ShapeRange = js.native
  def _Default(Index: js.Any): Shape = js.native
}

