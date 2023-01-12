package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionState extends StObject {
  
  /**
    * The user-specified reason why the transition between two stages of a pipeline was disabled.
    */
  var disabledReason: js.UndefOr[DisabledReason] = js.undefined
  
  /**
    * Whether the transition between stages is enabled (true) or disabled (false).
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * The timestamp when the transition state was last changed.
    */
  var lastChangedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the user who last changed the transition state.
    */
  var lastChangedBy: js.UndefOr[LastChangedBy] = js.undefined
}
object TransitionState {
  
  inline def apply(): TransitionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionState] (val x: Self) extends AnyVal {
    
    inline def setDisabledReason(value: DisabledReason): Self = StObject.set(x, "disabledReason", value.asInstanceOf[js.Any])
    
    inline def setDisabledReasonUndefined: Self = StObject.set(x, "disabledReason", js.undefined)
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLastChangedAt(value: js.Date): Self = StObject.set(x, "lastChangedAt", value.asInstanceOf[js.Any])
    
    inline def setLastChangedAtUndefined: Self = StObject.set(x, "lastChangedAt", js.undefined)
    
    inline def setLastChangedBy(value: LastChangedBy): Self = StObject.set(x, "lastChangedBy", value.asInstanceOf[js.Any])
    
    inline def setLastChangedByUndefined: Self = StObject.set(x, "lastChangedBy", js.undefined)
  }
}
