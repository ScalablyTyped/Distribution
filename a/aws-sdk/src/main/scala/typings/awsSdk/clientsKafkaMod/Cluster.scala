package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies a cluster operation.
    
    */
  var ActiveOperationArn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The name of the cluster.
    
    */
  var ClusterName: js.UndefOr[string] = js.undefined
  
  /**
    * 
    Cluster Type.
    
    */
  var ClusterType: js.UndefOr[typings.awsSdk.clientsKafkaMod.ClusterType] = js.undefined
  
  /**
    * 
    The time when the cluster was created.
    
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * 
    The current version of the MSK cluster.
    
    */
  var CurrentVersion: js.UndefOr[string] = js.undefined
  
  /**
    * 
    Information about the provisioned cluster.
    
    */
  var Provisioned: js.UndefOr[typings.awsSdk.clientsKafkaMod.Provisioned] = js.undefined
  
  /**
    * 
    Information about the serverless cluster.
    
    */
  var Serverless: js.UndefOr[typings.awsSdk.clientsKafkaMod.Serverless] = js.undefined
  
  /**
    * 
    The state of the cluster. The possible states are ACTIVE, CREATING, DELETING, FAILED, HEALING, MAINTENANCE, REBOOTING_BROKER, and UPDATING.
    
    */
  var State: js.UndefOr[ClusterState] = js.undefined
  
  /**
    * 
    State Info for the Amazon MSK cluster.
    
    */
  var StateInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.StateInfo] = js.undefined
  
  /**
    * 
    Tags attached to the cluster.
    
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object Cluster {
  
  inline def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    inline def setActiveOperationArn(value: string): Self = StObject.set(x, "ActiveOperationArn", value.asInstanceOf[js.Any])
    
    inline def setActiveOperationArnUndefined: Self = StObject.set(x, "ActiveOperationArn", js.undefined)
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setClusterName(value: string): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "ClusterName", js.undefined)
    
    inline def setClusterType(value: ClusterType): Self = StObject.set(x, "ClusterType", value.asInstanceOf[js.Any])
    
    inline def setClusterTypeUndefined: Self = StObject.set(x, "ClusterType", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    inline def setProvisioned(value: Provisioned): Self = StObject.set(x, "Provisioned", value.asInstanceOf[js.Any])
    
    inline def setProvisionedUndefined: Self = StObject.set(x, "Provisioned", js.undefined)
    
    inline def setServerless(value: Serverless): Self = StObject.set(x, "Serverless", value.asInstanceOf[js.Any])
    
    inline def setServerlessUndefined: Self = StObject.set(x, "Serverless", js.undefined)
    
    inline def setState(value: ClusterState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateInfo(value: StateInfo): Self = StObject.set(x, "StateInfo", value.asInstanceOf[js.Any])
    
    inline def setStateInfoUndefined: Self = StObject.set(x, "StateInfo", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
