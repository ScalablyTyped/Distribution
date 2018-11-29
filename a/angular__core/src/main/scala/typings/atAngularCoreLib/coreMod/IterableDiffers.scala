package typings
package atAngularCoreLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "IterableDiffers")
@js.native
class IterableDiffers protected ()
  extends atAngularCoreLib.publicUnderscoreApiMod.IterableDiffers {
  def this(factories: js.Array[
      atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableDifferFactory
    ]) = this()
}

@JSImport("@angular/core", "IterableDiffers")
@js.native
object IterableDiffers extends js.Object {
  /** @nocollapse */
  var ngInjectableDef: scala.Nothing = js.native
  def create(
    factories: js.Array[
      atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableDifferFactory
    ]
  ): atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableDiffers = js.native
  def create(
    factories: js.Array[
      atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableDifferFactory
    ],
    parent: atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableDiffers
  ): atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableDiffers = js.native
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
  def extend(
    factories: js.Array[
      atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableDifferFactory
    ]
  ): atAngularCoreLib.srcDiProviderMod.StaticProvider = js.native
}

