package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoToProperties extends js.Object {
  
  /**
    * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
    */
  var goToOverride: js.UndefOr[GoToOverride] = js.native
}
object GoToProperties {
  
  @scala.inline
  def apply(): GoToProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoToProperties]
  }
  
  @scala.inline
  implicit class GoToPropertiesOps[Self <: GoToProperties] (val x: Self) extends AnyVal {
    
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
    def setGoToOverride(value: (/* view */ MapView | SceneView, /* goToParameters */ js.Any) => Unit): Self = this.set("goToOverride", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGoToOverride: Self = this.set("goToOverride", js.undefined)
  }
}
