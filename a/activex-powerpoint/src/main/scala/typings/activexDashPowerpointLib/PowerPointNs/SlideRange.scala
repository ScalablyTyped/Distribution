package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SlideRange")
@js.native
class SlideRange protected () extends js.Object {
  val Application: Application = js.native
  val Background: ShapeRange = js.native
  var BackgroundStyle: activexDashOfficeLib.OfficeNs.MsoBackgroundStyleIndex = js.native
  var ColorScheme: ColorScheme = js.native
  val Comments: Comments = js.native
  val Count: scala.Double = js.native
  var CustomLayout: CustomLayout = js.native
  val CustomerData: CustomerData = js.native
  var Design: Design = js.native
  var DisplayMasterShapes: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var FollowMasterBackground: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasNotesPage: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HeadersFooters: HeadersFooters = js.native
  val Hyperlinks: Hyperlinks = js.native
  var Layout: PpSlideLayout = js.native
  val Master: Master = js.native
  var Name: java.lang.String = js.native
  val NotesPage: SlideRange = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.SlideRange_typekey`: SlideRange = js.native
  val PrintSteps: scala.Double = js.native
  @JSName("Scripts")
  val Scripts_Original: activexDashOfficeLib.OfficeNs.Scripts = js.native
  val SectionNumber: scala.Double = js.native
  val Shapes: Shapes = js.native
  val SlideID: scala.Double = js.native
  val SlideIndex: scala.Double = js.native
  val SlideNumber: scala.Double = js.native
  val SlideShowTransition: SlideShowTransition = js.native
  val Tags: Tags = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: activexDashOfficeLib.OfficeNs.ThemeColorScheme = js.native
  val TimeLine: TimeLine = js.native
  val sectionIndex: scala.Double = js.native
  def ApplyTemplate(FileName: java.lang.String): scala.Unit = js.native
  def ApplyTheme(themeName: java.lang.String): scala.Unit = js.native
  def ApplyThemeColorScheme(themeColorSchemeName: java.lang.String): scala.Unit = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Duplicate(): SlideRange = js.native
  /**
    * @param number [ScaleWidth=0]
    * @param number [ScaleHeight=0]
    */
  def Export(FileName: java.lang.String, FilterName: java.lang.String): scala.Unit = js.native
  def Export(FileName: java.lang.String, FilterName: java.lang.String, ScaleWidth: scala.Double): scala.Unit = js.native
  def Export(
    FileName: java.lang.String,
    FilterName: java.lang.String,
    ScaleWidth: scala.Double,
    ScaleHeight: scala.Double
  ): scala.Unit = js.native
  def Item(Index: js.Any): Slide = js.native
  def MoveTo(toPos: scala.Double): scala.Unit = js.native
  def MoveToSectionStart(toSection: scala.Double): scala.Unit = js.native
  /**
    * @param boolean [Overwrite=false]
    * @param boolean [UseSlideOrder=false]
    */
  def PublishSlides(SlideLibraryUrl: java.lang.String): scala.Unit = js.native
  def PublishSlides(SlideLibraryUrl: java.lang.String, Overwrite: scala.Boolean): scala.Unit = js.native
  def PublishSlides(SlideLibraryUrl: java.lang.String, Overwrite: scala.Boolean, UseSlideOrder: scala.Boolean): scala.Unit = js.native
  def Scripts(Index: js.Any): activexDashOfficeLib.OfficeNs.Script = js.native
  def Select(): scala.Unit = js.native
  def ThemeColorScheme(Index: activexDashOfficeLib.OfficeNs.MsoThemeColorSchemeIndex): activexDashOfficeLib.OfficeNs.ThemeColor = js.native
}

