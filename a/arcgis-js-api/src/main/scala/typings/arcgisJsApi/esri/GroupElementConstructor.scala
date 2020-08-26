package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupElementConstructor
  extends /**
  * A `GroupElement` form element defines a container that holds a set of [form elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#elements) that can be expanded, collapsed, or displayed together. This is the preferred way to set grouped field configurations within a [feature form's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate) or [feature layer's](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#formTemplate) `formTemplate`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html)
  */
Instantiable0[GroupElement]
     with Instantiable1[/* properties */ GroupElementProperties, GroupElement] {
  def fromJSON(json: js.Any): GroupElement = js.native
}

