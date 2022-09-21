package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregatedGeometryConstructor
  extends StObject
     with /**
  * A class that defines an aggregation of geometries.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html)
  */
Instantiable0[AggregatedGeometry]
     with Instantiable1[/* properties */ AggregatedGeometryProperties, AggregatedGeometry] {
  
  def fromJSON(json: Any): AggregatedGeometry = js.native
}
