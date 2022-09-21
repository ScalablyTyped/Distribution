package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.sun
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait websceneSunLighting
  extends StObject
     with Accessor {
  
  /**
    * The current date and time of the simulated sun.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-SunLighting.html#date)
    */
  var date: js.Date = js.native
  
  /**
    * Indicates whether to show shadows cast by the sun.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-SunLighting.html#directShadowsEnabled)
    */
  var directShadowsEnabled: Boolean = js.native
  
  /**
    * The UTC time zone offset in hours that should be displayed in the UI to represent the date.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-SunLighting.html#displayUTCOffset)
    */
  var displayUTCOffset: Double = js.native
  
  /**
    * Indicates that the light source is simulated position of the sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-SunLighting.html#type)
    */
  val `type`: sun = js.native
}
