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

