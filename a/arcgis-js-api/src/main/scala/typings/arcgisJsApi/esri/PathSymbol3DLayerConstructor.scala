package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathSymbol3DLayerConstructor
  extends StObject
     with /**
  * PathSymbol3DLayer renders [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries by extruding a 2D profile along the line.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html)
  */
Instantiable0[PathSymbol3DLayer]
     with Instantiable1[/* properties */ PathSymbol3DLayerProperties, PathSymbol3DLayer] {
  
  def fromJSON(json: js.Any): PathSymbol3DLayer = js.native
}
