package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSceneConstructor
  extends /**
  * The web scene is the core element of 3D mapping across the ArcGIS platform.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html)
  */
Instantiable0[WebScene]
     with Instantiable1[/* properties */ WebSceneProperties, WebScene] {
  
  /**
    * Creates a new instance of [this class]() and initializes it with values from a JSON object generated from a product in the ArcGIS platform.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#fromJSON)
    */
  def fromJSON(json: js.Any): js.Any = js.native
}
