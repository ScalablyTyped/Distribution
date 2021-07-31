package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XMenuBar
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides function to update a menu bar for inplace editing.
  * @deprecated Deprecated
  * @since OOo 2.0
  */
trait XMenuBarAcceptor
  extends StObject
     with XInterface {
  
  /**
    * update menu bar according to the current frame mode. This is used in inplace editing mode where we have to merge our own menu into the container
    * applications menu.
    * @param xMenuBar the menu bar that should be merged with current one.
    */
  def updateMenuBar(xMenuBar: js.Array[XMenuBar]): Unit
}
object XMenuBarAcceptor {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateMenuBar: js.Array[XMenuBar] => Unit
  ): XMenuBarAcceptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateMenuBar = js.Any.fromFunction1(updateMenuBar))
    __obj.asInstanceOf[XMenuBarAcceptor]
  }
  
  @scala.inline
  implicit class XMenuBarAcceptorMutableBuilder[Self <: XMenuBarAcceptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateMenuBar(value: js.Array[XMenuBar] => Unit): Self = StObject.set(x, "updateMenuBar", js.Any.fromFunction1(value))
  }
}
