package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementAlongLineRandomSize
  extends CIMMarkerPlacementAlongLine
     with CIMMarkerPlacementType {
  
  /**
    * The amount of randomness to be used for the size and rotation of the markers on the line. The size and rotation of the marker will vary for individual markers.
    */
  var randomization: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementRandomlyAlongLineRandomization * / any */ String
  ] = js.native
  
  /**
    * The starting value for generating a random number. This random number is used by the Randomization property to determine the marker shape.
    */
  var seed: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMMarkerPlacementAlongLineRandomSize: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineRandomSize = js.native
}
object CIMMarkerPlacementAlongLineRandomSize {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineRandomSize): CIMMarkerPlacementAlongLineRandomSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementAlongLineRandomSize]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementAlongLineRandomSizeOps[Self <: CIMMarkerPlacementAlongLineRandomSize] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineRandomSize): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomization(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementRandomlyAlongLineRandomization * / any */ String
    ): Self = this.set("randomization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandomization: Self = this.set("randomization", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
}
