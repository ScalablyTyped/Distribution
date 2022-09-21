package typings.aureliaBinding.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "ValueAttributeObserver")
@js.native
open class ValueAttributeObserver protected ()
  extends StObject
     with InternalPropertyObserver {
  def this(element: Element, propertyName: String, handler: EventSubscriber) = this()
  
  /**
    * Handle underlying checkbox element change events
    */
  def handleEvent(): Any = js.native
}
