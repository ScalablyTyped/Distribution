package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camera
  extends StObject
     with Accessor
     with JSONSupport
     with _GoToTarget3D {
  
  /**
    * The diagonal field of view (fov) angle for the camera.
    *
    * @default 55
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#fov)
    */
  var fov: Double = js.native
  
  /**
    * The compass heading of the camera in degrees.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading)
    */
  var heading: Double = js.native
  
  /**
    * The position of the camera defined by a map point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position)
    */
  var position: Point = js.native
  
  /**
    * The tilt of the camera in degrees with respect to the surface as projected down from the camera position.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#tilt)
    */
  var tilt: Double = js.native
}
