package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShiftDetails extends StObject {
  
  /**
    * The Amazon Resources Names (ARNs) of the contacts who were replaced in a shift when an override was created. If the override is deleted, these contacts are restored to the shift.
    */
  var OverriddenContactIds: SsmContactsArnList
}
object ShiftDetails {
  
  inline def apply(OverriddenContactIds: SsmContactsArnList): ShiftDetails = {
    val __obj = js.Dynamic.literal(OverriddenContactIds = OverriddenContactIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShiftDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShiftDetails] (val x: Self) extends AnyVal {
    
    inline def setOverriddenContactIds(value: SsmContactsArnList): Self = StObject.set(x, "OverriddenContactIds", value.asInstanceOf[js.Any])
    
    inline def setOverriddenContactIdsVarargs(value: SsmContactsArn*): Self = StObject.set(x, "OverriddenContactIds", js.Array(value*))
  }
}
