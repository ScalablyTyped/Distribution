package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateArchiveResponse extends StObject {
  
  /**
    * The ARN of the archive that was created.
    */
  var ArchiveArn: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.ArchiveArn] = js.undefined
  
  /**
    * The time at which the archive was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the archive that was created.
    */
  var State: js.UndefOr[ArchiveState] = js.undefined
  
  /**
    * The reason that the archive is in the state.
    */
  var StateReason: js.UndefOr[ArchiveStateReason] = js.undefined
}
object CreateArchiveResponse {
  
  inline def apply(): CreateArchiveResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateArchiveResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateArchiveResponse] (val x: Self) extends AnyVal {
    
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
