package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingComponentSublayerConstructor
  extends StObject
     with /**
  * BuildingComponentSublayers contain 3D Object features representing building components like doors, pipes or AC units.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html)
  */
Instantiable0[BuildingComponentSublayer]
     with Instantiable1[/* properties */ BuildingComponentSublayerProperties, BuildingComponentSublayer] {
  
  def fromJSON(json: js.Any): BuildingComponentSublayer = js.native
}
