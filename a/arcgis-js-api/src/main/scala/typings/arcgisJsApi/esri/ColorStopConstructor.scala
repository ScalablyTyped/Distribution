package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorStopConstructor
  extends StObject
     with /**
  * Defines a color stop used for creating a continuous color visualization in a [color visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorStop.html)
  */
Instantiable0[ColorStop]
     with Instantiable1[/* properties */ ColorStopProperties, ColorStop] {
  
  def fromJSON(json: Any): ColorStop = js.native
}
