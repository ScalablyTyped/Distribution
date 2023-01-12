package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewHitTestOptions extends StObject {
  
  /**
    * A list of layers and graphics to include for intersection testing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest)
    */
  var exclude: js.UndefOr[
    (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem
  ] = js.undefined
  
  /**
    * A list of layers and graphics to include for intersection testing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest)
    */
  var include: js.UndefOr[
    (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem
  ] = js.undefined
}
object SceneViewHitTestOptions {
  
  inline def apply(): SceneViewHitTestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneViewHitTestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewHitTestOptions] (val x: Self) extends AnyVal {
    
    inline def setExclude(
      value: (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem
    ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: (IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground)*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(
      value: (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem
    ): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: (IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground)*): Self = StObject.set(x, "include", js.Array(value*))
  }
}
