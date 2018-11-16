package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod {
  type CollectionChangeRecord[V] = IterableChangeRecord[V]
  type NgIterable[T] = js.Array[T] | nodeLib.Iterable[T]
  type TrackByFunction[T] = js.Function2[/* index */ scala.Double, /* item */ T, js.Any]
}
