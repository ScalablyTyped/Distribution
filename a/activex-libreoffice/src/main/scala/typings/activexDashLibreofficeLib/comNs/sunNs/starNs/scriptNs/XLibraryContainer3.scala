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
    getOriginalLibraryLinkURL: js.Function1[java.lang.String, java.lang.String],
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
  ): XLibraryContainer3 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createLibrary")(createLibrary)
    __obj.updateDynamic("createLibraryLink")(createLibraryLink)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getLibraryLinkURL")(getLibraryLinkURL)
    __obj.updateDynamic("getOriginalLibraryLinkURL")(getOriginalLibraryLinkURL)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("isLibraryLink")(isLibraryLink)
    __obj.updateDynamic("isLibraryLoaded")(isLibraryLoaded)
    __obj.updateDynamic("isLibraryReadOnly")(isLibraryReadOnly)
    __obj.updateDynamic("loadLibrary")(loadLibrary)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeLibrary")(removeLibrary)
    __obj.updateDynamic("renameLibrary")(renameLibrary)
    __obj.updateDynamic("setLibraryReadOnly")(setLibraryReadOnly)
    __obj.asInstanceOf[XLibraryContainer3]
  }
}

