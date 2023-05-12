package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`a3-landscape`
import typings.arcgisJsApi.arcgisJsApiStrings.`a3-portrait`
import typings.arcgisJsApi.arcgisJsApiStrings.`a4-landscape`
import typings.arcgisJsApi.arcgisJsApiStrings.`a4-portrait`
import typings.arcgisJsApi.arcgisJsApiStrings.`letter-ansi-a-landscape`
import typings.arcgisJsApi.arcgisJsApiStrings.`letter-ansi-a-portrait`
import typings.arcgisJsApi.arcgisJsApiStrings.`map-only`
import typings.arcgisJsApi.arcgisJsApiStrings.`tabloid-ansi-b-landscape`
import typings.arcgisJsApi.arcgisJsApiStrings.`tabloid-ansi-b-portrait`
import typings.arcgisJsApi.arcgisJsApiStrings.eps
import typings.arcgisJsApi.arcgisJsApiStrings.gif
import typings.arcgisJsApi.arcgisJsApiStrings.jpg
import typings.arcgisJsApi.arcgisJsApiStrings.pdf
import typings.arcgisJsApi.arcgisJsApiStrings.png32
import typings.arcgisJsApi.arcgisJsApiStrings.png8
import typings.arcgisJsApi.arcgisJsApiStrings.svg
import typings.arcgisJsApi.arcgisJsApiStrings.svgz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintTemplateProperties extends StObject {
  
  /**
    * When `false`, the attribution is not displayed on the printout.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#attributionVisible)
    */
  var attributionVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define the map width, height and dpi.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#exportOptions)
    */
  var exportOptions: js.UndefOr[PrintTemplateExportOptions] = js.undefined
  
  /**
    * When true, the feature's attributes are included in feature collection layers even when they are not needed for rendering.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#forceFeatureAttributes)
    */
  var forceFeatureAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The output format for the printed map.
    *
    * @default png32
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#format)
    */
  var format: js.UndefOr[pdf | png32 | png8 | jpg | gif | eps | svg | svgz] = js.undefined
  
  /**
    * When `true`, tables will be included in the printout request.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#includeTables)
    */
  var includeTables: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The layout used for the print output.
    *
    * @default map-only
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#layout)
    */
  var layout: js.UndefOr[
    `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait`
  ] = js.undefined
  
  /**
    * A custom layout hosted as a [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#layoutItem)
    */
  var layoutItem: js.UndefOr[PortalItemProperties] = js.undefined
  
  /**
    * Defines the layout elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#layoutOptions)
    */
  var layoutOptions: js.UndefOr[PrintTemplateLayoutOptions] = js.undefined
  
  /**
    * The optional map scale of the printed map.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#outScale)
    */
  var outScale: js.UndefOr[Double] = js.undefined
  
  /**
    * Define whether the printed map should preserve map scale or map extent.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#scalePreserved)
    */
  var scalePreserved: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, labels will be shown on the layout.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#showLabels)
    */
  var showLabels: js.UndefOr[Boolean] = js.undefined
}
object PrintTemplateProperties {
  
  inline def apply(): PrintTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintTemplateProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintTemplateProperties] (val x: Self) extends AnyVal {
    
    inline def setAttributionVisible(value: Boolean): Self = StObject.set(x, "attributionVisible", value.asInstanceOf[js.Any])
    
    inline def setAttributionVisibleUndefined: Self = StObject.set(x, "attributionVisible", js.undefined)
    
    inline def setExportOptions(value: PrintTemplateExportOptions): Self = StObject.set(x, "exportOptions", value.asInstanceOf[js.Any])
    
    inline def setExportOptionsUndefined: Self = StObject.set(x, "exportOptions", js.undefined)
    
    inline def setForceFeatureAttributes(value: Boolean): Self = StObject.set(x, "forceFeatureAttributes", value.asInstanceOf[js.Any])
    
    inline def setForceFeatureAttributesUndefined: Self = StObject.set(x, "forceFeatureAttributes", js.undefined)
    
    inline def setFormat(value: pdf | png32 | png8 | jpg | gif | eps | svg | svgz): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIncludeTables(value: Boolean): Self = StObject.set(x, "includeTables", value.asInstanceOf[js.Any])
    
    inline def setIncludeTablesUndefined: Self = StObject.set(x, "includeTables", js.undefined)
    
    inline def setLayout(
      value: `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait`
    ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutItem(value: PortalItemProperties): Self = StObject.set(x, "layoutItem", value.asInstanceOf[js.Any])
    
    inline def setLayoutItemUndefined: Self = StObject.set(x, "layoutItem", js.undefined)
    
    inline def setLayoutOptions(value: PrintTemplateLayoutOptions): Self = StObject.set(x, "layoutOptions", value.asInstanceOf[js.Any])
    
    inline def setLayoutOptionsUndefined: Self = StObject.set(x, "layoutOptions", js.undefined)
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setOutScale(value: Double): Self = StObject.set(x, "outScale", value.asInstanceOf[js.Any])
    
    inline def setOutScaleUndefined: Self = StObject.set(x, "outScale", js.undefined)
    
    inline def setScalePreserved(value: Boolean): Self = StObject.set(x, "scalePreserved", value.asInstanceOf[js.Any])
    
    inline def setScalePreservedUndefined: Self = StObject.set(x, "scalePreserved", js.undefined)
    
    inline def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
    
    inline def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
  }
}
