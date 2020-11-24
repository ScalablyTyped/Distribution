package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideConstructor
  extends /**
  * A slide stores a snapshot of several pre-set properties of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), such as the [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#basemap), [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#viewpoint) and [visible layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html)
  */
Instantiable0[Slide]
     with Instantiable1[/* properties */ SlideProperties, Slide] {
  
  /**
    * Creates a slide from a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), which may be added to the [slides](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides) in the WebScene's [presentation](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#presentation).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
    */
  def createFrom(view: SceneView): js.Promise[Slide] = js.native
  def createFrom(view: SceneView, options: SlideCreateFromOptions): js.Promise[Slide] = js.native
}
