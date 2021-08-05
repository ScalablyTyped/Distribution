package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the controls within an {@link UnoControlContainer} . */
trait XControlContainer
  extends StObject
     with XInterface {
  
  /** returns all controls. */
  val Controls: SafeArray[XControl]
  
  /** adds the given control with the specified name to the container. */
  def addControl(Name: String, Control: XControl): Unit
  
  /** returns the control with the specified name. */
  def getControl(aName: String): XControl
  
  /** returns all controls. */
  def getControls(): SafeArray[XControl]
  
  /** removes the given control from the container. */
  def removeControl(Control: XControl): Unit
  
  /** sets the status text in the status bar of the container. */
  def setStatusText(StatusText: String): Unit
}
object XControlContainer {
  
  inline def apply(
    Controls: SafeArray[XControl],
    acquire: () => Unit,
    addControl: (String, XControl) => Unit,
    getControl: String => XControl,
    getControls: () => SafeArray[XControl],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeControl: XControl => Unit,
    setStatusText: String => Unit
  ): XControlContainer = {
    val __obj = js.Dynamic.literal(Controls = Controls.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addControl = js.Any.fromFunction2(addControl), getControl = js.Any.fromFunction1(getControl), getControls = js.Any.fromFunction0(getControls), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeControl = js.Any.fromFunction1(removeControl), setStatusText = js.Any.fromFunction1(setStatusText))
    __obj.asInstanceOf[XControlContainer]
  }
  
  extension [Self <: XControlContainer](x: Self) {
    
    inline def setAddControl(value: (String, XControl) => Unit): Self = StObject.set(x, "addControl", js.Any.fromFunction2(value))
    
    inline def setControls(value: SafeArray[XControl]): Self = StObject.set(x, "Controls", value.asInstanceOf[js.Any])
    
    inline def setGetControl(value: String => XControl): Self = StObject.set(x, "getControl", js.Any.fromFunction1(value))
    
    inline def setGetControls(value: () => SafeArray[XControl]): Self = StObject.set(x, "getControls", js.Any.fromFunction0(value))
    
    inline def setRemoveControl(value: XControl => Unit): Self = StObject.set(x, "removeControl", js.Any.fromFunction1(value))
    
    inline def setSetStatusText(value: String => Unit): Self = StObject.set(x, "setStatusText", js.Any.fromFunction1(value))
  }
}
