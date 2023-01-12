package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPreview extends StObject {
  
  /**
    * The ARN of the analyzer used to generate the access preview.
    */
  var analyzerArn: AnalyzerArn
  
  /**
    * A map of resource ARNs for the proposed resource configuration.
    */
  var configurations: ConfigurationsMap
  
  /**
    * The time at which the access preview was created.
    */
  var createdAt: js.Date
  
  /**
    * The unique ID for the access preview.
    */
  var id: AccessPreviewId
  
  /**
    * The status of the access preview.    Creating - The access preview creation is in progress.    Completed - The access preview is complete. You can preview findings for external access to the resource.    Failed - The access preview creation has failed.  
    */
  var status: AccessPreviewStatus
  
  /**
    * Provides more details about the current status of the access preview. For example, if the creation of the access preview fails, a Failed status is returned. This failure can be due to an internal issue with the analysis or due to an invalid resource configuration.
    */
  var statusReason: js.UndefOr[AccessPreviewStatusReason] = js.undefined
}
object AccessPreview {
  
  inline def apply(
    analyzerArn: AnalyzerArn,
    configurations: ConfigurationsMap,
    createdAt: js.Date,
    id: AccessPreviewId,
    status: AccessPreviewStatus
  ): AccessPreview = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], configurations = configurations.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPreview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPreview] (val x: Self) extends AnyVal {
    
    inline def setAnalyzerArn(value: AnalyzerArn): Self = StObject.set(x, "analyzerArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurations(value: ConfigurationsMap): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setId(value: AccessPreviewId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AccessPreviewStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: AccessPreviewStatusReason): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
  }
}
