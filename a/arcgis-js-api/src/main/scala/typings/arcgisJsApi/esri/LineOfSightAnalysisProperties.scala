package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOfSightAnalysisProperties extends StObject {
  
  /**
    * Observer location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html#observer)
    */
  var observer: js.UndefOr[LineOfSightAnalysisObserverProperties] = js.undefined
  
  /**
    * Target locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html#targets)
    */
  var targets: js.UndefOr[CollectionProperties[LineOfSightAnalysisTargetProperties]] = js.undefined
}
object LineOfSightAnalysisProperties {
  
  inline def apply(): LineOfSightAnalysisProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOfSightAnalysisProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineOfSightAnalysisProperties] (val x: Self) extends AnyVal {
    
    inline def setObserver(value: LineOfSightAnalysisObserverProperties): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
    
    inline def setObserverUndefined: Self = StObject.set(x, "observer", js.undefined)
    
    inline def setTargets(value: CollectionProperties[LineOfSightAnalysisTargetProperties]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: LineOfSightAnalysisTargetProperties*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
