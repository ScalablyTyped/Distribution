package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DistanceParameters
import typings.arcgisJsApi.esri.DistanceParametersConstructor
import typings.arcgisJsApi.esri.DistanceParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportDistanceParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/DistanceParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DistanceParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/DistanceParameters", JSImport.Namespace)
  @js.native
  /**
    * Defines the input parameters when calling [geometryService.distance()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#distance).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html)
    */
  open class Class ()
    extends StObject
       with DistanceParameters {
    def this(properties: DistanceParametersProperties) = this()
  }
  
  type _To = js.Object & DistanceParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportDistanceParametersMod.foo` */
  override def _to: js.Object & DistanceParametersConstructor = ^
}
