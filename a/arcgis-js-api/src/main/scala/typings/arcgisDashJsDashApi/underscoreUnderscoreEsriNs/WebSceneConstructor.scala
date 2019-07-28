package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSceneConstructor
  extends /**
  * The web scene is the core element of 3D mapping across the ArcGIS platform. It defines the content, style, environment, and slides of your scene and it can be shared across multiple ArcGIS web and desktop applications. Web scenes can be created, published, and consumed in [ArcGIS Pro](http://pro.arcgis.com/en/pro-app/help/mapping/map-authoring/author-a-web-scene.htm) and ArcGIS Online with the [Scene Viewer](http://server.arcgis.com/en/portal/latest/use/make-your-first-scene.htm). The web scene is saved as a JSON document that can be consumed by the ArcGIS API for JavaScript via the WebScene class to easily create compelling 3D applications. The JSON document is written according to the [web scene specification](https://developers.arcgis.com/web-scene-specification/).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html)
  */
Instantiable0[WebScene]
     with Instantiable1[/* properties */ WebSceneProperties, WebScene] {
  /**
    * Creates a new instance of [this class]() and initializes it with values from a JSON object generated from a product in the ArcGIS platform. The object passed into the input `json` parameter often comes from a response to a query operation in the REST API or a [toJSON()](http://pro.arcgis.com/en/pro-app/tool-reference/conversion/features-to-json.htm) method from another ArcGIS product. If the [WebScene]() is used outside of a view, you must call [load()](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#load) explicitly to interact with its resources. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for details and examples of when and how to use this function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#fromJSON)
    *
    * @param json A JSON representation of the instance in the ArcGIS format. See the [web scene specification](https://developers.arcgis.com/web-scene-specification/) for more detailed information on serializing web scenes to JSON.
    *
    */
  def fromJSON(json: js.Any): js.Any = js.native
}

