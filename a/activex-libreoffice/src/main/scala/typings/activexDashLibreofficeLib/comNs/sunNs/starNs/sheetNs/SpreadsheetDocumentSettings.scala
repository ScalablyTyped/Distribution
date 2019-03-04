package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contributes properties to control the configuration which is global for all views of a spreadsheet document.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
trait SpreadsheetDocumentSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * specifies whether calculations are performed with the rounded values displayed in cells (set to `TRUE` ) instead of the internal values (set to
    * `FALSE` ).
    */
  var CalcAsShown: scala.Boolean
  /** contains the standard document language for Western text. */
  var CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** contains the standard document language for Asian text. */
  var CharLocaleAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** contains the standard document language for Complex text. */
  var CharLocaleComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** specifies the width of default tabulators. */
  var DefaultTabStop: scala.Double
  /** contains the interface XForbiddenCharacters. */
  var ForbiddenCharacters: activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.XForbiddenCharacters
  /**
    * If this property is set the document has DrawPages. Use this property to find out, whether the document has DrawPages or not, because the getDrawPage
    * method on the XDrawPageSupplier and the getDrawPages method on the XDrawPagesSupplier always creates the DrawPages if there are none; and this is very
    * slow and needs more memory.
    */
  var HasDrawPages: scala.Boolean
  /** specifies whether upper and lower cases are treated as equal when comparing cells. */
  var IgnoreCase: scala.Boolean
  /**
    * specifies whether the automatic adjustment of the row height is enabled.
    * @since OOo 3.0
    */
  var IsAdjustHeightEnabled: scala.Boolean
  /**
    * specifies whether the automatic execution of links is enabled.
    * @since OOo 3.0
    */
  var IsExecuteLinkEnabled: scala.Boolean
  /** enables iterated calculation of circular references. */
  var IsIterationEnabled: scala.Boolean
  /**
    * specifies whether the document data are already loaded.
    * @since OOo 3.0
    */
  var IsLoaded: scala.Boolean
  /**
    * specifies whether changes record is protected.
    * @since LibreOffice 5.0
    */
  var IsRecordChangesProtected: scala.Boolean
  /**
    * specifies whether the undo command is enabled.
    * @since OOo 3.0
    */
  var IsUndoEnabled: scala.Boolean
  /**
    * specifies how many iterations are carried out.
    *
    * This setting is only used, if iteration is enabled using {@link SpreadsheetDocumentSettings.IsIterationEnabled} .
    */
  var IterationCount: scala.Double
  /**
    * specifies the point at which a change in results will stop the iteration.
    *
    * More exactly it specifies a difference in the change of the result between two iterations. If the result difference is less than or equal to this
    * epsilon-value, the iteration is stopped.
    *
    * This setting is only used, if iteration is enabled using {@link SpreadsheetDocumentSettings.IsIterationEnabled} .
    */
  var IterationEpsilon: scala.Double
  /**
    * specifies whether column or row labels are looked up from anywhere on the sheet.
    *
    * Explicitly defined label ranges are used even if this property is set to `FALSE` .
    * @see com.sun.star.sheet.LabelRanges
    */
  var LookUpLabels: scala.Boolean
  /** specifies whether filter criteria must match entire cell contents. */
  var MatchWholeCell: scala.Boolean
  /** specifies the date that is represented by the value zero. */
  var NullDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /**
    * specifies whether changes record is enabled.
    *
    * No modification applied if the record changes protection is activated information given by {@link
    * SpreadsheetDocumentSettings.IsRecordChangesProtected}
    * @since LibreOffice 5.0
    */
  var RecordChanges: scala.Boolean
  /**
    * contains the reference device used for formatting the document.
    * @since OOo 3.0
    */
  var ReferenceDevice: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XDevice
  /**
    * specifies whether regular expressions in formulas are enabled, e.g., for functions which look up spreadsheet contents.
    *
    * RegularExpressions and Wildcards are mutually exclusive, only one can have the value `TRUE` . If both are set to `TRUE` via API calls then the last
    * one set takes precedence.
    */
  var RegularExpressions: scala.Boolean
  /** enables online spell checking. */
  var SpellOnline: scala.Boolean
  /** specifies the number of decimals in the default number format. */
  var StandardDecimals: scala.Double
  /**
    * specifies whether wildcards in formulas are enabled, e.g., for functions which look up spreadsheet contents.
    *
    * Wildcards and RegularExpressions are mutually exclusive, only one can have the value `TRUE` . If both are set to `TRUE` via API calls then the last
    * one set takes precedence.
    * @since LibreOffice 5.2
    */
  var Wildcards: scala.Boolean
}

object SpreadsheetDocumentSettings {
  @scala.inline
  def apply(
    CalcAsShown: scala.Boolean,
    CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharLocaleAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharLocaleComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    DefaultTabStop: scala.Double,
    ForbiddenCharacters: activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.XForbiddenCharacters,
    HasDrawPages: scala.Boolean,
    IgnoreCase: scala.Boolean,
    IsAdjustHeightEnabled: scala.Boolean,
    IsExecuteLinkEnabled: scala.Boolean,
    IsIterationEnabled: scala.Boolean,
    IsLoaded: scala.Boolean,
    IsRecordChangesProtected: scala.Boolean,
    IsUndoEnabled: scala.Boolean,
    IterationCount: scala.Double,
    IterationEpsilon: scala.Double,
    LookUpLabels: scala.Boolean,
    MatchWholeCell: scala.Boolean,
    NullDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RecordChanges: scala.Boolean,
    ReferenceDevice: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XDevice,
    RegularExpressions: scala.Boolean,
    SpellOnline: scala.Boolean,
    StandardDecimals: scala.Double,
    Wildcards: scala.Boolean,
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
  ): SpreadsheetDocumentSettings = {
    val __obj = js.Dynamic.literal(CalcAsShown = CalcAsShown, CharLocale = CharLocale, CharLocaleAsian = CharLocaleAsian, CharLocaleComplex = CharLocaleComplex, DefaultTabStop = DefaultTabStop, ForbiddenCharacters = ForbiddenCharacters, HasDrawPages = HasDrawPages, IgnoreCase = IgnoreCase, IsAdjustHeightEnabled = IsAdjustHeightEnabled, IsExecuteLinkEnabled = IsExecuteLinkEnabled, IsIterationEnabled = IsIterationEnabled, IsLoaded = IsLoaded, IsRecordChangesProtected = IsRecordChangesProtected, IsUndoEnabled = IsUndoEnabled, IterationCount = IterationCount, IterationEpsilon = IterationEpsilon, LookUpLabels = LookUpLabels, MatchWholeCell = MatchWholeCell, NullDate = NullDate, PropertySetInfo = PropertySetInfo, RecordChanges = RecordChanges, ReferenceDevice = ReferenceDevice, RegularExpressions = RegularExpressions, SpellOnline = SpellOnline, StandardDecimals = StandardDecimals, Wildcards = Wildcards, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[SpreadsheetDocumentSettings]
  }
}

