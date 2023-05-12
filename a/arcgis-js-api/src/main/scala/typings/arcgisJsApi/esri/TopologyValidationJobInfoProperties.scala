package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`in-progress`
import typings.arcgisJsApi.arcgisJsApiStrings.completed
import typings.arcgisJsApi.arcgisJsApiStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopologyValidationJobInfoProperties extends StObject {
  
  /**
    * The last date and time the service was updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TopologyValidationJobInfo.html#lastUpdatedTime)
    */
  var lastUpdatedTime: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * The job status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TopologyValidationJobInfo.html#status)
    */
  var status: js.UndefOr[pending | `in-progress` | completed] = js.undefined
  
  /**
    * ArcGIS Server Rest API endpoint to the resource that receives the validate network topology request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TopologyValidationJobInfo.html#statusUrl)
    */
  var statusUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time in which [submitTopologyValidationJob()](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#submitTopologyValidationJob) is first called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TopologyValidationJobInfo.html#submissionTime)
    */
  var submissionTime: js.UndefOr[DateProperties] = js.undefined
}
object TopologyValidationJobInfoProperties {
  
  inline def apply(): TopologyValidationJobInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopologyValidationJobInfoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopologyValidationJobInfoProperties] (val x: Self) extends AnyVal {
    
    inline def setLastUpdatedTime(value: DateProperties): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setStatus(value: pending | `in-progress` | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusUrl(value: String): Self = StObject.set(x, "statusUrl", value.asInstanceOf[js.Any])
    
    inline def setStatusUrlUndefined: Self = StObject.set(x, "statusUrl", js.undefined)
    
    inline def setSubmissionTime(value: DateProperties): Self = StObject.set(x, "submissionTime", value.asInstanceOf[js.Any])
    
    inline def setSubmissionTimeUndefined: Self = StObject.set(x, "submissionTime", js.undefined)
  }
}
