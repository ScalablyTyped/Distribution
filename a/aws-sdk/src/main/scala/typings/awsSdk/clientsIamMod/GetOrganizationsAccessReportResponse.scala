package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrganizationsAccessReportResponse extends StObject {
  
  /**
    * An object that contains details about the most recent attempt to access the service.
    */
  var AccessDetails: js.UndefOr[typings.awsSdk.clientsIamMod.AccessDetails] = js.undefined
  
  var ErrorDetails: js.UndefOr[typings.awsSdk.clientsIamMod.ErrorDetails] = js.undefined
  
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when the generated report job was completed or failed. This field is null if the job is still in progress, as indicated by a job status value of IN_PROGRESS.
    */
  var JobCompletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when the report job was created.
    */
  var JobCreationDate: js.Date
  
  /**
    * The status of the job.
    */
  var JobStatus: jobStatusType
  
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[markerType] = js.undefined
  
  /**
    * The number of services that the applicable SCPs allow account principals to access.
    */
  var NumberOfServicesAccessible: js.UndefOr[integerType] = js.undefined
  
  /**
    * The number of services that account principals are allowed but did not attempt to access.
    */
  var NumberOfServicesNotAccessed: js.UndefOr[integerType] = js.undefined
}
object GetOrganizationsAccessReportResponse {
  
  inline def apply(JobCreationDate: js.Date, JobStatus: jobStatusType): GetOrganizationsAccessReportResponse = {
    val __obj = js.Dynamic.literal(JobCreationDate = JobCreationDate.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationsAccessReportResponse]
  }
  
  extension [Self <: GetOrganizationsAccessReportResponse](x: Self) {
    
    inline def setAccessDetails(value: AccessDetails): Self = StObject.set(x, "AccessDetails", value.asInstanceOf[js.Any])
    
    inline def setAccessDetailsUndefined: Self = StObject.set(x, "AccessDetails", js.undefined)
    
    inline def setAccessDetailsVarargs(value: AccessDetail*): Self = StObject.set(x, "AccessDetails", js.Array(value*))
    
    inline def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    inline def setIsTruncated(value: booleanType): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setJobCompletionDate(value: js.Date): Self = StObject.set(x, "JobCompletionDate", value.asInstanceOf[js.Any])
    
    inline def setJobCompletionDateUndefined: Self = StObject.set(x, "JobCompletionDate", js.undefined)
    
    inline def setJobCreationDate(value: js.Date): Self = StObject.set(x, "JobCreationDate", value.asInstanceOf[js.Any])
    
    inline def setJobStatus(value: jobStatusType): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: markerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setNumberOfServicesAccessible(value: integerType): Self = StObject.set(x, "NumberOfServicesAccessible", value.asInstanceOf[js.Any])
    
    inline def setNumberOfServicesAccessibleUndefined: Self = StObject.set(x, "NumberOfServicesAccessible", js.undefined)
    
    inline def setNumberOfServicesNotAccessed(value: integerType): Self = StObject.set(x, "NumberOfServicesNotAccessed", value.asInstanceOf[js.Any])
    
    inline def setNumberOfServicesNotAccessedUndefined: Self = StObject.set(x, "NumberOfServicesNotAccessed", js.undefined)
  }
}
