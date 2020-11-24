package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementAlongLineVariableSize
  extends CIMMarkerPlacementAlongLine
     with CIMMarkerPlacementType {
  
  /**
    * The maximum random offset.
    */
  var maxRandomOffset: js.UndefOr[Double] = js.native
  
  /**
    * The largest size of the marker to be placed on the line. The value is expressed as a ratio.
    */
  var maxZoom: js.UndefOr[Double] = js.native
  
  /**
    * The smallest size of the marker to be placed on the line. The value is expressed as a ratio.
    */
  var minZoom: js.UndefOr[Double] = js.native
  
  /**
    * The number of different sizes of markers to be placed on the line.
    */
  var numberOfSizes: js.UndefOr[Double] = js.native
  
  /**
    * The starting value for generating a random number. This random number is used by the Randomization property to determine which size a marker will receive. This is only used if the VariationMethod is set to Random.
    */
  var seed: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMMarkerPlacementAlongLineVariableSize: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineVariableSize = js.native
  
  /**
    * The order in which the change of size in the markers should occur.
    */
  var variationMethod: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SizeVariationMethod * / any */ String
  ] = js.native
}
object CIMMarkerPlacementAlongLineVariableSize {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineVariableSize): CIMMarkerPlacementAlongLineVariableSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementAlongLineVariableSize]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementAlongLineVariableSizeOps[Self <: CIMMarkerPlacementAlongLineVariableSize] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineVariableSize): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRandomOffset(value: Double): Self = this.set("maxRandomOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRandomOffset: Self = this.set("maxRandomOffset", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setNumberOfSizes(value: Double): Self = this.set("numberOfSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfSizes: Self = this.set("numberOfSizes", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    
    @scala.inline
    def setVariationMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SizeVariationMethod * / any */ String
    ): Self = this.set("variationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariationMethod: Self = this.set("variationMethod", js.undefined)
  }
}
