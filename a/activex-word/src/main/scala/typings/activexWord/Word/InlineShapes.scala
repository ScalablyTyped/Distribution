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
  def AddChart(Type: Unit, Range: Any): InlineShape = js.native
  def AddChart(Type: XlChartType): InlineShape = js.native
  def AddChart(Type: XlChartType, Range: Any): InlineShape = js.native
  
  def AddHorizontalLine(FileName: String): InlineShape = js.native
  def AddHorizontalLine(FileName: String, Range: Any): InlineShape = js.native
  
  def AddHorizontalLineStandard(): InlineShape = js.native
  def AddHorizontalLineStandard(Range: Any): InlineShape = js.native
  
  def AddOLEControl(): InlineShape = js.native
  def AddOLEControl(ClassType: Any): InlineShape = js.native
  def AddOLEControl(ClassType: Any, Range: Any): InlineShape = js.native
  def AddOLEControl(ClassType: Unit, Range: Any): InlineShape = js.native
  
  def AddOLEObject(
    ClassType: js.UndefOr[Any],
    FileName: js.UndefOr[Any],
    LinkToFile: js.UndefOr[Any],
    DisplayAsIcon: js.UndefOr[Any],
    IconFileName: js.UndefOr[Any],
    IconIndex: js.UndefOr[Any],
    IconLabel: js.UndefOr[Any],
    Range: js.UndefOr[Any]
  ): InlineShape = js.native
  
  def AddPicture(FileName: String): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: Any): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: Any, SaveWithDocument: Any): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: Any, SaveWithDocument: Any, Range: Any): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: Any, SaveWithDocument: Unit, Range: Any): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: Unit, SaveWithDocument: Any): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: Unit, SaveWithDocument: Any, Range: Any): InlineShape = js.native
  def AddPicture(FileName: String, LinkToFile: Unit, SaveWithDocument: Unit, Range: Any): InlineShape = js.native
  
  def AddPictureBullet(FileName: String): InlineShape = js.native
  def AddPictureBullet(FileName: String, Range: Any): InlineShape = js.native
  
  def AddSmartArt(Layout: SmartArtLayout): InlineShape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Range: Any): InlineShape = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): InlineShape = js.native
  
  def New(Range: Range): InlineShape = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.InlineShapes_typekey")
  var WordDotInlineShapes_typekey: InlineShapes = js.native
}
