package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A minimum and maximum camera distance as meters from the center of the map.
  */
@js.native
trait CameraZoomRange extends js.Object {
  
  /**
    * The maximum allowed distance of the camera from the center of the map in meters.
    */
  var maxCameraDistance: Double = js.native
  
  /**
    * The minimum allowed distance of the camera from the center of the map in meters.
    */
  var minCameraDistance: Double = js.native
}
object CameraZoomRange {
  
  @scala.inline
  def apply(maxCameraDistance: Double, minCameraDistance: Double): CameraZoomRange = {
    val __obj = js.Dynamic.literal(maxCameraDistance = maxCameraDistance.asInstanceOf[js.Any], minCameraDistance = minCameraDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraZoomRange]
  }
  
  @scala.inline
  implicit class CameraZoomRangeOps[Self <: CameraZoomRange] (val x: Self) extends AnyVal {
    
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
    def setMaxCameraDistance(value: Double): Self = this.set("maxCameraDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCameraDistance(value: Double): Self = this.set("minCameraDistance", value.asInstanceOf[js.Any])
  }
}
