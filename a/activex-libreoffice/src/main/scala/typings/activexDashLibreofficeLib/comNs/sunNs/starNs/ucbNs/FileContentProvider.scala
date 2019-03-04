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
    compareContentIds: js.Function2[XContentIdentifier, XContentIdentifier, scala.Double],
    createContentIdentifier: js.Function1[java.lang.String, XContentIdentifier],
    getFileProviderLocality: js.Function1[java.lang.String, scala.Double],
    getFileURLFromSystemPath: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSystemPathFromFileURL: js.Function1[java.lang.String, java.lang.String],
    queryContent: js.Function1[XContentIdentifier, XContent],
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
  ): FileContentProvider = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, compareContentIds = compareContentIds, createContentIdentifier = createContentIdentifier, getFileProviderLocality = getFileProviderLocality, getFileURLFromSystemPath = getFileURLFromSystemPath, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getSystemPathFromFileURL = getSystemPathFromFileURL, queryContent = queryContent, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[FileContentProvider]
  }
}

