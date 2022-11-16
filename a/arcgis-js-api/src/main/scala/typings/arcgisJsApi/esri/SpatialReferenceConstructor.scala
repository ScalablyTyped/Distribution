package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialReferenceConstructor
  extends StObject
     with Instantiable0[SpatialReference]
     with Instantiable1[/* properties */ SpatialReferenceProperties, SpatialReference] {
  
  /**
    * A convenience spatial reference instance for WGS84.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#WGS84)
    */
  var WGS84: SpatialReference = js.native
  
  /**
    * A convenience spatial reference instance for Web Mercator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#WebMercator)
    */
  var WebMercator: SpatialReference = js.native
  
  def fromJSON(json: Any): SpatialReference = js.native
}
