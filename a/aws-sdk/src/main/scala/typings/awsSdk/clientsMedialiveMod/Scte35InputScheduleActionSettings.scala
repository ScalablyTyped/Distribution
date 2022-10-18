package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scte35InputScheduleActionSettings extends StObject {
  
  /**
    * In fixed mode, enter the name of the input attachment that you want to use as a SCTE-35 input. (Don't enter the ID of the input.)"
    */
  var InputAttachmentNameReference: js.UndefOr[string] = js.undefined
  
  /**
    * Whether the SCTE-35 input should be the active input or a fixed input.
    */
  var Mode: Scte35InputMode
}
object Scte35InputScheduleActionSettings {
  
  inline def apply(Mode: Scte35InputMode): Scte35InputScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35InputScheduleActionSettings]
  }
  
  extension [Self <: Scte35InputScheduleActionSettings](x: Self) {
    
    inline def setInputAttachmentNameReference(value: string): Self = StObject.set(x, "InputAttachmentNameReference", value.asInstanceOf[js.Any])
    
    inline def setInputAttachmentNameReferenceUndefined: Self = StObject.set(x, "InputAttachmentNameReference", js.undefined)
    
    inline def setMode(value: Scte35InputMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}
