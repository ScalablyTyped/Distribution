package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.i18n.XForbiddenCharacters
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes properties that apply to the whole document of any application.
  *
  * For application specific settings, please refer to the individual services.
  * @see com.sun.star.text.DocumentSettings
  * @see com.sun.star.sheet.DocumentSettings
  * @see com.sun.star.drawing.DocumentSettings
  * @see com.sun.star.presentation.DocumentSettings
  */
@js.native
trait Settings extends XPropertySet {
  
  /** layout engine should add value of a Font's "external leading" attribute to the line spacing. */
  var AddExternalLeading: Boolean = js.native
  
  /** specifies if the user-specific settings saved within a document should be loaded with the document. */
  var ApplyUserData: Boolean = js.native
  
  var AutoCalculate: Boolean = js.native
  
  var BitmapTableURL: String = js.native
  
  /**
    * specifies the compression (character spacing) type used for Asian characters.
    * @see com.sun.star.text.CharacterCompressionType
    */
  var CharacterCompressionType: Double = js.native
  
  /** contains the URL that points to a color table (file extension .soc) that will be used for showing a palette in dialogs using colors. */
  var ColorTableURL: String = js.native
  
  /** a string value, specifying the name of the object displayed currently (or the SQL statement used). */
  var CurrentDatabaseCommand: String = js.native
  
  /**
    * determines the interpretation of the property DataTableName.
    * @see com.sun.star.sdb.CommandType
    */
  var CurrentDatabaseCommandType: Double = js.native
  
  /**
    * The name of the globally registered {@link com.sun.star.sdb.DataSource} from which the current data is taken.
    *
    * The data source can e.g. be used for feeding a form letter.
    */
  var CurrentDatabaseDataSource: String = js.native
  
  var DashTableURL: String = js.native
  
  var DefaultTabStop: Double = js.native
  
  /**
    * Whether to embed fonts used by the document (see e.g. handling of OOXML embedRegular etc.)
    * @since LibreOffice 4.0
    */
  var EmbedFonts: Boolean = js.native
  
  /**
    * Whether to embed also system fonts used by the document. Does not have any effect if EmbedFonts is false.
    * @since LibreOffice 4.0
    */
  var EmbedSystemFonts: Boolean = js.native
  
  /** specifies if fields in text documents are updated automatically. */
  var FieldAutoUpdate: Boolean = js.native
  
  /**
    * gives access to the set of forbidden characters.
    * @returns the {@link com.sun.star.i18n.XForbiddenCharacters} interface to allow retrieval and modification of the forbidden characters set.
    */
  var ForbiddenCharacters: XForbiddenCharacters = js.native
  
  var GradientTableURL: String = js.native
  
  var HatchTableURL: String = js.native
  
  /**
    * specifies if kerning is applied to Asian punctuation.
    *
    * Applies only if kerning is enabled.
    */
  var IsKernAsianPunctuation: Boolean = js.native
  
  /**
    * determines if the document will be printed as a booklet (brochure), i.e., two document pages are put together on one physical page, such that you can
    * fold the print result and get a booklet.
    *
    * Note, that you have to print in duplex mode, if both, {@link IsPrintBookletFront} and {@link IsPrintBookletBack} are set to `TRUE` .
    */
  var IsPrintBooklet: Boolean = js.native
  
  /**
    * is only effective, if {@link IsPrintBooklet} is `TRUE` . If this property is also `TRUE` , only the backs of the pages of your booklet are printed.
    *
    * This is especially useful, if your printer does not supply duplex printing.
    */
  var IsPrintBookletBack: Boolean = js.native
  
  /**
    * is only effective, if {@link IsPrintBooklet} is `TRUE` . If this property is also `TRUE` , only the fronts of the pages of your booklet are printed.
    *
    * This is especially useful, if your printer does not supply duplex printing.
    */
  var IsPrintBookletFront: Boolean = js.native
  
  var LineEndTableURL: String = js.native
  
  /**
    * specifies the update mode for links when loading text documents.
    *
    * For supported values see the constants group {@link LinkUpdateModes} .
    */
  var LinkUpdateMode: Double = js.native
  
  var PrintQuality: Double = js.native
  
  /**
    * forbid use of printer metrics for layout
    *
    * For supported values see the constants group {@link PrinterIndependentLayout} .
    */
  var PrinterIndependentLayout: Double = js.native
  
  /** printer used by the document. */
  var PrinterName: String = js.native
  
  /**
    * platform and driver dependent printer setup data.
    *
    * This property serves to capture the current printer setup settings, such as paper tray, printer options, etc. The data can typically be interpreted
    * only by the system that generated it. The PrinterSetup property may be used to save and restore the user's printer settings.
    */
  var PrinterSetup: SafeArray[Double] = js.native
  
  /** specifies if a new version is created if a document has been modified and you want to close it. */
  var SaveVersionOnClose: Boolean = js.native
  
  /**
    * specifies if the document should be updated when the template it was created from changes.
    *
    * Applies only for documents that were created from a template.
    */
  var UpdateFromTemplate: Boolean = js.native
}
object Settings {
  
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
    HatchTableURL: String,
    IsKernAsianPunctuation: Boolean,
    IsPrintBooklet: Boolean,
    IsPrintBookletBack: Boolean,
    IsPrintBookletFront: Boolean,
    LineEndTableURL: String,
    LinkUpdateMode: Double,
    PrintQuality: Double,
    PrinterIndependentLayout: Double,
    PrinterName: String,
    PrinterSetup: SafeArray[Double],
    PropertySetInfo: XPropertySetInfo,
    SaveVersionOnClose: Boolean,
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
  ): Settings = {
    val __obj = js.Dynamic.literal(AddExternalLeading = AddExternalLeading.asInstanceOf[js.Any], ApplyUserData = ApplyUserData.asInstanceOf[js.Any], AutoCalculate = AutoCalculate.asInstanceOf[js.Any], BitmapTableURL = BitmapTableURL.asInstanceOf[js.Any], CharacterCompressionType = CharacterCompressionType.asInstanceOf[js.Any], ColorTableURL = ColorTableURL.asInstanceOf[js.Any], CurrentDatabaseCommand = CurrentDatabaseCommand.asInstanceOf[js.Any], CurrentDatabaseCommandType = CurrentDatabaseCommandType.asInstanceOf[js.Any], CurrentDatabaseDataSource = CurrentDatabaseDataSource.asInstanceOf[js.Any], DashTableURL = DashTableURL.asInstanceOf[js.Any], DefaultTabStop = DefaultTabStop.asInstanceOf[js.Any], EmbedFonts = EmbedFonts.asInstanceOf[js.Any], EmbedSystemFonts = EmbedSystemFonts.asInstanceOf[js.Any], FieldAutoUpdate = FieldAutoUpdate.asInstanceOf[js.Any], ForbiddenCharacters = ForbiddenCharacters.asInstanceOf[js.Any], GradientTableURL = GradientTableURL.asInstanceOf[js.Any], HatchTableURL = HatchTableURL.asInstanceOf[js.Any], IsKernAsianPunctuation = IsKernAsianPunctuation.asInstanceOf[js.Any], IsPrintBooklet = IsPrintBooklet.asInstanceOf[js.Any], IsPrintBookletBack = IsPrintBookletBack.asInstanceOf[js.Any], IsPrintBookletFront = IsPrintBookletFront.asInstanceOf[js.Any], LineEndTableURL = LineEndTableURL.asInstanceOf[js.Any], LinkUpdateMode = LinkUpdateMode.asInstanceOf[js.Any], PrintQuality = PrintQuality.asInstanceOf[js.Any], PrinterIndependentLayout = PrinterIndependentLayout.asInstanceOf[js.Any], PrinterName = PrinterName.asInstanceOf[js.Any], PrinterSetup = PrinterSetup.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SaveVersionOnClose = SaveVersionOnClose.asInstanceOf[js.Any], UpdateFromTemplate = UpdateFromTemplate.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddExternalLeading(value: Boolean): Self = StObject.set(x, "AddExternalLeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyUserData(value: Boolean): Self = StObject.set(x, "ApplyUserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCalculate(value: Boolean): Self = StObject.set(x, "AutoCalculate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitmapTableURL(value: String): Self = StObject.set(x, "BitmapTableURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterCompressionType(value: Double): Self = StObject.set(x, "CharacterCompressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTableURL(value: String): Self = StObject.set(x, "ColorTableURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDatabaseCommand(value: String): Self = StObject.set(x, "CurrentDatabaseCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDatabaseCommandType(value: Double): Self = StObject.set(x, "CurrentDatabaseCommandType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDatabaseDataSource(value: String): Self = StObject.set(x, "CurrentDatabaseDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashTableURL(value: String): Self = StObject.set(x, "DashTableURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTabStop(value: Double): Self = StObject.set(x, "DefaultTabStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedFonts(value: Boolean): Self = StObject.set(x, "EmbedFonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedSystemFonts(value: Boolean): Self = StObject.set(x, "EmbedSystemFonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldAutoUpdate(value: Boolean): Self = StObject.set(x, "FieldAutoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbiddenCharacters(value: XForbiddenCharacters): Self = StObject.set(x, "ForbiddenCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTableURL(value: String): Self = StObject.set(x, "GradientTableURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHatchTableURL(value: String): Self = StObject.set(x, "HatchTableURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsKernAsianPunctuation(value: Boolean): Self = StObject.set(x, "IsKernAsianPunctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrintBooklet(value: Boolean): Self = StObject.set(x, "IsPrintBooklet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrintBookletBack(value: Boolean): Self = StObject.set(x, "IsPrintBookletBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrintBookletFront(value: Boolean): Self = StObject.set(x, "IsPrintBookletFront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineEndTableURL(value: String): Self = StObject.set(x, "LineEndTableURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUpdateMode(value: Double): Self = StObject.set(x, "LinkUpdateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintQuality(value: Double): Self = StObject.set(x, "PrintQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrinterIndependentLayout(value: Double): Self = StObject.set(x, "PrinterIndependentLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrinterName(value: String): Self = StObject.set(x, "PrinterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrinterSetup(value: SafeArray[Double]): Self = StObject.set(x, "PrinterSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveVersionOnClose(value: Boolean): Self = StObject.set(x, "SaveVersionOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateFromTemplate(value: Boolean): Self = StObject.set(x, "UpdateFromTemplate", value.asInstanceOf[js.Any])
  }
}
