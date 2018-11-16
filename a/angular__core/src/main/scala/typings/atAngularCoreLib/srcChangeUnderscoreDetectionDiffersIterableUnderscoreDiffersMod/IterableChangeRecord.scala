package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IterableChangeRecord[V] extends js.Object {
  /** Current index of the item in `Iterable` or null if removed. */
  val currentIndex: scala.Double | scala.Null
  /** The item. */
  val item: V
  /** Previous index of the item in `Iterable` or null if added. */
  val previousIndex: scala.Double | scala.Null
  /** Track by identity as computed by the `TrackByFunction`. */
  val trackById: js.Any
}

