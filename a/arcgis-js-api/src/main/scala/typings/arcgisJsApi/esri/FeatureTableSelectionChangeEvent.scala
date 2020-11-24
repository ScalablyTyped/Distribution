package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTableSelectionChangeEvent extends js.Object {
  
  var added: js.Array[FeatureTableSelectionChangeEventAdded] = js.native
  
  var removed: js.Array[FeatureTableSelectionChangeEventRemoved] = js.native
}
object FeatureTableSelectionChangeEvent {
  
  @scala.inline
  def apply(
    added: js.Array[FeatureTableSelectionChangeEventAdded],
    removed: js.Array[FeatureTableSelectionChangeEventRemoved]
  ): FeatureTableSelectionChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTableSelectionChangeEvent]
  }
  
  @scala.inline
  implicit class FeatureTableSelectionChangeEventOps[Self <: FeatureTableSelectionChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setAddedVarargs(value: FeatureTableSelectionChangeEventAdded*): Self = this.set("added", js.Array(value :_*))
    
    @scala.inline
    def setAdded(value: js.Array[FeatureTableSelectionChangeEventAdded]): Self = this.set("added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedVarargs(value: FeatureTableSelectionChangeEventRemoved*): Self = this.set("removed", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[FeatureTableSelectionChangeEventRemoved]): Self = this.set("removed", value.asInstanceOf[js.Any])
  }
}
