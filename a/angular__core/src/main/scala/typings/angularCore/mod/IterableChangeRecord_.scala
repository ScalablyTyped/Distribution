package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IterableChangeRecord_[V]
  extends StObject
     with IterableChangeRecord[V]
object IterableChangeRecord_ {
  
  @scala.inline
  def apply[V](item: V, trackById: js.Any): IterableChangeRecord_[V] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], trackById = trackById.asInstanceOf[js.Any], currentIndex = null, previousIndex = null)
    __obj.asInstanceOf[IterableChangeRecord_[V]]
  }
}
