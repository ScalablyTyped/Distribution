package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.algorithmic
import typings.arcgisJsApi.arcgisJsApiStrings.multipart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorRamp
  extends Accessor
     with JSONSupport {
  /**
    * A string value representing the color ramp type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ColorRamp.html#type)
    */
  val `type`: algorithmic | multipart = js.native
}

