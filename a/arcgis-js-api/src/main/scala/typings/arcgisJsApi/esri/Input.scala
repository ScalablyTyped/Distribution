package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import typings.arcgisJsApi.arcgisJsApiStrings.`text-box`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends Accessor
     with JSONSupport {
  /**
    * The type of form element input displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-Input.html#type)
    */
  val `type`: `text-area` | `text-box` = js.native
}

