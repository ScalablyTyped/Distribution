package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.OLEObjects")
@js.native
class OLEObjects protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  var AutoLoad: scala.Boolean = js.native
  val Border: activexDashExcelLib.ExcelNs.Border = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  var Enabled: scala.Boolean = js.native
  var `Excel.OLEObjects_typekey`: OLEObjects = js.native
  var Height: scala.Double = js.native
  val Interior: activexDashExcelLib.ExcelNs.Interior = js.native
  var Left: scala.Double = js.native
  var Locked: scala.Boolean = js.native
  var OnAction: java.lang.String = js.native
  val Parent: js.Any = js.native
  var Placement: js.Any = js.native
  var PrintObject: scala.Boolean = js.native
  var Shadow: scala.Boolean = js.native
  @JSName("ShapeRange")
  val ShapeRange_Original: ShapeRange = js.native
  var SourceName: java.lang.String = js.native
  var Top: scala.Double = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  val ZOrder: scala.Double = js.native
  def Add(
    ClassType: java.lang.String,
    Filename: js.UndefOr[scala.Nothing],
    Link: js.UndefOr[scala.Nothing],
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: js.UndefOr[java.lang.String],
    IconIndex: js.UndefOr[scala.Double],
    IconLabel: js.UndefOr[java.lang.String],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double]
  ): OLEObject = js.native
  def Add(
    ClassType: java.lang.String,
    Filename: js.UndefOr[js.UndefOr[scala.Nothing]],
    Link: js.UndefOr[js.UndefOr[scala.Nothing]],
    DisplayAsIcon: js.UndefOr[activexDashExcelLib.activexDashExcelLibNumbers.`false`],
    IconFileName: js.UndefOr[js.UndefOr[scala.Nothing]],
    IconIndex: js.UndefOr[js.UndefOr[scala.Nothing]],
    IconLabel: js.UndefOr[js.UndefOr[scala.Nothing]],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double]
  ): OLEObject = js.native
  def Add(
    ClassType: js.UndefOr[scala.Nothing],
    Filename: java.lang.String,
    Link: js.UndefOr[scala.Boolean],
    DisplayAsIcon: js.UndefOr[activexDashExcelLib.activexDashExcelLibNumbers.`false`],
    IconFileName: js.UndefOr[js.UndefOr[scala.Nothing]],
    IconIndex: js.UndefOr[js.UndefOr[scala.Nothing]],
    IconLabel: js.UndefOr[js.UndefOr[scala.Nothing]],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double]
  ): OLEObject = js.native
  def Add(
    ClassType: js.UndefOr[scala.Nothing],
    Filename: java.lang.String,
    Link: scala.Boolean,
    DisplayAsIcon: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    IconFileName: js.UndefOr[java.lang.String],
    IconIndex: js.UndefOr[scala.Double],
    IconLabel: js.UndefOr[java.lang.String],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double]
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
  def Item(Index: java.lang.String): js.Any = js.native
  def Item(Index: scala.Double): js.Any = js.native
  def Select(): js.Any = js.native
  def Select(Replace: scala.Boolean): js.Any = js.native
  def SendToBack(): js.Any = js.native
  def ShapeRange(Index: java.lang.String): Shape = js.native
  def ShapeRange(Index: scala.Double): Shape = js.native
}

