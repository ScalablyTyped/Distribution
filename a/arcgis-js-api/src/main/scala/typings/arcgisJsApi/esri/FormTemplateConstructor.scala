package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormTemplateConstructor
  extends /**
  * A FormTemplate formats and defines the content of a [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) for a specific [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html). A FormTemplate allows the user to access values from feature attributes and values returned from [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions when a feature in the view is selected.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html)
  */
Instantiable0[FormTemplate]
     with Instantiable1[/* properties */ FormTemplateProperties, FormTemplate] {
  def fromJSON(json: js.Any): FormTemplate = js.native
}

