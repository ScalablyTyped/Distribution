package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmicColorRampConstructor
  extends StObject
     with /**
  * Creates a color ramp for use in a raster renderer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AlgorithmicColorRamp.html)
  */
Instantiable0[AlgorithmicColorRamp]
     with Instantiable1[/* properties */ AlgorithmicColorRampProperties, AlgorithmicColorRamp] {
  
  def fromJSON(json: Any): AlgorithmicColorRamp = js.native
}
