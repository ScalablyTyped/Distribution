package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionEngineConfig extends StObject {
  
  /**
    * The execution role ARN required for the notebook execution.
    */
  var ExecutionRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
  
  /**
    * The unique identifier of the execution engine. For an Amazon EMR cluster, this is the cluster ID.
    */
  var Id: XmlStringMaxLen256
  
  /**
    * An optional unique ID of an Amazon EC2 security group to associate with the master instance of the Amazon EMR cluster for this notebook execution. For more information see Specifying Amazon EC2 Security Groups for Amazon EMR Notebooks in the EMR Management Guide.
    */
  var MasterInstanceSecurityGroupId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The type of execution engine. A value of EMR specifies an Amazon EMR cluster.
    */
  var Type: js.UndefOr[ExecutionEngineType] = js.undefined
}
object ExecutionEngineConfig {
  
  inline def apply(Id: XmlStringMaxLen256): ExecutionEngineConfig = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionEngineConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionEngineConfig] (val x: Self) extends AnyVal {
    
    inline def setExecutionRoleArn(value: IAMRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setId(value: XmlStringMaxLen256): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMasterInstanceSecurityGroupId(value: XmlStringMaxLen256): Self = StObject.set(x, "MasterInstanceSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setMasterInstanceSecurityGroupIdUndefined: Self = StObject.set(x, "MasterInstanceSecurityGroupId", js.undefined)
    
    inline def setType(value: ExecutionEngineType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
