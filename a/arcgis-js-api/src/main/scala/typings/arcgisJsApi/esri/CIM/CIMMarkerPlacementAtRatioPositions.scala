package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementAtRatioPositions
  extends StObject
     with CIMMarkerStrokePlacement
     with CIMMarkerPlacementType {
  
  /**
    * The distance from the beginning of a line that the marker will be placed.
    */
  var beginPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance from the end of a line that the marker will be placed. The ending of a line is determined by the direction in which the line was digitized.
    */
  var endPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether only the first marker will be rotated 180 degrees.
    */
  var flipFirst: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The array of positions.
    */
  var positionArray: js.UndefOr[js.Array[Double]] = js.undefined
  
  @JSName("type")
  var type_CIMMarkerPlacementAtRatioPositions: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtRatioPositions
}
object CIMMarkerPlacementAtRatioPositions {
  
  inline def apply(): CIMMarkerPlacementAtRatioPositions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementAtRatioPositions")
    __obj.asInstanceOf[CIMMarkerPlacementAtRatioPositions]
  }
  
  extension [Self <: CIMMarkerPlacementAtRatioPositions](x: Self) {
    
    inline def setBeginPosition(value: Double): Self = StObject.set(x, "beginPosition", value.asInstanceOf[js.Any])
    
    inline def setBeginPositionUndefined: Self = StObject.set(x, "beginPosition", js.undefined)
    
    inline def setEndPosition(value: Double): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    inline def setFlipFirst(value: Boolean): Self = StObject.set(x, "flipFirst", value.asInstanceOf[js.Any])
    
    inline def setFlipFirstUndefined: Self = StObject.set(x, "flipFirst", js.undefined)
    
    inline def setPositionArray(value: js.Array[Double]): Self = StObject.set(x, "positionArray", value.asInstanceOf[js.Any])
    
    inline def setPositionArrayUndefined: Self = StObject.set(x, "positionArray", js.undefined)
    
    inline def setPositionArrayVarargs(value: Double*): Self = StObject.set(x, "positionArray", js.Array(value*))
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtRatioPositions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
