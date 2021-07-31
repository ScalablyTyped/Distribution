package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultUIProperties
  extends StObject
     with UIProperties {
  
  /**
    * An array of strings representing the default widgets visible when a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html#components)
    */
  var components: js.UndefOr[js.Array[String]] = js.undefined
}
object DefaultUIProperties {
  
  @scala.inline
  def apply(): DefaultUIProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultUIProperties]
  }
  
  @scala.inline
  implicit class DefaultUIPropertiesMutableBuilder[Self <: DefaultUIProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value :_*))
  }
}
