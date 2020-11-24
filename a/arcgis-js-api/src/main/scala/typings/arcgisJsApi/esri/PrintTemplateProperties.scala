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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintTemplateProperties extends js.Object {
  
  /**
    * When `false`, the attribution is not displayed on the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#attributionVisible)
    */
  var attributionVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Define the map width, height and dpi.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#exportOptions)
    */
  var exportOptions: js.UndefOr[PrintTemplateExportOptions] = js.native
  
  /**
    * When true, the feature's attributes are included in feature collection layers even when they are not needed for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#forceFeatureAttributes)
    */
  var forceFeatureAttributes: js.UndefOr[Boolean] = js.native
  
  /**
    * The output format for the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#format)
    */
  var format: js.UndefOr[pdf | png32 | png8 | jpg | gif | eps | svg | svgz] = js.native
  
  /**
    * The layout used for the print output.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layout)
    */
  var layout: js.UndefOr[
    `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait`
  ] = js.native
  
  /**
    * Defines the layout elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var layoutOptions: js.UndefOr[PrintTemplateLayoutOptions] = js.native
  
  /**
    * The optional map scale of the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#outScale)
    */
  var outScale: js.UndefOr[Double] = js.native
  
  /**
    * Define whether the printed map should preserve map scale or map extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#preserveScale)
    */
  var preserveScale: js.UndefOr[Boolean] = js.native
  
  /**
    * Define whether the printed map should preserve map scale or map extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#scalePreserved)
    */
  var scalePreserved: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, labels will be shown on the layout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#showLabels)
    */
  var showLabels: js.UndefOr[Boolean] = js.native
}
object PrintTemplateProperties {
  
  @scala.inline
  def apply(): PrintTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintTemplateProperties]
  }
  
  @scala.inline
  implicit class PrintTemplatePropertiesOps[Self <: PrintTemplateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributionVisible(value: Boolean): Self = this.set("attributionVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributionVisible: Self = this.set("attributionVisible", js.undefined)
    
    @scala.inline
    def setExportOptions(value: PrintTemplateExportOptions): Self = this.set("exportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportOptions: Self = this.set("exportOptions", js.undefined)
    
    @scala.inline
    def setForceFeatureAttributes(value: Boolean): Self = this.set("forceFeatureAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceFeatureAttributes: Self = this.set("forceFeatureAttributes", js.undefined)
    
    @scala.inline
    def setFormat(value: pdf | png32 | png8 | jpg | gif | eps | svg | svgz): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLayout(
      value: `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait`
    ): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLayoutOptions(value: PrintTemplateLayoutOptions): Self = this.set("layoutOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutOptions: Self = this.set("layoutOptions", js.undefined)
    
    @scala.inline
    def setOutScale(value: Double): Self = this.set("outScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutScale: Self = this.set("outScale", js.undefined)
    
    @scala.inline
    def setPreserveScale(value: Boolean): Self = this.set("preserveScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveScale: Self = this.set("preserveScale", js.undefined)
    
    @scala.inline
    def setScalePreserved(value: Boolean): Self = this.set("scalePreserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalePreserved: Self = this.set("scalePreserved", js.undefined)
    
    @scala.inline
    def setShowLabels(value: Boolean): Self = this.set("showLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLabels: Self = this.set("showLabels", js.undefined)
  }
}
