package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ProjectParameters
import typings.arcgisJsApi.esri.ProjectParametersConstructor
import typings.arcgisJsApi.esri.ProjectParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/ProjectParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ProjectParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ProjectParameters", JSImport.Namespace)
  @js.native
  /**
    * Defines the projection parameters used when calling the [geometryService.project()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#project).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ProjectParameters.html)
    */
  open class Class ()
    extends StObject
       with ProjectParameters {
    def this(properties: ProjectParametersProperties) = this()
  }
  
  type _To = js.Object & ProjectParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `projectParametersMod.foo` */
  override def _to: js.Object & ProjectParametersConstructor = ^
}
