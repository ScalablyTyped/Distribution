package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "ComponentRef")
@js.native
abstract class ComponentRef[C] () extends js.Object {
  /**
    * The change detector for this component instance.
    */
  val changeDetectorRef: ChangeDetectorRef = js.native
  /**
    * The type of this component (as created by a `ComponentFactory` class).
    */
  val componentType: Type[_] = js.native
  /**
    * The [host view](guide/glossary#view-tree) defined by the template
    * for this component instance.
    */
  val hostView: ViewRef = js.native
  /**
    * The [dependency injector](guide/glossary#injector) for this component instance.
    */
  val injector: Injector = js.native
  /**
    * This component instance.
    */
  val instance: C = js.native
  /**
    * The host or anchor [element](guide/glossary#element) for this component instance.
    */
  val location: ElementRef[_] = js.native
  /**
    * Destroys the component instance and all of the data structures associated with it.
    */
  def destroy(): scala.Unit = js.native
  /**
    * A lifecycle hook that provides additional developer-defined cleanup
    * functionality for the component.
    * @param callback A handler function that cleans up developer-defined data
    * associated with this component. Called when the `destroy()` method is invoked.
    */
  def onDestroy(callback: js.Function): scala.Unit = js.native
}

