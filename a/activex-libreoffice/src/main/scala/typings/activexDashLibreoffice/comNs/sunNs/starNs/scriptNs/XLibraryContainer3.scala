package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extension of {@link XLibraryContainer2} . */
trait XLibraryContainer3 extends XLibraryContainer2 {
  /**
    * returns the location of the library link target.
    *
    * The returned URL is literally the same as the one provided in {@link XLibraryContainer.createLibraryLink()} . Otherwise the behavior is the same as
    * {@link XLibraryContainer2.getLibraryLinkURL()}
    */
  def getOriginalLibraryLinkURL(Name: String): String
}

object XLibraryContainer3 {
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
    getLibraryLinkURL: String => String,
    getOriginalLibraryLinkURL: String => String,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    isLibraryLink: String => Boolean,
    isLibraryLoaded: String => Boolean,
    isLibraryReadOnly: String => Boolean,
    loadLibrary: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeLibrary: String => Unit,
    renameLibrary: (String, String) => Unit,
    setLibraryReadOnly: (String, Boolean) => Unit
  ): XLibraryContainer3 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), getOriginalLibraryLinkURL = js.Any.fromFunction1(getOriginalLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), loadLibrary = js.Any.fromFunction1(loadLibrary), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLibrary = js.Any.fromFunction1(removeLibrary), renameLibrary = js.Any.fromFunction2(renameLibrary), setLibraryReadOnly = js.Any.fromFunction2(setLibraryReadOnly))
  
    __obj.asInstanceOf[XLibraryContainer3]
  }
}

