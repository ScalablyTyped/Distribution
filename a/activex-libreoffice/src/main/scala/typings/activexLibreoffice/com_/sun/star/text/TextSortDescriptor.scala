package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.util.SortDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes sort criteria for sorting text.
  * @deprecated Deprecated
  */
trait TextSortDescriptor extends SortDescriptor {
  /** contains the character that marks the separation of columns. */
  var Delimiter: String
  /** determines if the sorting in the first search key is done in ascending or descending order. */
  var IsSortAscending0: Boolean
  /** determines if the sorting in the second search key is done in ascending or descending order. */
  var IsSortAscending1: Boolean
  /** determines if the sorting in the third search key is done in ascending or descending order. */
  var IsSortAscending2: Boolean
  /** determines if the content of a table is to be sorted. */
  var IsSortInTable: Boolean
  /** determines if the sorting in the first search key is done numeric or alphanumeric order. */
  var IsSortNumeric0: Boolean
  /** determines if the sorting in the second search key is done in numeric or alphanumeric order. */
  var IsSortNumeric1: Boolean
  /** determines if the sorting in the third search key is done in numeric or alphanumeric order. */
  var IsSortNumeric2: Boolean
  /** contains the row or column index used in the first search key. */
  var SortRowOrColumnNo0: Double
  /** contains the row or column index used in the second search key. */
  var SortRowOrColumnNo1: Double
  /** contains the row or column index used in the third search key. */
  var SortRowOrColumnNo2: Double
}

object TextSortDescriptor {
  @scala.inline
  def apply(
    CollatorAlgorithm: String,
    CollatorLocale: Locale,
    Delimiter: String,
    IsCaseSensitive: Boolean,
    IsSortAscending0: Boolean,
    IsSortAscending1: Boolean,
    IsSortAscending2: Boolean,
    IsSortInTable: Boolean,
    IsSortNumeric0: Boolean,
    IsSortNumeric1: Boolean,
    IsSortNumeric2: Boolean,
    PropertySetInfo: XPropertySetInfo,
    SortAscending: Boolean,
    SortColumns: Boolean,
    SortRowOrColumnNo0: Double,
    SortRowOrColumnNo1: Double,
    SortRowOrColumnNo2: Double,
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
  ): TextSortDescriptor = {
    val __obj = js.Dynamic.literal(CollatorAlgorithm = CollatorAlgorithm.asInstanceOf[js.Any], CollatorLocale = CollatorLocale.asInstanceOf[js.Any], Delimiter = Delimiter.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any], IsSortAscending0 = IsSortAscending0.asInstanceOf[js.Any], IsSortAscending1 = IsSortAscending1.asInstanceOf[js.Any], IsSortAscending2 = IsSortAscending2.asInstanceOf[js.Any], IsSortInTable = IsSortInTable.asInstanceOf[js.Any], IsSortNumeric0 = IsSortNumeric0.asInstanceOf[js.Any], IsSortNumeric1 = IsSortNumeric1.asInstanceOf[js.Any], IsSortNumeric2 = IsSortNumeric2.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any], SortColumns = SortColumns.asInstanceOf[js.Any], SortRowOrColumnNo0 = SortRowOrColumnNo0.asInstanceOf[js.Any], SortRowOrColumnNo1 = SortRowOrColumnNo1.asInstanceOf[js.Any], SortRowOrColumnNo2 = SortRowOrColumnNo2.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[TextSortDescriptor]
  }
}

