package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DistanceParameters
import typings.arcgisJsApi.esri.DistanceParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportDistanceParametersMod {
  
  @JSImport("esri/rest/support/DistanceParameters", JSImport.Namespace)
  @js.native
  /**
    * Defines the input parameters when calling [geometryService.distance()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#distance).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html)
    */
  open class ^ ()
    extends StObject
       with DistanceParameters {
    def this(properties: DistanceParametersProperties) = this()
  }
}
