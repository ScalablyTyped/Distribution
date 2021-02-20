package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "KeyValueDiffers")
@js.native
class KeyValueDiffers protected () extends StObject {
  def this(factories: js.Array[KeyValueDifferFactory]) = this()
  
  /**
    * @deprecated v4.0.0 - Should be private.
    */
  var factories: js.Array[KeyValueDifferFactory] = js.native
  
  def find(kv: js.Any): KeyValueDifferFactory = js.native
}
/* static members */
object KeyValueDiffers {
  
  @JSImport("@angular/core", "KeyValueDiffers.create")
  @js.native
  def create[S](factories: js.Array[KeyValueDifferFactory]): KeyValueDiffers = js.native
  @JSImport("@angular/core", "KeyValueDiffers.create")
  @js.native
  def create[S](factories: js.Array[KeyValueDifferFactory], parent: KeyValueDiffers): KeyValueDiffers = js.native
  
  /**
    * Takes an array of {@link KeyValueDifferFactory} and returns a provider used to extend the
    * inherited {@link KeyValueDiffers} instance with the provided factories and return a new
    * {@link KeyValueDiffers} instance.
    *
    * @usageNotes
    * ### Example
    *
    * The following example shows how to extend an existing list of factories,
    * which will only be applied to the injector for this component and its children.
    * This step is all that's required to make a new {@link KeyValueDiffer} available.
    *
    * ```
    * @Component({
    *   viewProviders: [
    *     KeyValueDiffers.extend([new ImmutableMapDiffer()])
    *   ]
    * })
    * ```
    */
  @JSImport("@angular/core", "KeyValueDiffers.extend")
  @js.native
  def extend[S](factories: js.Array[KeyValueDifferFactory]): StaticProvider = js.native
}
