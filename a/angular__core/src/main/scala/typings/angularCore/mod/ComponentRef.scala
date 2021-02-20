package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "ComponentRef")
@js.native
abstract class ComponentRef[C] () extends StObject {
  
  /**
    * The change detector for this component instance.
    */
  def changeDetectorRef: ChangeDetectorRef = js.native
  
  /**
    * The type of this component (as created by a `ComponentFactory` class).
    */
  def componentType: typings.angularCore.mod.Type[_] = js.native
  
  /**
    * Destroys the component instance and all of the data structures associated with it.
    */
  def destroy(): Unit = js.native
  
  /**
    * The [host view](guide/glossary#view-tree) defined by the template
    * for this component instance.
    */
  def hostView: ViewRef = js.native
  
  /**
    * The [dependency injector](guide/glossary#injector) for this component instance.
    */
  def injector: Injector = js.native
  
  /**
    * This component instance.
    */
  def instance: C = js.native
  
  /**
    * The host or anchor [element](guide/glossary#element) for this component instance.
    */
  def location: ElementRef[_] = js.native
  
  /**
    * A lifecycle hook that provides additional developer-defined cleanup
    * functionality for the component.
    * @param callback A handler function that cleans up developer-defined data
    * associated with this component. Called when the `destroy()` method is invoked.
    */
  def onDestroy(callback: js.Function): Unit = js.native
}
