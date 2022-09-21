package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slicers extends StObject {
  
  def apply(Index: String): Slicer = js.native
  def apply(Index: Double): Slicer = js.native
  
  def Add(
    SlicerDestination: String | Worksheet,
    Level: js.UndefOr[Any],
    Name: js.UndefOr[String],
    Caption: js.UndefOr[String],
    Top: js.UndefOr[Double],
    Left: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): Slicer = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): Slicer = js.native
  def Item(Index: Double): Slicer = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): Slicer = js.native
}
