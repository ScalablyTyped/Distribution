package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateOptions extends Accessor {
  /**
    * When `false`, the attribution is not displayed on the printout. This only applies when the [layout](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#layout) value is `map-only`. Reference our policies on [Licensing & Attribution](https://developers.arcgis.com/javascript/latest/guide/licensing/) for specific attribution requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#attributionEnabled)
    *
    * @default true
    */
  var attributionEnabled: scala.Boolean = js.native
  /**
    * The text used for the author if the specified layout contains an author text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#author)
    */
  var author: java.lang.String = js.native
  /**
    * The text used for the copyright if the specified layout contains an copyright text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#copyright)
    */
  var copyright: java.lang.String = js.native
  /**
    * Resolution in dots per inch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#dpi)
    *
    * @default 96
    */
  var dpi: java.lang.String = js.native
  /**
    * When true, the feature's attributes are included in feature collection layers even when they are not needed for rendering. By default they are removed to reduce the request size. Only applicable to custom print services which use the feature attributes, for example to display a table of features and their attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#forceFeatureAttributes)
    *
    * @default false
    */
  var forceFeatureAttributes: scala.Boolean = js.native
  /**
    * The output format for the printed map.  **Possible Values:** pdf | png32 | png8 | jpg | gif | eps | svg | svgz
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#format)
    *
    * @default pdf
    */
  var format: java.lang.String = js.native
  /**
    * Map height. This only applies when the [layout](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#layout) value is `map-only`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#height)
    */
  var height: scala.Double = js.native
  /**
    * The layout used for the print output. When the value is `map-only` or is empty, the output map does not contain any page layout surroundings (for example, title, legend, scale bar and so forth). The print service provides out-of-the-box templates listed in possible values. The server administrator can add additional templates to the print service.  Possible values are listed below:
    *
    * Value | Description
    * | --- | ---
    * map-only | Map does not contain any layout elements. Only map image is printed.
    * a3-landscape | A3 Landscape
    * a3-portrait | A3 Portrait
    * a4-landscape | A4 Landscape
    * a4-portrait | A4 Portrait
    * letter-ansi-a-landscape | Letter ANSI A Landscape
    * letter-ansi-a-portrait | Letter ANSI A Portrait
    * tabloid-ansi-b-landscape| Tabloid ANSI B Landscape
    * tabloid-ansi-b-portrait | Tabloid ANSI B Portrait
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#layout)
    *
    * @default letter-ansi-a-landscape
    */
  var layout: java.lang.String = js.native
  /**
    * When `false`, the legend is not displayed on the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: scala.Boolean = js.native
  /**
    * When `true`, scale is used in the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#scaleEnabled)
    *
    * @default false
    */
  var scaleEnabled: scala.Boolean = js.native
  /**
    * The text used for the map title if the specified layout contains a title text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#title)
    */
  var title: java.lang.String = js.native
  /**
    * Map width. This only applies when the [layout](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#layout) value is `map-only`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#width)
    */
  var width: scala.Double = js.native
}

@JSGlobal("__esri.TemplateOptions")
@js.native
class TemplateOptionsCls () extends TemplateOptions {
  def this(properties: TemplateOptionsProperties) = this()
}

