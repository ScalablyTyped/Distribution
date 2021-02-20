package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IterableChangeRecord[V] extends StObject {
  
  /** Current index of the item in `Iterable` or null if removed. */
  val currentIndex: Double | Null = js.native
  
  /** The item. */
  val item: V = js.native
  
  /** Previous index of the item in `Iterable` or null if added. */
  val previousIndex: Double | Null = js.native
  
  /** Track by identity as computed by the `TrackByFunction`. */
  val trackById: js.Any = js.native
}
object IterableChangeRecord {
  
  @scala.inline
  def apply[V](item: V, trackById: js.Any): IterableChangeRecord[V] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], trackById = trackById.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterableChangeRecord[V]]
  }
  
  @scala.inline
  implicit class IterableChangeRecordMutableBuilder[Self <: IterableChangeRecord[_], V] (val x: Self with IterableChangeRecord[V]) extends AnyVal {
    
    @scala.inline
    def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIndexNull: Self = StObject.set(x, "currentIndex", null)
    
    @scala.inline
    def setItem(value: V): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousIndex(value: Double): Self = StObject.set(x, "previousIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousIndexNull: Self = StObject.set(x, "previousIndex", null)
    
    @scala.inline
    def setTrackById(value: js.Any): Self = StObject.set(x, "trackById", value.asInstanceOf[js.Any])
  }
}
