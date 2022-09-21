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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contributes properties to control the configuration which is global for all views of a spreadsheet document.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
trait SpreadsheetDocumentSettings
  extends StObject
     with XPropertySet {
  
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
  
  inline def apply(
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
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit
  ): SpreadsheetDocumentSettings = {
    val __obj = js.Dynamic.literal(CalcAsShown = CalcAsShown.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], DefaultTabStop = DefaultTabStop.asInstanceOf[js.Any], ForbiddenCharacters = ForbiddenCharacters.asInstanceOf[js.Any], HasDrawPages = HasDrawPages.asInstanceOf[js.Any], IgnoreCase = IgnoreCase.asInstanceOf[js.Any], IsAdjustHeightEnabled = IsAdjustHeightEnabled.asInstanceOf[js.Any], IsExecuteLinkEnabled = IsExecuteLinkEnabled.asInstanceOf[js.Any], IsIterationEnabled = IsIterationEnabled.asInstanceOf[js.Any], IsLoaded = IsLoaded.asInstanceOf[js.Any], IsRecordChangesProtected = IsRecordChangesProtected.asInstanceOf[js.Any], IsUndoEnabled = IsUndoEnabled.asInstanceOf[js.Any], IterationCount = IterationCount.asInstanceOf[js.Any], IterationEpsilon = IterationEpsilon.asInstanceOf[js.Any], LookUpLabels = LookUpLabels.asInstanceOf[js.Any], MatchWholeCell = MatchWholeCell.asInstanceOf[js.Any], NullDate = NullDate.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RecordChanges = RecordChanges.asInstanceOf[js.Any], ReferenceDevice = ReferenceDevice.asInstanceOf[js.Any], RegularExpressions = RegularExpressions.asInstanceOf[js.Any], SpellOnline = SpellOnline.asInstanceOf[js.Any], StandardDecimals = StandardDecimals.asInstanceOf[js.Any], Wildcards = Wildcards.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[SpreadsheetDocumentSettings]
  }
  
  extension [Self <: SpreadsheetDocumentSettings](x: Self) {
    
    inline def setCalcAsShown(value: Boolean): Self = StObject.set(x, "CalcAsShown", value.asInstanceOf[js.Any])
    
    inline def setCharLocale(value: Locale): Self = StObject.set(x, "CharLocale", value.asInstanceOf[js.Any])
    
    inline def setCharLocaleAsian(value: Locale): Self = StObject.set(x, "CharLocaleAsian", value.asInstanceOf[js.Any])
    
    inline def setCharLocaleComplex(value: Locale): Self = StObject.set(x, "CharLocaleComplex", value.asInstanceOf[js.Any])
    
    inline def setDefaultTabStop(value: Double): Self = StObject.set(x, "DefaultTabStop", value.asInstanceOf[js.Any])
    
    inline def setForbiddenCharacters(value: XForbiddenCharacters): Self = StObject.set(x, "ForbiddenCharacters", value.asInstanceOf[js.Any])
    
    inline def setHasDrawPages(value: Boolean): Self = StObject.set(x, "HasDrawPages", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "IgnoreCase", value.asInstanceOf[js.Any])
    
    inline def setIsAdjustHeightEnabled(value: Boolean): Self = StObject.set(x, "IsAdjustHeightEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsExecuteLinkEnabled(value: Boolean): Self = StObject.set(x, "IsExecuteLinkEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsIterationEnabled(value: Boolean): Self = StObject.set(x, "IsIterationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsLoaded(value: Boolean): Self = StObject.set(x, "IsLoaded", value.asInstanceOf[js.Any])
    
    inline def setIsRecordChangesProtected(value: Boolean): Self = StObject.set(x, "IsRecordChangesProtected", value.asInstanceOf[js.Any])
    
    inline def setIsUndoEnabled(value: Boolean): Self = StObject.set(x, "IsUndoEnabled", value.asInstanceOf[js.Any])
    
    inline def setIterationCount(value: Double): Self = StObject.set(x, "IterationCount", value.asInstanceOf[js.Any])
    
    inline def setIterationEpsilon(value: Double): Self = StObject.set(x, "IterationEpsilon", value.asInstanceOf[js.Any])
    
    inline def setLookUpLabels(value: Boolean): Self = StObject.set(x, "LookUpLabels", value.asInstanceOf[js.Any])
    
    inline def setMatchWholeCell(value: Boolean): Self = StObject.set(x, "MatchWholeCell", value.asInstanceOf[js.Any])
    
    inline def setNullDate(value: Date): Self = StObject.set(x, "NullDate", value.asInstanceOf[js.Any])
    
    inline def setRecordChanges(value: Boolean): Self = StObject.set(x, "RecordChanges", value.asInstanceOf[js.Any])
    
    inline def setReferenceDevice(value: XDevice): Self = StObject.set(x, "ReferenceDevice", value.asInstanceOf[js.Any])
    
    inline def setRegularExpressions(value: Boolean): Self = StObject.set(x, "RegularExpressions", value.asInstanceOf[js.Any])
    
    inline def setSpellOnline(value: Boolean): Self = StObject.set(x, "SpellOnline", value.asInstanceOf[js.Any])
    
    inline def setStandardDecimals(value: Double): Self = StObject.set(x, "StandardDecimals", value.asInstanceOf[js.Any])
    
    inline def setWildcards(value: Boolean): Self = StObject.set(x, "Wildcards", value.asInstanceOf[js.Any])
  }
}
