package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Stop
import typings.arcgisJsApi.esri.StopConstructor
import typings.arcgisJsApi.esri.StopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportStopMod extends Shortcut {
  
  @JSImport("esri/rest/support/Stop", JSImport.Namespace)
  @js.native
  val ^ : js.Object & StopConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/Stop", JSImport.Namespace)
  @js.native
  /**
    * A stop respresents the start, end, or midpoint of a route in [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops) or [RouteParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html)
    */
  open class Class ()
    extends StObject
       with Stop {
    def this(properties: StopProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & StopConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportStopMod.foo` */
  override def _to: js.Object & StopConstructor = ^
}
