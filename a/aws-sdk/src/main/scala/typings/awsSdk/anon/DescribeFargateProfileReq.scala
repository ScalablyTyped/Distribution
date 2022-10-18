package typings.awsSdk.anon

import typings.awsSdk.clientsEksMod.String
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/eks.DescribeFargateProfileRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeFargateProfileReq extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of the Amazon EKS cluster associated with the Fargate profile.
    */
  var clusterName: String
  
  /**
    * The name of the Fargate profile to describe.
    */
  var fargateProfileName: String
}
object DescribeFargateProfileReq {
  
  inline def apply(clusterName: String, fargateProfileName: String): DescribeFargateProfileReq = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], fargateProfileName = fargateProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFargateProfileReq]
  }
  
  extension [Self <: DescribeFargateProfileReq](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setFargateProfileName(value: String): Self = StObject.set(x, "fargateProfileName", value.asInstanceOf[js.Any])
  }
}
