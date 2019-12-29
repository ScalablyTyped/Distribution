package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlideConstructor
  extends /**
  * A slide stores a snapshot of several pre-set properties of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), such as the [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#basemap), [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#viewpoint) and [visible layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers). The [visible layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers) may contain references (by [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id)) to both operational layers from the [scene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#layers) as well as elevation layers from the [ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers), which affect the surface elevation.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html)
  */
Instantiable0[Slide]
     with Instantiable1[/* properties */ SlideProperties, Slide] {
  /**
    * Creates a slide from a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), which may be added to the [slides](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides) in the WebScene's [presentation](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#presentation). Updating the slide is asynchronous and a snapshot of the view is only complete once the returned promise has resolved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
    *
    * @param view The SceneView from which the slide should be created.
    * @param options Creation options. See properties below for object specifications.
    * @param options.screenshot Screenshot options to use. See properties below for object specifications.
    *
    */
  def createFrom(view: SceneView): js.Promise[Slide] = js.native
  def createFrom(view: SceneView, options: SlideCreateFromOptions): js.Promise[Slide] = js.native
}

