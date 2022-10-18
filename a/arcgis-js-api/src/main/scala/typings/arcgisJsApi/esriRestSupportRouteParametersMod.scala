package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RouteParameters
import typings.arcgisJsApi.esri.RouteParametersConstructor
import typings.arcgisJsApi.esri.RouteParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportRouteParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/RouteParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RouteParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/RouteParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for [route](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-route.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html)
    */
  open class Class ()
    extends StObject
       with RouteParameters {
    def this(properties: RouteParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & RouteParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportRouteParametersMod.foo` */
  override def _to: js.Object & RouteParametersConstructor = ^
}
