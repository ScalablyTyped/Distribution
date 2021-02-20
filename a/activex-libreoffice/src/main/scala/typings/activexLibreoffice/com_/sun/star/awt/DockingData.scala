package typings.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** data returned by docking handler */
@js.native
trait DockingData extends StObject {
  
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
  implicit class DockingDataMutableBuilder[Self <: DockingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBFloating(value: Boolean): Self = StObject.set(x, "bFloating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingRectangle(value: Rectangle): Self = StObject.set(x, "TrackingRectangle", value.asInstanceOf[js.Any])
  }
}
