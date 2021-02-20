package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.awt.XWindowPeer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** creates a hatch window implementation. */
@js.native
trait XHatchWindowFactory extends XInterface {
  
  /**
    * creates a new hatch window instance.
    * @param xParent the parent window the hatch window should be created in
    * @param aBounds position and size of the hatch window
    * @param aSize border and handler squares size
    * @returns a new hatch window
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    */
  def createHatchWindowInstance(xParent: XWindowPeer, aBounds: Rectangle, aSize: Size): XHatchWindow = js.native
}
object XHatchWindowFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createHatchWindowInstance: (XWindowPeer, Rectangle, Size) => XHatchWindow,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHatchWindowFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createHatchWindowInstance = js.Any.fromFunction3(createHatchWindowInstance), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XHatchWindowFactory]
  }
  
  @scala.inline
  implicit class XHatchWindowFactoryMutableBuilder[Self <: XHatchWindowFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateHatchWindowInstance(value: (XWindowPeer, Rectangle, Size) => XHatchWindow): Self = StObject.set(x, "createHatchWindowInstance", js.Any.fromFunction3(value))
  }
}
