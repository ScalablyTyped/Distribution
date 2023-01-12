package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeProgressMessage extends StObject {
  
  /**
    * The average rate of the resize operation over the last few minutes, measured in megabytes per second. After the resize operation completes, this value shows the average rate of the entire resize operation.
    */
  var AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * The percent of data transferred from source cluster to target cluster.
    */
  var DataTransferProgressPercent: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * The amount of seconds that have elapsed since the resize operation began. After the resize operation completes, this value shows the total actual time, in seconds, for the resize operation.
    */
  var ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The estimated time remaining, in seconds, until the resize operation is complete. This value is calculated based on the average resize rate and the estimated amount of data remaining to be processed. Once the resize operation is complete, this value will be 0.
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The names of tables that have been completely imported . Valid Values: List of table names.
    */
  var ImportTablesCompleted: js.UndefOr[typings.awsSdk.clientsRedshiftMod.ImportTablesCompleted] = js.undefined
  
  /**
    * The names of tables that are being currently imported. Valid Values: List of table names.
    */
  var ImportTablesInProgress: js.UndefOr[typings.awsSdk.clientsRedshiftMod.ImportTablesInProgress] = js.undefined
  
  /**
    * The names of tables that have not been yet imported. Valid Values: List of table names
    */
  var ImportTablesNotStarted: js.UndefOr[typings.awsSdk.clientsRedshiftMod.ImportTablesNotStarted] = js.undefined
  
  /**
    * An optional string to provide additional details about the resize action.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * While the resize operation is in progress, this value shows the current amount of data, in megabytes, that has been processed so far. When the resize operation is complete, this value shows the total amount of data, in megabytes, on the cluster, which may be more or less than TotalResizeDataInMegaBytes (the estimated total amount of data before resize).
    */
  var ProgressInMegaBytes: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * An enum with possible values of ClassicResize and ElasticResize. These values describe the type of resize operation being performed. 
    */
  var ResizeType: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the resize operation. Valid Values: NONE | IN_PROGRESS | FAILED | SUCCEEDED | CANCELLING 
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The cluster type after the resize operation is complete. Valid Values: multi-node | single-node 
    */
  var TargetClusterType: js.UndefOr[String] = js.undefined
  
  /**
    * The type of encryption for the cluster after the resize is complete. Possible values are KMS and None. 
    */
  var TargetEncryptionType: js.UndefOr[String] = js.undefined
  
  /**
    * The node type that the cluster will have after the resize operation is complete.
    */
  var TargetNodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The number of nodes that the cluster will have after the resize operation is complete.
    */
  var TargetNumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The estimated total amount of data, in megabytes, on the cluster before the resize operation began.
    */
  var TotalResizeDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined
}
object ResizeProgressMessage {
  
  inline def apply(): ResizeProgressMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeProgressMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizeProgressMessage] (val x: Self) extends AnyVal {
    
    inline def setAvgResizeRateInMegaBytesPerSecond(value: DoubleOptional): Self = StObject.set(x, "AvgResizeRateInMegaBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setAvgResizeRateInMegaBytesPerSecondUndefined: Self = StObject.set(x, "AvgResizeRateInMegaBytesPerSecond", js.undefined)
    
    inline def setDataTransferProgressPercent(value: DoubleOptional): Self = StObject.set(x, "DataTransferProgressPercent", value.asInstanceOf[js.Any])
    
    inline def setDataTransferProgressPercentUndefined: Self = StObject.set(x, "DataTransferProgressPercent", js.undefined)
    
    inline def setElapsedTimeInSeconds(value: LongOptional): Self = StObject.set(x, "ElapsedTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeInSecondsUndefined: Self = StObject.set(x, "ElapsedTimeInSeconds", js.undefined)
    
    inline def setEstimatedTimeToCompletionInSeconds(value: LongOptional): Self = StObject.set(x, "EstimatedTimeToCompletionInSeconds", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTimeToCompletionInSecondsUndefined: Self = StObject.set(x, "EstimatedTimeToCompletionInSeconds", js.undefined)
    
    inline def setImportTablesCompleted(value: ImportTablesCompleted): Self = StObject.set(x, "ImportTablesCompleted", value.asInstanceOf[js.Any])
    
    inline def setImportTablesCompletedUndefined: Self = StObject.set(x, "ImportTablesCompleted", js.undefined)
    
    inline def setImportTablesCompletedVarargs(value: String*): Self = StObject.set(x, "ImportTablesCompleted", js.Array(value*))
    
    inline def setImportTablesInProgress(value: ImportTablesInProgress): Self = StObject.set(x, "ImportTablesInProgress", value.asInstanceOf[js.Any])
    
    inline def setImportTablesInProgressUndefined: Self = StObject.set(x, "ImportTablesInProgress", js.undefined)
    
    inline def setImportTablesInProgressVarargs(value: String*): Self = StObject.set(x, "ImportTablesInProgress", js.Array(value*))
    
    inline def setImportTablesNotStarted(value: ImportTablesNotStarted): Self = StObject.set(x, "ImportTablesNotStarted", value.asInstanceOf[js.Any])
    
    inline def setImportTablesNotStartedUndefined: Self = StObject.set(x, "ImportTablesNotStarted", js.undefined)
    
    inline def setImportTablesNotStartedVarargs(value: String*): Self = StObject.set(x, "ImportTablesNotStarted", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setProgressInMegaBytes(value: LongOptional): Self = StObject.set(x, "ProgressInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setProgressInMegaBytesUndefined: Self = StObject.set(x, "ProgressInMegaBytes", js.undefined)
    
    inline def setResizeType(value: String): Self = StObject.set(x, "ResizeType", value.asInstanceOf[js.Any])
    
    inline def setResizeTypeUndefined: Self = StObject.set(x, "ResizeType", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetClusterType(value: String): Self = StObject.set(x, "TargetClusterType", value.asInstanceOf[js.Any])
    
    inline def setTargetClusterTypeUndefined: Self = StObject.set(x, "TargetClusterType", js.undefined)
    
    inline def setTargetEncryptionType(value: String): Self = StObject.set(x, "TargetEncryptionType", value.asInstanceOf[js.Any])
    
    inline def setTargetEncryptionTypeUndefined: Self = StObject.set(x, "TargetEncryptionType", js.undefined)
    
    inline def setTargetNodeType(value: String): Self = StObject.set(x, "TargetNodeType", value.asInstanceOf[js.Any])
    
    inline def setTargetNodeTypeUndefined: Self = StObject.set(x, "TargetNodeType", js.undefined)
    
    inline def setTargetNumberOfNodes(value: IntegerOptional): Self = StObject.set(x, "TargetNumberOfNodes", value.asInstanceOf[js.Any])
    
    inline def setTargetNumberOfNodesUndefined: Self = StObject.set(x, "TargetNumberOfNodes", js.undefined)
    
    inline def setTotalResizeDataInMegaBytes(value: LongOptional): Self = StObject.set(x, "TotalResizeDataInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalResizeDataInMegaBytesUndefined: Self = StObject.set(x, "TotalResizeDataInMegaBytes", js.undefined)
  }
}
