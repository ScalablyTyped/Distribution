package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresentationProperties extends js.Object {
  /**
    * A collection of [slides](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html) that bookmark [viewpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html), visible layers, and other settings previously defined in a [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides)
    */
  var slides: js.UndefOr[CollectionProperties[SlideProperties]] = js.undefined
}

object PresentationProperties {
  @scala.inline
  def apply(slides: CollectionProperties[SlideProperties] = null): PresentationProperties = {
    val __obj = js.Dynamic.literal()
    if (slides != null) __obj.updateDynamic("slides")(slides.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresentationProperties]
  }
}

