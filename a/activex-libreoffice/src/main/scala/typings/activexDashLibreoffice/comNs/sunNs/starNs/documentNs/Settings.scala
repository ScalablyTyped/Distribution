package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs.XForbiddenCharacters
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes properties that apply to the whole document of any application.
  *
  * For application specific settings, please refer to the individual services.
  * @see com.sun.star.text.DocumentSettings
  * @see com.sun.star.sheet.DocumentSettings
  * @see com.sun.star.drawing.DocumentSettings
  * @see com.sun.star.presentation.DocumentSettings
  */
trait Settings extends XPropertySet {
  /** layout engine should add value of a Font's "external leading" attribute to the line spacing. */
  var AddExternalLeading: Boolean
  /** specifies if the user-specific settings saved within a document should be loaded with the document. */
  var ApplyUserData: Boolean
  var AutoCalculate: Boolean
  var BitmapTableURL: String
  /**
    * specifies the compression (character spacing) type used for Asian characters.
    * @see com.sun.star.text.CharacterCompressionType
    */
  var CharacterCompressionType: Double
  /** contains the URL that points to a color table (file extension .soc) that will be used for showing a palette in dialogs using colors. */
  var ColorTableURL: String
  /** a string value, specifying the name of the object displayed currently (or the SQL statement used). */
  var CurrentDatabaseCommand: String
  /**
    * determines the interpretation of the property DataTableName.
    * @see com.sun.star.sdb.CommandType
    */
  var CurrentDatabaseCommandType: Double
  /**
    * The name of the globally registered {@link com.sun.star.sdb.DataSource} from which the current data is taken.
    *
    * The data source can e.g. be used for feeding a form letter.
    */
  var CurrentDatabaseDataSource: String
  var DashTableURL: String
  var DefaultTabStop: Double
  /**
    * Whether to embed fonts used by the document (see e.g. handling of OOXML embedRegular etc.)
    * @since LibreOffice 4.0
    */
  var EmbedFonts: Boolean
  /**
    * Whether to embed also system fonts used by the document. Does not have any effect if EmbedFonts is false.
    * @since LibreOffice 4.0
    */
  var EmbedSystemFonts: Boolean
  /** specifies if fields in text documents are updated automatically. */
  var FieldAutoUpdate: Boolean
  /**
    * gives access to the set of forbidden characters.
    * @returns the {@link com.sun.star.i18n.XForbiddenCharacters} interface to allow retrieval and modification of the forbidden characters set.
    */
  var ForbiddenCharacters: XForbiddenCharacters
  var GradientTableURL: String
  var HatchTableURL: String
  /**
    * specifies if kerning is applied to Asian punctuation.
    *
    * Applies only if kerning is enabled.
    */
  var IsKernAsianPunctuation: Boolean
  /**
    * determines if the document will be printed as a booklet (brochure), i.e., two document pages are put together on one physical page, such that you can
    * fold the print result and get a booklet.
    *
    * Note, that you have to print in duplex mode, if both, {@link IsPrintBookletFront} and {@link IsPrintBookletBack} are set to `TRUE` .
    */
  var IsPrintBooklet: Boolean
  /**
    * is only effective, if {@link IsPrintBooklet} is `TRUE` . If this property is also `TRUE` , only the backs of the pages of your booklet are printed.
    *
    * This is especially useful, if your printer does not supply duplex printing.
    */
  var IsPrintBookletBack: Boolean
  /**
    * is only effective, if {@link IsPrintBooklet} is `TRUE` . If this property is also `TRUE` , only the fronts of the pages of your booklet are printed.
    *
    * This is especially useful, if your printer does not supply duplex printing.
    */
  var IsPrintBookletFront: Boolean
  var LineEndTableURL: String
  /**
    * specifies the update mode for links when loading text documents.
    *
    * For supported values see the constants group {@link LinkUpdateModes} .
    */
  var LinkUpdateMode: Double
  var PrintQuality: Double
  /**
    * forbid use of printer metrics for layout
    *
    * For supported values see the constants group {@link PrinterIndependentLayout} .
    */
  var PrinterIndependentLayout: Double
  /** printer used by the document. */
  var PrinterName: String
  /**
    * platform and driver dependent printer setup data.
    *
    * This property serves to capture the current printer setup settings, such as paper tray, printer options, etc. The data can typically be interpreted
    * only by the system that generated it. The PrinterSetup property may be used to save and restore the user's printer settings.
    */
  var PrinterSetup: SafeArray[Double]
  /** specifies if a new version is created if a document has been modified and you want to close it. */
  var SaveVersionOnClose: Boolean
  /**
    * specifies if the document should be updated when the template it was created from changes.
    *
    * Applies only for documents that were created from a template.
    */
  var UpdateFromTemplate: Boolean
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
    val __obj = js.Dynamic.literal(AddExternalLeading = AddExternalLeading, ApplyUserData = ApplyUserData, AutoCalculate = AutoCalculate, BitmapTableURL = BitmapTableURL, CharacterCompressionType = CharacterCompressionType, ColorTableURL = ColorTableURL, CurrentDatabaseCommand = CurrentDatabaseCommand, CurrentDatabaseCommandType = CurrentDatabaseCommandType, CurrentDatabaseDataSource = CurrentDatabaseDataSource, DashTableURL = DashTableURL, DefaultTabStop = DefaultTabStop, EmbedFonts = EmbedFonts, EmbedSystemFonts = EmbedSystemFonts, FieldAutoUpdate = FieldAutoUpdate, ForbiddenCharacters = ForbiddenCharacters, GradientTableURL = GradientTableURL, HatchTableURL = HatchTableURL, IsKernAsianPunctuation = IsKernAsianPunctuation, IsPrintBooklet = IsPrintBooklet, IsPrintBookletBack = IsPrintBookletBack, IsPrintBookletFront = IsPrintBookletFront, LineEndTableURL = LineEndTableURL, LinkUpdateMode = LinkUpdateMode, PrintQuality = PrintQuality, PrinterIndependentLayout = PrinterIndependentLayout, PrinterName = PrinterName, PrinterSetup = PrinterSetup, PropertySetInfo = PropertySetInfo, SaveVersionOnClose = SaveVersionOnClose, UpdateFromTemplate = UpdateFromTemplate, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Settings]
  }
}

