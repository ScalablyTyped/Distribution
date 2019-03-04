package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extension of {@link XLibraryContainer} to provide additional information about the libraries contained in a library container */
trait XLibraryContainer2 extends XLibraryContainer {
  /**
    * returns the location of the library link target. Should return the same URL that was passed to createLibraryLink in the StorageURL parameter.
    *
    * If the accessed library item exists but isn't a link, a IllegalArgumentException is thrown
    */
  def getLibraryLinkURL(Name: java.lang.String): java.lang.String
  /** returns true if the accessed library item is a link, e.g., created by createLibraryLink, otherwise false. */
  def isLibraryLink(Name: java.lang.String): scala.Boolean
  /**
    * returns true if the accessed library item (library or library link) is read only. A library can be read only because it was set to read only using the
    * methods provided by this interface or because of other reasons depending on the implementation (e.g., file system write protection)
    */
  def isLibraryReadOnly(Name: java.lang.String): scala.Boolean
  /**
    * renames the library item with the specified name. If the accessed library item is a link only the link is renamed, not the target library. If a
    * library with the new name exists already a {@link com.sun.star.container.ElementExistException} is thrown.
    */
  def renameLibrary(Name: java.lang.String, NewName: java.lang.String): scala.Unit
  /** Sets the accessed library item (library or library link) to read only according to the flag bReadOnly (true means read only) */
  def setLibraryReadOnly(Name: java.lang.String, bReadOnly: scala.Boolean): scala.Unit
}

object XLibraryContainer2 {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
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
    loadLibrary: js.Function1[java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeLibrary: js.Function1[java.lang.String, scala.Unit],
    renameLibrary: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setLibraryReadOnly: js.Function2[java.lang.String, scala.Boolean, scala.Unit]
  ): XLibraryContainer2 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, createLibrary = createLibrary, createLibraryLink = createLibraryLink, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, getLibraryLinkURL = getLibraryLinkURL, hasByName = hasByName, hasElements = hasElements, isLibraryLink = isLibraryLink, isLibraryLoaded = isLibraryLoaded, isLibraryReadOnly = isLibraryReadOnly, loadLibrary = loadLibrary, queryInterface = queryInterface, release = release, removeLibrary = removeLibrary, renameLibrary = renameLibrary, setLibraryReadOnly = setLibraryReadOnly)
  
    __obj.asInstanceOf[XLibraryContainer2]
  }
}

