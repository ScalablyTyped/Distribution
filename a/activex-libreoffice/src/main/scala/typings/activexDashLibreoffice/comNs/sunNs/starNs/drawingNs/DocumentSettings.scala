package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.HeaderFooterSettings
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.Settings
import typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs.XForbiddenCharacters
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes properties that apply to the whole drawing document. */
trait DocumentSettings
  extends Settings
     with HeaderFooterSettings {
  /** enables or disables the fitting of the page to the printable area during print */
  var IsPrintFitPage: Boolean
  /** if this is true and the paper size for printing is larger than the paper size of the printer than the content is tiled over multiple pages. */
  var IsPrintTilePage: Boolean
  /** This is the default logical measure unit that is used for string formatting inside the document, f.e. the measure text */
  var MeasureUnit: Double
  /** is the number format used for page number fields */
  var PageNumberFormat: Double
  /**
    * If this is true, the distance between two paragraphs is the sum of ParaTopMargin of the previous and ParaBottomMargin of the next paragraph. If false,
    * only the greater of the two is chosen.
    */
  var ParagraphSummation: Boolean
  /** is the denominator for the logical scale of the document */
  var ScaleDenominator: Double
  /** is the numerator for the logical scale of the document */
  var ScaleNumerator: Double
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
    HatchTableURL: String,
    IsKernAsianPunctuation: Boolean,
    IsPrintBooklet: Boolean,
    IsPrintBookletBack: Boolean,
    IsPrintBookletFront: Boolean,
    IsPrintDate: Boolean,
    IsPrintFitPage: Boolean,
    IsPrintPageName: Boolean,
    IsPrintTilePage: Boolean,
    IsPrintTime: Boolean,
    LineEndTableURL: String,
    LinkUpdateMode: Double,
    MeasureUnit: Double,
    PageNumberFormat: Double,
    ParagraphSummation: Boolean,
    PrintQuality: Double,
    PrinterIndependentLayout: Double,
    PrinterName: String,
    PrinterSetup: SafeArray[Double],
    PropertySetInfo: XPropertySetInfo,
    SaveVersionOnClose: Boolean,
    ScaleDenominator: Double,
    ScaleNumerator: Double,
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
    val __obj = js.Dynamic.literal(AddExternalLeading = AddExternalLeading, ApplyUserData = ApplyUserData, AutoCalculate = AutoCalculate, BitmapTableURL = BitmapTableURL, CharacterCompressionType = CharacterCompressionType, ColorTableURL = ColorTableURL, CurrentDatabaseCommand = CurrentDatabaseCommand, CurrentDatabaseCommandType = CurrentDatabaseCommandType, CurrentDatabaseDataSource = CurrentDatabaseDataSource, DashTableURL = DashTableURL, DefaultTabStop = DefaultTabStop, EmbedFonts = EmbedFonts, EmbedSystemFonts = EmbedSystemFonts, FieldAutoUpdate = FieldAutoUpdate, ForbiddenCharacters = ForbiddenCharacters, GradientTableURL = GradientTableURL, HatchTableURL = HatchTableURL, IsKernAsianPunctuation = IsKernAsianPunctuation, IsPrintBooklet = IsPrintBooklet, IsPrintBookletBack = IsPrintBookletBack, IsPrintBookletFront = IsPrintBookletFront, IsPrintDate = IsPrintDate, IsPrintFitPage = IsPrintFitPage, IsPrintPageName = IsPrintPageName, IsPrintTilePage = IsPrintTilePage, IsPrintTime = IsPrintTime, LineEndTableURL = LineEndTableURL, LinkUpdateMode = LinkUpdateMode, MeasureUnit = MeasureUnit, PageNumberFormat = PageNumberFormat, ParagraphSummation = ParagraphSummation, PrintQuality = PrintQuality, PrinterIndependentLayout = PrinterIndependentLayout, PrinterName = PrinterName, PrinterSetup = PrinterSetup, PropertySetInfo = PropertySetInfo, SaveVersionOnClose = SaveVersionOnClose, ScaleDenominator = ScaleDenominator, ScaleNumerator = ScaleNumerator, UpdateFromTemplate = UpdateFromTemplate, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DocumentSettings]
  }
}

