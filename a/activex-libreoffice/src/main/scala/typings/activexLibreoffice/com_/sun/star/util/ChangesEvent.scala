package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is fired when a set of changes becomes effective on the source of the event.
  * @see XChangesSet
  * @see XChangesBatch
  * @see XChangesListener
  * @see XChangesNotifier
  * @see com.sun.star.container.ContainerEvent
  * @see ElementChange
  */
trait ChangesEvent
  extends StObject
     with EventObject {
  
  /**
    * contains the accessor to the common root of the changed elements.
    *
    * Type and value of the accessor depend on the service.
    */
  var Base: Any
  
  /** contains the changes which occurred. */
  var Changes: ChangesSet
}
object ChangesEvent {
  
  inline def apply(Base: Any, Changes: ChangesSet, Source: XInterface): ChangesEvent = {
    val __obj = js.Dynamic.literal(Base = Base.asInstanceOf[js.Any], Changes = Changes.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangesEvent] (val x: Self) extends AnyVal {
    
    inline def setBase(value: Any): Self = StObject.set(x, "Base", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: ChangesSet): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: ElementChange*): Self = StObject.set(x, "Changes", js.Array(value*))
  }
}
