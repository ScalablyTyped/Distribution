package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RouteInfo
import typings.arcgisJsApi.esri.RouteInfoConstructor
import typings.arcgisJsApi.esri.RouteInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportRouteInfoMod extends Shortcut {
  
  @JSImport("esri/rest/support/RouteInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RouteInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/RouteInfo", JSImport.Namespace)
  @js.native
  /**
    * A RouteInfo contains information about a solved route including the routes geometry and overall distance and time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html)
    */
  open class Class ()
    extends StObject
       with RouteInfo {
    def this(properties: RouteInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & RouteInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportRouteInfoMod.foo` */
  override def _to: js.Object & RouteInfoConstructor = ^
}
