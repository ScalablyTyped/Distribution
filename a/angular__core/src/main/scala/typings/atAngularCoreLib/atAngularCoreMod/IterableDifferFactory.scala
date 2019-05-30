package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterableDifferFactory extends js.Object {
  def create[V](): IterableDiffer[V] = js.native
  def create[V](trackByFn: TrackByFunction[V]): IterableDiffer[V] = js.native
  def supports(objects: js.Any): scala.Boolean = js.native
}

