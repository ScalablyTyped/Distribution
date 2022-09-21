package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents something that provides an embedded object. */
trait XEmbeddedObjectSupplier
  extends StObject
     with XInterface {
  
  /** returns the object which is embedded into this object. */
  val EmbeddedObject: XComponent
  
  /** returns the object which is embedded into this object. */
  def getEmbeddedObject(): XComponent
}
object XEmbeddedObjectSupplier {
  
  inline def apply(
    EmbeddedObject: XComponent,
    acquire: () => Unit,
    getEmbeddedObject: () => XComponent,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XEmbeddedObjectSupplier = {
    val __obj = js.Dynamic.literal(EmbeddedObject = EmbeddedObject.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEmbeddedObjectSupplier]
  }
  
  extension [Self <: XEmbeddedObjectSupplier](x: Self) {
    
    inline def setEmbeddedObject(value: XComponent): Self = StObject.set(x, "EmbeddedObject", value.asInstanceOf[js.Any])
    
    inline def setGetEmbeddedObject(value: () => XComponent): Self = StObject.set(x, "getEmbeddedObject", js.Any.fromFunction0(value))
  }
}
