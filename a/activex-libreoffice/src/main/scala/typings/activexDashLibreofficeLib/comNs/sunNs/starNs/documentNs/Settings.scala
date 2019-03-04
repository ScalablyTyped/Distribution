package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

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
trait Settings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** layout engine should add value of a Font's "external leading" attribute to the line spacing. */
  var AddExternalLeading: scala.Boolean
  /** specifies if the user-specific settings saved within a document should be loaded with the document. */
  var ApplyUserData: scala.Boolean
  var AutoCalculate: scala.Boolean
  var BitmapTableURL: java.lang.String
  /**
    * specifies the compression (character spacing) type used for Asian characters.
    * @see com.sun.star.text.CharacterCompressionType
    */
  var CharacterCompressionType: scala.Double
  /** contains the URL that points to a color table (file extension .soc) that will be used for showing a palette in dialogs using colors. */
  var ColorTableURL: java.lang.String
  /** a string value, specifying the name of the object displayed currently (or the SQL statement used). */
  var CurrentDatabaseCommand: java.lang.String
  /**
    * determines the interpretation of the property DataTableName.
    * @see com.sun.star.sdb.CommandType
    */
  var CurrentDatabaseCommandType: scala.Double
  /**
    * The name of the globally registered {@link com.sun.star.sdb.DataSource} from which the current data is taken.
    *
    * The data source can e.g. be used for feeding a form letter.
    */
  var CurrentDatabaseDataSource: java.lang.String
  var DashTableURL: java.lang.String
  var DefaultTabStop: scala.Double
  /**
    * Whether to embed fonts used by the document (see e.g. handling of OOXML embedRegular etc.)
    * @since LibreOffice 4.0
    */
  var EmbedFonts: scala.Boolean
  /**
    * Whether to embed also system fonts used by the document. Does not have any effect if EmbedFonts is false.
    * @since LibreOffice 4.0
    */
  var EmbedSystemFonts: scala.Boolean
  /** specifies if fields in text documents are updated automatically. */
  var FieldAutoUpdate: scala.Boolean
  /**
    * gives access to the set of forbidden characters.
    * @returns the {@link com.sun.star.i18n.XForbiddenCharacters} interface to allow retrieval and modification of the forbidden characters set.
    */
  var ForbiddenCharacters: activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.XForbiddenCharacters
  var GradientTableURL: java.lang.String
  var HatchTableURL: java.lang.String
  /**
    * specifies if kerning is applied to Asian punctuation.
    *
    * Applies only if kerning is enabled.
    */
  var IsKernAsianPunctuation: scala.Boolean
  /**
    * determines if the document will be printed as a booklet (brochure), i.e., two document pages are put together on one physical page, such that you can
    * fold the print result and get a booklet.
    *
    * Note, that you have to print in duplex mode, if both, {@link IsPrintBookletFront} and {@link IsPrintBookletBack} are set to `TRUE` .
    */
  var IsPrintBooklet: scala.Boolean
  /**
    * is only effective, if {@link IsPrintBooklet} is `TRUE` . If this property is also `TRUE` , only the backs of the pages of your booklet are printed.
    *
    * This is especially useful, if your printer does not supply duplex printing.
    */
  var IsPrintBookletBack: scala.Boolean
  /**
    * is only effective, if {@link IsPrintBooklet} is `TRUE` . If this property is also `TRUE` , only the fronts of the pages of your booklet are printed.
    *
    * This is especially useful, if your printer does not supply duplex printing.
    */
  var IsPrintBookletFront: scala.Boolean
  var LineEndTableURL: java.lang.String
  /**
    * specifies the update mode for links when loading text documents.
    *
    * For supported values see the constants group {@link LinkUpdateModes} .
    */
  var LinkUpdateMode: scala.Double
  var PrintQuality: scala.Double
  /**
    * forbid use of printer metrics for layout
    *
    * For supported values see the constants group {@link PrinterIndependentLayout} .
    */
  var PrinterIndependentLayout: scala.Double
  /** printer used by the document. */
  var PrinterName: java.lang.String
  /**
    * platform and driver dependent printer setup data.
    *
    * This property serves to capture the current printer setup settings, such as paper tray, printer options, etc. The data can typically be interpreted
    * only by the system that generated it. The PrinterSetup property may be used to save and restore the user's printer settings.
    */
  var PrinterSetup: activexDashInteropLib.SafeArray[scala.Double]
  /** specifies if a new version is created if a document has been modified and you want to close it. */
  var SaveVersionOnClose: scala.Boolean
  /**
    * specifies if the document should be updated when the template it was created from changes.
    *
    * Applies only for documents that were created from a template.
    */
  var UpdateFromTemplate: scala.Boolean
}

object Settings {
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
    HatchTableURL: java.lang.String,
    IsKernAsianPunctuation: scala.Boolean,
    IsPrintBooklet: scala.Boolean,
    IsPrintBookletBack: scala.Boolean,
    IsPrintBookletFront: scala.Boolean,
    LineEndTableURL: java.lang.String,
    LinkUpdateMode: scala.Double,
    PrintQuality: scala.Double,
    PrinterIndependentLayout: scala.Double,
    PrinterName: java.lang.String,
    PrinterSetup: activexDashInteropLib.SafeArray[scala.Double],
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SaveVersionOnClose: scala.Boolean,
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
  ): Settings = {
    val __obj = js.Dynamic.literal(AddExternalLeading = AddExternalLeading, ApplyUserData = ApplyUserData, AutoCalculate = AutoCalculate, BitmapTableURL = BitmapTableURL, CharacterCompressionType = CharacterCompressionType, ColorTableURL = ColorTableURL, CurrentDatabaseCommand = CurrentDatabaseCommand, CurrentDatabaseCommandType = CurrentDatabaseCommandType, CurrentDatabaseDataSource = CurrentDatabaseDataSource, DashTableURL = DashTableURL, DefaultTabStop = DefaultTabStop, EmbedFonts = EmbedFonts, EmbedSystemFonts = EmbedSystemFonts, FieldAutoUpdate = FieldAutoUpdate, ForbiddenCharacters = ForbiddenCharacters, GradientTableURL = GradientTableURL, HatchTableURL = HatchTableURL, IsKernAsianPunctuation = IsKernAsianPunctuation, IsPrintBooklet = IsPrintBooklet, IsPrintBookletBack = IsPrintBookletBack, IsPrintBookletFront = IsPrintBookletFront, LineEndTableURL = LineEndTableURL, LinkUpdateMode = LinkUpdateMode, PrintQuality = PrintQuality, PrinterIndependentLayout = PrinterIndependentLayout, PrinterName = PrinterName, PrinterSetup = PrinterSetup, PropertySetInfo = PropertySetInfo, SaveVersionOnClose = SaveVersionOnClose, UpdateFromTemplate = UpdateFromTemplate, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[Settings]
  }
}

