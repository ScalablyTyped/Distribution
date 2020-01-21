package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoBackgroundStyleIndex
import typings.activexOffice.Office.MsoThemeColorSchemeIndex
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.Script
import typings.activexOffice.Office.Scripts
import typings.activexOffice.Office.ThemeColor
import typings.activexOffice.Office.ThemeColorScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SlideRange")
@js.native
class SlideRange protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Background: ShapeRange = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var ColorScheme: typings.activexPowerpoint.PowerPoint.ColorScheme = js.native
  val Comments: typings.activexPowerpoint.PowerPoint.Comments = js.native
  val Count: Double = js.native
  var CustomLayout: typings.activexPowerpoint.PowerPoint.CustomLayout = js.native
  val CustomerData: typings.activexPowerpoint.PowerPoint.CustomerData = js.native
  var Design: typings.activexPowerpoint.PowerPoint.Design = js.native
  var DisplayMasterShapes: MsoTriState = js.native
  var FollowMasterBackground: MsoTriState = js.native
  val HasNotesPage: MsoTriState = js.native
  val HeadersFooters: typings.activexPowerpoint.PowerPoint.HeadersFooters = js.native
  val Hyperlinks: typings.activexPowerpoint.PowerPoint.Hyperlinks = js.native
  var Layout: PpSlideLayout = js.native
  val Master: typings.activexPowerpoint.PowerPoint.Master = js.native
  var Name: String = js.native
  val NotesPage: SlideRange = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.SlideRange_typekey")
  var PowerPointDotSlideRange_typekey: SlideRange = js.native
  val PrintSteps: Double = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  val SectionNumber: Double = js.native
  val Shapes: typings.activexPowerpoint.PowerPoint.Shapes = js.native
  val SlideID: Double = js.native
  val SlideIndex: Double = js.native
  val SlideNumber: Double = js.native
  val SlideShowTransition: typings.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  val Tags: typings.activexPowerpoint.PowerPoint.Tags = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme = js.native
  val TimeLine: typings.activexPowerpoint.PowerPoint.TimeLine = js.native
  val sectionIndex: Double = js.native
  def ApplyTemplate(FileName: String): Unit = js.native
  def ApplyTheme(themeName: String): Unit = js.native
  def ApplyThemeColorScheme(themeColorSchemeName: String): Unit = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Duplicate(): SlideRange = js.native
  /**
    * @param number [ScaleWidth=0]
    * @param number [ScaleHeight=0]
    */
  def Export(FileName: String, FilterName: String): Unit = js.native
  def Export(FileName: String, FilterName: String, ScaleWidth: Double): Unit = js.native
  def Export(FileName: String, FilterName: String, ScaleWidth: Double, ScaleHeight: Double): Unit = js.native
  def Item(Index: js.Any): Slide = js.native
  def MoveTo(toPos: Double): Unit = js.native
  def MoveToSectionStart(toSection: Double): Unit = js.native
  /**
    * @param boolean [Overwrite=false]
    * @param boolean [UseSlideOrder=false]
    */
  def PublishSlides(SlideLibraryUrl: String): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: Boolean): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: Boolean, UseSlideOrder: Boolean): Unit = js.native
  def Scripts(Index: js.Any): Script = js.native
  def Select(): Unit = js.native
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
}

