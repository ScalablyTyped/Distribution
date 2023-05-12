package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "IterableDiffers")
@js.native
open class IterableDiffers protected () extends StObject {
  def this(factories: js.Array[IterableDifferFactory]) = this()
  
  /* private */ var factories: Any = js.native
  
  def find(iterable: Any): IterableDifferFactory = js.native
}
/* static members */
object IterableDiffers {
  
  @JSImport("@angular/core", "IterableDiffers")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(factories: js.Array[IterableDifferFactory]): IterableDiffers = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(factories.asInstanceOf[js.Any]).asInstanceOf[IterableDiffers]
  inline def create(factories: js.Array[IterableDifferFactory], parent: IterableDiffers): IterableDiffers = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(factories.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[IterableDiffers]
  
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
  inline def extend(factories: js.Array[IterableDifferFactory]): StaticProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(factories.asInstanceOf[js.Any]).asInstanceOf[StaticProvider]
  
  /** @nocollapse */
  @JSImport("@angular/core", "IterableDiffers.\u0275prov")
  @js.native
  def ɵprov: Any = js.native
  inline def ɵprov_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
