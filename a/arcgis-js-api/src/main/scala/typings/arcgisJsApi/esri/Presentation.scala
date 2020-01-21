package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Presentation extends Accessor {
  /**
    * A collection of [slides](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html) that bookmark [viewpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html), visible layers, and other settings previously defined in a [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides)
    */
  var slides: Collection[Slide] = js.native
}

@JSGlobal("__esri.Presentation")
@js.native
object Presentation extends TopLevel[PresentationConstructor]

