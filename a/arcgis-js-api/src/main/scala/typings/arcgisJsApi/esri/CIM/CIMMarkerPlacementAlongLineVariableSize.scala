package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementAlongLineVariableSize
  extends StObject
     with CIMMarkerPlacementAlongLine
     with CIMMarkerPlacementType {
  
  /**
  			 * The maximum random offset.
  			 */
  var maxRandomOffset: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The largest size of the marker to be placed on the line. The value is expressed as a ratio.
  			 */
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The smallest size of the marker to be placed on the line. The value is expressed as a ratio.
  			 */
  var minZoom: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The number of different sizes of markers to be placed on the line.
  			 */
  var numberOfSizes: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The starting value for generating a random number. This random number is used by the Randomization property to determine which size a marker will receive. This is only used if the VariationMethod is set to Random.
  			 */
  var seed: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMMarkerPlacementAlongLineVariableSize: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineVariableSize
  
  /**
  			 * The order in which the change of size in the markers should occur.
  			 */
  var variationMethod: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SizeVariationMethod * / any */ String
  ] = js.undefined
}
object CIMMarkerPlacementAlongLineVariableSize {
  
  inline def apply(): CIMMarkerPlacementAlongLineVariableSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementAlongLineVariableSize")
    __obj.asInstanceOf[CIMMarkerPlacementAlongLineVariableSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMMarkerPlacementAlongLineVariableSize] (val x: Self) extends AnyVal {
    
    inline def setMaxRandomOffset(value: Double): Self = StObject.set(x, "maxRandomOffset", value.asInstanceOf[js.Any])
    
    inline def setMaxRandomOffsetUndefined: Self = StObject.set(x, "maxRandomOffset", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setNumberOfSizes(value: Double): Self = StObject.set(x, "numberOfSizes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSizesUndefined: Self = StObject.set(x, "numberOfSizes", js.undefined)
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineVariableSize): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVariationMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SizeVariationMethod * / any */ String
    ): Self = StObject.set(x, "variationMethod", value.asInstanceOf[js.Any])
    
    inline def setVariationMethodUndefined: Self = StObject.set(x, "variationMethod", js.undefined)
  }
}
