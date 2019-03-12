package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slicers extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): Slicer = js.native
  def apply(Index: scala.Double): Slicer = js.native
  def Add(
    SlicerDestination: Worksheet,
    Level: js.UndefOr[js.Any],
    Name: js.UndefOr[java.lang.String],
    Caption: js.UndefOr[java.lang.String],
    Top: js.UndefOr[scala.Double],
    Left: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double]
  ): Slicer = js.native
  def Add(
    SlicerDestination: java.lang.String,
    Level: js.UndefOr[js.Any],
    Name: js.UndefOr[java.lang.String],
    Caption: js.UndefOr[java.lang.String],
    Top: js.UndefOr[scala.Double],
    Left: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double]
  ): Slicer = js.native
  def Item(Index: java.lang.String): Slicer = js.native
  def Item(Index: scala.Double): Slicer = js.native
  def _Default(Index: js.Any): Slicer = js.native
}

