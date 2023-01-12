package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to a {@link LayerManager} .
  * @see LayerManager
  */
trait XLayerSupplier
  extends StObject
     with XInterface {
  
  /** @returns the {@link LayerManager} . */
  val LayerManager: XNameAccess
  
  /** @returns the {@link LayerManager} . */
  def getLayerManager(): XNameAccess
}
object XLayerSupplier {
  
  inline def apply(
    LayerManager: XNameAccess,
    acquire: () => Unit,
    getLayerManager: () => XNameAccess,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XLayerSupplier = {
    val __obj = js.Dynamic.literal(LayerManager = LayerManager.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLayerManager = js.Any.fromFunction0(getLayerManager), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLayerSupplier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XLayerSupplier] (val x: Self) extends AnyVal {
    
    inline def setGetLayerManager(value: () => XNameAccess): Self = StObject.set(x, "getLayerManager", js.Any.fromFunction0(value))
    
    inline def setLayerManager(value: XNameAccess): Self = StObject.set(x, "LayerManager", value.asInstanceOf[js.Any])
  }
}
