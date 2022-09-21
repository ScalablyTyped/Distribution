package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ImageElementPropertiestyp
import typings.arcgisJsApi.anon.VideoElementPropertiestyp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaLayerProperties
  extends StObject
     with LayerProperties
     with ScaleRangeLayerProperties
     with BlendLayerProperties {
  
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The source for the MediaLayer that will be displayed on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source)
    */
  var source: js.UndefOr[
    LocalMediaElementSourceProperties | (CollectionProperties[ImageElementPropertiestyp | VideoElementPropertiestyp]) | (js.Array[ImageElementPropertiestyp | VideoElementPropertiestyp])
  ] = js.undefined
  
  /**
    * The spatial reference of the layer and defines the spatial reference of the layer's [fullExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#fullExtent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
}
object MediaLayerProperties {
  
  inline def apply(): MediaLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaLayerProperties]
  }
  
  extension [Self <: MediaLayerProperties](x: Self) {
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setSource(
      value: LocalMediaElementSourceProperties | (CollectionProperties[ImageElementPropertiestyp | VideoElementPropertiestyp]) | (js.Array[ImageElementPropertiestyp | VideoElementPropertiestyp])
    ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: (ImageElementPropertiestyp | VideoElementPropertiestyp)*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
