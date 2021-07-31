package typings.awsSdk.anon

import typings.awsSdk.iotsitewiseMod.ID
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/iotsitewise.DescribePortalRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribePortalRequestwait extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The ID of the portal.
    */
  var portalId: ID
}
object DescribePortalRequestwait {
  
  @scala.inline
  def apply(portalId: ID): DescribePortalRequestwait = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortalRequestwait]
  }
  
  @scala.inline
  implicit class DescribePortalRequestwaitMutableBuilder[Self <: DescribePortalRequestwait] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setPortalId(value: ID): Self = StObject.set(x, "portalId", value.asInstanceOf[js.Any])
  }
}
