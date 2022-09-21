package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ClassBreaksRendererProper
import typings.arcgisJsApi.anon.FlowRendererPropertiestyp
import typings.arcgisJsApi.anon.RasterColormapRendererPro
import typings.arcgisJsApi.anon.RasterShadedReliefRendere
import typings.arcgisJsApi.anon.RasterStretchRendererProp
import typings.arcgisJsApi.anon.UniqueValueRendererProper
import typings.arcgisJsApi.anon.VectorFieldRendererProper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageryTileMixinProperties extends StObject {
  
  /**
    * Defines a band combination using 0-based band indexes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#bandIds)
    */
  var bandIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The multidimensional definitions associated with the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#multidimensionalDefinition)
    */
  var multidimensionalDefinition: js.UndefOr[js.Array[DimensionalDefinitionProperties]] = js.undefined
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#renderer)
    */
  var renderer: js.UndefOr[
    ClassBreaksRendererProper | UniqueValueRendererProper | RasterStretchRendererProp | RasterShadedReliefRendere | RasterColormapRendererPro | VectorFieldRendererProper | FlowRendererPropertiestyp
  ] = js.undefined
  
  /**
    * The URL of the REST endpoint of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}
object ImageryTileMixinProperties {
  
  inline def apply(): ImageryTileMixinProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageryTileMixinProperties]
  }
  
  extension [Self <: ImageryTileMixinProperties](x: Self) {
    
    inline def setBandIds(value: js.Array[Double]): Self = StObject.set(x, "bandIds", value.asInstanceOf[js.Any])
    
    inline def setBandIdsUndefined: Self = StObject.set(x, "bandIds", js.undefined)
    
    inline def setBandIdsVarargs(value: Double*): Self = StObject.set(x, "bandIds", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setMultidimensionalDefinition(value: js.Array[DimensionalDefinitionProperties]): Self = StObject.set(x, "multidimensionalDefinition", value.asInstanceOf[js.Any])
    
    inline def setMultidimensionalDefinitionUndefined: Self = StObject.set(x, "multidimensionalDefinition", js.undefined)
    
    inline def setMultidimensionalDefinitionVarargs(value: DimensionalDefinitionProperties*): Self = StObject.set(x, "multidimensionalDefinition", js.Array(value*))
    
    inline def setRenderer(
      value: ClassBreaksRendererProper | UniqueValueRendererProper | RasterStretchRendererProp | RasterShadedReliefRendere | RasterColormapRendererPro | VectorFieldRendererProper | FlowRendererPropertiestyp
    ): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
