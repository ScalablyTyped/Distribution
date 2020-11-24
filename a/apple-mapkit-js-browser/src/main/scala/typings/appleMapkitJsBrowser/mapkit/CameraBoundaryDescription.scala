package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object literal containing at least one property defining an area on the map.
  */
@js.native
trait CameraBoundaryDescription extends js.Object {
  
  /**
    * A rectangular area on a two-dimensional map projection.
    */
  var mapRect: js.UndefOr[MapRect] = js.native
  
  /**
    * A rectangular area on a map, defined by coordinates of the rectangle's northeast and southwest corners.
    */
  var region: js.UndefOr[CoordinateRegion] = js.native
}
object CameraBoundaryDescription {
  
  @scala.inline
  def apply(): CameraBoundaryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraBoundaryDescription]
  }
  
  @scala.inline
  implicit class CameraBoundaryDescriptionOps[Self <: CameraBoundaryDescription] (val x: Self) extends AnyVal {
    
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
    def setMapRect(value: MapRect): Self = this.set("mapRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapRect: Self = this.set("mapRect", js.undefined)
    
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
