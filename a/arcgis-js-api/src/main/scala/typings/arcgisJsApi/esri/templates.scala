package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains helper methods for generating popup templates to be set on a [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate). The suggested popup templates will only include information in the popup related to the layer's renderer. For example, the popup template in the image below was generated based on a layer rendered with a [predominance](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html) renderer coloring census tracks based on the decade in which the most homes were built.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html)
  */
@js.native
trait templates extends js.Object {
  /**
    * Returns one or more suggested [popupTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for a given layer based on its renderer. This method is useful in apps where a layer's renderer can be modified by the user (or some other process) and the popup template is expected to display values related to the renderer. Popup templates will not be generated for layers with renderers that don't refer to a data value (i.e. SimpleRenderer with no visual variables).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#getTemplates)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.layer The layer to which the suggested popup templates can be applied.
    * @param params.renderer Specify the renderer to be used on the layer when if it will be different than the renderer already set on the layer.
    *
    */
  def getTemplates(params: templatesGetTemplatesParams): js.Promise[Templates_] = js.native
}

object templates {
  @scala.inline
  def apply(getTemplates: templatesGetTemplatesParams => js.Promise[Templates_]): templates = {
    val __obj = js.Dynamic.literal(getTemplates = js.Any.fromFunction1(getTemplates))
    __obj.asInstanceOf[templates]
  }
  @scala.inline
  implicit class templatesOps[Self <: templates] (val x: Self) extends AnyVal {
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
    def setGetTemplates(value: templatesGetTemplatesParams => js.Promise[Templates_]): Self = this.set("getTemplates", js.Any.fromFunction1(value))
  }
  
}

