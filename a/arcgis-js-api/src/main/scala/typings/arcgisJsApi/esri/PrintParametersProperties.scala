package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintParametersProperties extends js.Object {
  /**
    * Additional parameters for the print service. When an arcpy script is published as a custom print service there may be additional parameters associated with the print service. To determine the extra parameters visit the ArcGIS REST Services Directory page for the print service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html#extraParameters)
    */
  var extraParameters: js.UndefOr[js.Any] = js.native
  /**
    * Specify the output spatial reference for the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * Defines the layout template used for the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html#template)
    */
  var template: js.UndefOr[PrintTemplateProperties] = js.native
  /**
    * The view to print.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintParameters.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}

object PrintParametersProperties {
  @scala.inline
  def apply(): PrintParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintParametersProperties]
  }
  @scala.inline
  implicit class PrintParametersPropertiesOps[Self <: PrintParametersProperties] (val x: Self) extends AnyVal {
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
    def setExtraParameters(value: js.Any): Self = this.set("extraParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraParameters: Self = this.set("extraParameters", js.undefined)
    @scala.inline
    def setOutSpatialReference(value: SpatialReferenceProperties): Self = this.set("outSpatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutSpatialReference: Self = this.set("outSpatialReference", js.undefined)
    @scala.inline
    def setTemplate(value: PrintTemplateProperties): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

