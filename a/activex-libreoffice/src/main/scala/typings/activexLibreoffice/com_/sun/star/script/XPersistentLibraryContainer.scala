package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.util.XModifiable
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
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
@js.native
trait XPersistentLibraryContainer
  extends XLibraryContainer2
     with XModifiable {
  /**
    * denotes the name of the sub location where the container elements are actually stored.
    * @see RootLocation
    */
  var ContainerLocationName: String = js.native
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
  var RootLocation: js.Any = js.native
  /**
    * stores the libraries to the current location.
    * @see RootLocation
    * @see ContainerLocationName
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during storing.
    */
  def storeLibraries(): Unit = js.native
}

object XPersistentLibraryContainer {
  @scala.inline
  def apply(
    ContainerLocationName: String,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    RootLocation: js.Any,
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    createLibrary: String => XNameContainer,
    createLibraryLink: (String, String, Boolean) => XNameAccess,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getLibraryLinkURL: String => String,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    isLibraryLink: String => Boolean,
    isLibraryLoaded: String => Boolean,
    isLibraryReadOnly: String => Boolean,
    isModified: () => Boolean,
    loadLibrary: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeLibrary: String => Unit,
    removeModifyListener: XModifyListener => Unit,
    renameLibrary: (String, String) => Unit,
    setLibraryReadOnly: (String, Boolean) => Unit,
    setModified: Boolean => Unit,
    storeLibraries: () => Unit
  ): XPersistentLibraryContainer = {
    val __obj = js.Dynamic.literal(ContainerLocationName = ContainerLocationName.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], RootLocation = RootLocation.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), isModified = js.Any.fromFunction0(isModified), loadLibrary = js.Any.fromFunction1(loadLibrary), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLibrary = js.Any.fromFunction1(removeLibrary), removeModifyListener = js.Any.fromFunction1(removeModifyListener), renameLibrary = js.Any.fromFunction2(renameLibrary), setLibraryReadOnly = js.Any.fromFunction2(setLibraryReadOnly), setModified = js.Any.fromFunction1(setModified), storeLibraries = js.Any.fromFunction0(storeLibraries))
    __obj.asInstanceOf[XPersistentLibraryContainer]
  }
  @scala.inline
  implicit class XPersistentLibraryContainerOps[Self <: XPersistentLibraryContainer] (val x: Self) extends AnyVal {
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
    def setContainerLocationName(value: String): Self = this.set("ContainerLocationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootLocation(value: js.Any): Self = this.set("RootLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoreLibraries(value: () => Unit): Self = this.set("storeLibraries", js.Any.fromFunction0(value))
  }
  
}

