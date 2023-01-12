package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBrokerTypeRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string
  
  /**
    * 
    The cluster version that you want to change. After this operation completes successfully, the cluster will have a new version.
    
    */
  var CurrentVersion: string
  
  /**
    * 
    The Amazon MSK broker type that you want all of the brokers in this cluster to be.
    
    */
  var TargetInstanceType: string
}
object UpdateBrokerTypeRequest {
  
  inline def apply(ClusterArn: string, CurrentVersion: string, TargetInstanceType: string): UpdateBrokerTypeRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any], TargetInstanceType = TargetInstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBrokerTypeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBrokerTypeRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetInstanceType(value: string): Self = StObject.set(x, "TargetInstanceType", value.asInstanceOf[js.Any])
  }
}
