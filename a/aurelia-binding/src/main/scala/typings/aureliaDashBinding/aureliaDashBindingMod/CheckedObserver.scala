package typings.aureliaDashBinding.aureliaDashBindingMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "CheckedObserver")
@js.native
class CheckedObserver protected () extends InternalPropertyObserver {
  def this(element: Element, handler: EventSubscriber, observerLocator: ObserverLocator) = this()
  /**
    * Handle underlying checkbox element change events
    */
  def handleEvent(): js.Any = js.native
}

