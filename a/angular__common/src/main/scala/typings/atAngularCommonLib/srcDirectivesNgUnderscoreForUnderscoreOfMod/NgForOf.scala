package typings
package atAngularCommonLib.srcDirectivesNgUnderscoreForUnderscoreOfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/directives/ng_for_of", "NgForOf")
@js.native
class NgForOf[T] protected ()
  extends atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.DoCheck {
  def this(_viewContainer: atAngularCoreLib.coreMod.ViewContainerRef, _template: atAngularCoreLib.coreMod.TemplateRef[NgForOfContext[T]], _differs: atAngularCoreLib.coreMod.IterableDiffers) = this()
  var _applyChanges: js.Any = js.native
  var _differ: js.Any = js.native
  var _differs: js.Any = js.native
  var _ngForOf: js.Any = js.native
  var _ngForOfDirty: js.Any = js.native
  var _perViewChange: js.Any = js.native
  var _template: js.Any = js.native
  var _trackByFn: js.Any = js.native
  var _viewContainer: js.Any = js.native
  var ngForOf: atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.NgIterable[T] = js.native
  var ngForTemplate: atAngularCoreLib.coreMod.TemplateRef[NgForOfContext[T]] = js.native
  @JSName("ngForTrackBy")
  var ngForTrackBy_Original: atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.TrackByFunction[T] = js.native
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  /* CompleteClass */
  override def ngDoCheck(): scala.Unit = js.native
  def ngForTrackBy(index: scala.Double, item: T): js.Any = js.native
}

@JSImport("@angular/common/src/directives/ng_for_of", "NgForOf")
@js.native
object NgForOf extends js.Object {
  /**
    * Assert the correct type of the context for the template that `NgForOf` will render.
    *
    * The presence of this method is a signal to the Ivy template type check compiler that the
    * `NgForOf` structural directive renders its template with a specific context type.
    */
  def ngTemplateContextGuard[T](dir: atAngularCommonLib.srcDirectivesNgUnderscoreForUnderscoreOfMod.NgForOf[T], ctx: js.Any): /* is @angular/common.@angular/common/src/directives/ng_for_of.NgForOfContext<T> */ scala.Boolean = js.native
}

