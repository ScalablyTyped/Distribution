package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOfSightAnalysisTargetProperties extends StObject {
  
  /**
    * Specifies how the target is placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysisTarget.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[LineOfSightAnalysisTargetElevationInfo] = js.undefined
  
  /**
    * Specifies a feature which shall be excluded from intersection testing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysisTarget.html#feature)
    */
  var feature: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
    * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the position of the target.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysisTarget.html#position)
    */
  var position: js.UndefOr[PointProperties] = js.undefined
}
object LineOfSightAnalysisTargetProperties {
  
  inline def apply(): LineOfSightAnalysisTargetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOfSightAnalysisTargetProperties]
  }
  
  extension [Self <: LineOfSightAnalysisTargetProperties](x: Self) {
    
    inline def setElevationInfo(value: LineOfSightAnalysisTargetElevationInfo): Self = StObject.set(x, "elevationInfo", value.asInstanceOf[js.Any])
    
    inline def setElevationInfoUndefined: Self = StObject.set(x, "elevationInfo", js.undefined)
    
    inline def setFeature(value: GraphicProperties): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setPosition(value: PointProperties): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
