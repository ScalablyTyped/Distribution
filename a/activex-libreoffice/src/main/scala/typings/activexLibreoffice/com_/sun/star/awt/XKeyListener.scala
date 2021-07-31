package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive keyboard events. */
trait XKeyListener
  extends StObject
     with XEventListener {
  
  /** is invoked when a key has been pressed. */
  def keyPressed(e: KeyEvent): Unit
  
  /** is invoked when a key has been released. */
  def keyReleased(e: KeyEvent): Unit
}
object XKeyListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    keyPressed: KeyEvent => Unit,
    keyReleased: KeyEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XKeyListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), keyPressed = js.Any.fromFunction1(keyPressed), keyReleased = js.Any.fromFunction1(keyReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XKeyListener]
  }
  
  @scala.inline
  implicit class XKeyListenerMutableBuilder[Self <: XKeyListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPressed(value: KeyEvent => Unit): Self = StObject.set(x, "keyPressed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyReleased(value: KeyEvent => Unit): Self = StObject.set(x, "keyReleased", js.Any.fromFunction1(value))
  }
}
