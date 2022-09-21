package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DensifyParameters
import typings.arcgisJsApi.esri.DensifyParametersConstructor
import typings.arcgisJsApi.esri.DensifyParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object densifyParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/DensifyParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DensifyParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/DensifyParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for the densify() method on the GeometryService.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DensifyParameters.html)
    */
  open class Class ()
    extends StObject
       with DensifyParameters {
    def this(properties: DensifyParametersProperties) = this()
  }
  
  type _To = js.Object & DensifyParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `densifyParametersMod.foo` */
  override def _to: js.Object & DensifyParametersConstructor = ^
}
