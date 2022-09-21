package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IterableDifferFactory extends StObject {
  
  def create[V](): IterableDiffer[V] = js.native
  def create[V](trackByFn: TrackByFunction[V]): IterableDiffer[V] = js.native
  
  def supports(objects: Any): Boolean = js.native
}
