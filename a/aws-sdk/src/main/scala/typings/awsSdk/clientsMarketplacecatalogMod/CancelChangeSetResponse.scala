package typings.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelChangeSetResponse extends StObject {
  
  /**
    * The ARN associated with the change set referenced in this request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The unique identifier for the change set referenced in this request.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.undefined
}
object CancelChangeSetResponse {
  
  inline def apply(): CancelChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelChangeSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelChangeSetResponse] (val x: Self) extends AnyVal {
    
    inline def setChangeSetArn(value: ARN): Self = StObject.set(x, "ChangeSetArn", value.asInstanceOf[js.Any])
    
    inline def setChangeSetArnUndefined: Self = StObject.set(x, "ChangeSetArn", js.undefined)
    
    inline def setChangeSetId(value: ResourceId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    inline def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
  }
}
