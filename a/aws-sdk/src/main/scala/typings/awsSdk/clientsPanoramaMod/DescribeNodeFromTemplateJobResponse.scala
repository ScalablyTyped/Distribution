package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNodeFromTemplateJobResponse extends StObject {
  
  /**
    * When the job was created.
    */
  var CreatedTime: js.Date
  
  /**
    * The job's ID.
    */
  var JobId: typings.awsSdk.clientsPanoramaMod.JobId
  
  /**
    * The job's tags.
    */
  var JobTags: js.UndefOr[JobTagsList] = js.undefined
  
  /**
    * When the job was updated.
    */
  var LastUpdatedTime: js.Date
  
  /**
    * The node's description.
    */
  var NodeDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The node's name.
    */
  var NodeName: typings.awsSdk.clientsPanoramaMod.NodeName
  
  /**
    * The job's output package name.
    */
  var OutputPackageName: NodePackageName
  
  /**
    * The job's output package version.
    */
  var OutputPackageVersion: NodePackageVersion
  
  /**
    * The job's status.
    */
  var Status: NodeFromTemplateJobStatus
  
  /**
    * The job's status message.
    */
  var StatusMessage: NodeFromTemplateJobStatusMessage
  
  /**
    * The job's template parameters.
    */
  var TemplateParameters: TemplateParametersMap
  
  /**
    * The job's template type.
    */
  var TemplateType: typings.awsSdk.clientsPanoramaMod.TemplateType
}
object DescribeNodeFromTemplateJobResponse {
  
  inline def apply(
    CreatedTime: js.Date,
    JobId: JobId,
    LastUpdatedTime: js.Date,
    NodeName: NodeName,
    OutputPackageName: NodePackageName,
    OutputPackageVersion: NodePackageVersion,
    Status: NodeFromTemplateJobStatus,
    StatusMessage: NodeFromTemplateJobStatusMessage,
    TemplateParameters: TemplateParametersMap,
    TemplateType: TemplateType
  ): DescribeNodeFromTemplateJobResponse = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], LastUpdatedTime = LastUpdatedTime.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], OutputPackageName = OutputPackageName.asInstanceOf[js.Any], OutputPackageVersion = OutputPackageVersion.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StatusMessage = StatusMessage.asInstanceOf[js.Any], TemplateParameters = TemplateParameters.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeFromTemplateJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeNodeFromTemplateJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobTags(value: JobTagsList): Self = StObject.set(x, "JobTags", value.asInstanceOf[js.Any])
    
    inline def setJobTagsUndefined: Self = StObject.set(x, "JobTags", js.undefined)
    
    inline def setJobTagsVarargs(value: JobResourceTags*): Self = StObject.set(x, "JobTags", js.Array(value*))
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setNodeDescription(value: Description): Self = StObject.set(x, "NodeDescription", value.asInstanceOf[js.Any])
    
    inline def setNodeDescriptionUndefined: Self = StObject.set(x, "NodeDescription", js.undefined)
    
    inline def setNodeName(value: NodeName): Self = StObject.set(x, "NodeName", value.asInstanceOf[js.Any])
    
    inline def setOutputPackageName(value: NodePackageName): Self = StObject.set(x, "OutputPackageName", value.asInstanceOf[js.Any])
    
    inline def setOutputPackageVersion(value: NodePackageVersion): Self = StObject.set(x, "OutputPackageVersion", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: NodeFromTemplateJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: NodeFromTemplateJobStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setTemplateParameters(value: TemplateParametersMap): Self = StObject.set(x, "TemplateParameters", value.asInstanceOf[js.Any])
    
    inline def setTemplateType(value: TemplateType): Self = StObject.set(x, "TemplateType", value.asInstanceOf[js.Any])
  }
}
