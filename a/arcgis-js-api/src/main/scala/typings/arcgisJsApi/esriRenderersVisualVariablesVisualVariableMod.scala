package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.VisualVariable
import typings.arcgisJsApi.esri.VisualVariableConstructor
import typings.arcgisJsApi.esri.VisualVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersVisualVariablesVisualVariableMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/VisualVariable", JSImport.Namespace)
  @js.native
  val ^ : js.Object & VisualVariableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/VisualVariable", JSImport.Namespace)
  @js.native
  /**
    * The visual variable base class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html)
    */
  open class Class ()
    extends StObject
       with VisualVariable {
    def this(properties: VisualVariableProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & VisualVariableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersVisualVariablesVisualVariableMod.foo` */
  override def _to: js.Object & VisualVariableConstructor = ^
}
