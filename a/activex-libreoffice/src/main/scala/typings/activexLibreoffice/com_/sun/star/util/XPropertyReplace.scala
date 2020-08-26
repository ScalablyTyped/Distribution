package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to search and replace properties. */
@js.native
trait XPropertyReplace extends XReplaceDescriptor {
  /** @returns the attribute values which are used to replace the found occurrences. */
  var ReplaceAttributes: SafeArray[PropertyValue] = js.native
  /** @returns the attributes to search for. */
  var SearchAttributes: SafeArray[PropertyValue] = js.native
  /** provides the information if specific property values are searched, or just the existence of the specified properties. */
  var ValueSearch: Boolean = js.native
  /** @returns the attribute values which are used to replace the found occurrences. */
  def getReplaceAttributes(): SafeArray[PropertyValue] = js.native
  /** @returns the attributes to search for. */
  def getSearchAttributes(): SafeArray[PropertyValue] = js.native
  /** provides the information if specific property values are searched, or just the existence of the specified properties. */
  def getValueSearch(): Boolean = js.native
  /** sets the properties to replace the found occurrences. */
  def setReplaceAttributes(aSearchAttribs: SeqEquiv[PropertyValue]): Unit = js.native
  /** sets the properties to search for. */
  def setSearchAttributes(aSearchAttribs: SeqEquiv[PropertyValue]): Unit = js.native
  /** specifies if specific property values are searched, or just the existence of the specified properties. */
  def setValueSearch(bValueSearch: Boolean): Unit = js.native
}

object XPropertyReplace {
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    ReplaceAttributes: SafeArray[PropertyValue],
    ReplaceString: String,
    SearchAttributes: SafeArray[PropertyValue],
    SearchString: String,
    ValueSearch: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getReplaceAttributes: () => SafeArray[PropertyValue],
    getReplaceString: () => String,
    getSearchAttributes: () => SafeArray[PropertyValue],
    getSearchString: () => String,
    getValueSearch: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setReplaceAttributes: SeqEquiv[PropertyValue] => Unit,
    setReplaceString: String => Unit,
    setSearchAttributes: SeqEquiv[PropertyValue] => Unit,
    setSearchString: String => Unit,
    setValueSearch: Boolean => Unit
  ): XPropertyReplace = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReplaceAttributes = ReplaceAttributes.asInstanceOf[js.Any], ReplaceString = ReplaceString.asInstanceOf[js.Any], SearchAttributes = SearchAttributes.asInstanceOf[js.Any], SearchString = SearchString.asInstanceOf[js.Any], ValueSearch = ValueSearch.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReplaceAttributes = js.Any.fromFunction0(getReplaceAttributes), getReplaceString = js.Any.fromFunction0(getReplaceString), getSearchAttributes = js.Any.fromFunction0(getSearchAttributes), getSearchString = js.Any.fromFunction0(getSearchString), getValueSearch = js.Any.fromFunction0(getValueSearch), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setReplaceAttributes = js.Any.fromFunction1(setReplaceAttributes), setReplaceString = js.Any.fromFunction1(setReplaceString), setSearchAttributes = js.Any.fromFunction1(setSearchAttributes), setSearchString = js.Any.fromFunction1(setSearchString), setValueSearch = js.Any.fromFunction1(setValueSearch))
    __obj.asInstanceOf[XPropertyReplace]
  }
  @scala.inline
  implicit class XPropertyReplaceOps[Self <: XPropertyReplace] (val x: Self) extends AnyVal {
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
    def setReplaceAttributes(value: SafeArray[PropertyValue]): Self = this.set("ReplaceAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchAttributes(value: SafeArray[PropertyValue]): Self = this.set("SearchAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueSearch(value: Boolean): Self = this.set("ValueSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetReplaceAttributes(value: () => SafeArray[PropertyValue]): Self = this.set("getReplaceAttributes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSearchAttributes(value: () => SafeArray[PropertyValue]): Self = this.set("getSearchAttributes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValueSearch(value: () => Boolean): Self = this.set("getValueSearch", js.Any.fromFunction0(value))
    @scala.inline
    def setSetReplaceAttributes(value: SeqEquiv[PropertyValue] => Unit): Self = this.set("setReplaceAttributes", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSearchAttributes(value: SeqEquiv[PropertyValue] => Unit): Self = this.set("setSearchAttributes", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValueSearch(value: Boolean => Unit): Self = this.set("setValueSearch", js.Any.fromFunction1(value))
  }
  
}

