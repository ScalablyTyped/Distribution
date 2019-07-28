package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.Settings
import typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs.XForbiddenCharacters
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes properties that apply to the whole spreadsheet document.
  *
  * For settings that affect view properties, these settings apply to subsequently created views and are saved with the document, while {@link
  * SpreadsheetViewSettings} can be used to alter a specific view that is already open.
  */
trait DocumentSettings extends Settings {
  /** specifies the color in which the cell grid is displayed. */
  var GridColor: Color
  /** enables the column and row headers of the view. */
  var HasColumnRowHeaders: Boolean
  /** enables the sheet tabs of the view. */
  var HasSheetTabs: Boolean
  /** enables the display of outline symbols. */
  var IsOutlineSymbolsSet: Boolean
  /** enables the synchronization of horizontal and vertical grid settings in the user interface. */
  var IsRasterAxisSynchronized: Boolean
  /** enables the restriction of object movement and resizing of drawing objects to the raster. */
  var IsSnapToRaster: Boolean
  /** enables the display of the drawing object raster. */
  var RasterIsVisible: Boolean
  /** specifies the distance between horizontal grid elements in 1/100 mm. */
  var RasterResolutionX: Double
  /** specifies the distance between vertical grid elements in 1/100 mm. */
  var RasterResolutionY: Double
  /** specifies the number of subdivisions between two horizontal grid elements. */
  var RasterSubdivisionX: Double
  /** specifies the number of subdivisions between two vertical grid elements. */
  var RasterSubdivisionY: Double
  /** enables the display of the cell grid. */
  var ShowGrid: Boolean
  /** controls whether a marker is shown for notes in cells. */
  var ShowNotes: Boolean
  /** enables display of page breaks. */
  var ShowPageBreaks: Boolean
  /** enables display of zero-values. */
  var ShowZeroValues: Boolean
}

object DocumentSettings {
  @scala.inline
  def apply(
    AddExternalLeading: Boolean,
    ApplyUserData: Boolean,
    AutoCalculate: Boolean,
    BitmapTableURL: String,
    CharacterCompressionType: Double,
    ColorTableURL: String,
    CurrentDatabaseCommand: String,
    CurrentDatabaseCommandType: Double,
    CurrentDatabaseDataSource: String,
    DashTableURL: String,
    DefaultTabStop: Double,
    EmbedFonts: Boolean,
    EmbedSystemFonts: Boolean,
    FieldAutoUpdate: Boolean,
    ForbiddenCharacters: XForbiddenCharacters,
    GradientTableURL: String,
    GridColor: Color,
    HasColumnRowHeaders: Boolean,
    HasSheetTabs: Boolean,
    HatchTableURL: String,
    IsKernAsianPunctuation: Boolean,
    IsOutlineSymbolsSet: Boolean,
    IsPrintBooklet: Boolean,
    IsPrintBookletBack: Boolean,
    IsPrintBookletFront: Boolean,
    IsRasterAxisSynchronized: Boolean,
    IsSnapToRaster: Boolean,
    LineEndTableURL: String,
    LinkUpdateMode: Double,
    PrintQuality: Double,
    PrinterIndependentLayout: Double,
    PrinterName: String,
    PrinterSetup: SafeArray[Double],
    PropertySetInfo: XPropertySetInfo,
    RasterIsVisible: Boolean,
    RasterResolutionX: Double,
    RasterResolutionY: Double,
    RasterSubdivisionX: Double,
    RasterSubdivisionY: Double,
    SaveVersionOnClose: Boolean,
    ShowGrid: Boolean,
    ShowNotes: Boolean,
    ShowPageBreaks: Boolean,
    ShowZeroValues: Boolean,
    UpdateFromTemplate: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DocumentSettings = {
    val __obj = js.Dynamic.literal(AddExternalLeading = AddExternalLeading, ApplyUserData = ApplyUserData, AutoCalculate = AutoCalculate, BitmapTableURL = BitmapTableURL, CharacterCompressionType = CharacterCompressionType, ColorTableURL = ColorTableURL, CurrentDatabaseCommand = CurrentDatabaseCommand, CurrentDatabaseCommandType = CurrentDatabaseCommandType, CurrentDatabaseDataSource = CurrentDatabaseDataSource, DashTableURL = DashTableURL, DefaultTabStop = DefaultTabStop, EmbedFonts = EmbedFonts, EmbedSystemFonts = EmbedSystemFonts, FieldAutoUpdate = FieldAutoUpdate, ForbiddenCharacters = ForbiddenCharacters, GradientTableURL = GradientTableURL, GridColor = GridColor, HasColumnRowHeaders = HasColumnRowHeaders, HasSheetTabs = HasSheetTabs, HatchTableURL = HatchTableURL, IsKernAsianPunctuation = IsKernAsianPunctuation, IsOutlineSymbolsSet = IsOutlineSymbolsSet, IsPrintBooklet = IsPrintBooklet, IsPrintBookletBack = IsPrintBookletBack, IsPrintBookletFront = IsPrintBookletFront, IsRasterAxisSynchronized = IsRasterAxisSynchronized, IsSnapToRaster = IsSnapToRaster, LineEndTableURL = LineEndTableURL, LinkUpdateMode = LinkUpdateMode, PrintQuality = PrintQuality, PrinterIndependentLayout = PrinterIndependentLayout, PrinterName = PrinterName, PrinterSetup = PrinterSetup, PropertySetInfo = PropertySetInfo, RasterIsVisible = RasterIsVisible, RasterResolutionX = RasterResolutionX, RasterResolutionY = RasterResolutionY, RasterSubdivisionX = RasterSubdivisionX, RasterSubdivisionY = RasterSubdivisionY, SaveVersionOnClose = SaveVersionOnClose, ShowGrid = ShowGrid, ShowNotes = ShowNotes, ShowPageBreaks = ShowPageBreaks, ShowZeroValues = ShowZeroValues, UpdateFromTemplate = UpdateFromTemplate, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DocumentSettings]
  }
}

