package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFargateProfileRequest extends StObject {
  
  /**
    * The name of the Amazon EKS cluster associated with the Fargate profile to delete.
    */
  var clusterName: String
  
  /**
    * The name of the Fargate profile to delete.
    */
  var fargateProfileName: String
}
object DeleteFargateProfileRequest {
  
  inline def apply(clusterName: String, fargateProfileName: String): DeleteFargateProfileRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], fargateProfileName = fargateProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFargateProfileRequest]
  }
  
  extension [Self <: DeleteFargateProfileRequest](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setFargateProfileName(value: String): Self = StObject.set(x, "fargateProfileName", value.asInstanceOf[js.Any])
  }
}
