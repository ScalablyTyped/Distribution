package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.OpacityStop
import typings.arcgisJsApi.esri.OpacityStopConstructor
import typings.arcgisJsApi.esri.OpacityStopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opacityStopMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/support/OpacityStop", JSImport.Namespace)
  @js.native
  val ^ : js.Object & OpacityStopConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/support/OpacityStop", JSImport.Namespace)
  @js.native
  /**
    * Defines an opacity stop used for creating a continuous opacity visualization in a [opacity visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-OpacityStop.html)
    */
  open class Class ()
    extends StObject
       with OpacityStop {
    def this(properties: OpacityStopProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & OpacityStopConstructor
  
  /* This means you don't have to write `^`, but can instead just say `opacityStopMod.foo` */
  override def _to: js.Object & OpacityStopConstructor = ^
}
