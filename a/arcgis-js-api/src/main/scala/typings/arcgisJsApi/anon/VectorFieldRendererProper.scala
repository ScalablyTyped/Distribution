package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.Magnitude
import typings.arcgisJsApi.arcgisJsApiStrings.`beaufort-ft`
import typings.arcgisJsApi.arcgisJsApiStrings.`beaufort-km`
import typings.arcgisJsApi.arcgisJsApiStrings.`beaufort-kn`
import typings.arcgisJsApi.arcgisJsApiStrings.`beaufort-m`
import typings.arcgisJsApi.arcgisJsApiStrings.`beaufort-mi`
import typings.arcgisJsApi.arcgisJsApiStrings.`classified-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`flow-from`
import typings.arcgisJsApi.arcgisJsApiStrings.`flow-to`
import typings.arcgisJsApi.arcgisJsApiStrings.`ocean-current-kn`
import typings.arcgisJsApi.arcgisJsApiStrings.`ocean-current-m`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-scalar`
import typings.arcgisJsApi.arcgisJsApiStrings.`single-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`vector-field`
import typings.arcgisJsApi.arcgisJsApiStrings.`wind-barb`
import typings.arcgisJsApi.esri.VisualVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.VectorFieldRendererProperties & {  type :'vector-field'} */
trait VectorFieldRendererProper extends StObject {
  
  /**
    * Attribute field presenting the magnitude.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#attributeField)
    */
  var attributeField: js.UndefOr[Magnitude] = js.undefined
  
  /**
    * Defines the flow direction of the data.
    *
    * @default "flow-from"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#flowRepresentation)
    */
  var flowRepresentation: js.UndefOr[`flow-from` | `flow-to`] = js.undefined
  
  /**
    * Predefined symbol styles used to represent the vector flow.
    *
    * @default "single-arrow"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#style)
    */
  var style: js.UndefOr[
    `beaufort-ft` | `beaufort-km` | `beaufort-kn` | `beaufort-m` | `beaufort-mi` | `classified-arrow` | `ocean-current-kn` | `ocean-current-m` | `simple-scalar` | `single-arrow` | `wind-barb`
  ] = js.undefined
  
  /**
    * Determines the density of the symbols.
    *
    * @default 50
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#symbolTileSize)
    */
  var symbolTileSize: js.UndefOr[Double] = js.undefined
  
  var `type`: `vector-field`
  
  /**
    * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#visualVariables)
    */
  var visualVariables: js.UndefOr[js.Array[VisualVariableProperties]] = js.undefined
}
object VectorFieldRendererProper {
  
  inline def apply(): VectorFieldRendererProper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("vector-field")
    __obj.asInstanceOf[VectorFieldRendererProper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VectorFieldRendererProper] (val x: Self) extends AnyVal {
    
    inline def setAttributeField(value: Magnitude): Self = StObject.set(x, "attributeField", value.asInstanceOf[js.Any])
    
    inline def setAttributeFieldUndefined: Self = StObject.set(x, "attributeField", js.undefined)
    
    inline def setFlowRepresentation(value: `flow-from` | `flow-to`): Self = StObject.set(x, "flowRepresentation", value.asInstanceOf[js.Any])
    
    inline def setFlowRepresentationUndefined: Self = StObject.set(x, "flowRepresentation", js.undefined)
    
    inline def setStyle(
      value: `beaufort-ft` | `beaufort-km` | `beaufort-kn` | `beaufort-m` | `beaufort-mi` | `classified-arrow` | `ocean-current-kn` | `ocean-current-m` | `simple-scalar` | `single-arrow` | `wind-barb`
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSymbolTileSize(value: Double): Self = StObject.set(x, "symbolTileSize", value.asInstanceOf[js.Any])
    
    inline def setSymbolTileSizeUndefined: Self = StObject.set(x, "symbolTileSize", js.undefined)
    
    inline def setType(value: `vector-field`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisualVariables(value: js.Array[VisualVariableProperties]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    inline def setVisualVariablesUndefined: Self = StObject.set(x, "visualVariables", js.undefined)
    
    inline def setVisualVariablesVarargs(value: VisualVariableProperties*): Self = StObject.set(x, "visualVariables", js.Array(value*))
  }
}
