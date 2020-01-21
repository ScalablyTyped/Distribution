package typings.arcgisJsApi.featureFormMod

import typings.arcgisJsApi.esri.FeatureForm
import typings.arcgisJsApi.esri.FeatureFormProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/FeatureForm", JSImport.Namespace)
@js.native
/**
  * The FeatureForm widget displays attributes of a feature. This widget renders input fields based on the feature's attributes and whether the field allows editing. You can configure field groupings to aid in display and organization of form data. Use this widget, in combination with [FeatureLayer.applyEdits](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits), to enable an end user to update a feature's attribute on a specified editable feature layer(s).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html)
  */
class Class () extends FeatureForm {
  def this(properties: FeatureFormProperties) = this()
}

