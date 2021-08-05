package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive ScriptEvents. */
trait XScriptListener
  extends StObject
     with XEventListener {
  
  /** gets called when a "vetoable event" occurs at the object. */
  def approveFiring(aEvent: ScriptEvent): js.Any
  
  /**
    * gets called when an event takes place. For that a {@link ScriptEventDescriptor} is registered at and attached to an object by an {@link
    * XEventAttacherManager} .
    */
  def firing(aEvent: ScriptEvent): Unit
}
object XScriptListener {
  
  inline def apply(
    acquire: () => Unit,
    approveFiring: ScriptEvent => js.Any,
    disposing: EventObject => Unit,
    firing: ScriptEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScriptListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveFiring = js.Any.fromFunction1(approveFiring), disposing = js.Any.fromFunction1(disposing), firing = js.Any.fromFunction1(firing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScriptListener]
  }
  
  extension [Self <: XScriptListener](x: Self) {
    
    inline def setApproveFiring(value: ScriptEvent => js.Any): Self = StObject.set(x, "approveFiring", js.Any.fromFunction1(value))
    
    inline def setFiring(value: ScriptEvent => Unit): Self = StObject.set(x, "firing", js.Any.fromFunction1(value))
  }
}
