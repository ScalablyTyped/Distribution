package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ProjectParameters
import typings.arcgisJsApi.esri.ProjectParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportProjectParametersMod {
  
  @JSImport("esri/rest/support/ProjectParameters", JSImport.Namespace)
  @js.native
  /**
    * Defines the projection parameters used when calling the [geometryService.project()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#project).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ProjectParameters.html)
    */
  open class ^ ()
    extends StObject
       with ProjectParameters {
    def this(properties: ProjectParametersProperties) = this()
  }
}
