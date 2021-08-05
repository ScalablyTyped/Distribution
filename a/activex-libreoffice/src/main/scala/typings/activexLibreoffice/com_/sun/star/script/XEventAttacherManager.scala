package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** registers listeners for specified events. */
trait XEventAttacherManager
  extends StObject
     with XInterface {
  
  /**
    * adds an {@link XScriptListener} that will be notified when an event takes place. For that a {@link ScriptEventDescriptor} is registered at and
    * attached to an object by an {@link XEventAttacherManager} .
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see removeScriptListener
    */
  def addScriptListener(xListener: XScriptListener): Unit
  
  /**
    * attaches all the ScriptEvents which are registered for the given index to the given object.
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    */
  def attach(nIndex: Double, xObject: XInterface, aHelper: js.Any): Unit
  
  /**
    * detaches all the ScriptEvents from the given object which are registered at this object for the given index.
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    */
  def detach(nIndex: Double, xObject: XInterface): Unit
  
  /**
    * @param Index an index previously inserted with the method insertEntry.
    * @returns all events registered for the given object index.
    * @throws IllegalArgumentException if Index is not valid.
    */
  def getScriptEvents(Index: Double): SafeArray[ScriptEventDescriptor]
  
  /**
    * creates an empty entry at the given position.
    *
    * The index **n** of all entries with `n &gt;= nIndex` will be increased by one.
    */
  def insertEntry(nIndex: Double): Unit
  
  /**
    * registers one event for an object identified by its index.
    *
    * If any object is attached under this index, then this event is attached automatically.
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    */
  def registerScriptEvent(nIndex: Double, aScriptEvent: ScriptEventDescriptor): Unit
  
  /**
    * registers several events for an object identified by its index.
    *
    * The result is the same as if the method {@link registerScriptEvent()} was called once for each {@link ScriptEventDescriptor} in the sequence.
    *
    * If any object is attached under this index, then this event is attached automatically (see {@link attach()} )
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    * @see registerScriptEvent
    * @see attach
    */
  def registerScriptEvents(nIndex: Double, aScriptEvents: SeqEquiv[ScriptEventDescriptor]): Unit
  
  /**
    * removes the entry at the given position.
    *
    * If any events are registered at this index, they will be revoked, too. So if the events at this index have been attached to any object they are
    * detached automatically. (see {@link attach()} ).
    * @see attach
    */
  def removeEntry(nIndex: Double): Unit
  
  /**
    * removes a {@link XScriptListener} from the listener list.
    *
    * Nothing happens if the listener is not registered.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see addScriptListener
    */
  def removeScriptListener(Listener: XScriptListener): Unit
  
  /**
    * revokes the registration of an event.
    *
    * The parameters **ListenerType** and **EventMethod** are equivalent to the first two members of the {@link ScriptEventDescriptor} used to register
    * events. If this event at this index has been attached to any object, it is detached automatically (see {@link attach()} ).
    *
    * Exceptions of type {@link com.sun.star.beans.IntrospectionException} and {@link com.sun.star.script.CannotCreateAdapterException} that can be thrown
    * by methods of {@link XEventAttacher} are caught and ignored.
    * @see attach
    */
  def revokeScriptEvent(nIndex: Double, aListenerType: String, aEventMethod: String, aRemoveListenerParam: String): Unit
  
  /**
    * revokes all events which are registered for the given index.
    *
    * If the events at this index have been attached to any object, they are detached automatically. (see {@link attach()} ).
    * @see attach
    */
  def revokeScriptEvents(nIndex: Double): Unit
}
object XEventAttacherManager {
  
  inline def apply(
    acquire: () => Unit,
    addScriptListener: XScriptListener => Unit,
    attach: (Double, XInterface, js.Any) => Unit,
    detach: (Double, XInterface) => Unit,
    getScriptEvents: Double => SafeArray[ScriptEventDescriptor],
    insertEntry: Double => Unit,
    queryInterface: `type` => js.Any,
    registerScriptEvent: (Double, ScriptEventDescriptor) => Unit,
    registerScriptEvents: (Double, SeqEquiv[ScriptEventDescriptor]) => Unit,
    release: () => Unit,
    removeEntry: Double => Unit,
    removeScriptListener: XScriptListener => Unit,
    revokeScriptEvent: (Double, String, String, String) => Unit,
    revokeScriptEvents: Double => Unit
  ): XEventAttacherManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addScriptListener = js.Any.fromFunction1(addScriptListener), attach = js.Any.fromFunction3(attach), detach = js.Any.fromFunction2(detach), getScriptEvents = js.Any.fromFunction1(getScriptEvents), insertEntry = js.Any.fromFunction1(insertEntry), queryInterface = js.Any.fromFunction1(queryInterface), registerScriptEvent = js.Any.fromFunction2(registerScriptEvent), registerScriptEvents = js.Any.fromFunction2(registerScriptEvents), release = js.Any.fromFunction0(release), removeEntry = js.Any.fromFunction1(removeEntry), removeScriptListener = js.Any.fromFunction1(removeScriptListener), revokeScriptEvent = js.Any.fromFunction4(revokeScriptEvent), revokeScriptEvents = js.Any.fromFunction1(revokeScriptEvents))
    __obj.asInstanceOf[XEventAttacherManager]
  }
  
  extension [Self <: XEventAttacherManager](x: Self) {
    
    inline def setAddScriptListener(value: XScriptListener => Unit): Self = StObject.set(x, "addScriptListener", js.Any.fromFunction1(value))
    
    inline def setAttach(value: (Double, XInterface, js.Any) => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction3(value))
    
    inline def setDetach(value: (Double, XInterface) => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction2(value))
    
    inline def setGetScriptEvents(value: Double => SafeArray[ScriptEventDescriptor]): Self = StObject.set(x, "getScriptEvents", js.Any.fromFunction1(value))
    
    inline def setInsertEntry(value: Double => Unit): Self = StObject.set(x, "insertEntry", js.Any.fromFunction1(value))
    
    inline def setRegisterScriptEvent(value: (Double, ScriptEventDescriptor) => Unit): Self = StObject.set(x, "registerScriptEvent", js.Any.fromFunction2(value))
    
    inline def setRegisterScriptEvents(value: (Double, SeqEquiv[ScriptEventDescriptor]) => Unit): Self = StObject.set(x, "registerScriptEvents", js.Any.fromFunction2(value))
    
    inline def setRemoveEntry(value: Double => Unit): Self = StObject.set(x, "removeEntry", js.Any.fromFunction1(value))
    
    inline def setRemoveScriptListener(value: XScriptListener => Unit): Self = StObject.set(x, "removeScriptListener", js.Any.fromFunction1(value))
    
    inline def setRevokeScriptEvent(value: (Double, String, String, String) => Unit): Self = StObject.set(x, "revokeScriptEvent", js.Any.fromFunction4(value))
    
    inline def setRevokeScriptEvents(value: Double => Unit): Self = StObject.set(x, "revokeScriptEvents", js.Any.fromFunction1(value))
  }
}
