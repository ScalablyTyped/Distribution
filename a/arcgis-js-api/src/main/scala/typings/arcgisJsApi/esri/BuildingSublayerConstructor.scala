package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingSublayerConstructor
  extends StObject
     with /**
  * BuildingSublayer is the base class for sublayers of a BuildingSceneLayer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html)
  */
Instantiable0[BuildingSublayer]
     with Instantiable1[/* properties */ BuildingSublayerProperties, BuildingSublayer] {
  
  def fromJSON(json: Any): BuildingSublayer = js.native
}
