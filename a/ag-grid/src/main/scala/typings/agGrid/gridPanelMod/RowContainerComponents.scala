package typings.agGrid.gridPanelMod

import typings.agGrid.rowContainerComponentMod.RowContainerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in ag-grid.ag-grid/dist/lib/gridPanel/gridPanel.RowContainerComponentNames ]: ag-grid.ag-grid/dist/lib/rendering/rowContainerComponent.RowContainerComponent} */
@js.native
trait RowContainerComponents extends js.Object {
  
  var body: RowContainerComponent = js.native
  
  var floatingBottom: RowContainerComponent = js.native
  
  var floatingBottomFullWith: RowContainerComponent = js.native
  
  var floatingBottomPinnedLeft: RowContainerComponent = js.native
  
  var floatingBottomPinnedRight: RowContainerComponent = js.native
  
  var floatingTop: RowContainerComponent = js.native
  
  var floatingTopFullWidth: RowContainerComponent = js.native
  
  var floatingTopPinnedLeft: RowContainerComponent = js.native
  
  var floatingTopPinnedRight: RowContainerComponent = js.native
  
  var fullWidth: RowContainerComponent = js.native
  
  var pinnedLeft: RowContainerComponent = js.native
  
  var pinnedRight: RowContainerComponent = js.native
}
object RowContainerComponents {
  
  @scala.inline
  def apply(
    body: RowContainerComponent,
    floatingBottom: RowContainerComponent,
    floatingBottomFullWith: RowContainerComponent,
    floatingBottomPinnedLeft: RowContainerComponent,
    floatingBottomPinnedRight: RowContainerComponent,
    floatingTop: RowContainerComponent,
    floatingTopFullWidth: RowContainerComponent,
    floatingTopPinnedLeft: RowContainerComponent,
    floatingTopPinnedRight: RowContainerComponent,
    fullWidth: RowContainerComponent,
    pinnedLeft: RowContainerComponent,
    pinnedRight: RowContainerComponent
  ): RowContainerComponents = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], floatingBottom = floatingBottom.asInstanceOf[js.Any], floatingBottomFullWith = floatingBottomFullWith.asInstanceOf[js.Any], floatingBottomPinnedLeft = floatingBottomPinnedLeft.asInstanceOf[js.Any], floatingBottomPinnedRight = floatingBottomPinnedRight.asInstanceOf[js.Any], floatingTop = floatingTop.asInstanceOf[js.Any], floatingTopFullWidth = floatingTopFullWidth.asInstanceOf[js.Any], floatingTopPinnedLeft = floatingTopPinnedLeft.asInstanceOf[js.Any], floatingTopPinnedRight = floatingTopPinnedRight.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], pinnedLeft = pinnedLeft.asInstanceOf[js.Any], pinnedRight = pinnedRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowContainerComponents]
  }
  
  @scala.inline
  implicit class RowContainerComponentsOps[Self <: RowContainerComponents] (val x: Self) extends AnyVal {
    
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
    def setBody(value: RowContainerComponent): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingBottom(value: RowContainerComponent): Self = this.set("floatingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingBottomFullWith(value: RowContainerComponent): Self = this.set("floatingBottomFullWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingBottomPinnedLeft(value: RowContainerComponent): Self = this.set("floatingBottomPinnedLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingBottomPinnedRight(value: RowContainerComponent): Self = this.set("floatingBottomPinnedRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingTop(value: RowContainerComponent): Self = this.set("floatingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingTopFullWidth(value: RowContainerComponent): Self = this.set("floatingTopFullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingTopPinnedLeft(value: RowContainerComponent): Self = this.set("floatingTopPinnedLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingTopPinnedRight(value: RowContainerComponent): Self = this.set("floatingTopPinnedRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidth(value: RowContainerComponent): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedLeft(value: RowContainerComponent): Self = this.set("pinnedLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedRight(value: RowContainerComponent): Self = this.set("pinnedRight", value.asInstanceOf[js.Any])
  }
}
