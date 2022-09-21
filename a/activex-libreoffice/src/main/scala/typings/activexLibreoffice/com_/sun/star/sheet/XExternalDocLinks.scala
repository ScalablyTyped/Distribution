package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Primary interface for the {@link com.sun.star.sheet.ExternalDocLinks} service.
  * @see com.sun.star.sheet.ExternalDocLinks
  * @since OOo 3.1
  */
trait XExternalDocLinks
  extends StObject
     with XNameAccess
     with XIndexAccess
     with XEnumerationAccess {
  
  /**
    * This method adds a new external document link by its URL, and returns its instance. If a document instance already exists for the specified URL, then
    * that instance gets returned instead of creating a new one.
    * @param aDocName document URL (e.g. [file:///path/to/document.ods]{@link url="file:///path/to/document.ods"} )
    * @returns external document link instance
    */
  def addDocLink(aDocName: String): XExternalDocLink
}
object XExternalDocLinks {
  
  inline def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addDocLink: String => XExternalDocLink,
    createEnumeration: () => XEnumeration,
    getByIndex: Double => Any,
    getByName: String => Any,
    getCount: () => Double,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XExternalDocLinks = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDocLink = js.Any.fromFunction1(addDocLink), createEnumeration = js.Any.fromFunction0(createEnumeration), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XExternalDocLinks]
  }
  
  extension [Self <: XExternalDocLinks](x: Self) {
    
    inline def setAddDocLink(value: String => XExternalDocLink): Self = StObject.set(x, "addDocLink", js.Any.fromFunction1(value))
  }
}
