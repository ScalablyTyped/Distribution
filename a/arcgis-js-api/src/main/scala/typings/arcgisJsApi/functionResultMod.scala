package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FunctionResult
import typings.arcgisJsApi.esri.FunctionResultConstructor
import typings.arcgisJsApi.esri.FunctionResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionResultMod extends Shortcut {
  
  @JSImport("esri/rest/networks/support/FunctionResult", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FunctionResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/networks/support/FunctionResult", JSImport.Namespace)
  @js.native
  /**
    * A trace can optionally return a aggregated function result if the trace configuration asked for it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-FunctionResult.html)
    */
  open class Class ()
    extends StObject
       with FunctionResult {
    def this(properties: FunctionResultProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FunctionResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `functionResultMod.foo` */
  override def _to: js.Object & FunctionResultConstructor = ^
}
