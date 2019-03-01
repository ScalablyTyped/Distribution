package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialReferenceConstructor
  extends org.scalablytyped.runtime.Instantiable0[SpatialReference]
     with org.scalablytyped.runtime.Instantiable1[/* properties */ SpatialReferenceProperties, SpatialReference] {
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
  def fromJSON(json: js.Any): SpatialReference = js.native
}

