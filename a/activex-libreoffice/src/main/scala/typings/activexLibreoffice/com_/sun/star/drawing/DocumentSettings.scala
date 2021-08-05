package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.document.HeaderFooterSettings
import typings.activexLibreoffice.com_.sun.star.document.Settings
import typings.activexLibreoffice.com_.sun.star.i18n.XForbiddenCharacters
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes properties that apply to the whole drawing document. */
trait DocumentSettings
  extends StObject
     with Settings
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
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(AddExternalLeading = AddExternalLeading.asInstanceOf[js.Any], ApplyUserData = ApplyUserData.asInstanceOf[js.Any], AutoCalculate = AutoCalculate.asInstanceOf[js.Any], BitmapTableURL = BitmapTableURL.asInstanceOf[js.Any], CharacterCompressionType = CharacterCompressionType.asInstanceOf[js.Any], ColorTableURL = ColorTableURL.asInstanceOf[js.Any], CurrentDatabaseCommand = CurrentDatabaseCommand.asInstanceOf[js.Any], CurrentDatabaseCommandType = CurrentDatabaseCommandType.asInstanceOf[js.Any], CurrentDatabaseDataSource = CurrentDatabaseDataSource.asInstanceOf[js.Any], DashTableURL = DashTableURL.asInstanceOf[js.Any], DefaultTabStop = DefaultTabStop.asInstanceOf[js.Any], EmbedFonts = EmbedFonts.asInstanceOf[js.Any], EmbedSystemFonts = EmbedSystemFonts.asInstanceOf[js.Any], FieldAutoUpdate = FieldAutoUpdate.asInstanceOf[js.Any], ForbiddenCharacters = ForbiddenCharacters.asInstanceOf[js.Any], GradientTableURL = GradientTableURL.asInstanceOf[js.Any], HatchTableURL = HatchTableURL.asInstanceOf[js.Any], IsKernAsianPunctuation = IsKernAsianPunctuation.asInstanceOf[js.Any], IsPrintBooklet = IsPrintBooklet.asInstanceOf[js.Any], IsPrintBookletBack = IsPrintBookletBack.asInstanceOf[js.Any], IsPrintBookletFront = IsPrintBookletFront.asInstanceOf[js.Any], IsPrintDate = IsPrintDate.asInstanceOf[js.Any], IsPrintFitPage = IsPrintFitPage.asInstanceOf[js.Any], IsPrintPageName = IsPrintPageName.asInstanceOf[js.Any], IsPrintTilePage = IsPrintTilePage.asInstanceOf[js.Any], IsPrintTime = IsPrintTime.asInstanceOf[js.Any], LineEndTableURL = LineEndTableURL.asInstanceOf[js.Any], LinkUpdateMode = LinkUpdateMode.asInstanceOf[js.Any], MeasureUnit = MeasureUnit.asInstanceOf[js.Any], PageNumberFormat = PageNumberFormat.asInstanceOf[js.Any], ParagraphSummation = ParagraphSummation.asInstanceOf[js.Any], PrintQuality = PrintQuality.asInstanceOf[js.Any], PrinterIndependentLayout = PrinterIndependentLayout.asInstanceOf[js.Any], PrinterName = PrinterName.asInstanceOf[js.Any], PrinterSetup = PrinterSetup.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SaveVersionOnClose = SaveVersionOnClose.asInstanceOf[js.Any], ScaleDenominator = ScaleDenominator.asInstanceOf[js.Any], ScaleNumerator = ScaleNumerator.asInstanceOf[js.Any], UpdateFromTemplate = UpdateFromTemplate.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DocumentSettings]
  }
  
  extension [Self <: DocumentSettings](x: Self) {
    
    inline def setIsPrintFitPage(value: Boolean): Self = StObject.set(x, "IsPrintFitPage", value.asInstanceOf[js.Any])
    
    inline def setIsPrintTilePage(value: Boolean): Self = StObject.set(x, "IsPrintTilePage", value.asInstanceOf[js.Any])
    
    inline def setMeasureUnit(value: Double): Self = StObject.set(x, "MeasureUnit", value.asInstanceOf[js.Any])
    
    inline def setPageNumberFormat(value: Double): Self = StObject.set(x, "PageNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setParagraphSummation(value: Boolean): Self = StObject.set(x, "ParagraphSummation", value.asInstanceOf[js.Any])
    
    inline def setScaleDenominator(value: Double): Self = StObject.set(x, "ScaleDenominator", value.asInstanceOf[js.Any])
    
    inline def setScaleNumerator(value: Double): Self = StObject.set(x, "ScaleNumerator", value.asInstanceOf[js.Any])
  }
}
