package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

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
  def getOriginalLibraryLinkURL(Name: java.lang.String): java.lang.String
}

object XLibraryContainer3 {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    createLibrary: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    createLibraryLink: (java.lang.String, java.lang.String, scala.Boolean) => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getLibraryLinkURL: java.lang.String => java.lang.String,
    getOriginalLibraryLinkURL: java.lang.String => java.lang.String,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    isLibraryLink: java.lang.String => scala.Boolean,
    isLibraryLoaded: java.lang.String => scala.Boolean,
    isLibraryReadOnly: java.lang.String => scala.Boolean,
    loadLibrary: java.lang.String => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeLibrary: java.lang.String => scala.Unit,
    renameLibrary: (java.lang.String, java.lang.String) => scala.Unit,
    setLibraryReadOnly: (java.lang.String, scala.Boolean) => scala.Unit
  ): XLibraryContainer3 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), getOriginalLibraryLinkURL = js.Any.fromFunction1(getOriginalLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), loadLibrary = js.Any.fromFunction1(loadLibrary), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLibrary = js.Any.fromFunction1(removeLibrary), renameLibrary = js.Any.fromFunction2(renameLibrary), setLibraryReadOnly = js.Any.fromFunction2(setLibraryReadOnly))
  
    __obj.asInstanceOf[XLibraryContainer3]
  }
}

