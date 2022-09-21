package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * has to be provided if an object wants to receive events when several things happen to components within frames of the desktop frame tree.
  *
  * E.g., you can receive events of instantiation/destruction and activation/deactivation of components.
  * @see XFrame.addFrameActionListener()
  * @see XFrame.removeFrameActionListener()
  */
trait XFrameActionListener
  extends StObject
     with XEventListener {
  
  /**
    * is called whenever any action occurs to a component within a frame.
    * @param Action describes the detected frame action for which the listener can react
    */
  def frameAction(Action: FrameActionEvent): Unit
}
object XFrameActionListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    frameAction: FrameActionEvent => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XFrameActionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), frameAction = js.Any.fromFunction1(frameAction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFrameActionListener]
  }
  
  extension [Self <: XFrameActionListener](x: Self) {
    
    inline def setFrameAction(value: FrameActionEvent => Unit): Self = StObject.set(x, "frameAction", js.Any.fromFunction1(value))
  }
}
