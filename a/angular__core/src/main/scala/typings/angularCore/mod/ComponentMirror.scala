package typings.angularCore.mod

import typings.angularCore.anon.TemplateName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentMirror[C] extends StObject {
  
  /**
    * The inputs of the component.
    */
  def inputs: js.Array[TemplateName] = js.native
  
  /**
    * Whether this component is marked as standalone.
    * Note: an extra flag, not present in `ComponentFactory`.
    */
  def isStandalone: Boolean = js.native
  
  /**
    * Selector for all <ng-content> elements in the component.
    */
  def ngContentSelectors: js.Array[String] = js.native
  
  /**
    * The outputs of the component.
    */
  def outputs: js.Array[TemplateName] = js.native
  
  /**
    * The component's HTML selector.
    */
  def selector: String = js.native
  
  /**
    * The type of component the factory will create.
    */
  def `type`: Type[C] = js.native
}
