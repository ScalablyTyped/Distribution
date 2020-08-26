package typings.activexWord.Word

import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoSegmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeformBuilder extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.FreeformBuilder_typekey")
  var WordDotFreeformBuilder_typekey: FreeformBuilder = js.native
  /**
    * @param number [X2=0]
    * @param number [Y2=0]
    * @param number [X3=0]
    * @param number [Y3=0]
    */
  def AddNodes(SegmentType: MsoSegmentType, EditingType: MsoEditingType, X1: Double, Y1: Double): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: js.UndefOr[scala.Nothing],
    Y2: js.UndefOr[scala.Nothing],
    X3: js.UndefOr[scala.Nothing],
    Y3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: js.UndefOr[scala.Nothing],
    Y2: js.UndefOr[scala.Nothing],
    X3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: js.UndefOr[scala.Nothing],
    Y2: js.UndefOr[scala.Nothing],
    X3: Double,
    Y3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: js.UndefOr[scala.Nothing],
    Y2: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: js.UndefOr[scala.Nothing],
    Y2: Double,
    X3: js.UndefOr[scala.Nothing],
    Y3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: js.UndefOr[scala.Nothing],
    Y2: Double,
    X3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: js.UndefOr[scala.Nothing],
    Y2: Double,
    X3: Double,
    Y3: Double
  ): Unit = js.native
  def AddNodes(SegmentType: MsoSegmentType, EditingType: MsoEditingType, X1: Double, Y1: Double, X2: Double): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: js.UndefOr[scala.Nothing],
    X3: js.UndefOr[scala.Nothing],
    Y3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: js.UndefOr[scala.Nothing],
    X3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: js.UndefOr[scala.Nothing],
    X3: Double,
    Y3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: js.UndefOr[scala.Nothing],
    Y3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: Double,
    Y3: Double
  ): Unit = js.native
  def ConvertToShape(): Shape = js.native
  def ConvertToShape(Anchor: js.Any): Shape = js.native
}

