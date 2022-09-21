package typings.aureliaBinding.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "SelectValueObserver")
@js.native
open class SelectValueObserver protected ()
  extends StObject
     with InternalPropertyObserver {
  def this(element: Element, handler: EventSubscriber, observerLocator: ObserverLocator) = this()
  
  /**
    * Handle underlying checkbox element change events
    */
  def handleEvent(): Any = js.native
}
