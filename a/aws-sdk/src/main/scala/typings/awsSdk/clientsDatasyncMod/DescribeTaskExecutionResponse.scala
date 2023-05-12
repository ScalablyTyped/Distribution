package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTaskExecutionResponse extends StObject {
  
  /**
    * The physical number of bytes transferred over the network after compression was applied. In most cases, this number is less than BytesTransferred unless the data isn't compressible.
    */
  var BytesCompressed: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of bytes that are involved in the transfer. For the number of bytes sent over the network, see BytesCompressed. 
    */
  var BytesTransferred: js.UndefOr[long] = js.undefined
  
  /**
    * The number of logical bytes written to the destination Amazon Web Services storage resource.
    */
  var BytesWritten: js.UndefOr[long] = js.undefined
  
  /**
    * The estimated physical number of bytes that is to be transferred over the network.
    */
  var EstimatedBytesToTransfer: js.UndefOr[long] = js.undefined
  
  /**
    * The expected number of files that is to be transferred over the network. This value is calculated during the PREPARING phase before the TRANSFERRING phase of the task execution. This value is the expected number of files to be transferred. It's calculated based on comparing the content of the source and destination locations and finding the delta that needs to be transferred. 
    */
  var EstimatedFilesToTransfer: js.UndefOr[long] = js.undefined
  
  /**
    * A list of filter rules that exclude specific data during your transfer. For more information and examples, see Filtering data transferred by DataSync.
    */
  var Excludes: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The actual number of files that was transferred over the network. This value is calculated and updated on an ongoing basis during the TRANSFERRING phase of the task execution. It's updated periodically when each file is read from the source and sent over the network.  If failures occur during a transfer, this value can be less than EstimatedFilesToTransfer. In some cases, this value can also be greater than EstimatedFilesToTransfer. This element is implementation-specific for some location types, so don't use it as an indicator for a correct file number or to monitor your task execution.
    */
  var FilesTransferred: js.UndefOr[long] = js.undefined
  
  /**
    * A list of filter rules that include specific data during your transfer. For more information and examples, see Filtering data transferred by DataSync.
    */
  var Includes: js.UndefOr[FilterList] = js.undefined
  
  var Options: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Options] = js.undefined
  
  /**
    * The result of the task execution.
    */
  var Result: js.UndefOr[TaskExecutionResultDetail] = js.undefined
  
  /**
    * The time that the task execution was started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the task execution.  For detailed information about task execution statuses, see Understanding Task Statuses in the DataSync User Guide. 
    */
  var Status: js.UndefOr[TaskExecutionStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task execution that was described. TaskExecutionArn is hierarchical and includes TaskArn for the task that was executed.  For example, a TaskExecution value with the ARN arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b executed the task with the ARN arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2. 
    */
  var TaskExecutionArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.TaskExecutionArn] = js.undefined
}
object DescribeTaskExecutionResponse {
  
  inline def apply(): DescribeTaskExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTaskExecutionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTaskExecutionResponse] (val x: Self) extends AnyVal {
    
    inline def setBytesCompressed(value: long): Self = StObject.set(x, "BytesCompressed", value.asInstanceOf[js.Any])
    
    inline def setBytesCompressedUndefined: Self = StObject.set(x, "BytesCompressed", js.undefined)
    
    inline def setBytesTransferred(value: long): Self = StObject.set(x, "BytesTransferred", value.asInstanceOf[js.Any])
    
    inline def setBytesTransferredUndefined: Self = StObject.set(x, "BytesTransferred", js.undefined)
    
    inline def setBytesWritten(value: long): Self = StObject.set(x, "BytesWritten", value.asInstanceOf[js.Any])
    
    inline def setBytesWrittenUndefined: Self = StObject.set(x, "BytesWritten", js.undefined)
    
    inline def setEstimatedBytesToTransfer(value: long): Self = StObject.set(x, "EstimatedBytesToTransfer", value.asInstanceOf[js.Any])
    
    inline def setEstimatedBytesToTransferUndefined: Self = StObject.set(x, "EstimatedBytesToTransfer", js.undefined)
    
    inline def setEstimatedFilesToTransfer(value: long): Self = StObject.set(x, "EstimatedFilesToTransfer", value.asInstanceOf[js.Any])
    
    inline def setEstimatedFilesToTransferUndefined: Self = StObject.set(x, "EstimatedFilesToTransfer", js.undefined)
    
    inline def setExcludes(value: FilterList): Self = StObject.set(x, "Excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "Excludes", js.undefined)
    
    inline def setExcludesVarargs(value: FilterRule*): Self = StObject.set(x, "Excludes", js.Array(value*))
    
    inline def setFilesTransferred(value: long): Self = StObject.set(x, "FilesTransferred", value.asInstanceOf[js.Any])
    
    inline def setFilesTransferredUndefined: Self = StObject.set(x, "FilesTransferred", js.undefined)
    
    inline def setIncludes(value: FilterList): Self = StObject.set(x, "Includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "Includes", js.undefined)
    
    inline def setIncludesVarargs(value: FilterRule*): Self = StObject.set(x, "Includes", js.Array(value*))
    
    inline def setOptions(value: Options): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setResult(value: TaskExecutionResultDetail): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: TaskExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "TaskExecutionArn", value.asInstanceOf[js.Any])
    
    inline def setTaskExecutionArnUndefined: Self = StObject.set(x, "TaskExecutionArn", js.undefined)
  }
}
