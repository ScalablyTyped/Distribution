package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a {@link Bibliography} field master.
  * @see com.sun.star.text.TextField
  */
trait Bibliography
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFieldMaster {
  /** determines the closing bracket used to display the bibliography text fields. */
  var BracketAfter: java.lang.String
  /** determines the opening bracket used to display the bibliography text fields. */
  var BracketBefore: java.lang.String
  /** determines whether the bibliography text fields are numbered. If `FALSE` the short name of the bibliography entry is displayed instead. */
  var IsNumberEntries: scala.Boolean
  /**
    * determines whether the bibliography entries in a bibliography index are sorted by the document position. If `FALSE` the SortKey property determines
    * the sorting of the entries.
    */
  var IsSortByPosition: scala.Boolean
  /** contains the locale of the field master */
  var Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** contains the name of the sort algorithm that is used to sort the text fields. */
  var SortAlgorithm: java.lang.String
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
  var SortKeys: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues]
}

object Bibliography {
  @scala.inline
  def apply(
    BracketAfter: java.lang.String,
    BracketBefore: java.lang.String,
    DependentTextFields: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XDependentTextField],
    InstanceName: java.lang.String,
    IsNumberEntries: scala.Boolean,
    IsSortByPosition: scala.Boolean,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Name: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SortAlgorithm: java.lang.String,
    SortKeys: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues],
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
  ): Bibliography = {
    val __obj = js.Dynamic.literal(BracketAfter = BracketAfter, BracketBefore = BracketBefore, DependentTextFields = DependentTextFields, InstanceName = InstanceName, IsNumberEntries = IsNumberEntries, IsSortByPosition = IsSortByPosition, Locale = Locale, Name = Name, PropertySetInfo = PropertySetInfo, SortAlgorithm = SortAlgorithm, SortKeys = SortKeys, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[Bibliography]
  }
}

