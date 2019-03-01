package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a container of script libraries which is persistent.
  *
  * The type of persistence of the container elements is not defined here, but in derived interfaces or services using `XPersistentLibraryContainer` .
  *
  * The actual libraries are stored in some object - a sub folder, or a sub storage, for example - below the root location.
  * @since OOo 2.3
  */
trait XPersistentLibraryContainer
  extends XLibraryContainer2
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifiable {
  /**
    * denotes the name of the sub location where the container elements are actually stored.
    * @see RootLocation
    */
  var ContainerLocationName: java.lang.String
  /**
    * denotes the root location associated with the container.
    *
    * The type of this location - it might be a folder in a file system, a storage, or anything else - is not specified here, but in derived interfaces or
    * services implementing `XPersistentLibraryContainer` .
    *
    * All operations of the library container take place in a location below the root location, the so-called container location, whose name is exposed as
    * {@link ContainerLocationName} .
    * @see ContainerLocationName
    */
  var RootLocation: js.Any
  /**
    * stores the libraries to the current location.
    * @see RootLocation
    * @see ContainerLocationName
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during storing.
    */
  def storeLibraries(): scala.Unit
}

object XPersistentLibraryContainer {
  @scala.inline
  def apply(
    ContainerLocationName: java.lang.String,
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    RootLocation: js.Any,
    acquire: js.Function0[scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    createLibrary: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
    ],
    createLibraryLink: js.Function3[
      java.lang.String, 
      java.lang.String, 
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
    ],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getLibraryLinkURL: js.Function1[java.lang.String, java.lang.String],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    isLibraryLink: js.Function1[java.lang.String, scala.Boolean],
    isLibraryLoaded: js.Function1[java.lang.String, scala.Boolean],
    isLibraryReadOnly: js.Function1[java.lang.String, scala.Boolean],
    isModified: js.Function0[scala.Boolean],
    loadLibrary: js.Function1[java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeLibrary: js.Function1[java.lang.String, scala.Unit],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    renameLibrary: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setLibraryReadOnly: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    setModified: js.Function1[scala.Boolean, scala.Unit],
    storeLibraries: js.Function0[scala.Unit]
  ): XPersistentLibraryContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContainerLocationName")(ContainerLocationName)
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("RootLocation")(RootLocation)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addModifyListener")(addModifyListener)
    __obj.updateDynamic("createLibrary")(createLibrary)
    __obj.updateDynamic("createLibraryLink")(createLibraryLink)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getLibraryLinkURL")(getLibraryLinkURL)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("isLibraryLink")(isLibraryLink)
    __obj.updateDynamic("isLibraryLoaded")(isLibraryLoaded)
    __obj.updateDynamic("isLibraryReadOnly")(isLibraryReadOnly)
    __obj.updateDynamic("isModified")(isModified)
    __obj.updateDynamic("loadLibrary")(loadLibrary)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeLibrary")(removeLibrary)
    __obj.updateDynamic("removeModifyListener")(removeModifyListener)
    __obj.updateDynamic("renameLibrary")(renameLibrary)
    __obj.updateDynamic("setLibraryReadOnly")(setLibraryReadOnly)
    __obj.updateDynamic("setModified")(setModified)
    __obj.updateDynamic("storeLibraries")(storeLibraries)
    __obj.asInstanceOf[XPersistentLibraryContainer]
  }
}

