package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOfSightLayerProperties
  extends StObject
     with LayerProperties {
  
  /**
  		 * The [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html) associated with the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-LineOfSightLayer.html#analysis)
  		 */
  var analysis: js.UndefOr[LineOfSightAnalysisProperties] = js.undefined
  
  /**
  		 * The observer defines the point from which the line of sight analysis is performed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-LineOfSightLayer.html#observer)
  		 */
  var observer: js.UndefOr[LineOfSightAnalysisObserverProperties] = js.undefined
  
  /**
  		 * Target locations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-LineOfSightLayer.html#targets)
  		 */
  var targets: js.UndefOr[CollectionProperties[LineOfSightAnalysisTargetProperties]] = js.undefined
}
object LineOfSightLayerProperties {
  
  inline def apply(): LineOfSightLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOfSightLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineOfSightLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setAnalysis(value: LineOfSightAnalysisProperties): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setAnalysisUndefined: Self = StObject.set(x, "analysis", js.undefined)
    
    inline def setObserver(value: LineOfSightAnalysisObserverProperties): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
    
    inline def setObserverUndefined: Self = StObject.set(x, "observer", js.undefined)
    
    inline def setTargets(value: CollectionProperties[LineOfSightAnalysisTargetProperties]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: LineOfSightAnalysisTargetProperties*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
