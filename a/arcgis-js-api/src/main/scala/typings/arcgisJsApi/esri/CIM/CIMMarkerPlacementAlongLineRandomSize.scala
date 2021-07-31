package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementAlongLineRandomSize
  extends StObject
     with CIMMarkerPlacementAlongLine
     with CIMMarkerPlacementType {
  
  /**
    * The amount of randomness to be used for the size and rotation of the markers on the line. The size and rotation of the marker will vary for individual markers.
    */
  var randomization: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementRandomlyAlongLineRandomization * / any */ String
  ] = js.undefined
  
  /**
    * The starting value for generating a random number. This random number is used by the Randomization property to determine the marker shape.
    */
  var seed: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMMarkerPlacementAlongLineRandomSize: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineRandomSize
}
object CIMMarkerPlacementAlongLineRandomSize {
  
  @scala.inline
  def apply(): CIMMarkerPlacementAlongLineRandomSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementAlongLineRandomSize")
    __obj.asInstanceOf[CIMMarkerPlacementAlongLineRandomSize]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementAlongLineRandomSizeMutableBuilder[Self <: CIMMarkerPlacementAlongLineRandomSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRandomization(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementRandomlyAlongLineRandomization * / any */ String
    ): Self = StObject.set(x, "randomization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomizationUndefined: Self = StObject.set(x, "randomization", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineRandomSize): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
