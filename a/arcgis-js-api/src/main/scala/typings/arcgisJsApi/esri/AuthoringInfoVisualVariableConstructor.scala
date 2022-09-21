package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthoringInfoVisualVariableConstructor
  extends StObject
     with /**
  * Contains authoring properties of visual variables generated from one of the Smart Mapping methods or sliders.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html)
  */
Instantiable0[AuthoringInfoVisualVariable]
     with Instantiable1[
      /* properties */ AuthoringInfoVisualVariableProperties, 
      AuthoringInfoVisualVariable
    ] {
  
  def fromJSON(json: Any): AuthoringInfoVisualVariable = js.native
}
