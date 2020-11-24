package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineOfSightViewModelProperties extends js.Object {
  
  /**
    * The observer's viewpoint from which lines of sight will be drawn towards the targets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#observer)
    */
  var observer: js.UndefOr[PointProperties] = js.native
  
  /**
    * A collection of [LineOfSightTarget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightTarget.html) containing the target location and the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#targets)
    */
  var targets: js.UndefOr[CollectionProperties[LineOfSightTargetProperties]] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.native
}
object LineOfSightViewModelProperties {
  
  @scala.inline
  def apply(): LineOfSightViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOfSightViewModelProperties]
  }
  
  @scala.inline
  implicit class LineOfSightViewModelPropertiesOps[Self <: LineOfSightViewModelProperties] (val x: Self) extends AnyVal {
    
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
    def setObserver(value: PointProperties): Self = this.set("observer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObserver: Self = this.set("observer", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: LineOfSightTargetProperties*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: CollectionProperties[LineOfSightTargetProperties]): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    
    @scala.inline
    def setView(value: SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
