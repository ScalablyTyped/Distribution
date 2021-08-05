package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a VCL window implementation. */
trait XWindowSupplier
  extends StObject
     with XInterface {
  
  /**
    * allows to get access to a VCL window implementation.
    * @returns VCL window implementation
    */
  val Window: XWindow
  
  /**
    * allows to get access to a VCL window implementation.
    * @returns VCL window implementation
    */
  def getWindow(): XWindow
}
object XWindowSupplier {
  
  inline def apply(
    Window: XWindow,
    acquire: () => Unit,
    getWindow: () => XWindow,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XWindowSupplier = {
    val __obj = js.Dynamic.literal(Window = Window.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getWindow = js.Any.fromFunction0(getWindow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XWindowSupplier]
  }
  
  extension [Self <: XWindowSupplier](x: Self) {
    
    inline def setGetWindow(value: () => XWindow): Self = StObject.set(x, "getWindow", js.Any.fromFunction0(value))
    
    inline def setWindow(value: XWindow): Self = StObject.set(x, "Window", value.asInstanceOf[js.Any])
  }
}
