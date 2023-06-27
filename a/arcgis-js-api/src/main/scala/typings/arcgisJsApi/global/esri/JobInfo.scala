package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.JobInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.JobInfo")
@js.native
/**
		 * Represents information pertaining to the execution of an asynchronous [geoprocessor](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor.html) request on the server.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html)
		 */
open class JobInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.JobInfo {
  def this(properties: JobInfoProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object JobInfo {
  
  @JSGlobal("__esri.JobInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.JobInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.JobInfo]
}
