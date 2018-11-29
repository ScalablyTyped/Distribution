package typings
package atAngularCoreLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/core", "KeyValueDiffers")
@js.native
class KeyValueDiffers protected ()
  extends atAngularCoreLib.srcChangeUnderscoreDetectionMod.KeyValueDiffers {
  def this(factories: js.Array[
      atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueDifferFactory
    ]) = this()
}

@JSImport("@angular/core/src/core", "KeyValueDiffers")
@js.native
object KeyValueDiffers extends js.Object {
  /** @nocollapse */
  var ngInjectableDef: scala.Nothing = js.native
  def create[S](
    factories: js.Array[
      atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueDifferFactory
    ]
  ): atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueDiffers = js.native
  def create[S](
    factories: js.Array[
      atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueDifferFactory
    ],
    parent: atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueDiffers
  ): atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueDiffers = js.native
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
  def extend[S](
    factories: js.Array[
      atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueDifferFactory
    ]
  ): atAngularCoreLib.srcDiProviderMod.StaticProvider = js.native
}

