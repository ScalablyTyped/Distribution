package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.WebScene")
@js.native
/**
  * The web scene is the core element of 3D mapping across the ArcGIS platform. It defines the content, style, environment, and slides of your scene and it can be shared across multiple ArcGIS web and desktop applications. Web scenes can be created, published, and consumed in [ArcGIS Pro](http://pro.arcgis.com/en/pro-app/help/mapping/map-authoring/author-a-web-scene.htm) and ArcGIS Online with the [Scene Viewer](http://server.arcgis.com/en/portal/latest/use/make-your-first-scene.htm). The web scene is saved as a JSON document that can be consumed by the ArcGIS API for JavaScript via the WebScene class to easily create compelling 3D applications. The JSON document is written according to the [web scene specification](https://developers.arcgis.com/web-scene-specification/).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html)
  */
class WebSceneCls () extends WebScene {
  def this(properties: WebSceneProperties) = this()
}

