package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes properties that apply to the whole spreadsheet document.
  *
  * For settings that affect view properties, these settings apply to subsequently created views and are saved with the document, while {@link
  * SpreadsheetViewSettings} can be used to alter a specific view that is already open.
  */
trait DocumentSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.Settings {
  /** specifies the color in which the cell grid is displayed. */
  var GridColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** enables the column and row headers of the view. */
  var HasColumnRowHeaders: scala.Boolean
  /** enables the sheet tabs of the view. */
  var HasSheetTabs: scala.Boolean
  /** enables the display of outline symbols. */
  var IsOutlineSymbolsSet: scala.Boolean
  /** enables the synchronization of horizontal and vertical grid settings in the user interface. */
  var IsRasterAxisSynchronized: scala.Boolean
  /** enables the restriction of object movement and resizing of drawing objects to the raster. */
  var IsSnapToRaster: scala.Boolean
  /** enables the display of the drawing object raster. */
  var RasterIsVisible: scala.Boolean
  /** specifies the distance between horizontal grid elements in 1/100 mm. */
  var RasterResolutionX: scala.Double
  /** specifies the distance between vertical grid elements in 1/100 mm. */
  var RasterResolutionY: scala.Double
  /** specifies the number of subdivisions between two horizontal grid elements. */
  var RasterSubdivisionX: scala.Double
  /** specifies the number of subdivisions between two vertical grid elements. */
  var RasterSubdivisionY: scala.Double
  /** enables the display of the cell grid. */
  var ShowGrid: scala.Boolean
  /** controls whether a marker is shown for notes in cells. */
  var ShowNotes: scala.Boolean
  /** enables display of page breaks. */
  var ShowPageBreaks: scala.Boolean
  /** enables display of zero-values. */
  var ShowZeroValues: scala.Boolean
}

object DocumentSettings {
  @scala.inline
  def apply(
    AddExternalLeading: scala.Boolean,
    ApplyUserData: scala.Boolean,
    AutoCalculate: scala.Boolean,
    BitmapTableURL: java.lang.String,
    CharacterCompressionType: scala.Double,
    ColorTableURL: java.lang.String,
    CurrentDatabaseCommand: java.lang.String,
    CurrentDatabaseCommandType: scala.Double,
    CurrentDatabaseDataSource: java.lang.String,
    DashTableURL: java.lang.String,
    DefaultTabStop: scala.Double,
    EmbedFonts: scala.Boolean,
    EmbedSystemFonts: scala.Boolean,
    FieldAutoUpdate: scala.Boolean,
    ForbiddenCharacters: activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.XForbiddenCharacters,
    GradientTableURL: java.lang.String,
    GridColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    HasColumnRowHeaders: scala.Boolean,
    HasSheetTabs: scala.Boolean,
    HatchTableURL: java.lang.String,
    IsKernAsianPunctuation: scala.Boolean,
    IsOutlineSymbolsSet: scala.Boolean,
    IsPrintBooklet: scala.Boolean,
    IsPrintBookletBack: scala.Boolean,
    IsPrintBookletFront: scala.Boolean,
    IsRasterAxisSynchronized: scala.Boolean,
    IsSnapToRaster: scala.Boolean,
    LineEndTableURL: java.lang.String,
    LinkUpdateMode: scala.Double,
    PrintQuality: scala.Double,
    PrinterIndependentLayout: scala.Double,
    PrinterName: java.lang.String,
    PrinterSetup: activexDashInteropLib.SafeArray[scala.Double],
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RasterIsVisible: scala.Boolean,
    RasterResolutionX: scala.Double,
    RasterResolutionY: scala.Double,
    RasterSubdivisionX: scala.Double,
    RasterSubdivisionY: scala.Double,
    SaveVersionOnClose: scala.Boolean,
    ShowGrid: scala.Boolean,
    ShowNotes: scala.Boolean,
    ShowPageBreaks: scala.Boolean,
    ShowZeroValues: scala.Boolean,
    UpdateFromTemplate: scala.Boolean,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): DocumentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddExternalLeading")(AddExternalLeading)
    __obj.updateDynamic("ApplyUserData")(ApplyUserData)
    __obj.updateDynamic("AutoCalculate")(AutoCalculate)
    __obj.updateDynamic("BitmapTableURL")(BitmapTableURL)
    __obj.updateDynamic("CharacterCompressionType")(CharacterCompressionType)
    __obj.updateDynamic("ColorTableURL")(ColorTableURL)
    __obj.updateDynamic("CurrentDatabaseCommand")(CurrentDatabaseCommand)
    __obj.updateDynamic("CurrentDatabaseCommandType")(CurrentDatabaseCommandType)
    __obj.updateDynamic("CurrentDatabaseDataSource")(CurrentDatabaseDataSource)
    __obj.updateDynamic("DashTableURL")(DashTableURL)
    __obj.updateDynamic("DefaultTabStop")(DefaultTabStop)
    __obj.updateDynamic("EmbedFonts")(EmbedFonts)
    __obj.updateDynamic("EmbedSystemFonts")(EmbedSystemFonts)
    __obj.updateDynamic("FieldAutoUpdate")(FieldAutoUpdate)
    __obj.updateDynamic("ForbiddenCharacters")(ForbiddenCharacters)
    __obj.updateDynamic("GradientTableURL")(GradientTableURL)
    __obj.updateDynamic("GridColor")(GridColor)
    __obj.updateDynamic("HasColumnRowHeaders")(HasColumnRowHeaders)
    __obj.updateDynamic("HasSheetTabs")(HasSheetTabs)
    __obj.updateDynamic("HatchTableURL")(HatchTableURL)
    __obj.updateDynamic("IsKernAsianPunctuation")(IsKernAsianPunctuation)
    __obj.updateDynamic("IsOutlineSymbolsSet")(IsOutlineSymbolsSet)
    __obj.updateDynamic("IsPrintBooklet")(IsPrintBooklet)
    __obj.updateDynamic("IsPrintBookletBack")(IsPrintBookletBack)
    __obj.updateDynamic("IsPrintBookletFront")(IsPrintBookletFront)
    __obj.updateDynamic("IsRasterAxisSynchronized")(IsRasterAxisSynchronized)
    __obj.updateDynamic("IsSnapToRaster")(IsSnapToRaster)
    __obj.updateDynamic("LineEndTableURL")(LineEndTableURL)
    __obj.updateDynamic("LinkUpdateMode")(LinkUpdateMode)
    __obj.updateDynamic("PrintQuality")(PrintQuality)
    __obj.updateDynamic("PrinterIndependentLayout")(PrinterIndependentLayout)
    __obj.updateDynamic("PrinterName")(PrinterName)
    __obj.updateDynamic("PrinterSetup")(PrinterSetup)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RasterIsVisible")(RasterIsVisible)
    __obj.updateDynamic("RasterResolutionX")(RasterResolutionX)
    __obj.updateDynamic("RasterResolutionY")(RasterResolutionY)
    __obj.updateDynamic("RasterSubdivisionX")(RasterSubdivisionX)
    __obj.updateDynamic("RasterSubdivisionY")(RasterSubdivisionY)
    __obj.updateDynamic("SaveVersionOnClose")(SaveVersionOnClose)
    __obj.updateDynamic("ShowGrid")(ShowGrid)
    __obj.updateDynamic("ShowNotes")(ShowNotes)
    __obj.updateDynamic("ShowPageBreaks")(ShowPageBreaks)
    __obj.updateDynamic("ShowZeroValues")(ShowZeroValues)
    __obj.updateDynamic("UpdateFromTemplate")(UpdateFromTemplate)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[DocumentSettings]
  }
}

