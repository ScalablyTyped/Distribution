package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the collection of all embedded and linked graphics within this context (i.e. within this document). */
trait XTextGraphicObjectsSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of graphic objects in this object (document). */
  val GraphicObjects: XNameAccess
  
  /** @returns the collection of graphic objects in this object (document). */
  def getGraphicObjects(): XNameAccess
}
object XTextGraphicObjectsSupplier {
  
  inline def apply(
    GraphicObjects: XNameAccess,
    acquire: () => Unit,
    getGraphicObjects: () => XNameAccess,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XTextGraphicObjectsSupplier = {
    val __obj = js.Dynamic.literal(GraphicObjects = GraphicObjects.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGraphicObjects = js.Any.fromFunction0(getGraphicObjects), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextGraphicObjectsSupplier]
  }
  
  extension [Self <: XTextGraphicObjectsSupplier](x: Self) {
    
    inline def setGetGraphicObjects(value: () => XNameAccess): Self = StObject.set(x, "getGraphicObjects", js.Any.fromFunction0(value))
    
    inline def setGraphicObjects(value: XNameAccess): Self = StObject.set(x, "GraphicObjects", value.asInstanceOf[js.Any])
  }
}
