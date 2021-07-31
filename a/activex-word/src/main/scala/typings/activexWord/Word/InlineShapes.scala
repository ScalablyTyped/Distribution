package typings.activexWord.Word

import typings.activexOffice.Office.SmartArtLayout
import typings.activexOffice.Office.XlChartType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineShapes extends StObject {
  
  /** @param Office.XlChartType [Type=-1] */
  def AddChart(): InlineShape = js.native
  def AddChart(Type: Unit, Range: js.Any): InlineShape = js.native
  def AddChart(Type: XlChartType): InlineShape = js.native
  def AddChart(Type: XlChartType, Range: js.Any): InlineShape = js.native
  
  def AddHorizontalLine(FileName: String): InlineShape = js.native
  def AddHorizontalLine(FileName: String, Range: js.Any): InlineShape = js.native
  
  def AddHorizontalLineStandard(): InlineShape = js.native
  def AddHorizontalLineStandard(Range: js.Any): InlineShape = js.native
  
  def AddOLEControl(): InlineShape = js.native
  def AddOLEControl(ClassType: js.Any): InlineShape = js.native
  def AddOLEControl(ClassType: js.Any, Range: js.Any): InlineShape = js.native
  def AddOLEControl(ClassType: Unit, Range: js.Any): InlineShape = js.native
  
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
  
  def AddPicture(FileName: String): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: js.Any): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: js.Any, SaveWithDocument: js.Any): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: js.Any, SaveWithDocument: js.Any, Range: js.Any): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: js.Any, SaveWithDocument: Unit, Range: js.Any): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: Unit, SaveWithDocument: js.Any): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: Unit, SaveWithDocument: js.Any, Range: js.Any): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: Unit, SaveWithDocument: Unit, Range: js.Any): InlineShape = js.native
  
  def AddPictureBullet(FileName: String): InlineShape = js.native
  def AddPictureBullet(FileName: String, Range: js.Any): InlineShape = js.native
  
  def AddSmartArt(Layout: SmartArtLayout): InlineShape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Range: js.Any): InlineShape = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): InlineShape = js.native
  
  def New(Range: Range): InlineShape = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.InlineShapes_typekey")
  var WordDotInlineShapes_typekey: InlineShapes = js.native
}
