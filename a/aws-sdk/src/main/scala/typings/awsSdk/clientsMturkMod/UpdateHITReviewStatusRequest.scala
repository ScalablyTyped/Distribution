package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHITReviewStatusRequest extends StObject {
  
  /**
    *  The ID of the HIT to update. 
    */
  var HITId: EntityId
  
  /**
    *  Specifies how to update the HIT status. Default is False.     Setting this to false will only transition a HIT from Reviewable to Reviewing     Setting this to true will only transition a HIT from Reviewing to Reviewable   
    */
  var Revert: js.UndefOr[Boolean] = js.undefined
}
object UpdateHITReviewStatusRequest {
  
  inline def apply(HITId: EntityId): UpdateHITReviewStatusRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHITReviewStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateHITReviewStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
    
    inline def setRevert(value: Boolean): Self = StObject.set(x, "Revert", value.asInstanceOf[js.Any])
    
    inline def setRevertUndefined: Self = StObject.set(x, "Revert", js.undefined)
  }
}
