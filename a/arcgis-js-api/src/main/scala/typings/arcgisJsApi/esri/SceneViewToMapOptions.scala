package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewToMapOptions extends StObject {
  
  /**
    * A list of layers and graphics to include for intersection testing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#toMap)
    */
  var exclude: js.UndefOr[
    (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem
  ] = js.undefined
  
  /**
    * A list of layers and graphics to include for intersection testing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#toMap)
    */
  var include: js.UndefOr[
    (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem
  ] = js.undefined
}
object SceneViewToMapOptions {
  
  inline def apply(): SceneViewToMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneViewToMapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewToMapOptions] (val x: Self) extends AnyVal {
    
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
