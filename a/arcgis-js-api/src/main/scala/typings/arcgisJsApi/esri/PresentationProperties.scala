package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresentationProperties extends js.Object {
  
  /**
    * A collection of [slides](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html) that bookmark [viewpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html), visible layers, and other settings previously defined in a [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides)
    */
  var slides: js.UndefOr[CollectionProperties[SlideProperties]] = js.native
}
object PresentationProperties {
  
  @scala.inline
  def apply(): PresentationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresentationProperties]
  }
  
  @scala.inline
  implicit class PresentationPropertiesOps[Self <: PresentationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSlidesVarargs(value: SlideProperties*): Self = this.set("slides", js.Array(value :_*))
    
    @scala.inline
    def setSlides(value: CollectionProperties[SlideProperties]): Self = this.set("slides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlides: Self = this.set("slides", js.undefined)
  }
}
