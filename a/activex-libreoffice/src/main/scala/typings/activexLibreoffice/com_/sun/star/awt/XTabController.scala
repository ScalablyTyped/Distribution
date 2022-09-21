package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the basic operations for a tab controller. */
trait XTabController
  extends StObject
     with XInterface {
  
  /** returns the control container. */
  var Container: XControlContainer
  
  /** returns all controls of the control container. */
  val Controls: SafeArray[XControl]
  
  /** sets the focus to the first control that can be reached with the TAB key. */
  def activateFirst(): Unit
  
  /** sets the focus to the last control that can be reached with the TAB key. */
  def activateLast(): Unit
  
  /** activates tab order. */
  def activateTabOrder(): Unit
  
  /** enables automatic tab order. */
  def autoTabOrder(): Unit
  
  /** returns the control container. */
  def getContainer(): XControlContainer
  
  /** returns all controls of the control container. */
  def getControls(): SafeArray[XControl]
  
  /** returns the tab controller model. */
  def getModel(): XTabControllerModel
  
  /** set the control container. */
  def setContainer(Container: XControlContainer): Unit
  
  /** sets the tab controller model. */
  def setModel(Model: XTabControllerModel): Unit
}
object XTabController {
  
  inline def apply(
    Container: XControlContainer,
    Controls: SafeArray[XControl],
    acquire: () => Unit,
    activateFirst: () => Unit,
    activateLast: () => Unit,
    activateTabOrder: () => Unit,
    autoTabOrder: () => Unit,
    getContainer: () => XControlContainer,
    getControls: () => SafeArray[XControl],
    getModel: () => XTabControllerModel,
    queryInterface: `type` => Any,
    release: () => Unit,
    setContainer: XControlContainer => Unit,
    setModel: XTabControllerModel => Unit
  ): XTabController = {
    val __obj = js.Dynamic.literal(Container = Container.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activateFirst = js.Any.fromFunction0(activateFirst), activateLast = js.Any.fromFunction0(activateLast), activateTabOrder = js.Any.fromFunction0(activateTabOrder), autoTabOrder = js.Any.fromFunction0(autoTabOrder), getContainer = js.Any.fromFunction0(getContainer), getControls = js.Any.fromFunction0(getControls), getModel = js.Any.fromFunction0(getModel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setContainer = js.Any.fromFunction1(setContainer), setModel = js.Any.fromFunction1(setModel))
    __obj.asInstanceOf[XTabController]
  }
  
  extension [Self <: XTabController](x: Self) {
    
    inline def setActivateFirst(value: () => Unit): Self = StObject.set(x, "activateFirst", js.Any.fromFunction0(value))
    
    inline def setActivateLast(value: () => Unit): Self = StObject.set(x, "activateLast", js.Any.fromFunction0(value))
    
    inline def setActivateTabOrder(value: () => Unit): Self = StObject.set(x, "activateTabOrder", js.Any.fromFunction0(value))
    
    inline def setAutoTabOrder(value: () => Unit): Self = StObject.set(x, "autoTabOrder", js.Any.fromFunction0(value))
    
    inline def setContainer(value: XControlContainer): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    inline def setControls(value: SafeArray[XControl]): Self = StObject.set(x, "Controls", value.asInstanceOf[js.Any])
    
    inline def setGetContainer(value: () => XControlContainer): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    
    inline def setGetControls(value: () => SafeArray[XControl]): Self = StObject.set(x, "getControls", js.Any.fromFunction0(value))
    
    inline def setGetModel(value: () => XTabControllerModel): Self = StObject.set(x, "getModel", js.Any.fromFunction0(value))
    
    inline def setSetContainer(value: XControlContainer => Unit): Self = StObject.set(x, "setContainer", js.Any.fromFunction1(value))
    
    inline def setSetModel(value: XTabControllerModel => Unit): Self = StObject.set(x, "setModel", js.Any.fromFunction1(value))
  }
}
