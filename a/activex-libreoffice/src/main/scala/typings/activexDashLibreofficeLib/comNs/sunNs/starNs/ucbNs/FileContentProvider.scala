package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The File {@link Content} Provider (FCP) implements a {@link ContentProvider} for the {@link UniversalContentBroker} (UCB).
  *
  * The served contents enable access to the local file system.
  *
  * The FCP is able to restrict access to the local file system to a number of directories shown to the client under configurable alias names.
  * @see com.sun.star.ucb.Content
  */
trait FileContentProvider
  extends XContentProvider
     with XContentIdentifierFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XFileIdentifierConverter

object FileContentProvider {
  @scala.inline
  def apply(
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => scala.Double,
    createContentIdentifier: java.lang.String => XContentIdentifier,
    getFileProviderLocality: java.lang.String => scala.Double,
    getFileURLFromSystemPath: (java.lang.String, java.lang.String) => java.lang.String,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getSystemPathFromFileURL: java.lang.String => java.lang.String,
    queryContent: XContentIdentifier => XContent,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): FileContentProvider = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), compareContentIds = js.Any.fromFunction2(compareContentIds), createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), getFileProviderLocality = js.Any.fromFunction1(getFileProviderLocality), getFileURLFromSystemPath = js.Any.fromFunction2(getFileURLFromSystemPath), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSystemPathFromFileURL = js.Any.fromFunction1(getSystemPathFromFileURL), queryContent = js.Any.fromFunction1(queryContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[FileContentProvider]
  }
}

