package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "IterableDiffers")
@js.native
class IterableDiffers protected () extends StObject {
  def this(factories: js.Array[IterableDifferFactory]) = this()
  
  /**
    * @deprecated v4.0.0 - Should be private
    */
  var factories: js.Array[IterableDifferFactory] = js.native
  
  def find(iterable: js.Any): IterableDifferFactory = js.native
}
/* static members */
object IterableDiffers {
  
  @JSImport("@angular/core", "IterableDiffers")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(factories: js.Array[IterableDifferFactory]): IterableDiffers = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(factories.asInstanceOf[js.Any]).asInstanceOf[IterableDiffers]
  @scala.inline
  def create(factories: js.Array[IterableDifferFactory], parent: IterableDiffers): IterableDiffers = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(factories.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[IterableDiffers]
  
  /**
    * Takes an array of {@link IterableDifferFactory} and returns a provider used to extend the
    * inherited {@link IterableDiffers} instance with the provided factories and return a new
    * {@link IterableDiffers} instance.
    *
    * @usageNotes
    * ### Example
    *
    * The following example shows how to extend an existing list of factories,
    * which will only be applied to the injector for this component and its children.
    * This step is all that's required to make a new {@link IterableDiffer} available.
    *
    * ```
    * @Component({
    *   viewProviders: [
    *     IterableDiffers.extend([new ImmutableListDiffer()])
    *   ]
    * })
    * ```
    */
  @scala.inline
  def extend(factories: js.Array[IterableDifferFactory]): StaticProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(factories.asInstanceOf[js.Any]).asInstanceOf[StaticProvider]
}
