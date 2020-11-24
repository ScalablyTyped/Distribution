package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryTraversalOptions extends js.Object {
  
  /** Restore snapshot of selections marker layer to given selectionsMarkerLayer. */
  var selectionsMarkerLayer: js.UndefOr[MarkerLayer] = js.native
}
object HistoryTraversalOptions {
  
  @scala.inline
  def apply(): HistoryTraversalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryTraversalOptions]
  }
  
  @scala.inline
  implicit class HistoryTraversalOptionsOps[Self <: HistoryTraversalOptions] (val x: Self) extends AnyVal {
    
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
    def setSelectionsMarkerLayer(value: MarkerLayer): Self = this.set("selectionsMarkerLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionsMarkerLayer: Self = this.set("selectionsMarkerLayer", js.undefined)
  }
}
