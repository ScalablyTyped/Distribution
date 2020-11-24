package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** data returned by docking handler */
@js.native
trait DockingData extends js.Object {
  
  /** specifies the position and size where the window would be placed if the user releases the mouse */
  var TrackingRectangle: Rectangle = js.native
  
  /** specifies that the window should be floating (TRUE) or docked (FALSE) */
  var bFloating: Boolean = js.native
}
object DockingData {
  
  @scala.inline
  def apply(TrackingRectangle: Rectangle, bFloating: Boolean): DockingData = {
    val __obj = js.Dynamic.literal(TrackingRectangle = TrackingRectangle.asInstanceOf[js.Any], bFloating = bFloating.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockingData]
  }
  
  @scala.inline
  implicit class DockingDataOps[Self <: DockingData] (val x: Self) extends AnyVal {
    
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
    def setTrackingRectangle(value: Rectangle): Self = this.set("TrackingRectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBFloating(value: Boolean): Self = this.set("bFloating", value.asInstanceOf[js.Any])
  }
}
