package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a container event.
  *
  * These events are provided **only** for notification purposes.
  * @see XVclContainerListener
  */
@js.native
trait VclContainerEvent extends EventObject {
  
  /** returns the child component that was added or removed. */
  var Child: XInterface = js.native
}
object VclContainerEvent {
  
  @scala.inline
  def apply(Child: XInterface, Source: XInterface): VclContainerEvent = {
    val __obj = js.Dynamic.literal(Child = Child.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VclContainerEvent]
  }
  
  @scala.inline
  implicit class VclContainerEventMutableBuilder[Self <: VclContainerEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChild(value: XInterface): Self = StObject.set(x, "Child", value.asInstanceOf[js.Any])
  }
}
