package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureReductionSelection
  extends Accessor
     with JSONSupport {
  /**
    * The feature reduction type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html#type)
    */
  var `type`: selection = js.native
}

@JSGlobal("__esri.FeatureReductionSelection")
@js.native
object FeatureReductionSelection extends TopLevel[FeatureReductionSelectionConstructor]

