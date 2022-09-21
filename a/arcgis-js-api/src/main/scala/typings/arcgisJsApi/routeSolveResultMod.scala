package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RouteSolveResult
import typings.arcgisJsApi.esri.RouteSolveResultConstructor
import typings.arcgisJsApi.esri.RouteSolveResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeSolveResultMod extends Shortcut {
  
  @JSImport("esri/rest/support/RouteSolveResult", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RouteSolveResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/RouteSolveResult", JSImport.Namespace)
  @js.native
  /**
    * The results from [route.solve()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-route.html#solve) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html)
    */
  open class Class ()
    extends StObject
       with RouteSolveResult {
    def this(properties: RouteSolveResultProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & RouteSolveResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `routeSolveResultMod.foo` */
  override def _to: js.Object & RouteSolveResultConstructor = ^
}
