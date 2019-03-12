package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Primary interface for the {@link com.sun.star.sheet.ExternalDocLinks} service.
  * @see com.sun.star.sheet.ExternalDocLinks
  * @since OOo 3.1
  */
trait XExternalDocLinks
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess {
  /**
    * This method adds a new external document link by its URL, and returns its instance. If a document instance already exists for the specified URL, then
    * that instance gets returned instead of creating a new one.
    * @param aDocName document URL (e.g. [file:///path/to/document.ods]{@link url="file:///path/to/document.ods"} )
    * @returns {@link com.sun.star.sheet.XExternalDocLink} external document link instance
    */
  def addDocLink(aDocName: java.lang.String): XExternalDocLink
}

object XExternalDocLinks {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    addDocLink: java.lang.String => XExternalDocLink,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    getByIndex: scala.Double => js.Any,
    getByName: java.lang.String => js.Any,
    getCount: () => scala.Double,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XExternalDocLinks = {
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addDocLink = js.Any.fromFunction1(addDocLink), createEnumeration = js.Any.fromFunction0(createEnumeration), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XExternalDocLinks]
  }
}

