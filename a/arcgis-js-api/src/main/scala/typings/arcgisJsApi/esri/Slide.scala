package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slide extends Accessor {
  
  /**
    * Applies a slide's settings to a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    */
  def applyTo(view: SceneView): js.Promise[Slide] = js.native
  def applyTo(view: SceneView, options: SlideApplyToOptions): js.Promise[Slide] = js.native
  
  /**
    * The basemap of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#basemap)
    */
  var basemap: Basemap = js.native
  
  /**
    * The description of the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#description)
    */
  var description: SlideDescription = js.native
  
  /**
    * Represents settings that affect the environment in which the WebScene is displayed (such as lighting).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#environment)
    */
  var environment: SlideEnvironment = js.native
  
  /**
    * Ground properties for this slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#ground)
    */
  var ground: SlideGround = js.native
  
  /**
    * The unique id of a slide within the [slides property](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides) of a [Presentation](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#id)
    */
  var id: String = js.native
  
  /**
    * A data URI encoded thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#thumbnail)
    */
  var thumbnail: SlideThumbnail = js.native
  
  /**
    * The title of the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#title)
    */
  var title: SlideTitle = js.native
  
  /**
    * Updates a slide from a [WebScene's slides](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#updateFrom)
    */
  def updateFrom(view: SceneView): js.Promise[Slide] = js.native
  def updateFrom(view: SceneView, options: SlideUpdateFromOptions): js.Promise[Slide] = js.native
  
  /**
    * The viewpoint of the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#viewpoint)
    */
  var viewpoint: Viewpoint = js.native
  
  /**
    * The visible layers of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers)
    */
  var visibleLayers: Collection[SlideVisibleLayers] = js.native
}
