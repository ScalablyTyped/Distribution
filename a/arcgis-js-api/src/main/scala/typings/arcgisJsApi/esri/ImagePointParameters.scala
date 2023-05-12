package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePointParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Input geometry to determine a a point location or a centroid of a given area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePointParameters.html#geometry)
    */
  var geometry: Point | Extent | Polygon = js.native
  
  /**
    * When `true`, this method calculates the z-value for the returned point geometry.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePointParameters.html#is3D)
    */
  var is3D: Boolean = js.native
  
  /**
    * The string value representing the type of imagery mensuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePointParameters.html#type)
    */
  val `type`: point = js.native
}
