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
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    RootLocation: js.Any,
    acquire: () => scala.Unit,
    addModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    createLibrary: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    createLibraryLink: (java.lang.String, java.lang.String, scala.Boolean) => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getLibraryLinkURL: java.lang.String => java.lang.String,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    isLibraryLink: java.lang.String => scala.Boolean,
    isLibraryLoaded: java.lang.String => scala.Boolean,
    isLibraryReadOnly: java.lang.String => scala.Boolean,
    isModified: () => scala.Boolean,
    loadLibrary: java.lang.String => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeLibrary: java.lang.String => scala.Unit,
    removeModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    renameLibrary: (java.lang.String, java.lang.String) => scala.Unit,
    setLibraryReadOnly: (java.lang.String, scala.Boolean) => scala.Unit,
    setModified: scala.Boolean => scala.Unit,
    storeLibraries: () => scala.Unit
  ): XPersistentLibraryContainer = {
    val __obj = js.Dynamic.literal(ContainerLocationName = ContainerLocationName, ElementNames = ElementNames, ElementType = ElementType, RootLocation = RootLocation, acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), isModified = js.Any.fromFunction0(isModified), loadLibrary = js.Any.fromFunction1(loadLibrary), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLibrary = js.Any.fromFunction1(removeLibrary), removeModifyListener = js.Any.fromFunction1(removeModifyListener), renameLibrary = js.Any.fromFunction2(renameLibrary), setLibraryReadOnly = js.Any.fromFunction2(setLibraryReadOnly), setModified = js.Any.fromFunction1(setModified), storeLibraries = js.Any.fromFunction0(storeLibraries))
  
    __obj.asInstanceOf[XPersistentLibraryContainer]
  }
}

