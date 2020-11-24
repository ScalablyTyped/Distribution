package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initialization options for the camera zoom range.
  */
@js.native
trait CameraZoomRangeConstructorOptions extends js.Object {
  
  /**
    * The maximum allowed distance of the camera from the center of the map in meters.
    */
  var maxCameraDistance: js.UndefOr[Double] = js.native
  
  /**
    * The minimum allowed distance of the camera from the center of the map in meters.
    */
  var minCameraDistance: js.UndefOr[Double] = js.native
}
object CameraZoomRangeConstructorOptions {
  
  @scala.inline
  def apply(): CameraZoomRangeConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraZoomRangeConstructorOptions]
  }
  
  @scala.inline
  implicit class CameraZoomRangeConstructorOptionsOps[Self <: CameraZoomRangeConstructorOptions] (val x: Self) extends AnyVal {
    
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
    def deleteMaxCameraDistance: Self = this.set("maxCameraDistance", js.undefined)
    
    @scala.inline
    def setMinCameraDistance(value: Double): Self = this.set("minCameraDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCameraDistance: Self = this.set("minCameraDistance", js.undefined)
  }
}
