package typings.awsSdk.anon

import typings.awsSdk.clientsEksMod.String
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/eks.DescribeNodegroupRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeNodegroupRequestw extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of the Amazon EKS cluster associated with the node group.
    */
  var clusterName: String
  
  /**
    * The name of the node group to describe.
    */
  var nodegroupName: String
}
object DescribeNodegroupRequestw {
  
  inline def apply(clusterName: String, nodegroupName: String): DescribeNodegroupRequestw = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodegroupRequestw]
  }
  
  extension [Self <: DescribeNodegroupRequestw](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setNodegroupName(value: String): Self = StObject.set(x, "nodegroupName", value.asInstanceOf[js.Any])
  }
}
