package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to register for action events of an image button and sets the action command. */
@js.native
trait XImageButton extends XInterface {
  
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): Unit = js.native
  
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): Unit = js.native
  
  /** sets the action command string. */
  def setActionCommand(Command: String): Unit = js.native
}
object XImageButton {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    setActionCommand: String => Unit
  ): XImageButton = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), setActionCommand = js.Any.fromFunction1(setActionCommand))
    __obj.asInstanceOf[XImageButton]
  }
  
  @scala.inline
  implicit class XImageButtonMutableBuilder[Self <: XImageButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddActionListener(value: XActionListener => Unit): Self = StObject.set(x, "addActionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveActionListener(value: XActionListener => Unit): Self = StObject.set(x, "removeActionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActionCommand(value: String => Unit): Self = StObject.set(x, "setActionCommand", js.Any.fromFunction1(value))
  }
}
