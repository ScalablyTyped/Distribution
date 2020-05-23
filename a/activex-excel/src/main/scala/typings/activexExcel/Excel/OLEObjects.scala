package typings.activexExcel.Excel

import typings.activexExcel.activexExcelBooleans.`false`
import typings.activexExcel.activexExcelBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OLEObjects extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var AutoLoad: Boolean = js.native
  val Border: typings.activexExcel.Excel.Border = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  var Enabled: Boolean = js.native
  @JSName("Excel.OLEObjects_typekey")
  var ExcelDotOLEObjects_typekey: OLEObjects = js.native
  var Height: Double = js.native
  val Interior: typings.activexExcel.Excel.Interior = js.native
  var Left: Double = js.native
  var Locked: Boolean = js.native
  var OnAction: String = js.native
  val Parent: js.Any = js.native
  var Placement: js.Any = js.native
  var PrintObject: Boolean = js.native
  var Shadow: Boolean = js.native
  @JSName("ShapeRange")
  val ShapeRange_Original: ShapeRange = js.native
  var SourceName: String = js.native
  var Top: Double = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  val ZOrder: Double = js.native
  @JSName("Add")
  def Add_false(
    ClassType: js.UndefOr[scala.Nothing],
    Filename: String,
    Link: js.UndefOr[Boolean],
    DisplayAsIcon: js.UndefOr[`false`],
    IconFileName: js.UndefOr[scala.Nothing],
    IconIndex: js.UndefOr[scala.Nothing],
    IconLabel: js.UndefOr[scala.Nothing],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): OLEObject = js.native
  @JSName("Add")
  def Add_false(
    ClassType: String,
    Filename: js.UndefOr[scala.Nothing],
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: js.UndefOr[`false`],
    IconFileName: js.UndefOr[scala.Nothing],
    IconIndex: js.UndefOr[scala.Nothing],
    IconLabel: js.UndefOr[scala.Nothing],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): OLEObject = js.native
  @JSName("Add")
  def Add_true(
    ClassType: js.UndefOr[scala.Nothing],
    Filename: String,
    Link: Boolean,
    DisplayAsIcon: `true`,
    IconFileName: js.UndefOr[String],
    IconIndex: js.UndefOr[Double],
    IconLabel: js.UndefOr[String],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): OLEObject = js.native
  @JSName("Add")
  def Add_true(
    ClassType: String,
    Filename: js.UndefOr[scala.Nothing],
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: `true`,
    IconFileName: js.UndefOr[String],
    IconIndex: js.UndefOr[Double],
    IconLabel: js.UndefOr[String],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): OLEObject = js.native
  def BringToFront(): js.Any = js.native
  def Copy(): js.Any = js.native
  /**
    * @param Appearance [Appearance=2]
    * @param Format [Format=-4147]
    */
  def CopyPicture(): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): js.Any = js.native
  def Cut(): js.Any = js.native
  def Delete(): js.Any = js.native
  def Duplicate(): js.Any = js.native
  def Group(): GroupObject = js.native
  def Item(Index: String): js.Any = js.native
  def Item(Index: Double): js.Any = js.native
  def Select(): js.Any = js.native
  def Select(Replace: Boolean): js.Any = js.native
  def SendToBack(): js.Any = js.native
  def ShapeRange(Index: String): Shape = js.native
  def ShapeRange(Index: Double): Shape = js.native
}

