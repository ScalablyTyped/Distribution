package typings.arcgisJsApi.formTemplateMod

import typings.arcgisJsApi.esri.FormTemplate
import typings.arcgisJsApi.esri.FormTemplateProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/form/FormTemplate", JSImport.Namespace)
@js.native
/**
  * A FormTemplate formats and defines the content of a [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) for a specific [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html). A FormTemplate allows the user to access values from feature attributes and values returned from [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions when a feature in the view is selected.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html)
  */
class Class () extends FormTemplate {
  def this(properties: FormTemplateProperties) = this()
}

