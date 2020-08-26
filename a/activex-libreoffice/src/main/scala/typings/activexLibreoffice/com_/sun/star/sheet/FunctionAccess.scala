package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XDevice
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.i18n.XForbiddenCharacters
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.util.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows generic access to all spreadsheet functions. */
@js.native
trait FunctionAccess
  extends SpreadsheetDocumentSettings
     with XFunctionAccess {
  /**
    * specifies whether the function call is performed as array function call.
    *
    * If set to `TRUE` , the result of the function call will be calculated similar to array formulas in a spreadsheet document. The return value of the
    * function call will usually be a sequence of sequences containing the values of the resulting array. Example: If the function ABS is called for a 3x2
    * cell range, the result will be a 3x2 array containing the absolute values of the numbers contained in the specified cell range.
    *
    * If set to `FALSE` , the result of the function call will be calculated similar to simple cell formulas in a spreadsheet document. The return value of
    * the function call will usually be a single value. Of course, some functions always return an array, for example the MUNIT function.
    *
    * For compatibility with older versions, the default value of this property is `TRUE` .
    * @since OOo 3.3
    */
  var IsArrayFunction: Boolean = js.native
}

object FunctionAccess {
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
    IsArrayFunction: Boolean,
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
    callFunction: (String, SeqEquiv[_]) => js.Any,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): FunctionAccess = {
    val __obj = js.Dynamic.literal(CalcAsShown = CalcAsShown.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], DefaultTabStop = DefaultTabStop.asInstanceOf[js.Any], ForbiddenCharacters = ForbiddenCharacters.asInstanceOf[js.Any], HasDrawPages = HasDrawPages.asInstanceOf[js.Any], IgnoreCase = IgnoreCase.asInstanceOf[js.Any], IsAdjustHeightEnabled = IsAdjustHeightEnabled.asInstanceOf[js.Any], IsArrayFunction = IsArrayFunction.asInstanceOf[js.Any], IsExecuteLinkEnabled = IsExecuteLinkEnabled.asInstanceOf[js.Any], IsIterationEnabled = IsIterationEnabled.asInstanceOf[js.Any], IsLoaded = IsLoaded.asInstanceOf[js.Any], IsRecordChangesProtected = IsRecordChangesProtected.asInstanceOf[js.Any], IsUndoEnabled = IsUndoEnabled.asInstanceOf[js.Any], IterationCount = IterationCount.asInstanceOf[js.Any], IterationEpsilon = IterationEpsilon.asInstanceOf[js.Any], LookUpLabels = LookUpLabels.asInstanceOf[js.Any], MatchWholeCell = MatchWholeCell.asInstanceOf[js.Any], NullDate = NullDate.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RecordChanges = RecordChanges.asInstanceOf[js.Any], ReferenceDevice = ReferenceDevice.asInstanceOf[js.Any], RegularExpressions = RegularExpressions.asInstanceOf[js.Any], SpellOnline = SpellOnline.asInstanceOf[js.Any], StandardDecimals = StandardDecimals.asInstanceOf[js.Any], Wildcards = Wildcards.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), callFunction = js.Any.fromFunction2(callFunction), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[FunctionAccess]
  }
  @scala.inline
  implicit class FunctionAccessOps[Self <: FunctionAccess] (val x: Self) extends AnyVal {
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
    def setIsArrayFunction(value: Boolean): Self = this.set("IsArrayFunction", value.asInstanceOf[js.Any])
  }
  
}

