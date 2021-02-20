package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo extends StObject {
  
  /**
    * Return is allowed within that many days.
    */
  var daysToReturn: js.UndefOr[Double] = js.native
  
  /**
    * If true, return is allowed.
    */
  var isReturnable: js.UndefOr[Boolean] = js.native
  
  /**
    * Link to the return policy.
    */
  var policyUrl: js.UndefOr[String] = js.native
}
object GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfoMutableBuilder[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysToReturn(value: Double): Self = StObject.set(x, "daysToReturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysToReturnUndefined: Self = StObject.set(x, "daysToReturn", js.undefined)
    
    @scala.inline
    def setIsReturnable(value: Boolean): Self = StObject.set(x, "isReturnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReturnableUndefined: Self = StObject.set(x, "isReturnable", js.undefined)
    
    @scala.inline
    def setPolicyUrl(value: String): Self = StObject.set(x, "policyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUrlUndefined: Self = StObject.set(x, "policyUrl", js.undefined)
  }
}
