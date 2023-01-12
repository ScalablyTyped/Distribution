package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterV2Request extends StObject {
  
  /**
    * 
    The name of the cluster.
    
    */
  var ClusterName: stringMin1Max64
  
  /**
    * 
    Information about the provisioned cluster.
    
    */
  var Provisioned: js.UndefOr[ProvisionedRequest] = js.undefined
  
  /**
    * 
    Information about the serverless cluster.
    
    */
  var Serverless: js.UndefOr[ServerlessRequest] = js.undefined
  
  /**
    * 
    A map of tags that you want the cluster to have.
    
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object CreateClusterV2Request {
  
  inline def apply(ClusterName: stringMin1Max64): CreateClusterV2Request = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterV2Request]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateClusterV2Request] (val x: Self) extends AnyVal {
    
    inline def setClusterName(value: stringMin1Max64): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setProvisioned(value: ProvisionedRequest): Self = StObject.set(x, "Provisioned", value.asInstanceOf[js.Any])
    
    inline def setProvisionedUndefined: Self = StObject.set(x, "Provisioned", js.undefined)
    
    inline def setServerless(value: ServerlessRequest): Self = StObject.set(x, "Serverless", value.asInstanceOf[js.Any])
    
    inline def setServerlessUndefined: Self = StObject.set(x, "Serverless", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
