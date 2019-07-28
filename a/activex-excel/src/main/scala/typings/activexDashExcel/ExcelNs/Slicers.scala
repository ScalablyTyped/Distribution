package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slicers extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): Slicer = js.native
  def apply(Index: Double): Slicer = js.native
  def Add(
    SlicerDestination: String,
    Level: js.UndefOr[js.Any],
    Name: js.UndefOr[String],
    Caption: js.UndefOr[String],
    Top: js.UndefOr[Double],
    Left: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): Slicer = js.native
  def Add(
    SlicerDestination: Worksheet,
    Level: js.UndefOr[js.Any],
    Name: js.UndefOr[String],
    Caption: js.UndefOr[String],
    Top: js.UndefOr[Double],
    Left: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): Slicer = js.native
  def Item(Index: String): Slicer = js.native
  def Item(Index: Double): Slicer = js.native
  def _Default(Index: js.Any): Slicer = js.native
}

