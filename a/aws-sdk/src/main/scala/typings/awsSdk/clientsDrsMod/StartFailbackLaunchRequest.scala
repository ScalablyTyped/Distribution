package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFailbackLaunchRequest extends StObject {
  
  /**
    * The IDs of the Recovery Instance whose failback launch we want to request.
    */
  var recoveryInstanceIDs: StartFailbackRequestRecoveryInstanceIDs
  
  /**
    * The tags to be associated with the failback launch Job.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object StartFailbackLaunchRequest {
  
  inline def apply(recoveryInstanceIDs: StartFailbackRequestRecoveryInstanceIDs): StartFailbackLaunchRequest = {
    val __obj = js.Dynamic.literal(recoveryInstanceIDs = recoveryInstanceIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFailbackLaunchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartFailbackLaunchRequest] (val x: Self) extends AnyVal {
    
    inline def setRecoveryInstanceIDs(value: StartFailbackRequestRecoveryInstanceIDs): Self = StObject.set(x, "recoveryInstanceIDs", value.asInstanceOf[js.Any])
    
    inline def setRecoveryInstanceIDsVarargs(value: RecoveryInstanceID*): Self = StObject.set(x, "recoveryInstanceIDs", js.Array(value*))
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
