package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Attributes used when initializing a tile overlay, including minimum and
  * maximum zoom, opacity, and custom data.
  */
@js.native
trait TileOverlayConstructorOptions extends js.Object {
  
  /**
    * Custom data used to populate the URL template.
    */
  var data: js.UndefOr[js.Object] = js.native
  
  /**
    * Maximum zoom level of the overlay.
    */
  var maximumZ: js.UndefOr[Double] = js.native
  
  /**
    * Minimum zoom level of the overlay.
    */
  var minimumZ: js.UndefOr[Double] = js.native
  
  /**
    * Opacity level of the overlay.
    */
  var opacity: js.UndefOr[Double] = js.native
}
object TileOverlayConstructorOptions {
  
  @scala.inline
  def apply(): TileOverlayConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileOverlayConstructorOptions]
  }
  
  @scala.inline
  implicit class TileOverlayConstructorOptionsOps[Self <: TileOverlayConstructorOptions] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setMaximumZ(value: Double): Self = this.set("maximumZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumZ: Self = this.set("maximumZ", js.undefined)
    
    @scala.inline
    def setMinimumZ(value: Double): Self = this.set("minimumZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumZ: Self = this.set("minimumZ", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
}
