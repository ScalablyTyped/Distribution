package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.InlineShapes")
@js.native
class InlineShapes protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.InlineShapes_typekey`: InlineShapes = js.native
  /** @param Office.XlChartType [Type=-1] */
  def AddChart(): InlineShape = js.native
  /** @param Office.XlChartType [Type=-1] */
  def AddChart(Type: activexDashOfficeLib.OfficeNs.XlChartType): InlineShape = js.native
  /** @param Office.XlChartType [Type=-1] */
  def AddChart(Type: activexDashOfficeLib.OfficeNs.XlChartType, Range: js.Any): InlineShape = js.native
  def AddHorizontalLine(FileName: java.lang.String): InlineShape = js.native
  def AddHorizontalLine(FileName: java.lang.String, Range: js.Any): InlineShape = js.native
  def AddHorizontalLineStandard(): InlineShape = js.native
  def AddHorizontalLineStandard(Range: js.Any): InlineShape = js.native
  def AddOLEControl(): InlineShape = js.native
  def AddOLEControl(ClassType: js.Any): InlineShape = js.native
  def AddOLEControl(ClassType: js.Any, Range: js.Any): InlineShape = js.native
  def AddOLEObject(
    ClassType: js.UndefOr[js.Any],
    FileName: js.UndefOr[js.Any],
    LinkToFile: js.UndefOr[js.Any],
    DisplayAsIcon: js.UndefOr[js.Any],
    IconFileName: js.UndefOr[js.Any],
    IconIndex: js.UndefOr[js.Any],
    IconLabel: js.UndefOr[js.Any],
    Range: js.UndefOr[js.Any]
  ): InlineShape = js.native
  def AddPicture(FileName: java.lang.String): InlineShape = js.native
  def AddPicture(FileName: java.lang.String, LinkToFile: js.Any): InlineShape = js.native
  def AddPicture(FileName: java.lang.String, LinkToFile: js.Any, SaveWithDocument: js.Any): InlineShape = js.native
  def AddPicture(FileName: java.lang.String, LinkToFile: js.Any, SaveWithDocument: js.Any, Range: js.Any): InlineShape = js.native
  def AddPictureBullet(FileName: java.lang.String): InlineShape = js.native
  def AddPictureBullet(FileName: java.lang.String, Range: js.Any): InlineShape = js.native
  def AddSmartArt(Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout): InlineShape = js.native
  def AddSmartArt(Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout, Range: js.Any): InlineShape = js.native
  def Item(Index: scala.Double): InlineShape = js.native
  def New(Range: Range): InlineShape = js.native
}

