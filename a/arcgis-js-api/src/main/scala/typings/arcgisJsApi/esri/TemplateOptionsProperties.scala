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

trait TemplateOptionsProperties extends StObject {
  
  /**
    * When `false`, the attribution is not displayed on the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#attributionEnabled)
    */
  var attributionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text used for the author if the specified layout contains an author text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#author)
    */
  var author: js.UndefOr[String] = js.undefined
  
  /**
    * The text used for the copyright if the specified layout contains an copyright text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Resolution in dots per inch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#dpi)
    */
  var dpi: js.UndefOr[String] = js.undefined
  
  /**
    * This property only applies when the [layout](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#layout) value is `map-only`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#fileName)
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * When true, the feature's attributes are included in feature collection layers even when they are not needed for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#forceFeatureAttributes)
    */
  var forceFeatureAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The output format for the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#format)
    */
  var format: js.UndefOr[pdf | png32 | png8 | jpg | gif | eps | svg | svgz] = js.undefined
  
  /**
    * Map height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#height)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The layout used for the print output.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#layout)
    */
  var layout: js.UndefOr[
    `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait`
  ] = js.undefined
  
  /**
    * When `false`, the legend is not displayed on the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#legendEnabled)
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The map scale of the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#scale)
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * When `true`, [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#scale) is used in the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#scaleEnabled)
    */
  var scaleEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text used for the map title if the specified layout contains a title text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Map width.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#width)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object TemplateOptionsProperties {
  
  @scala.inline
  def apply(): TemplateOptionsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOptionsProperties]
  }
  
  @scala.inline
  implicit class TemplateOptionsPropertiesMutableBuilder[Self <: TemplateOptionsProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributionEnabled(value: Boolean): Self = StObject.set(x, "attributionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionEnabledUndefined: Self = StObject.set(x, "attributionEnabled", js.undefined)
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setDpi(value: String): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setForceFeatureAttributes(value: Boolean): Self = StObject.set(x, "forceFeatureAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceFeatureAttributesUndefined: Self = StObject.set(x, "forceFeatureAttributes", js.undefined)
    
    @scala.inline
    def setFormat(value: pdf | png32 | png8 | jpg | gif | eps | svg | svgz): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLayout(
      value: `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait`
    ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendEnabledUndefined: Self = StObject.set(x, "legendEnabled", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleEnabled(value: Boolean): Self = StObject.set(x, "scaleEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleEnabledUndefined: Self = StObject.set(x, "scaleEnabled", js.undefined)
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
