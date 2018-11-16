package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionDiffersDefaultUnderscoreIterableUnderscoreDifferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/change_detection/differs/default_iterable_differ", "IterableChangeRecord_")
@js.native
class `IterableChangeRecord_`[V] protected ()
  extends atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableChangeRecord[V] {
  def this(item: V, trackById: js.Any) = this()
  /** Current index of the item in `Iterable` or null if removed. */
  /* CompleteClass */
  override val currentIndex: scala.Double | scala.Null = js.native
  /** The item. */
  /* CompleteClass */
  override val item: V = js.native
  /** Previous index of the item in `Iterable` or null if added. */
  /* CompleteClass */
  override val previousIndex: scala.Double | scala.Null = js.native
  /** Track by identity as computed by the `TrackByFunction`. */
  /* CompleteClass */
  override val trackById: js.Any = js.native
}

