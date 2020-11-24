package typings.activexLibreoffice.com_.sun.star.text.fieldmaster

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.text.TextFieldMaster
import typings.activexLibreoffice.com_.sun.star.text.XDependentTextField
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies service of a {@link Bibliography} field master.
  * @see com.sun.star.text.TextField
  */
@js.native
trait Bibliography extends TextFieldMaster {
  
  /** determines the closing bracket used to display the bibliography text fields. */
  var BracketAfter: String = js.native
  
  /** determines the opening bracket used to display the bibliography text fields. */
  var BracketBefore: String = js.native
  
  /** determines whether the bibliography text fields are numbered. If `FALSE` the short name of the bibliography entry is displayed instead. */
  var IsNumberEntries: Boolean = js.native
  
  /**
    * determines whether the bibliography entries in a bibliography index are sorted by the document position. If `FALSE` the SortKey property determines
    * the sorting of the entries.
    */
  var IsSortByPosition: Boolean = js.native
  
  /** contains the locale of the field master */
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  
  /** contains the name of the sort algorithm that is used to sort the text fields. */
  var SortAlgorithm: String = js.native
  
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
  var SortKeys: SafeArray[PropertyValues] = js.native
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
    val __obj = js.Dynamic.literal(BracketAfter = BracketAfter.asInstanceOf[js.Any], BracketBefore = BracketBefore.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], IsNumberEntries = IsNumberEntries.asInstanceOf[js.Any], IsSortByPosition = IsSortByPosition.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SortAlgorithm = SortAlgorithm.asInstanceOf[js.Any], SortKeys = SortKeys.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[Bibliography]
  }
  
  @scala.inline
  implicit class BibliographyOps[Self <: Bibliography] (val x: Self) extends AnyVal {
    
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
    def setBracketAfter(value: String): Self = this.set("BracketAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBracketBefore(value: String): Self = this.set("BracketBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNumberEntries(value: Boolean): Self = this.set("IsNumberEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSortByPosition(value: Boolean): Self = this.set("IsSortByPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: Locale): Self = this.set("Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortAlgorithm(value: String): Self = this.set("SortAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortKeys(value: SafeArray[PropertyValues]): Self = this.set("SortKeys", value.asInstanceOf[js.Any])
  }
}
