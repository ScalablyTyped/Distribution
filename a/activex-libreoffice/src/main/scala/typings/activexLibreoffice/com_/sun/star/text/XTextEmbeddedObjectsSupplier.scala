package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the collection of all embedded objects within this context (i.e. this document). */
@js.native
trait XTextEmbeddedObjectsSupplier extends XInterface {
  
  /** @returns the collection of embedded objects. */
  val EmbeddedObjects: XNameAccess = js.native
  
  /** @returns the collection of embedded objects. */
  def getEmbeddedObjects(): XNameAccess = js.native
}
object XTextEmbeddedObjectsSupplier {
  
  @scala.inline
  def apply(
    EmbeddedObjects: XNameAccess,
    acquire: () => Unit,
    getEmbeddedObjects: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextEmbeddedObjectsSupplier = {
    val __obj = js.Dynamic.literal(EmbeddedObjects = EmbeddedObjects.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEmbeddedObjects = js.Any.fromFunction0(getEmbeddedObjects), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextEmbeddedObjectsSupplier]
  }
  
  @scala.inline
  implicit class XTextEmbeddedObjectsSupplierMutableBuilder[Self <: XTextEmbeddedObjectsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbeddedObjects(value: XNameAccess): Self = StObject.set(x, "EmbeddedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEmbeddedObjects(value: () => XNameAccess): Self = StObject.set(x, "getEmbeddedObjects", js.Any.fromFunction0(value))
  }
}
