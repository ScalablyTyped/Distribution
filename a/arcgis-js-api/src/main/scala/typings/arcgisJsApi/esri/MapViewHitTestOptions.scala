package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewHitTestOptions extends StObject {
  
  /**
    * A list of layers and graphics to exclude from the hitTest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest)
    */
  var exclude: js.UndefOr[js.Array[HitTestItem] | Collection[HitTestItem] | Layer | Graphic] = js.undefined
  
  /**
    * A list of layers and graphics to include in the hitTest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest)
    */
  var include: js.UndefOr[js.Array[HitTestItem] | Collection[HitTestItem] | Layer | Graphic] = js.undefined
}
object MapViewHitTestOptions {
  
  inline def apply(): MapViewHitTestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapViewHitTestOptions]
  }
  
  extension [Self <: MapViewHitTestOptions](x: Self) {
    
    inline def setExclude(value: js.Array[HitTestItem] | Collection[HitTestItem] | Layer | Graphic): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: HitTestItem*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: js.Array[HitTestItem] | Collection[HitTestItem] | Layer | Graphic): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: HitTestItem*): Self = StObject.set(x, "include", js.Array(value*))
  }
}
