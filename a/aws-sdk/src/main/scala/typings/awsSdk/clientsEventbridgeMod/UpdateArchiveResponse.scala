package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateArchiveResponse extends StObject {
  
  /**
    * The ARN of the archive.
    */
  var ArchiveArn: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ArchiveArn] = js.undefined
  
  /**
    * The time at which the archive was updated.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the archive.
    */
  var State: js.UndefOr[ArchiveState] = js.undefined
  
  /**
    * The reason that the archive is in the current state.
    */
  var StateReason: js.UndefOr[ArchiveStateReason] = js.undefined
}
object UpdateArchiveResponse {
  
  inline def apply(): UpdateArchiveResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateArchiveResponse]
  }
  
  extension [Self <: UpdateArchiveResponse](x: Self) {
    
    inline def setArchiveArn(value: ArchiveArn): Self = StObject.set(x, "ArchiveArn", value.asInstanceOf[js.Any])
    
    inline def setArchiveArnUndefined: Self = StObject.set(x, "ArchiveArn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setState(value: ArchiveState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateReason(value: ArchiveStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
