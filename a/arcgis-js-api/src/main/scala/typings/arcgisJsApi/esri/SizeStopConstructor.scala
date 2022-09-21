package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeStopConstructor
  extends StObject
     with /**
  * Defines a size stop used for creating a continuous size visualization in a [size visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#stops).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html)
  */
Instantiable0[SizeStop]
     with Instantiable1[/* properties */ SizeStopProperties, SizeStop] {
  
  def fromJSON(json: Any): SizeStop = js.native
}
