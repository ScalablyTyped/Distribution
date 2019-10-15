package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`a3-landscape`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`a3-portrait`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`a4-landscape`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`a4-portrait`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`letter-ansi-a-landscape`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`letter-ansi-a-portrait`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`map-only`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`tabloid-ansi-b-landscape`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`tabloid-ansi-b-portrait`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintTemplateProperties extends js.Object {
  /**
    * When `false`, the attribution is not displayed on the printout. This only applies when the [layout](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layout) value is `map-only`. Reference our policies on [Licensing & Attribution](https://developers.arcgis.com/javascript/latest/guide/licensing/) for specific attribution requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#attributionVisible)
    *
    * @default true
    */
  var attributionVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Define the map width, height and dpi. Required when `layout = 'map-only'`. See the object specification table below for available options to set for exportOptions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#exportOptions)
    */
  var exportOptions: js.UndefOr[PrintTemplateExportOptions] = js.undefined
  /**
    * When true, the feature's attributes are included in feature collection layers even when they are not needed for rendering. By default they are removed to reduce the request size. Only applicable to custom print services which use the feature attributes, for example to display a table of features and their attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#forceFeatureAttributes)
    *
    * @default false
    */
  var forceFeatureAttributes: js.UndefOr[Boolean] = js.undefined
  /**
    * The output format for the printed map.  **Possible Values:** pdf | png32 | png8 | jpg | gif | eps | svg | svgz
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#format)
    *
    * @default png32
    */
  var format: js.UndefOr[String] = js.undefined
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layout)
    *
    * @default map-only
    */
  var layout: js.UndefOr[
    `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait`
  ] = js.undefined
  /**
    * Defines the layout elements. It's an object with the following properties:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var layoutOptions: js.UndefOr[PrintTemplateLayoutOptions] = js.undefined
  /**
    * The optional map scale of the printed map. Only applies when `preserveScale = true`. If `outScale` is less than 1, then the printed map will use the scale of the input map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#outScale)
    *
    * @default 0
    */
  var outScale: js.UndefOr[Double] = js.undefined
  /**
    * Define whether the printed map should preserve map scale or map extent. If `true`, the printed map will use the `outScale` property or default to the scale of the input map. If `false`, the printed map will use the same extent as the input map and thus scale might change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#preserveScale)
    *
    * @default true
    */
  var preserveScale: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, labels will be shown on the layout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#showLabels)
    *
    * @default true
    */
  var showLabels: js.UndefOr[Boolean] = js.undefined
}

object PrintTemplateProperties {
  @scala.inline
  def apply(
    attributionVisible: js.UndefOr[Boolean] = js.undefined,
    exportOptions: PrintTemplateExportOptions = null,
    forceFeatureAttributes: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    layout: `map-only` | `a3-landscape` | `a3-portrait` | `a4-landscape` | `a4-portrait` | `letter-ansi-a-landscape` | `letter-ansi-a-portrait` | `tabloid-ansi-b-landscape` | `tabloid-ansi-b-portrait` = null,
    layoutOptions: PrintTemplateLayoutOptions = null,
    outScale: Int | Double = null,
    preserveScale: js.UndefOr[Boolean] = js.undefined,
    showLabels: js.UndefOr[Boolean] = js.undefined
  ): PrintTemplateProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attributionVisible)) __obj.updateDynamic("attributionVisible")(attributionVisible)
    if (exportOptions != null) __obj.updateDynamic("exportOptions")(exportOptions)
    if (!js.isUndefined(forceFeatureAttributes)) __obj.updateDynamic("forceFeatureAttributes")(forceFeatureAttributes)
    if (format != null) __obj.updateDynamic("format")(format)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (layoutOptions != null) __obj.updateDynamic("layoutOptions")(layoutOptions)
    if (outScale != null) __obj.updateDynamic("outScale")(outScale.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveScale)) __obj.updateDynamic("preserveScale")(preserveScale)
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels)
    __obj.asInstanceOf[PrintTemplateProperties]
  }
}

