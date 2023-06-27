package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationProfileLineViewProperties
  extends StObject
     with ElevationProfileLineProperties {
  
  /**
  		 * Items which are to be excluded when querying elevation from view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineView.html#exclude)
  		 */
  var exclude: js.UndefOr[
    (js.Array[
      GraphicProperties | LayerProperties | BuildingSublayerProperties | (CollectionProperties[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | (js.Array[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | GroundProperties
    ]) | (CollectionProperties[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | GraphicProperties | LayerProperties | BuildingSublayerProperties
  ] = js.undefined
  
  /**
  		 * Items which are to be hit when querying elevation from view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineView.html#include)
  		 */
  var include: js.UndefOr[
    (js.Array[
      GraphicProperties | LayerProperties | BuildingSublayerProperties | (CollectionProperties[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | (js.Array[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | GroundProperties
    ]) | (CollectionProperties[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | GraphicProperties | LayerProperties | BuildingSublayerProperties
  ] = js.undefined
}
object ElevationProfileLineViewProperties {
  
  inline def apply(): ElevationProfileLineViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElevationProfileLineViewProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationProfileLineViewProperties] (val x: Self) extends AnyVal {
    
    inline def setExclude(
      value: (js.Array[
          GraphicProperties | LayerProperties | BuildingSublayerProperties | (CollectionProperties[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | (js.Array[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | GroundProperties
        ]) | (CollectionProperties[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | GraphicProperties | LayerProperties | BuildingSublayerProperties
    ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(
      value: ((js.Array[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | BuildingSublayerProperties | (CollectionProperties[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | GraphicProperties | GroundProperties | LayerProperties)*
    ): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(
      value: (js.Array[
          GraphicProperties | LayerProperties | BuildingSublayerProperties | (CollectionProperties[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | (js.Array[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | GroundProperties
        ]) | (CollectionProperties[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | GraphicProperties | LayerProperties | BuildingSublayerProperties
    ): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(
      value: ((js.Array[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | BuildingSublayerProperties | (CollectionProperties[GraphicProperties | LayerProperties | BuildingSublayerProperties]) | GraphicProperties | GroundProperties | LayerProperties)*
    ): Self = StObject.set(x, "include", js.Array(value*))
  }
}
