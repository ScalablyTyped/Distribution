package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * With the Service area service, you can find the area that can be reached from the input location within a given travel time or travel distance.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-serviceArea.html)
  */
@js.native
trait serviceArea extends StObject {
  
  /**
    * Determines the service area based on a set of parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-serviceArea.html#solve)
    */
  def solve(url: String, params: ServiceAreaParameters): js.Promise[ServiceAreaSolveResult] = js.native
  def solve(url: String, params: ServiceAreaParameters, requestOptions: Any): js.Promise[ServiceAreaSolveResult] = js.native
}
