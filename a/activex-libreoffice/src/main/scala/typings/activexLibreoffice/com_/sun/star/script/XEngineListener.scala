package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive events from a scripting engine.
  * @deprecated Deprecated
  */
trait XEngineListener
  extends StObject
     with XEventListener {
  
  /** gets fired when the script execution has finished. */
  def finished(Evt: FinishEngineEvent): Unit
  
  /**
    * gets fired when an interrupt occurs during the script execution.
    *
    * If you call the method, the execution stops. So in this situation, the stack and variable values are still available by using the appropriate {@link
    * XDebugging} methods.
    */
  def interrupt(Evt: InterruptEngineEvent): Unit
  
  /** gets fired when the script gets into execution state. */
  def running(Evt: EventObject): Unit
}
object XEngineListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    finished: FinishEngineEvent => Unit,
    interrupt: InterruptEngineEvent => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    running: EventObject => Unit
  ): XEngineListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), finished = js.Any.fromFunction1(finished), interrupt = js.Any.fromFunction1(interrupt), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), running = js.Any.fromFunction1(running))
    __obj.asInstanceOf[XEngineListener]
  }
  
  extension [Self <: XEngineListener](x: Self) {
    
    inline def setFinished(value: FinishEngineEvent => Unit): Self = StObject.set(x, "finished", js.Any.fromFunction1(value))
    
    inline def setInterrupt(value: InterruptEngineEvent => Unit): Self = StObject.set(x, "interrupt", js.Any.fromFunction1(value))
    
    inline def setRunning(value: EventObject => Unit): Self = StObject.set(x, "running", js.Any.fromFunction1(value))
  }
}
