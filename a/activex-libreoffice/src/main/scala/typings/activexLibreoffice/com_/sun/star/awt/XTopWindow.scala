package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** manages the functionality specific for a top window. */
@js.native
trait XTopWindow extends XInterface {
  
  /** adds the specified top window listener to receive window events from this window. */
  def addTopWindowListener(xListener: XTopWindowListener): Unit = js.native
  
  /** removes the specified top window listener so that it no longer receives window events from this window. */
  def removeTopWindowListener(xListener: XTopWindowListener): Unit = js.native
  
  /** sets a menu bar. */
  def setMenuBar(xMenu: XMenuBar): Unit = js.native
  
  /** places this window at the bottom of the stacking order and makes the corresponding adjustment to other visible windows. */
  def toBack(): Unit = js.native
  
  /** places this window at the top of the stacking order and shows it in front of any other windows. */
  def toFront(): Unit = js.native
}
object XTopWindow {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addTopWindowListener: XTopWindowListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTopWindowListener: XTopWindowListener => Unit,
    setMenuBar: XMenuBar => Unit,
    toBack: () => Unit,
    toFront: () => Unit
  ): XTopWindow = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addTopWindowListener = js.Any.fromFunction1(addTopWindowListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTopWindowListener = js.Any.fromFunction1(removeTopWindowListener), setMenuBar = js.Any.fromFunction1(setMenuBar), toBack = js.Any.fromFunction0(toBack), toFront = js.Any.fromFunction0(toFront))
    __obj.asInstanceOf[XTopWindow]
  }
  
  @scala.inline
  implicit class XTopWindowMutableBuilder[Self <: XTopWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTopWindowListener(value: XTopWindowListener => Unit): Self = StObject.set(x, "addTopWindowListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveTopWindowListener(value: XTopWindowListener => Unit): Self = StObject.set(x, "removeTopWindowListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMenuBar(value: XMenuBar => Unit): Self = StObject.set(x, "setMenuBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToBack(value: () => Unit): Self = StObject.set(x, "toBack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToFront(value: () => Unit): Self = StObject.set(x, "toFront", js.Any.fromFunction0(value))
  }
}
