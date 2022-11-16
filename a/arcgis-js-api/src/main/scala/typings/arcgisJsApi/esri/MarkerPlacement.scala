package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.LineBeginning
import typings.arcgisJsApi.arcgisJsApiStrings.LineEnd
import typings.arcgisJsApi.arcgisJsApiStrings.LineMiddle
import typings.arcgisJsApi.arcgisJsApiStrings.SegmentMidpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.CIMMarkerPlacementAlongLineSameSize
  - typings.arcgisJsApi.esri.CIMMarkerPlacementAtExtremities
  - typings.arcgisJsApi.esri.CIMMarkerPlacementAtRatioPositions
  - typings.arcgisJsApi.esri.CIMMarkerPlacementInsidePolygon
  - typings.arcgisJsApi.esri.CIMMarkerPlacementOnLine
  - typings.arcgisJsApi.esri.CIMMarkerPlacementOnVertices
  - typings.arcgisJsApi.esri.CIMMarkerPlacementPolygonCenter
*/
trait MarkerPlacement extends StObject
object MarkerPlacement {
  
  inline def CIMMarkerPlacementAlongLineSameSize(placementTemplate: js.Array[Double]): typings.arcgisJsApi.esri.CIMMarkerPlacementAlongLineSameSize = {
    val __obj = js.Dynamic.literal(placementTemplate = placementTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMMarkerPlacementAlongLineSameSize")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMMarkerPlacementAlongLineSameSize]
  }
  
  inline def CIMMarkerPlacementAtExtremities(): typings.arcgisJsApi.esri.CIMMarkerPlacementAtExtremities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementAtExtremities")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMMarkerPlacementAtExtremities]
  }
  
  inline def CIMMarkerPlacementAtRatioPositions(positionArray: js.Array[Double]): typings.arcgisJsApi.esri.CIMMarkerPlacementAtRatioPositions = {
    val __obj = js.Dynamic.literal(positionArray = positionArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMMarkerPlacementAtRatioPositions")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMMarkerPlacementAtRatioPositions]
  }
  
  inline def CIMMarkerPlacementInsidePolygon(): typings.arcgisJsApi.esri.CIMMarkerPlacementInsidePolygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementInsidePolygon")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMMarkerPlacementInsidePolygon]
  }
  
  inline def CIMMarkerPlacementOnLine(relativeTo: LineMiddle | LineBeginning | LineEnd | SegmentMidpoint): typings.arcgisJsApi.esri.CIMMarkerPlacementOnLine = {
    val __obj = js.Dynamic.literal(relativeTo = relativeTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMMarkerPlacementOnLine")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMMarkerPlacementOnLine]
  }
  
  inline def CIMMarkerPlacementOnVertices(): typings.arcgisJsApi.esri.CIMMarkerPlacementOnVertices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementOnVertices")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMMarkerPlacementOnVertices]
  }
  
  inline def CIMMarkerPlacementPolygonCenter(): typings.arcgisJsApi.esri.CIMMarkerPlacementPolygonCenter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementPolygonCenter")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CIMMarkerPlacementPolygonCenter]
  }
}
