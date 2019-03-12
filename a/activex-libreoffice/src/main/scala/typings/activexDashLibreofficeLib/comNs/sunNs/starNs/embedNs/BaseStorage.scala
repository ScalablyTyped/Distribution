package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a service that allows to get access to a storage hierarchy. */
trait BaseStorage
  extends XStorage
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * allows to get the mode the storage is opened in.
    *
    * Can be a combination of values from {@link ElementModes} .
    */
  var OpenMode: scala.Double
  /** allows to retrieve URL the storage is based on. */
  var URL: java.lang.String
}

object BaseStorage {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    OpenMode: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    URL: java.lang.String,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    cloneEncryptedStreamElement: (java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    cloneStreamElement: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    copyElementTo: (java.lang.String, XStorage, java.lang.String) => scala.Unit,
    copyLastCommitTo: XStorage => scala.Unit,
    copyStorageElementLastCommitTo: (java.lang.String, XStorage) => scala.Unit,
    copyToStorage: XStorage => scala.Unit,
    dispose: () => scala.Unit,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    isStorageElement: java.lang.String => scala.Boolean,
    isStreamElement: java.lang.String => scala.Boolean,
    moveElementTo: (java.lang.String, XStorage, java.lang.String) => scala.Unit,
    openEncryptedStreamElement: (java.lang.String, scala.Double, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    openStorageElement: (java.lang.String, scala.Double) => XStorage,
    openStreamElement: (java.lang.String, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeElement: java.lang.String => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    renameElement: (java.lang.String, java.lang.String) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): BaseStorage = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, OpenMode = OpenMode, PropertySetInfo = PropertySetInfo, URL = URL, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cloneEncryptedStreamElement = js.Any.fromFunction2(cloneEncryptedStreamElement), cloneStreamElement = js.Any.fromFunction1(cloneStreamElement), copyElementTo = js.Any.fromFunction3(copyElementTo), copyLastCommitTo = js.Any.fromFunction1(copyLastCommitTo), copyStorageElementLastCommitTo = js.Any.fromFunction2(copyStorageElementLastCommitTo), copyToStorage = js.Any.fromFunction1(copyToStorage), dispose = js.Any.fromFunction0(dispose), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isStorageElement = js.Any.fromFunction1(isStorageElement), isStreamElement = js.Any.fromFunction1(isStreamElement), moveElementTo = js.Any.fromFunction3(moveElementTo), openEncryptedStreamElement = js.Any.fromFunction3(openEncryptedStreamElement), openStorageElement = js.Any.fromFunction2(openStorageElement), openStreamElement = js.Any.fromFunction2(openStreamElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeElement = js.Any.fromFunction1(removeElement), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), renameElement = js.Any.fromFunction2(renameElement), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[BaseStorage]
  }
}

