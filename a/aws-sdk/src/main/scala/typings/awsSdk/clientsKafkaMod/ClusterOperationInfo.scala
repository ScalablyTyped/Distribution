package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOperationInfo extends StObject {
  
  /**
    * 
    The ID of the API request that triggered this operation.
    
    */
  var ClientRequestId: js.UndefOr[string] = js.undefined
  
  /**
    * 
    ARN of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The time that the operation was created.
    
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * 
    The time at which the operation finished.
    
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * 
    Describes the error if the operation fails.
    
    */
  var ErrorInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.ErrorInfo] = js.undefined
  
  /**
    * 
    ARN of the cluster operation.
    
    */
  var OperationArn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    State of the cluster operation.
    
    */
  var OperationState: js.UndefOr[string] = js.undefined
  
  /**
    * 
    Steps completed during the operation.
    
    */
  var OperationSteps: js.UndefOr[listOfClusterOperationStep] = js.undefined
  
  /**
    * 
    Type of the cluster operation.
    
    */
  var OperationType: js.UndefOr[string] = js.undefined
  
  /**
    * 
    Information about cluster attributes before a cluster is updated.
    
    */
  var SourceClusterInfo: js.UndefOr[MutableClusterInfo] = js.undefined
  
  /**
    * 
    Information about cluster attributes after a cluster is updated.
    
    */
  var TargetClusterInfo: js.UndefOr[MutableClusterInfo] = js.undefined
}
object ClusterOperationInfo {
  
  inline def apply(): ClusterOperationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterOperationInfo] (val x: Self) extends AnyVal {
    
    inline def setClientRequestId(value: string): Self = StObject.set(x, "ClientRequestId", value.asInstanceOf[js.Any])
    
    inline def setClientRequestIdUndefined: Self = StObject.set(x, "ClientRequestId", js.undefined)
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setErrorInfo(value: ErrorInfo): Self = StObject.set(x, "ErrorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "ErrorInfo", js.undefined)
    
    inline def setOperationArn(value: string): Self = StObject.set(x, "OperationArn", value.asInstanceOf[js.Any])
    
    inline def setOperationArnUndefined: Self = StObject.set(x, "OperationArn", js.undefined)
    
    inline def setOperationState(value: string): Self = StObject.set(x, "OperationState", value.asInstanceOf[js.Any])
    
    inline def setOperationStateUndefined: Self = StObject.set(x, "OperationState", js.undefined)
    
    inline def setOperationSteps(value: listOfClusterOperationStep): Self = StObject.set(x, "OperationSteps", value.asInstanceOf[js.Any])
    
    inline def setOperationStepsUndefined: Self = StObject.set(x, "OperationSteps", js.undefined)
    
    inline def setOperationStepsVarargs(value: ClusterOperationStep*): Self = StObject.set(x, "OperationSteps", js.Array(value*))
    
    inline def setOperationType(value: string): Self = StObject.set(x, "OperationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "OperationType", js.undefined)
    
    inline def setSourceClusterInfo(value: MutableClusterInfo): Self = StObject.set(x, "SourceClusterInfo", value.asInstanceOf[js.Any])
    
    inline def setSourceClusterInfoUndefined: Self = StObject.set(x, "SourceClusterInfo", js.undefined)
    
    inline def setTargetClusterInfo(value: MutableClusterInfo): Self = StObject.set(x, "TargetClusterInfo", value.asInstanceOf[js.Any])
    
    inline def setTargetClusterInfoUndefined: Self = StObject.set(x, "TargetClusterInfo", js.undefined)
  }
}
