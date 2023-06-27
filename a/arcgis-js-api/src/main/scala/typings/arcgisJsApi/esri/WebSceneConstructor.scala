package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSceneConstructor
  extends StObject
     with Instantiable0[WebScene]
     with Instantiable1[/* properties */ WebSceneProperties, WebScene] {
  
  /**
  		 * Creates a new instance of this class and initializes it with values from a JSON object generated from an ArcGIS product.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#fromJSON)
  		 */
  def fromJSON(json: Any): WebScene = js.native
  
  /**
  		 * The latest supported webscene spec version.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#version)
  		 */
  val version: String = js.native
}
