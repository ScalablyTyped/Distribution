package typings.awsSdk.anon

import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/cloudfront.GetInvalidationRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetInvalidationRequestwai extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The distribution's ID.
    */
  var DistributionId: String
  
  /**
    * The identifier for the invalidation request, for example, IDFDVBD632BHDS5.
    */
  var Id: String
}
object GetInvalidationRequestwai {
  
  @scala.inline
  def apply(DistributionId: String, Id: String): GetInvalidationRequestwai = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInvalidationRequestwai]
  }
  
  @scala.inline
  implicit class GetInvalidationRequestwaiMutableBuilder[Self <: GetInvalidationRequestwai] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setDistributionId(value: String): Self = StObject.set(x, "DistributionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
