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
trait XPropertyReplace extends XReplaceDescriptor {
  /** @returns the attribute values which are used to replace the found occurrences. */
  var ReplaceAttributes: SafeArray[PropertyValue]
  /** @returns the attributes to search for. */
  var SearchAttributes: SafeArray[PropertyValue]
  /** provides the information if specific property values are searched, or just the existence of the specified properties. */
  var ValueSearch: Boolean
  /** @returns the attribute values which are used to replace the found occurrences. */
  def getReplaceAttributes(): SafeArray[PropertyValue]
  /** @returns the attributes to search for. */
  def getSearchAttributes(): SafeArray[PropertyValue]
  /** provides the information if specific property values are searched, or just the existence of the specified properties. */
  def getValueSearch(): Boolean
  /** sets the properties to replace the found occurrences. */
  def setReplaceAttributes(aSearchAttribs: SeqEquiv[PropertyValue]): Unit
  /** sets the properties to search for. */
  def setSearchAttributes(aSearchAttribs: SeqEquiv[PropertyValue]): Unit
  /** specifies if specific property values are searched, or just the existence of the specified properties. */
  def setValueSearch(bValueSearch: Boolean): Unit
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
}

