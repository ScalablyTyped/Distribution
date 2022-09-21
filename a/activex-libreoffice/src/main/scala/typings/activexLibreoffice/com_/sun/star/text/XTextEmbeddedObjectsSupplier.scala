package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the collection of all embedded objects within this context (i.e. this document). */
trait XTextEmbeddedObjectsSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of embedded objects. */
  val EmbeddedObjects: XNameAccess
  
  /** @returns the collection of embedded objects. */
  def getEmbeddedObjects(): XNameAccess
}
object XTextEmbeddedObjectsSupplier {
  
  inline def apply(
    EmbeddedObjects: XNameAccess,
    acquire: () => Unit,
    getEmbeddedObjects: () => XNameAccess,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XTextEmbeddedObjectsSupplier = {
    val __obj = js.Dynamic.literal(EmbeddedObjects = EmbeddedObjects.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEmbeddedObjects = js.Any.fromFunction0(getEmbeddedObjects), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextEmbeddedObjectsSupplier]
  }
  
  extension [Self <: XTextEmbeddedObjectsSupplier](x: Self) {
    
    inline def setEmbeddedObjects(value: XNameAccess): Self = StObject.set(x, "EmbeddedObjects", value.asInstanceOf[js.Any])
    
    inline def setGetEmbeddedObjects(value: () => XNameAccess): Self = StObject.set(x, "getEmbeddedObjects", js.Any.fromFunction0(value))
  }
}
