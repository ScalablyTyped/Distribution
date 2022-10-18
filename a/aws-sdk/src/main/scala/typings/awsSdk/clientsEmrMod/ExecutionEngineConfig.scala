package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionEngineConfig extends StObject {
  
  /**
    * The unique identifier of the execution engine. For an EMR cluster, this is the cluster ID.
    */
  var Id: XmlStringMaxLen256
  
  /**
    * An optional unique ID of an EC2 security group to associate with the master instance of the EMR cluster for this notebook execution. For more information see Specifying EC2 Security Groups for EMR Notebooks in the EMR Management Guide.
    */
  var MasterInstanceSecurityGroupId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The type of execution engine. A value of EMR specifies an EMR cluster.
    */
  var Type: js.UndefOr[ExecutionEngineType] = js.undefined
}
object ExecutionEngineConfig {
  
  inline def apply(Id: XmlStringMaxLen256): ExecutionEngineConfig = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionEngineConfig]
  }
  
  extension [Self <: ExecutionEngineConfig](x: Self) {
    
    inline def setId(value: XmlStringMaxLen256): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMasterInstanceSecurityGroupId(value: XmlStringMaxLen256): Self = StObject.set(x, "MasterInstanceSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setMasterInstanceSecurityGroupIdUndefined: Self = StObject.set(x, "MasterInstanceSecurityGroupId", js.undefined)
    
    inline def setType(value: ExecutionEngineType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
