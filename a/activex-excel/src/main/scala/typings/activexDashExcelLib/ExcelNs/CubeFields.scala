package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CubeFields extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): CubeField = js.native
  def apply(Index: scala.Double): CubeField = js.native
  def AddSet(Name: java.lang.String, Caption: java.lang.String): CubeField = js.native
  def Item(Index: java.lang.String): CubeField = js.native
  def Item(Index: scala.Double): CubeField = js.native
  def _Default(Index: js.Any): CubeField = js.native
}

