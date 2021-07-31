package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment
  extends StObject
     with Accessor {
  
  /**
    * Specifies whether the atmosphere should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#atmosphereEnabled)
    */
  var atmosphereEnabled: Boolean = js.native
  
  /**
    * Specifies how the background of the scene (which lies behind sky, stars and atmosphere) should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#background)
    */
  var background: Background = js.native
  
  /**
    * Settings for defining the lighting of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#lighting)
    */
  var lighting: Lighting = js.native
  
  /**
    * Specifies whether stars should be displayed in the sky.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#starsEnabled)
    */
  var starsEnabled: Boolean = js.native
}
