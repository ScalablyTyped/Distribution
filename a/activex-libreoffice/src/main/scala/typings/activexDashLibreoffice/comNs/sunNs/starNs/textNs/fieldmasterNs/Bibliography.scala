package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.fieldmasterNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValues
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.TextFieldMaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XDependentTextField
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a {@link Bibliography} field master.
  * @see com.sun.star.text.TextField
  */
trait Bibliography extends TextFieldMaster {
  /** determines the closing bracket used to display the bibliography text fields. */
  var BracketAfter: String
  /** determines the opening bracket used to display the bibliography text fields. */
  var BracketBefore: String
  /** determines whether the bibliography text fields are numbered. If `FALSE` the short name of the bibliography entry is displayed instead. */
  var IsNumberEntries: Boolean
  /**
    * determines whether the bibliography entries in a bibliography index are sorted by the document position. If `FALSE` the SortKey property determines
    * the sorting of the entries.
    */
  var IsSortByPosition: Boolean
  /** contains the locale of the field master */
  var Locale: typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
  /** contains the name of the sort algorithm that is used to sort the text fields. */
  var SortAlgorithm: String
  /**
    * determines the sorting of the bibliography entries in a bibliography index. This property is used if the property IsSortByPosition is not set. Each
    * contained element of the sequence is a sequence of the following two properties:
    *
    * [property] short SortKey;
    *
    *
    *
    * Determines the bibliography field that is used to sort by.
    *
    *
    *
    * [property] boolean IsSortAscending;
    *
    *
    *
    * Determines whether the sorting is ascending or descending. It uses the type {@link com.sun.star.text.BibliographyDataField}
    */
  var SortKeys: SafeArray[PropertyValues]
}

object Bibliography {
  @scala.inline
  def apply(
    BracketAfter: String,
    BracketBefore: String,
    DependentTextFields: SafeArray[XDependentTextField],
    InstanceName: String,
    IsNumberEntries: Boolean,
    IsSortByPosition: Boolean,
    Locale: Locale,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    SortAlgorithm: String,
    SortKeys: SafeArray[PropertyValues],
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
  ): Bibliography = {
    val __obj = js.Dynamic.literal(BracketAfter = BracketAfter, BracketBefore = BracketBefore, DependentTextFields = DependentTextFields, InstanceName = InstanceName, IsNumberEntries = IsNumberEntries, IsSortByPosition = IsSortByPosition, Locale = Locale, Name = Name, PropertySetInfo = PropertySetInfo, SortAlgorithm = SortAlgorithm, SortKeys = SortKeys, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Bibliography]
  }
}

