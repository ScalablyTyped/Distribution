package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonConstructor
  extends StObject
     with Instantiable0[Polygon]
     with Instantiable1[/* properties */ PolygonProperties, Polygon] {
  
  /**
    * Converts the given Extent to a Polygon instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#fromExtent)
    */
  def fromExtent(extent: Extent): Polygon = js.native
  
  def fromJSON(json: Any): Polygon = js.native
}
