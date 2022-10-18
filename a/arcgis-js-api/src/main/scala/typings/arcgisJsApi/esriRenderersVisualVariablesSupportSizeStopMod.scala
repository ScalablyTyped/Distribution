package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SizeStop
import typings.arcgisJsApi.esri.SizeStopConstructor
import typings.arcgisJsApi.esri.SizeStopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersVisualVariablesSupportSizeStopMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/support/SizeStop", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SizeStopConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/support/SizeStop", JSImport.Namespace)
  @js.native
  /**
    * Defines a size stop used for creating a continuous size visualization in a [size visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html)
    */
  open class Class ()
    extends StObject
       with SizeStop {
    def this(properties: SizeStopProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & SizeStopConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersVisualVariablesSupportSizeStopMod.foo` */
  override def _to: js.Object & SizeStopConstructor = ^
}
