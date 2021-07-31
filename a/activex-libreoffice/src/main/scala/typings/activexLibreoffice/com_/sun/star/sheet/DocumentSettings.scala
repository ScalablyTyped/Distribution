package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.document.Settings
import typings.activexLibreoffice.com_.sun.star.i18n.XForbiddenCharacters
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes properties that apply to the whole spreadsheet document.
  *
  * For settings that affect view properties, these settings apply to subsequently created views and are saved with the document, while {@link
  * SpreadsheetViewSettings} can be used to alter a specific view that is already open.
  */
trait DocumentSettings
  extends StObject
     with Settings {
  
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
    val __obj = js.Dynamic.literal(AddExternalLeading = AddExternalLeading.asInstanceOf[js.Any], ApplyUserData = ApplyUserData.asInstanceOf[js.Any], AutoCalculate = AutoCalculate.asInstanceOf[js.Any], BitmapTableURL = BitmapTableURL.asInstanceOf[js.Any], CharacterCompressionType = CharacterCompressionType.asInstanceOf[js.Any], ColorTableURL = ColorTableURL.asInstanceOf[js.Any], CurrentDatabaseCommand = CurrentDatabaseCommand.asInstanceOf[js.Any], CurrentDatabaseCommandType = CurrentDatabaseCommandType.asInstanceOf[js.Any], CurrentDatabaseDataSource = CurrentDatabaseDataSource.asInstanceOf[js.Any], DashTableURL = DashTableURL.asInstanceOf[js.Any], DefaultTabStop = DefaultTabStop.asInstanceOf[js.Any], EmbedFonts = EmbedFonts.asInstanceOf[js.Any], EmbedSystemFonts = EmbedSystemFonts.asInstanceOf[js.Any], FieldAutoUpdate = FieldAutoUpdate.asInstanceOf[js.Any], ForbiddenCharacters = ForbiddenCharacters.asInstanceOf[js.Any], GradientTableURL = GradientTableURL.asInstanceOf[js.Any], GridColor = GridColor.asInstanceOf[js.Any], HasColumnRowHeaders = HasColumnRowHeaders.asInstanceOf[js.Any], HasSheetTabs = HasSheetTabs.asInstanceOf[js.Any], HatchTableURL = HatchTableURL.asInstanceOf[js.Any], IsKernAsianPunctuation = IsKernAsianPunctuation.asInstanceOf[js.Any], IsOutlineSymbolsSet = IsOutlineSymbolsSet.asInstanceOf[js.Any], IsPrintBooklet = IsPrintBooklet.asInstanceOf[js.Any], IsPrintBookletBack = IsPrintBookletBack.asInstanceOf[js.Any], IsPrintBookletFront = IsPrintBookletFront.asInstanceOf[js.Any], IsRasterAxisSynchronized = IsRasterAxisSynchronized.asInstanceOf[js.Any], IsSnapToRaster = IsSnapToRaster.asInstanceOf[js.Any], LineEndTableURL = LineEndTableURL.asInstanceOf[js.Any], LinkUpdateMode = LinkUpdateMode.asInstanceOf[js.Any], PrintQuality = PrintQuality.asInstanceOf[js.Any], PrinterIndependentLayout = PrinterIndependentLayout.asInstanceOf[js.Any], PrinterName = PrinterName.asInstanceOf[js.Any], PrinterSetup = PrinterSetup.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RasterIsVisible = RasterIsVisible.asInstanceOf[js.Any], RasterResolutionX = RasterResolutionX.asInstanceOf[js.Any], RasterResolutionY = RasterResolutionY.asInstanceOf[js.Any], RasterSubdivisionX = RasterSubdivisionX.asInstanceOf[js.Any], RasterSubdivisionY = RasterSubdivisionY.asInstanceOf[js.Any], SaveVersionOnClose = SaveVersionOnClose.asInstanceOf[js.Any], ShowGrid = ShowGrid.asInstanceOf[js.Any], ShowNotes = ShowNotes.asInstanceOf[js.Any], ShowPageBreaks = ShowPageBreaks.asInstanceOf[js.Any], ShowZeroValues = ShowZeroValues.asInstanceOf[js.Any], UpdateFromTemplate = UpdateFromTemplate.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DocumentSettings]
  }
  
  @scala.inline
  implicit class DocumentSettingsMutableBuilder[Self <: DocumentSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridColor(value: Color): Self = StObject.set(x, "GridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasColumnRowHeaders(value: Boolean): Self = StObject.set(x, "HasColumnRowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSheetTabs(value: Boolean): Self = StObject.set(x, "HasSheetTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOutlineSymbolsSet(value: Boolean): Self = StObject.set(x, "IsOutlineSymbolsSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRasterAxisSynchronized(value: Boolean): Self = StObject.set(x, "IsRasterAxisSynchronized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSnapToRaster(value: Boolean): Self = StObject.set(x, "IsSnapToRaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRasterIsVisible(value: Boolean): Self = StObject.set(x, "RasterIsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRasterResolutionX(value: Double): Self = StObject.set(x, "RasterResolutionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRasterResolutionY(value: Double): Self = StObject.set(x, "RasterResolutionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRasterSubdivisionX(value: Double): Self = StObject.set(x, "RasterSubdivisionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRasterSubdivisionY(value: Double): Self = StObject.set(x, "RasterSubdivisionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGrid(value: Boolean): Self = StObject.set(x, "ShowGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNotes(value: Boolean): Self = StObject.set(x, "ShowNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPageBreaks(value: Boolean): Self = StObject.set(x, "ShowPageBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowZeroValues(value: Boolean): Self = StObject.set(x, "ShowZeroValues", value.asInstanceOf[js.Any])
  }
}
