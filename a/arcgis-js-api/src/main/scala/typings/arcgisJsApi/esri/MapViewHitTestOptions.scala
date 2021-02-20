package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapViewHitTestOptions extends Object {
  
  /**
    * A list of layers and graphics to exclude from the hitTest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest)
    */
  var exclude: js.UndefOr[js.Array[HitTestItem] | Collection[HitTestItem] | Layer | Graphic] = js.native
  
  /**
    * A list of layers and graphics to include in the hitTest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest)
    */
  var include: js.UndefOr[js.Array[HitTestItem] | Collection[HitTestItem] | Layer | Graphic] = js.native
}
object MapViewHitTestOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MapViewHitTestOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MapViewHitTestOptions]
  }
  
  @scala.inline
  implicit class MapViewHitTestOptionsMutableBuilder[Self <: MapViewHitTestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclude(value: js.Array[HitTestItem] | Collection[HitTestItem] | Layer | Graphic): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: HitTestItem*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[HitTestItem] | Collection[HitTestItem] | Layer | Graphic): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: HitTestItem*): Self = StObject.set(x, "include", js.Array(value :_*))
  }
}
