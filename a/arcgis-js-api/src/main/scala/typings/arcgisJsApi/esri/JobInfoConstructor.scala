package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobInfoConstructor
  extends StObject
     with /**
  * Represents information pertaining to the execution of an asynchronous [geoprocessor](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor.html) request on the server.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html)
  */
Instantiable0[JobInfo]
     with Instantiable1[/* properties */ JobInfoProperties, JobInfo] {
  
  def fromJSON(json: Any): JobInfo = js.native
}
