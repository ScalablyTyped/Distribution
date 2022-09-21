package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interfaces allows the object to act according to dictionary events.
  *
  * The single method is used by a dictionary to notify its listeners about com::sun::star::linguistic2::DictionaryEvents.
  * @see com.sun.star.linguistic2.XDictionary
  * @see com.sun.star.lang.XEventListener
  */
trait XDictionaryEventListener
  extends StObject
     with XEventListener {
  
  /**
    * is used to get notification of dictionary events.
    * @param aDicEvent the event to be notified of.
    * @see com.sun.star.lang.DictionaryEvent
    */
  def processDictionaryEvent(aDicEvent: DictionaryEvent): Unit
}
object XDictionaryEventListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    processDictionaryEvent: DictionaryEvent => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDictionaryEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), processDictionaryEvent = js.Any.fromFunction1(processDictionaryEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDictionaryEventListener]
  }
  
  extension [Self <: XDictionaryEventListener](x: Self) {
    
    inline def setProcessDictionaryEvent(value: DictionaryEvent => Unit): Self = StObject.set(x, "processDictionaryEvent", js.Any.fromFunction1(value))
  }
}
