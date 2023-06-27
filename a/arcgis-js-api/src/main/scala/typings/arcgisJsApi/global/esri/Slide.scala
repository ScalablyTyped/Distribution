package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SlideCreateFromOptions
import typings.arcgisJsApi.esri.SlideProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Slide")
@js.native
/**
		 * A slide stores a snapshot of several pre-set properties of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), such as the [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#basemap), [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#viewpoint) and [visible layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html)
		 */
open class Slide ()
  extends StObject
     with typings.arcgisJsApi.esri.Slide {
  def this(properties: SlideProperties) = this()
}
/* static members */
object Slide {
  
  @JSGlobal("__esri.Slide")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Creates a slide from a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), which may be added to the [slides](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides) in the WebScene's [presentation](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#presentation).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
  		 */
  inline def createFrom(view: typings.arcgisJsApi.esri.SceneView): js.Promise[typings.arcgisJsApi.esri.Slide] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFrom")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.arcgisJsApi.esri.Slide]]
  inline def createFrom(view: typings.arcgisJsApi.esri.SceneView, options: SlideCreateFromOptions): js.Promise[typings.arcgisJsApi.esri.Slide] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFrom")(view.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.arcgisJsApi.esri.Slide]]
}
