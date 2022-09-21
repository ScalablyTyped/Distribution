package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpacityStopConstructor
  extends StObject
     with /**
  * Defines an opacity stop used for creating a continuous opacity visualization in a [opacity visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-OpacityStop.html)
  */
Instantiable0[OpacityStop]
     with Instantiable1[/* properties */ OpacityStopProperties, OpacityStop] {
  
  def fromJSON(json: Any): OpacityStop = js.native
}
