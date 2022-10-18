package typings.awsSdk.anon

import typings.awsSdk.clientsEksMod.ClusterName
import typings.awsSdk.clientsEksMod.String
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/eks.DescribeAddonRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeAddonRequestwaite extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of the add-on. The name must match one of the names returned by  ListAddons .
    */
  var addonName: String
  
  /**
    * The name of the cluster.
    */
  var clusterName: ClusterName
}
object DescribeAddonRequestwaite {
  
  inline def apply(addonName: String, clusterName: ClusterName): DescribeAddonRequestwaite = {
    val __obj = js.Dynamic.literal(addonName = addonName.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAddonRequestwaite]
  }
  
  extension [Self <: DescribeAddonRequestwaite](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setAddonName(value: String): Self = StObject.set(x, "addonName", value.asInstanceOf[js.Any])
    
    inline def setClusterName(value: ClusterName): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
  }
}
