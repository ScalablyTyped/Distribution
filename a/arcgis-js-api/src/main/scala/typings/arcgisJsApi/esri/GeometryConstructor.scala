package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryConstructor
  extends StObject
     with /**
  * The base class for geometry objects.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html)
  */
Instantiable0[Geometry_]
     with Instantiable1[/* properties */ GeometryProperties, Geometry_] {
  
  def fromJSON(json: Any): Geometry_ = js.native
}
