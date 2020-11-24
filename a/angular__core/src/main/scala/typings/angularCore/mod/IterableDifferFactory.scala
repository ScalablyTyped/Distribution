package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IterableDifferFactory extends js.Object {
  
  def create[V](): IterableDiffer[V] = js.native
  def create[V](trackByFn: TrackByFunction[V]): IterableDiffer[V] = js.native
  
  def supports(objects: js.Any): Boolean = js.native
}
