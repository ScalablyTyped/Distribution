package typings.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChangeSetResponse extends StObject {
  
  /**
    * The ARN associated to the unique identifier generated for the request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Unique identifier generated for the request.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.undefined
}
object StartChangeSetResponse {
  
  inline def apply(): StartChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartChangeSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartChangeSetResponse] (val x: Self) extends AnyVal {
    
    inline def setChangeSetArn(value: ARN): Self = StObject.set(x, "ChangeSetArn", value.asInstanceOf[js.Any])
    
    inline def setChangeSetArnUndefined: Self = StObject.set(x, "ChangeSetArn", js.undefined)
    
    inline def setChangeSetId(value: ResourceId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    inline def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
  }
}
