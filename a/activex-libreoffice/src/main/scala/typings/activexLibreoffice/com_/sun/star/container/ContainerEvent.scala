package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is fired when an element is inserted in a container.
  * @see XContainerListener
  */
trait ContainerEvent
  extends StObject
     with EventObject {
  
  /**
    * It contains the accessor to the element which is inserted or removed.
    *
    * The type and the value of the accessor depends on the service.
    */
  var Accessor: Any
  
  /** This contains the element that was inserted or removed. */
  var Element: Any
  
  /** This contains the replaced element. */
  var ReplacedElement: Any
}
object ContainerEvent {
  
  inline def apply(Accessor: Any, Element: Any, ReplacedElement: Any, Source: XInterface): ContainerEvent = {
    val __obj = js.Dynamic.literal(Accessor = Accessor.asInstanceOf[js.Any], Element = Element.asInstanceOf[js.Any], ReplacedElement = ReplacedElement.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerEvent] (val x: Self) extends AnyVal {
    
    inline def setAccessor(value: Any): Self = StObject.set(x, "Accessor", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Any): Self = StObject.set(x, "Element", value.asInstanceOf[js.Any])
    
    inline def setReplacedElement(value: Any): Self = StObject.set(x, "ReplacedElement", value.asInstanceOf[js.Any])
  }
}
