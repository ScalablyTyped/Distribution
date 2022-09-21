package typings.aureliaBinding.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "CheckedObserver")
@js.native
open class CheckedObserver protected ()
  extends StObject
     with InternalPropertyObserver {
  def this(element: Element, handler: EventSubscriber, observerLocator: ObserverLocator) = this()
  
  /**
    * Handle underlying checkbox element change events
    */
  def handleEvent(): Any = js.native
}
