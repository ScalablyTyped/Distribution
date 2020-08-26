package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldElementConstructor
  extends /**
  * A `FieldElement` form element defines how a feature layer's [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) participates in the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html). This is the preferred way to set field configurations within a [feature form's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate) or [feature layer's](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#formTemplate) `formTemplate`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html)
  */
Instantiable0[FieldElement]
     with Instantiable1[/* properties */ FieldElementProperties, FieldElement] {
  def fromJSON(json: js.Any): FieldElement = js.native
}

