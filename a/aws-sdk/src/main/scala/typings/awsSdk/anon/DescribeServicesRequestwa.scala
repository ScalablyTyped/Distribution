package typings.awsSdk.anon

import typings.awsSdk.clientsEcsMod.ServiceField
import typings.awsSdk.clientsEcsMod.ServiceFieldList
import typings.awsSdk.clientsEcsMod.String
import typings.awsSdk.clientsEcsMod.StringList
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ecs.DescribeServicesRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeServicesRequestwa extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The short name or full Amazon Resource Name (ARN)the cluster that hosts the service to describe. If you do not specify a cluster, the default cluster is assumed. This parameter is required if the service or services you are describing were launched in any cluster other than the default cluster.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether you want to see the resource tags for the service. If TAGS is specified, the tags are included in the response. If this field is omitted, tags aren't included in the response.
    */
  var include: js.UndefOr[ServiceFieldList] = js.undefined
  
  /**
    * A list of services to describe. You may specify up to 10 services to describe in a single operation.
    */
  var services: StringList
}
object DescribeServicesRequestwa {
  
  inline def apply(services: StringList): DescribeServicesRequestwa = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServicesRequestwa]
  }
  
  extension [Self <: DescribeServicesRequestwa](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setInclude(value: ServiceFieldList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: ServiceField*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setServices(value: StringList): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
