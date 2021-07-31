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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#attributionVisible)
    */
  var attributionVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define the map width, height and dpi.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#exportOptions)
    */
  var exportOptions: js.UndefOr[PrintTemplateExportOptions] = js.undefined
  
  /**
    * When true, the feature's attributes are included in feature collection layers even when they are not needed for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#forceFeatureAttributes)
    */
  var forceFeatureAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The output format for the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#format)
    */
  var format: js.UndefOr[pdf | png32 | png8 | jpg | gif | eps | svg | svgz] = js.undefined
  
  /**
    * The layout used for the print output.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layout)
    */
  var layout: js.UndefOr[
    `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait`
  ] = js.undefined
  
  /**
    * Defines the layout elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var layoutOptions: js.UndefOr[PrintTemplateLayoutOptions] = js.undefined
  
  /**
    * The optional map scale of the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#outScale)
    */
  var outScale: js.UndefOr[Double] = js.undefined
  
  /**
    * Define whether the printed map should preserve map scale or map extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#preserveScale)
    */
  var preserveScale: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define whether the printed map should preserve map scale or map extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#scalePreserved)
    */
  var scalePreserved: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, labels will be shown on the layout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#showLabels)
    */
  var showLabels: js.UndefOr[Boolean] = js.undefined
}
object PrintTemplateProperties {
  
  @scala.inline
  def apply(): PrintTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintTemplateProperties]
  }
  
  @scala.inline
  implicit class PrintTemplatePropertiesMutableBuilder[Self <: PrintTemplateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributionVisible(value: Boolean): Self = StObject.set(x, "attributionVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionVisibleUndefined: Self = StObject.set(x, "attributionVisible", js.undefined)
    
    @scala.inline
    def setExportOptions(value: PrintTemplateExportOptions): Self = StObject.set(x, "exportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportOptionsUndefined: Self = StObject.set(x, "exportOptions", js.undefined)
    
    @scala.inline
    def setForceFeatureAttributes(value: Boolean): Self = StObject.set(x, "forceFeatureAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceFeatureAttributesUndefined: Self = StObject.set(x, "forceFeatureAttributes", js.undefined)
    
    @scala.inline
    def setFormat(value: pdf | png32 | png8 | jpg | gif | eps | svg | svgz): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLayout(
      value: `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait`
    ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutOptions(value: PrintTemplateLayoutOptions): Self = StObject.set(x, "layoutOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutOptionsUndefined: Self = StObject.set(x, "layoutOptions", js.undefined)
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setOutScale(value: Double): Self = StObject.set(x, "outScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutScaleUndefined: Self = StObject.set(x, "outScale", js.undefined)
    
    @scala.inline
    def setPreserveScale(value: Boolean): Self = StObject.set(x, "preserveScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveScaleUndefined: Self = StObject.set(x, "preserveScale", js.undefined)
    
    @scala.inline
    def setScalePreserved(value: Boolean): Self = StObject.set(x, "scalePreserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalePreservedUndefined: Self = StObject.set(x, "scalePreserved", js.undefined)
    
    @scala.inline
    def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
  }
}
