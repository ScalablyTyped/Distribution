package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XDevice
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs.XForbiddenCharacters
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contributes properties to control the configuration which is global for all views of a spreadsheet document.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
trait SpreadsheetDocumentSettings extends XPropertySet {
  /**
    * specifies whether calculations are performed with the rounded values displayed in cells (set to `TRUE` ) instead of the internal values (set to
    * `FALSE` ).
    */
  var CalcAsShown: Boolean
  /** contains the standard document language for Western text. */
  var CharLocale: Locale
  /** contains the standard document language for Asian text. */
  var CharLocaleAsian: Locale
  /** contains the standard document language for Complex text. */
  var CharLocaleComplex: Locale
  /** specifies the width of default tabulators. */
  var DefaultTabStop: Double
  /** contains the interface XForbiddenCharacters. */
  var ForbiddenCharacters: XForbiddenCharacters
  /**
    * If this property is set the document has DrawPages. Use this property to find out, whether the document has DrawPages or not, because the getDrawPage
    * method on the XDrawPageSupplier and the getDrawPages method on the XDrawPagesSupplier always creates the DrawPages if there are none; and this is very
    * slow and needs more memory.
    */
  var HasDrawPages: Boolean
  /** specifies whether upper and lower cases are treated as equal when comparing cells. */
  var IgnoreCase: Boolean
  /**
    * specifies whether the automatic adjustment of the row height is enabled.
    * @since OOo 3.0
    */
  var IsAdjustHeightEnabled: Boolean
  /**
    * specifies whether the automatic execution of links is enabled.
    * @since OOo 3.0
    */
  var IsExecuteLinkEnabled: Boolean
  /** enables iterated calculation of circular references. */
  var IsIterationEnabled: Boolean
  /**
    * specifies whether the document data are already loaded.
    * @since OOo 3.0
    */
  var IsLoaded: Boolean
  /**
    * specifies whether changes record is protected.
    * @since LibreOffice 5.0
    */
  var IsRecordChangesProtected: Boolean
  /**
    * specifies whether the undo command is enabled.
    * @since OOo 3.0
    */
  var IsUndoEnabled: Boolean
  /**
    * specifies how many iterations are carried out.
    *
    * This setting is only used, if iteration is enabled using {@link SpreadsheetDocumentSettings.IsIterationEnabled} .
    */
  var IterationCount: Double
  /**
    * specifies the point at which a change in results will stop the iteration.
    *
    * More exactly it specifies a difference in the change of the result between two iterations. If the result difference is less than or equal to this
    * epsilon-value, the iteration is stopped.
    *
    * This setting is only used, if iteration is enabled using {@link SpreadsheetDocumentSettings.IsIterationEnabled} .
    */
  var IterationEpsilon: Double
  /**
    * specifies whether column or row labels are looked up from anywhere on the sheet.
    *
    * Explicitly defined label ranges are used even if this property is set to `FALSE` .
    * @see com.sun.star.sheet.LabelRanges
    */
  var LookUpLabels: Boolean
  /** specifies whether filter criteria must match entire cell contents. */
  var MatchWholeCell: Boolean
  /** specifies the date that is represented by the value zero. */
  var NullDate: Date
  /**
    * specifies whether changes record is enabled.
    *
    * No modification applied if the record changes protection is activated information given by {@link
    * SpreadsheetDocumentSettings.IsRecordChangesProtected}
    * @since LibreOffice 5.0
    */
  var RecordChanges: Boolean
  /**
    * contains the reference device used for formatting the document.
    * @since OOo 3.0
    */
  var ReferenceDevice: XDevice
  /**
    * specifies whether regular expressions in formulas are enabled, e.g., for functions which look up spreadsheet contents.
    *
    * RegularExpressions and Wildcards are mutually exclusive, only one can have the value `TRUE` . If both are set to `TRUE` via API calls then the last
    * one set takes precedence.
    */
  var RegularExpressions: Boolean
  /** enables online spell checking. */
  var SpellOnline: Boolean
  /** specifies the number of decimals in the default number format. */
  var StandardDecimals: Double
  /**
    * specifies whether wildcards in formulas are enabled, e.g., for functions which look up spreadsheet contents.
    *
    * Wildcards and RegularExpressions are mutually exclusive, only one can have the value `TRUE` . If both are set to `TRUE` via API calls then the last
    * one set takes precedence.
    * @since LibreOffice 5.2
    */
  var Wildcards: Boolean
}

object SpreadsheetDocumentSettings {
  @scala.inline
  def apply(
    CalcAsShown: Boolean,
    CharLocale: Locale,
    CharLocaleAsian: Locale,
    CharLocaleComplex: Locale,
    DefaultTabStop: Double,
    ForbiddenCharacters: XForbiddenCharacters,
    HasDrawPages: Boolean,
    IgnoreCase: Boolean,
    IsAdjustHeightEnabled: Boolean,
    IsExecuteLinkEnabled: Boolean,
    IsIterationEnabled: Boolean,
    IsLoaded: Boolean,
    IsRecordChangesProtected: Boolean,
    IsUndoEnabled: Boolean,
    IterationCount: Double,
    IterationEpsilon: Double,
    LookUpLabels: Boolean,
    MatchWholeCell: Boolean,
    NullDate: Date,
    PropertySetInfo: XPropertySetInfo,
    RecordChanges: Boolean,
    ReferenceDevice: XDevice,
    RegularExpressions: Boolean,
    SpellOnline: Boolean,
    StandardDecimals: Double,
    Wildcards: Boolean,
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
  ): SpreadsheetDocumentSettings = {
    val __obj = js.Dynamic.literal(CalcAsShown = CalcAsShown, CharLocale = CharLocale, CharLocaleAsian = CharLocaleAsian, CharLocaleComplex = CharLocaleComplex, DefaultTabStop = DefaultTabStop, ForbiddenCharacters = ForbiddenCharacters, HasDrawPages = HasDrawPages, IgnoreCase = IgnoreCase, IsAdjustHeightEnabled = IsAdjustHeightEnabled, IsExecuteLinkEnabled = IsExecuteLinkEnabled, IsIterationEnabled = IsIterationEnabled, IsLoaded = IsLoaded, IsRecordChangesProtected = IsRecordChangesProtected, IsUndoEnabled = IsUndoEnabled, IterationCount = IterationCount, IterationEpsilon = IterationEpsilon, LookUpLabels = LookUpLabels, MatchWholeCell = MatchWholeCell, NullDate = NullDate, PropertySetInfo = PropertySetInfo, RecordChanges = RecordChanges, ReferenceDevice = ReferenceDevice, RegularExpressions = RegularExpressions, SpellOnline = SpellOnline, StandardDecimals = StandardDecimals, Wildcards = Wildcards, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[SpreadsheetDocumentSettings]
  }
}

