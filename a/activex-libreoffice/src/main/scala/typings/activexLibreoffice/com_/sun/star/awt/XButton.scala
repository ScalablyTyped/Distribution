package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to set the label of a button and to register for action events. */
trait XButton
  extends StObject
     with XInterface {
  
  /** registers an event handler for button action events. */
  def addActionListener(l: XActionListener): Unit
  
  /** unregisters an event handler for button action events. */
  def removeActionListener(l: XActionListener): Unit
  
  /**
    * sets a command string for pushing the button.
    * @param Command value can be used to detect which button is pressed.
    */
  def setActionCommand(Command: String): Unit
  
  /** sets the label of the button. */
  def setLabel(Label: String): Unit
}
object XButton {
  
  inline def apply(
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    setActionCommand: String => Unit,
    setLabel: String => Unit
  ): XButton = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), setActionCommand = js.Any.fromFunction1(setActionCommand), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[XButton]
  }
  
  extension [Self <: XButton](x: Self) {
    
    inline def setAddActionListener(value: XActionListener => Unit): Self = StObject.set(x, "addActionListener", js.Any.fromFunction1(value))
    
    inline def setRemoveActionListener(value: XActionListener => Unit): Self = StObject.set(x, "removeActionListener", js.Any.fromFunction1(value))
    
    inline def setSetActionCommand(value: String => Unit): Self = StObject.set(x, "setActionCommand", js.Any.fromFunction1(value))
    
    inline def setSetLabel(value: String => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
  }
}
