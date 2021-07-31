package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpacityVariable
  extends StObject
     with VisualVariable {
  
  /**
    * Name of the numeric attribute field by which to normalize the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#normalizationField)
    */
  var normalizationField: String = js.native
  
  /**
    * An array of objects that defines the opacity to apply to features in a layer in a sequence of stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops)
    */
  var stops: js.Array[OpacityStop] = js.native
  
  /**
    * The visual variable type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#type)
    */
  @JSName("type")
  val type_OpacityVariable: typings.arcgisJsApi.arcgisJsApiStrings.opacity = js.native
}
