package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that determine map parameters used when showing items.
  */
@js.native
trait MapShowItemsOptions extends js.Object {
  
  /**
    * A Boolean value that determines whether the map is animated as the map
    * region changes to show the items.
    */
  var animate: js.UndefOr[Boolean] = js.native
  
  /**
    * Spacing that is added around the computed map region when showing items.
    */
  var minimumSpan: js.UndefOr[CoordinateSpan] = js.native
  
  /**
    * The minimum longitudinal and latitudinal span the map should display.
    */
  var padding: js.UndefOr[Padding] = js.native
}
object MapShowItemsOptions {
  
  @scala.inline
  def apply(): MapShowItemsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapShowItemsOptions]
  }
  
  @scala.inline
  implicit class MapShowItemsOptionsOps[Self <: MapShowItemsOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setMinimumSpan(value: CoordinateSpan): Self = this.set("minimumSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumSpan: Self = this.set("minimumSpan", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
}
