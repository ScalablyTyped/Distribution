package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintParameters extends Accessor {
  /**
    * Additional parameters for the print service. When an arcpy script is published as a custom print service there may be additional parameters associated with the print service. To determine the extra parameters visit the ArcGIS REST Services Directory page for the print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html#extraParameters)
    */
  var extraParameters: js.Any = js.native
  /**
    * Specify the output spatial reference for the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  /**
    * Defines the layout template used for the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html#template)
    */
  var template: PrintTemplate = js.native
  /**
    * The view to print.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html#view)
    */
  var view: MapView = js.native
}

@JSGlobal("__esri.PrintParameters")
@js.native
class PrintParametersCls () extends PrintParameters {
  def this(properties: PrintParametersProperties) = this()
}

