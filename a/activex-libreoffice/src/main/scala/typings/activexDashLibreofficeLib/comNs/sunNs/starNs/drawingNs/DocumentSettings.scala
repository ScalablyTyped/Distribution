package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes properties that apply to the whole drawing document. */
trait DocumentSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.Settings
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.HeaderFooterSettings {
  /** enables or disables the fitting of the page to the printable area during print */
  var IsPrintFitPage: scala.Boolean
  /** if this is true and the paper size for printing is larger than the paper size of the printer than the content is tiled over multiple pages. */
  var IsPrintTilePage: scala.Boolean
  /** This is the default logical measure unit that is used for string formatting inside the document, f.e. the measure text */
  var MeasureUnit: scala.Double
  /** is the number format used for page number fields */
  var PageNumberFormat: scala.Double
  /**
    * If this is true, the distance between two paragraphs is the sum of ParaTopMargin of the previous and ParaBottomMargin of the next paragraph. If false,
    * only the greater of the two is chosen.
    */
  var ParagraphSummation: scala.Boolean
  /** is the denominator for the logical scale of the document */
  var ScaleDenominator: scala.Double
  /** is the numerator for the logical scale of the document */
  var ScaleNumerator: scala.Double
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
    HatchTableURL: java.lang.String,
    IsKernAsianPunctuation: scala.Boolean,
    IsPrintBooklet: scala.Boolean,
    IsPrintBookletBack: scala.Boolean,
    IsPrintBookletFront: scala.Boolean,
    IsPrintDate: scala.Boolean,
    IsPrintFitPage: scala.Boolean,
    IsPrintPageName: scala.Boolean,
    IsPrintTilePage: scala.Boolean,
    IsPrintTime: scala.Boolean,
    LineEndTableURL: java.lang.String,
    LinkUpdateMode: scala.Double,
    MeasureUnit: scala.Double,
    PageNumberFormat: scala.Double,
    ParagraphSummation: scala.Boolean,
    PrintQuality: scala.Double,
    PrinterIndependentLayout: scala.Double,
    PrinterName: java.lang.String,
    PrinterSetup: activexDashInteropLib.SafeArray[scala.Double],
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SaveVersionOnClose: scala.Boolean,
    ScaleDenominator: scala.Double,
    ScaleNumerator: scala.Double,
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
    __obj.updateDynamic("HatchTableURL")(HatchTableURL)
    __obj.updateDynamic("IsKernAsianPunctuation")(IsKernAsianPunctuation)
    __obj.updateDynamic("IsPrintBooklet")(IsPrintBooklet)
    __obj.updateDynamic("IsPrintBookletBack")(IsPrintBookletBack)
    __obj.updateDynamic("IsPrintBookletFront")(IsPrintBookletFront)
    __obj.updateDynamic("IsPrintDate")(IsPrintDate)
    __obj.updateDynamic("IsPrintFitPage")(IsPrintFitPage)
    __obj.updateDynamic("IsPrintPageName")(IsPrintPageName)
    __obj.updateDynamic("IsPrintTilePage")(IsPrintTilePage)
    __obj.updateDynamic("IsPrintTime")(IsPrintTime)
    __obj.updateDynamic("LineEndTableURL")(LineEndTableURL)
    __obj.updateDynamic("LinkUpdateMode")(LinkUpdateMode)
    __obj.updateDynamic("MeasureUnit")(MeasureUnit)
    __obj.updateDynamic("PageNumberFormat")(PageNumberFormat)
    __obj.updateDynamic("ParagraphSummation")(ParagraphSummation)
    __obj.updateDynamic("PrintQuality")(PrintQuality)
    __obj.updateDynamic("PrinterIndependentLayout")(PrinterIndependentLayout)
    __obj.updateDynamic("PrinterName")(PrinterName)
    __obj.updateDynamic("PrinterSetup")(PrinterSetup)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("SaveVersionOnClose")(SaveVersionOnClose)
    __obj.updateDynamic("ScaleDenominator")(ScaleDenominator)
    __obj.updateDynamic("ScaleNumerator")(ScaleNumerator)
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

