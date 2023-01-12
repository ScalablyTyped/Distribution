package typings.awsSdk.anon

import typings.awsSdk.clientsRoute53recoverycontrolconfigMod.string
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/route53recoverycontrolconfig.DescribeClusterRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeClusterRequestwaiClusterArn extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  var ClusterArn: string
}
object DescribeClusterRequestwaiClusterArn {
  
  inline def apply(ClusterArn: string): DescribeClusterRequestwaiClusterArn = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterRequestwaiClusterArn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeClusterRequestwaiClusterArn] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
  }
}
