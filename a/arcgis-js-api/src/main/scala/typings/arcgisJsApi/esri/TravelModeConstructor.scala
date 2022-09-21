package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TravelModeConstructor
  extends StObject
     with /**
  * A TravelMode is a set of characteristics that define how an object like a vehicle, bicycle, or pedestrian moves along a street network.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html)
  */
Instantiable0[TravelMode]
     with Instantiable1[/* properties */ TravelModeProperties, TravelMode] {
  
  def fromJSON(json: Any): TravelMode = js.native
}
