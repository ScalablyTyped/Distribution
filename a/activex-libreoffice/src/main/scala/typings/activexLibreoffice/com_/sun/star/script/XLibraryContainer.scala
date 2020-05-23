package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a library system. */
trait XLibraryContainer extends XNameAccess {
  /** Creates a new library */
  def createLibrary(Name: String): XNameContainer
  /**
    * Creates a link to an "external" library that then can be accessed using this library manager. The format of the StorageURL is a matter of the
    * implementation. If the read only flag is set, the linked library cannot be modified. In this case, the returned interface really is only an
    * XNameAccess. If ReadOnly is false (and the referenced storage allows write access) the returned interface also can be a {@link
    * com.sun.star.container.XNameContainer} .
    */
  def createLibraryLink(Name: String, StorageURL: String, ReadOnly: Boolean): XNameAccess
  /** returns true if the accessed library is already loaded from the storage, otherwise false. */
  def isLibraryLoaded(Name: String): Boolean
  /** Causes the accessed library to be loaded from its storage if it hasn't already been loaded. */
  def loadLibrary(Name: String): Unit
  /** removes the library item with the specified name. If the accessed library item is a link only the link is removed, not the target library. */
  def removeLibrary(Name: String): Unit
}

object XLibraryContainer {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    createLibrary: String => XNameContainer,
    createLibraryLink: (String, String, Boolean) => XNameAccess,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    isLibraryLoaded: String => Boolean,
    loadLibrary: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeLibrary: String => Unit
  ): XLibraryContainer = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), loadLibrary = js.Any.fromFunction1(loadLibrary), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLibrary = js.Any.fromFunction1(removeLibrary))
    __obj.asInstanceOf[XLibraryContainer]
  }
}

