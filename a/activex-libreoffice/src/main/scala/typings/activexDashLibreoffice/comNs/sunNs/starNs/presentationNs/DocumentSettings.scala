package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

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

/** describes properties that apply to the whole presentation document. */
trait DocumentSettings
  extends Settings
     with HeaderFooterSettings {
  /** enables or disables the printing of the drawing pages */
  var IsPrintDrawing: Boolean
  /** enables or disables the fitting of the page to the printable area during print */
  var IsPrintFitPage: Boolean
  /** enables or disables the printing of the handout pages */
  var IsPrintHandout: Boolean
  /** enables or disables the printing of draw pages that are marked hidden */
  var IsPrintHiddenPages: Boolean
  /** enables or disables the printing of the notes pages */
  var IsPrintNotes: Boolean
  /** enables or disables the printing of the outline pages */
  var IsPrintOutline: Boolean
  /** if this is true and the paper size for printing is larger than the paper size of the printer than the content is tiled over multiple pages. */
  var IsPrintTilePage: Boolean
  /** is the number format used for page number fields */
  var PageNumberFormat: Double
  /**
    * If this is true, the distance between two paragraphs is the sum of ParaTopMargin of the previous and ParaBottomMargin of the next paragraph. If false,
    * only the greater of the two is chosen.
    */
  var ParagraphSummation: Boolean
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
    IsPrintDrawing: Boolean,
    IsPrintFitPage: Boolean,
    IsPrintHandout: Boolean,
    IsPrintHiddenPages: Boolean,
    IsPrintNotes: Boolean,
    IsPrintOutline: Boolean,
    IsPrintPageName: Boolean,
    IsPrintTilePage: Boolean,
    IsPrintTime: Boolean,
    LineEndTableURL: String,
    LinkUpdateMode: Double,
    PageNumberFormat: Double,
    ParagraphSummation: Boolean,
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
  ): DocumentSettings = {
    val __obj = js.Dynamic.literal(AddExternalLeading = AddExternalLeading, ApplyUserData = ApplyUserData, AutoCalculate = AutoCalculate, BitmapTableURL = BitmapTableURL, CharacterCompressionType = CharacterCompressionType, ColorTableURL = ColorTableURL, CurrentDatabaseCommand = CurrentDatabaseCommand, CurrentDatabaseCommandType = CurrentDatabaseCommandType, CurrentDatabaseDataSource = CurrentDatabaseDataSource, DashTableURL = DashTableURL, DefaultTabStop = DefaultTabStop, EmbedFonts = EmbedFonts, EmbedSystemFonts = EmbedSystemFonts, FieldAutoUpdate = FieldAutoUpdate, ForbiddenCharacters = ForbiddenCharacters, GradientTableURL = GradientTableURL, HatchTableURL = HatchTableURL, IsKernAsianPunctuation = IsKernAsianPunctuation, IsPrintBooklet = IsPrintBooklet, IsPrintBookletBack = IsPrintBookletBack, IsPrintBookletFront = IsPrintBookletFront, IsPrintDate = IsPrintDate, IsPrintDrawing = IsPrintDrawing, IsPrintFitPage = IsPrintFitPage, IsPrintHandout = IsPrintHandout, IsPrintHiddenPages = IsPrintHiddenPages, IsPrintNotes = IsPrintNotes, IsPrintOutline = IsPrintOutline, IsPrintPageName = IsPrintPageName, IsPrintTilePage = IsPrintTilePage, IsPrintTime = IsPrintTime, LineEndTableURL = LineEndTableURL, LinkUpdateMode = LinkUpdateMode, PageNumberFormat = PageNumberFormat, ParagraphSummation = ParagraphSummation, PrintQuality = PrintQuality, PrinterIndependentLayout = PrinterIndependentLayout, PrinterName = PrinterName, PrinterSetup = PrinterSetup, PropertySetInfo = PropertySetInfo, SaveVersionOnClose = SaveVersionOnClose, UpdateFromTemplate = UpdateFromTemplate, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DocumentSettings]
  }
}

