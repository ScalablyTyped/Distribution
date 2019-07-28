package typings.activexDashPowerpoint.PowerPointNs

import typings.activexDashOffice.OfficeNs.MsoBackgroundStyleIndex
import typings.activexDashOffice.OfficeNs.MsoThemeColorSchemeIndex
import typings.activexDashOffice.OfficeNs.MsoTriState
import typings.activexDashOffice.OfficeNs.Script
import typings.activexDashOffice.OfficeNs.Scripts
import typings.activexDashOffice.OfficeNs.ThemeColor
import typings.activexDashOffice.OfficeNs.ThemeColorScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SlideRange")
@js.native
class SlideRange protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  val Background: ShapeRange = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var ColorScheme: typings.activexDashPowerpoint.PowerPointNs.ColorScheme = js.native
  val Comments: typings.activexDashPowerpoint.PowerPointNs.Comments = js.native
  val Count: Double = js.native
  var CustomLayout: typings.activexDashPowerpoint.PowerPointNs.CustomLayout = js.native
  val CustomerData: typings.activexDashPowerpoint.PowerPointNs.CustomerData = js.native
  var Design: typings.activexDashPowerpoint.PowerPointNs.Design = js.native
  var DisplayMasterShapes: MsoTriState = js.native
  var FollowMasterBackground: MsoTriState = js.native
  val HasNotesPage: MsoTriState = js.native
  val HeadersFooters: typings.activexDashPowerpoint.PowerPointNs.HeadersFooters = js.native
  val Hyperlinks: typings.activexDashPowerpoint.PowerPointNs.Hyperlinks = js.native
  var Layout: PpSlideLayout = js.native
  val Master: typings.activexDashPowerpoint.PowerPointNs.Master = js.native
  var Name: String = js.native
  val NotesPage: SlideRange = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.SlideRange_typekey`: SlideRange = js.native
  val PrintSteps: Double = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  val SectionNumber: Double = js.native
  val Shapes: typings.activexDashPowerpoint.PowerPointNs.Shapes = js.native
  val SlideID: Double = js.native
  val SlideIndex: Double = js.native
  val SlideNumber: Double = js.native
  val SlideShowTransition: typings.activexDashPowerpoint.PowerPointNs.SlideShowTransition = js.native
  val Tags: typings.activexDashPowerpoint.PowerPointNs.Tags = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme = js.native
  val TimeLine: typings.activexDashPowerpoint.PowerPointNs.TimeLine = js.native
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

