package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
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
  implicit class CIMMarkerPlacementAlongLineVariableSizeMutableBuilder[Self <: CIMMarkerPlacementAlongLineVariableSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxRandomOffset(value: Double): Self = StObject.set(x, "maxRandomOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRandomOffsetUndefined: Self = StObject.set(x, "maxRandomOffset", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setNumberOfSizes(value: Double): Self = StObject.set(x, "numberOfSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfSizesUndefined: Self = StObject.set(x, "numberOfSizes", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineVariableSize): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariationMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SizeVariationMethod * / any */ String
    ): Self = StObject.set(x, "variationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariationMethodUndefined: Self = StObject.set(x, "variationMethod", js.undefined)
  }
}
