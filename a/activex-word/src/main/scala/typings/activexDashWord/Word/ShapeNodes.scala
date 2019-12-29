package typings.activexDashWord.Word

import typings.activexDashOffice.Office.MsoEditingType
import typings.activexDashOffice.Office.MsoSegmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ShapeNodes")
@js.native
class ShapeNodes protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.ShapeNodes_typekey")
  var WordDotShapeNodes_typekey: ShapeNodes = js.native
  def Delete(Index: Double): Unit = js.native
  /**
    * @param number [X2=0]
    * @param number [Y2=0]
    * @param number [X3=0]
    * @param number [Y3=0]
    */
  def Insert(Index: Double, SegmentType: MsoSegmentType, EditingType: MsoEditingType, X1: Double, Y1: Double): Unit = js.native
  def Insert(
    Index: Double,
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double
  ): Unit = js.native
  def Insert(
    Index: Double,
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double
  ): Unit = js.native
  def Insert(
    Index: Double,
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: Double
  ): Unit = js.native
  def Insert(
    Index: Double,
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: Double,
    Y3: Double
  ): Unit = js.native
  def Item(Index: js.Any): ShapeNode = js.native
  def SetEditingType(Index: Double, EditingType: MsoEditingType): Unit = js.native
  def SetPosition(Index: Double, X1: Double, Y1: Double): Unit = js.native
  def SetSegmentType(Index: Double, SegmentType: MsoSegmentType): Unit = js.native
}

