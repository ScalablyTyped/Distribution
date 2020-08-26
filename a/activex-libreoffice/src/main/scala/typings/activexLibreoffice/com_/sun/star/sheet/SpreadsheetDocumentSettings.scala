package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XDevice
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.i18n.XForbiddenCharacters
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.util.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contributes properties to control the configuration which is global for all views of a spreadsheet document.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
@js.native
trait SpreadsheetDocumentSettings extends XPropertySet {
  /**
    * specifies whether calculations are performed with the rounded values displayed in cells (set to `TRUE` ) instead of the internal values (set to
    * `FALSE` ).
    */
  var CalcAsShown: Boolean = js.native
  /** contains the standard document language for Western text. */
  var CharLocale: Locale = js.native
  /** contains the standard document language for Asian text. */
  var CharLocaleAsian: Locale = js.native
  /** contains the standard document language for Complex text. */
  var CharLocaleComplex: Locale = js.native
  /** specifies the width of default tabulators. */
  var DefaultTabStop: Double = js.native
  /** contains the interface XForbiddenCharacters. */
  var ForbiddenCharacters: XForbiddenCharacters = js.native
  /**
    * If this property is set the document has DrawPages. Use this property to find out, whether the document has DrawPages or not, because the getDrawPage
    * method on the XDrawPageSupplier and the getDrawPages method on the XDrawPagesSupplier always creates the DrawPages if there are none; and this is very
    * slow and needs more memory.
    */
  var HasDrawPages: Boolean = js.native
  /** specifies whether upper and lower cases are treated as equal when comparing cells. */
  var IgnoreCase: Boolean = js.native
  /**
    * specifies whether the automatic adjustment of the row height is enabled.
    * @since OOo 3.0
    */
  var IsAdjustHeightEnabled: Boolean = js.native
  /**
    * specifies whether the automatic execution of links is enabled.
    * @since OOo 3.0
    */
  var IsExecuteLinkEnabled: Boolean = js.native
  /** enables iterated calculation of circular references. */
  var IsIterationEnabled: Boolean = js.native
  /**
    * specifies whether the document data are already loaded.
    * @since OOo 3.0
    */
  var IsLoaded: Boolean = js.native
  /**
    * specifies whether changes record is protected.
    * @since LibreOffice 5.0
    */
  var IsRecordChangesProtected: Boolean = js.native
  /**
    * specifies whether the undo command is enabled.
    * @since OOo 3.0
    */
  var IsUndoEnabled: Boolean = js.native
  /**
    * specifies how many iterations are carried out.
    *
    * This setting is only used, if iteration is enabled using {@link SpreadsheetDocumentSettings.IsIterationEnabled} .
    */
  var IterationCount: Double = js.native
  /**
    * specifies the point at which a change in results will stop the iteration.
    *
    * More exactly it specifies a difference in the change of the result between two iterations. If the result difference is less than or equal to this
    * epsilon-value, the iteration is stopped.
    *
    * This setting is only used, if iteration is enabled using {@link SpreadsheetDocumentSettings.IsIterationEnabled} .
    */
  var IterationEpsilon: Double = js.native
  /**
    * specifies whether column or row labels are looked up from anywhere on the sheet.
    *
    * Explicitly defined label ranges are used even if this property is set to `FALSE` .
    * @see com.sun.star.sheet.LabelRanges
    */
  var LookUpLabels: Boolean = js.native
  /** specifies whether filter criteria must match entire cell contents. */
  var MatchWholeCell: Boolean = js.native
  /** specifies the date that is represented by the value zero. */
  var NullDate: Date = js.native
  /**
    * specifies whether changes record is enabled.
    *
    * No modification applied if the record changes protection is activated information given by {@link
    * SpreadsheetDocumentSettings.IsRecordChangesProtected}
    * @since LibreOffice 5.0
    */
  var RecordChanges: Boolean = js.native
  /**
    * contains the reference device used for formatting the document.
    * @since OOo 3.0
    */
  var ReferenceDevice: XDevice = js.native
  /**
    * specifies whether regular expressions in formulas are enabled, e.g., for functions which look up spreadsheet contents.
    *
    * RegularExpressions and Wildcards are mutually exclusive, only one can have the value `TRUE` . If both are set to `TRUE` via API calls then the last
    * one set takes precedence.
    */
  var RegularExpressions: Boolean = js.native
  /** enables online spell checking. */
  var SpellOnline: Boolean = js.native
  /** specifies the number of decimals in the default number format. */
  var StandardDecimals: Double = js.native
  /**
    * specifies whether wildcards in formulas are enabled, e.g., for functions which look up spreadsheet contents.
    *
    * Wildcards and RegularExpressions are mutually exclusive, only one can have the value `TRUE` . If both are set to `TRUE` via API calls then the last
    * one set takes precedence.
    * @since LibreOffice 5.2
    */
  var Wildcards: Boolean = js.native
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
    val __obj = js.Dynamic.literal(CalcAsShown = CalcAsShown.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], DefaultTabStop = DefaultTabStop.asInstanceOf[js.Any], ForbiddenCharacters = ForbiddenCharacters.asInstanceOf[js.Any], HasDrawPages = HasDrawPages.asInstanceOf[js.Any], IgnoreCase = IgnoreCase.asInstanceOf[js.Any], IsAdjustHeightEnabled = IsAdjustHeightEnabled.asInstanceOf[js.Any], IsExecuteLinkEnabled = IsExecuteLinkEnabled.asInstanceOf[js.Any], IsIterationEnabled = IsIterationEnabled.asInstanceOf[js.Any], IsLoaded = IsLoaded.asInstanceOf[js.Any], IsRecordChangesProtected = IsRecordChangesProtected.asInstanceOf[js.Any], IsUndoEnabled = IsUndoEnabled.asInstanceOf[js.Any], IterationCount = IterationCount.asInstanceOf[js.Any], IterationEpsilon = IterationEpsilon.asInstanceOf[js.Any], LookUpLabels = LookUpLabels.asInstanceOf[js.Any], MatchWholeCell = MatchWholeCell.asInstanceOf[js.Any], NullDate = NullDate.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RecordChanges = RecordChanges.asInstanceOf[js.Any], ReferenceDevice = ReferenceDevice.asInstanceOf[js.Any], RegularExpressions = RegularExpressions.asInstanceOf[js.Any], SpellOnline = SpellOnline.asInstanceOf[js.Any], StandardDecimals = StandardDecimals.asInstanceOf[js.Any], Wildcards = Wildcards.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[SpreadsheetDocumentSettings]
  }
  @scala.inline
  implicit class SpreadsheetDocumentSettingsOps[Self <: SpreadsheetDocumentSettings] (val x: Self) extends AnyVal {
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
    def setCalcAsShown(value: Boolean): Self = this.set("CalcAsShown", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharLocale(value: Locale): Self = this.set("CharLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharLocaleAsian(value: Locale): Self = this.set("CharLocaleAsian", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharLocaleComplex(value: Locale): Self = this.set("CharLocaleComplex", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultTabStop(value: Double): Self = this.set("DefaultTabStop", value.asInstanceOf[js.Any])
    @scala.inline
    def setForbiddenCharacters(value: XForbiddenCharacters): Self = this.set("ForbiddenCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasDrawPages(value: Boolean): Self = this.set("HasDrawPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("IgnoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAdjustHeightEnabled(value: Boolean): Self = this.set("IsAdjustHeightEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExecuteLinkEnabled(value: Boolean): Self = this.set("IsExecuteLinkEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIterationEnabled(value: Boolean): Self = this.set("IsIterationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoaded(value: Boolean): Self = this.set("IsLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRecordChangesProtected(value: Boolean): Self = this.set("IsRecordChangesProtected", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsUndoEnabled(value: Boolean): Self = this.set("IsUndoEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterationCount(value: Double): Self = this.set("IterationCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterationEpsilon(value: Double): Self = this.set("IterationEpsilon", value.asInstanceOf[js.Any])
    @scala.inline
    def setLookUpLabels(value: Boolean): Self = this.set("LookUpLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchWholeCell(value: Boolean): Self = this.set("MatchWholeCell", value.asInstanceOf[js.Any])
    @scala.inline
    def setNullDate(value: Date): Self = this.set("NullDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordChanges(value: Boolean): Self = this.set("RecordChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceDevice(value: XDevice): Self = this.set("ReferenceDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegularExpressions(value: Boolean): Self = this.set("RegularExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpellOnline(value: Boolean): Self = this.set("SpellOnline", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandardDecimals(value: Double): Self = this.set("StandardDecimals", value.asInstanceOf[js.Any])
    @scala.inline
    def setWildcards(value: Boolean): Self = this.set("Wildcards", value.asInstanceOf[js.Any])
  }
  
}

