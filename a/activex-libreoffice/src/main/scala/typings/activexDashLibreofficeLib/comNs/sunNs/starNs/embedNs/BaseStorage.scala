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
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    OpenMode: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    URL: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
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
    cloneEncryptedStreamElement: js.Function2[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
    ],
    cloneStreamElement: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream],
    copyElementTo: js.Function3[java.lang.String, XStorage, java.lang.String, scala.Unit],
    copyLastCommitTo: js.Function1[XStorage, scala.Unit],
    copyStorageElementLastCommitTo: js.Function2[java.lang.String, XStorage, scala.Unit],
    copyToStorage: js.Function1[XStorage, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    isStorageElement: js.Function1[java.lang.String, scala.Boolean],
    isStreamElement: js.Function1[java.lang.String, scala.Boolean],
    moveElementTo: js.Function3[java.lang.String, XStorage, java.lang.String, scala.Unit],
    openEncryptedStreamElement: js.Function3[
      java.lang.String, 
      scala.Double, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
    ],
    openStorageElement: js.Function2[java.lang.String, scala.Double, XStorage],
    openStreamElement: js.Function2[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeElement: js.Function1[java.lang.String, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
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
    renameElement: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): BaseStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("OpenMode")(OpenMode)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("cloneEncryptedStreamElement")(cloneEncryptedStreamElement)
    __obj.updateDynamic("cloneStreamElement")(cloneStreamElement)
    __obj.updateDynamic("copyElementTo")(copyElementTo)
    __obj.updateDynamic("copyLastCommitTo")(copyLastCommitTo)
    __obj.updateDynamic("copyStorageElementLastCommitTo")(copyStorageElementLastCommitTo)
    __obj.updateDynamic("copyToStorage")(copyToStorage)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("isStorageElement")(isStorageElement)
    __obj.updateDynamic("isStreamElement")(isStreamElement)
    __obj.updateDynamic("moveElementTo")(moveElementTo)
    __obj.updateDynamic("openEncryptedStreamElement")(openEncryptedStreamElement)
    __obj.updateDynamic("openStorageElement")(openStorageElement)
    __obj.updateDynamic("openStreamElement")(openStreamElement)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeElement")(removeElement)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("renameElement")(renameElement)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[BaseStorage]
  }
}

