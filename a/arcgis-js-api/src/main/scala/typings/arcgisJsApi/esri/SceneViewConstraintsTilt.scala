package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewConstraintsTilt
  extends StObject
     with AnonymousAccessor {
  
  /**
    * Specifies the maximum amount of tilt (in degrees) allowed in the view and may range from 0.5 to 179.5 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the mode of the constraint.
    *
    * @default auto
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var mode: js.UndefOr[auto | manual] = js.undefined
}
object SceneViewConstraintsTilt {
  
  inline def apply(
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ Any, SceneViewConstraintsTilt]
    ]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], SceneViewConstraintsTilt]])
  ): SceneViewConstraintsTilt = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewConstraintsTilt]
  }
  
  extension [Self <: SceneViewConstraintsTilt](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMode(value: auto | manual): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
