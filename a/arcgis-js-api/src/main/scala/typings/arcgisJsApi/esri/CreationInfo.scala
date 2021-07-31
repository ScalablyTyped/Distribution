package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreationInfo
  extends StObject
     with Object {
  
  /**
    * The associated feature layer where the new feature is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo)
    */
  var layer: FeatureLayer
  
  /**
    * The associated feature template used to create the new feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo)
    */
  var template: FeatureTemplate
}
object CreationInfo {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    template: FeatureTemplate
  ): CreationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationInfo]
  }
  
  @scala.inline
  implicit class CreationInfoMutableBuilder[Self <: CreationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayer(value: FeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: FeatureTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
