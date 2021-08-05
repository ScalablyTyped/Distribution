package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** manages the text sections within the context (i.e. the document). */
trait XTextSectionsSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of text sections. */
  val TextSections: XNameAccess
  
  /** @returns the collection of text sections. */
  def getTextSections(): XNameAccess
}
object XTextSectionsSupplier {
  
  inline def apply(
    TextSections: XNameAccess,
    acquire: () => Unit,
    getTextSections: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextSectionsSupplier = {
    val __obj = js.Dynamic.literal(TextSections = TextSections.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTextSections = js.Any.fromFunction0(getTextSections), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextSectionsSupplier]
  }
  
  extension [Self <: XTextSectionsSupplier](x: Self) {
    
    inline def setGetTextSections(value: () => XNameAccess): Self = StObject.set(x, "getTextSections", js.Any.fromFunction0(value))
    
    inline def setTextSections(value: XNameAccess): Self = StObject.set(x, "TextSections", value.asInstanceOf[js.Any])
  }
}
