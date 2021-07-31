package typings.awsSdk.anon

import typings.awsSdk.iotsitewiseMod.ID
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/iotsitewise.DescribeAssetRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeAssetRequestwaite extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The ID of the asset.
    */
  var assetId: ID
}
object DescribeAssetRequestwaite {
  
  @scala.inline
  def apply(assetId: ID): DescribeAssetRequestwaite = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetRequestwaite]
  }
  
  @scala.inline
  implicit class DescribeAssetRequestwaiteMutableBuilder[Self <: DescribeAssetRequestwaite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
  }
}
