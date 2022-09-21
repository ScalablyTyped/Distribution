package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtrudeSymbol3DLayerConstructor
  extends StObject
     with /**
  * ExtrudeSymbol3DLayer is used to render [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries by extruding them upward from the ground, creating a 3D volumetric object.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html)
  */
Instantiable0[ExtrudeSymbol3DLayer]
     with Instantiable1[/* properties */ ExtrudeSymbol3DLayerProperties, ExtrudeSymbol3DLayer] {
  
  def fromJSON(json: Any): ExtrudeSymbol3DLayer = js.native
}
