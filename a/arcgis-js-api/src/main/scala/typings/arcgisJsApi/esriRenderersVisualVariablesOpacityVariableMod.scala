package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.OpacityVariable
import typings.arcgisJsApi.esri.OpacityVariableConstructor
import typings.arcgisJsApi.esri.OpacityVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersVisualVariablesOpacityVariableMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/OpacityVariable", JSImport.Namespace)
  @js.native
  val ^ : js.Object & OpacityVariableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/OpacityVariable", JSImport.Namespace)
  @js.native
  /**
    * The opacity visual variable defines the opacity of each feature's symbol based on a numeric [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#field) value or number returned from an [expression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#valueExpression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html)
    */
  open class Class ()
    extends StObject
       with OpacityVariable {
    def this(properties: OpacityVariableProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & OpacityVariableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersVisualVariablesOpacityVariableMod.foo` */
  override def _to: js.Object & OpacityVariableConstructor = ^
}
