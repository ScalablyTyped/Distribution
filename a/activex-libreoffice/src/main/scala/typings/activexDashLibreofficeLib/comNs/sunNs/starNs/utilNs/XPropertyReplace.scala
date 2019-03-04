package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to search and replace properties. */
trait XPropertyReplace extends XReplaceDescriptor {
  /** @returns the attribute values which are used to replace the found occurrences. */
  var ReplaceAttributes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** @returns the attributes to search for. */
  var SearchAttributes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** provides the information if specific property values are searched, or just the existence of the specified properties. */
  var ValueSearch: scala.Boolean
  /** @returns the attribute values which are used to replace the found occurrences. */
  def getReplaceAttributes(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** @returns the attributes to search for. */
  def getSearchAttributes(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** provides the information if specific property values are searched, or just the existence of the specified properties. */
  def getValueSearch(): scala.Boolean
  /** sets the properties to replace the found occurrences. */
  def setReplaceAttributes(
    aSearchAttribs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /** sets the properties to search for. */
  def setSearchAttributes(
    aSearchAttribs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /** specifies if specific property values are searched, or just the existence of the specified properties. */
  def setValueSearch(bValueSearch: scala.Boolean): scala.Unit
}

object XPropertyReplace {
  @scala.inline
  def apply(
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReplaceAttributes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    ReplaceString: java.lang.String,
    SearchAttributes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    SearchString: java.lang.String,
    ValueSearch: scala.Boolean,
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
    getReplaceAttributes: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getReplaceString: js.Function0[java.lang.String],
    getSearchAttributes: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getSearchString: js.Function0[java.lang.String],
    getValueSearch: js.Function0[scala.Boolean],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setReplaceAttributes: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    setReplaceString: js.Function1[java.lang.String, scala.Unit],
    setSearchAttributes: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    setSearchString: js.Function1[java.lang.String, scala.Unit],
    setValueSearch: js.Function1[scala.Boolean, scala.Unit]
  ): XPropertyReplace = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, ReplaceAttributes = ReplaceAttributes, ReplaceString = ReplaceString, SearchAttributes = SearchAttributes, SearchString = SearchString, ValueSearch = ValueSearch, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getReplaceAttributes = getReplaceAttributes, getReplaceString = getReplaceString, getSearchAttributes = getSearchAttributes, getSearchString = getSearchString, getValueSearch = getValueSearch, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setReplaceAttributes = setReplaceAttributes, setReplaceString = setReplaceString, setSearchAttributes = setSearchAttributes, setSearchString = setSearchString, setValueSearch = setValueSearch)
  
    __obj.asInstanceOf[XPropertyReplace]
  }
}

