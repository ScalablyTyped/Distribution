package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IterableChangeRecord[V] extends js.Object {
  
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
  implicit class IterableChangeRecordOps[Self <: IterableChangeRecord[_], V] (val x: Self with IterableChangeRecord[V]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItem(value: V): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackById(value: js.Any): Self = this.set("trackById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIndex(value: Double): Self = this.set("currentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIndexNull: Self = this.set("currentIndex", null)
    
    @scala.inline
    def setPreviousIndex(value: Double): Self = this.set("previousIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousIndexNull: Self = this.set("previousIndex", null)
  }
}
