package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.document.HeaderFooterSettings
import typings.activexLibreoffice.com_.sun.star.document.Settings
import typings.activexLibreoffice.com_.sun.star.i18n.XForbiddenCharacters
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes properties that apply to the whole presentation document. */
@js.native
trait DocumentSettings
  extends Settings
     with HeaderFooterSettings {
  /** enables or disables the printing of the drawing pages */
  var IsPrintDrawing: Boolean = js.native
  /** enables or disables the fitting of the page to the printable area during print */
  var IsPrintFitPage: Boolean = js.native
  /** enables or disables the printing of the handout pages */
  var IsPrintHandout: Boolean = js.native
  /** enables or disables the printing of draw pages that are marked hidden */
  var IsPrintHiddenPages: Boolean = js.native
  /** enables or disables the printing of the notes pages */
  var IsPrintNotes: Boolean = js.native
  /** enables or disables the printing of the outline pages */
  var IsPrintOutline: Boolean = js.native
  /** if this is true and the paper size for printing is larger than the paper size of the printer than the content is tiled over multiple pages. */
  var IsPrintTilePage: Boolean = js.native
  /** is the number format used for page number fields */
  var PageNumberFormat: Double = js.native
  /**
    * If this is true, the distance between two paragraphs is the sum of ParaTopMargin of the previous and ParaBottomMargin of the next paragraph. If false,
    * only the greater of the two is chosen.
    */
  var ParagraphSummation: Boolean = js.native
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
    val __obj = js.Dynamic.literal(AddExternalLeading = AddExternalLeading.asInstanceOf[js.Any], ApplyUserData = ApplyUserData.asInstanceOf[js.Any], AutoCalculate = AutoCalculate.asInstanceOf[js.Any], BitmapTableURL = BitmapTableURL.asInstanceOf[js.Any], CharacterCompressionType = CharacterCompressionType.asInstanceOf[js.Any], ColorTableURL = ColorTableURL.asInstanceOf[js.Any], CurrentDatabaseCommand = CurrentDatabaseCommand.asInstanceOf[js.Any], CurrentDatabaseCommandType = CurrentDatabaseCommandType.asInstanceOf[js.Any], CurrentDatabaseDataSource = CurrentDatabaseDataSource.asInstanceOf[js.Any], DashTableURL = DashTableURL.asInstanceOf[js.Any], DefaultTabStop = DefaultTabStop.asInstanceOf[js.Any], EmbedFonts = EmbedFonts.asInstanceOf[js.Any], EmbedSystemFonts = EmbedSystemFonts.asInstanceOf[js.Any], FieldAutoUpdate = FieldAutoUpdate.asInstanceOf[js.Any], ForbiddenCharacters = ForbiddenCharacters.asInstanceOf[js.Any], GradientTableURL = GradientTableURL.asInstanceOf[js.Any], HatchTableURL = HatchTableURL.asInstanceOf[js.Any], IsKernAsianPunctuation = IsKernAsianPunctuation.asInstanceOf[js.Any], IsPrintBooklet = IsPrintBooklet.asInstanceOf[js.Any], IsPrintBookletBack = IsPrintBookletBack.asInstanceOf[js.Any], IsPrintBookletFront = IsPrintBookletFront.asInstanceOf[js.Any], IsPrintDate = IsPrintDate.asInstanceOf[js.Any], IsPrintDrawing = IsPrintDrawing.asInstanceOf[js.Any], IsPrintFitPage = IsPrintFitPage.asInstanceOf[js.Any], IsPrintHandout = IsPrintHandout.asInstanceOf[js.Any], IsPrintHiddenPages = IsPrintHiddenPages.asInstanceOf[js.Any], IsPrintNotes = IsPrintNotes.asInstanceOf[js.Any], IsPrintOutline = IsPrintOutline.asInstanceOf[js.Any], IsPrintPageName = IsPrintPageName.asInstanceOf[js.Any], IsPrintTilePage = IsPrintTilePage.asInstanceOf[js.Any], IsPrintTime = IsPrintTime.asInstanceOf[js.Any], LineEndTableURL = LineEndTableURL.asInstanceOf[js.Any], LinkUpdateMode = LinkUpdateMode.asInstanceOf[js.Any], PageNumberFormat = PageNumberFormat.asInstanceOf[js.Any], ParagraphSummation = ParagraphSummation.asInstanceOf[js.Any], PrintQuality = PrintQuality.asInstanceOf[js.Any], PrinterIndependentLayout = PrinterIndependentLayout.asInstanceOf[js.Any], PrinterName = PrinterName.asInstanceOf[js.Any], PrinterSetup = PrinterSetup.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SaveVersionOnClose = SaveVersionOnClose.asInstanceOf[js.Any], UpdateFromTemplate = UpdateFromTemplate.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DocumentSettings]
  }
  @scala.inline
  implicit class DocumentSettingsOps[Self <: DocumentSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsPrintDrawing(value: Boolean): Self = this.set("IsPrintDrawing", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPrintFitPage(value: Boolean): Self = this.set("IsPrintFitPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPrintHandout(value: Boolean): Self = this.set("IsPrintHandout", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPrintHiddenPages(value: Boolean): Self = this.set("IsPrintHiddenPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPrintNotes(value: Boolean): Self = this.set("IsPrintNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPrintOutline(value: Boolean): Self = this.set("IsPrintOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPrintTilePage(value: Boolean): Self = this.set("IsPrintTilePage", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageNumberFormat(value: Double): Self = this.set("PageNumberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setParagraphSummation(value: Boolean): Self = this.set("ParagraphSummation", value.asInstanceOf[js.Any])
  }
  
}

