package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ColorVariable
import typings.arcgisJsApi.esri.ColorVariableConstructor
import typings.arcgisJsApi.esri.ColorVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorVariableMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/ColorVariable", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ColorVariableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/ColorVariable", JSImport.Namespace)
  @js.native
  /**
    * The color visual variable is used to visualize features along a continuous color ramp based on the values of a numeric attribute [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#field) or an [expression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#valueExpression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html)
    */
  class Class ()
    extends StObject
       with ColorVariable {
    def this(properties: ColorVariableProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & ColorVariableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `colorVariableMod.foo` */
  override def _to: js.Object & ColorVariableConstructor = ^
}
