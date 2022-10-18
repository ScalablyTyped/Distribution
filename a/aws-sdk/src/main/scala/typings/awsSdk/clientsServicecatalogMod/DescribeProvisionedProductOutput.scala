package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProvisionedProductOutput extends StObject {
  
  /**
    * Any CloudWatch dashboards that were created when provisioning the product.
    */
  var CloudWatchDashboards: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.CloudWatchDashboards] = js.undefined
  
  /**
    * Information about the provisioned product.
    */
  var ProvisionedProductDetail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProvisionedProductDetail] = js.undefined
}
object DescribeProvisionedProductOutput {
  
  inline def apply(): DescribeProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisionedProductOutput]
  }
  
  extension [Self <: DescribeProvisionedProductOutput](x: Self) {
    
    inline def setCloudWatchDashboards(value: CloudWatchDashboards): Self = StObject.set(x, "CloudWatchDashboards", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchDashboardsUndefined: Self = StObject.set(x, "CloudWatchDashboards", js.undefined)
    
    inline def setCloudWatchDashboardsVarargs(value: CloudWatchDashboard*): Self = StObject.set(x, "CloudWatchDashboards", js.Array(value*))
    
    inline def setProvisionedProductDetail(value: ProvisionedProductDetail): Self = StObject.set(x, "ProvisionedProductDetail", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductDetailUndefined: Self = StObject.set(x, "ProvisionedProductDetail", js.undefined)
  }
}
