package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOfSightViewModelProperties extends StObject {
  
  /**
    * The observer's viewpoint from which lines of sight will be drawn towards the targets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#observer)
    */
  var observer: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * A collection of [LineOfSightTarget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightTarget.html) containing the target location and the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#targets)
    */
  var targets: js.UndefOr[CollectionProperties[LineOfSightTargetProperties]] = js.undefined
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
}
object LineOfSightViewModelProperties {
  
  @scala.inline
  def apply(): LineOfSightViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOfSightViewModelProperties]
  }
  
  @scala.inline
  implicit class LineOfSightViewModelPropertiesMutableBuilder[Self <: LineOfSightViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObserver(value: PointProperties): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserverUndefined: Self = StObject.set(x, "observer", js.undefined)
    
    @scala.inline
    def setTargets(value: CollectionProperties[LineOfSightTargetProperties]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: LineOfSightTargetProperties*): Self = StObject.set(x, "targets", js.Array(value :_*))
    
    @scala.inline
    def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
