package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtyomGlobalEvents extends StObject {
  
  var COMMAND_MATCHED: String
  
  var COMMAND_RECOGNITION_END: String
  
  var COMMAND_RECOGNITION_START: String
  
  var ERROR: String
  
  var NOT_COMMAND_MATCHED: String
  
  var SPEECH_SYNTHESIS_END: String
  
  var SPEECH_SYNTHESIS_START: String
  
  var TEXT_RECOGNIZED: String
}
object ArtyomGlobalEvents {
  
  @scala.inline
  def apply(
    COMMAND_MATCHED: String,
    COMMAND_RECOGNITION_END: String,
    COMMAND_RECOGNITION_START: String,
    ERROR: String,
    NOT_COMMAND_MATCHED: String,
    SPEECH_SYNTHESIS_END: String,
    SPEECH_SYNTHESIS_START: String,
    TEXT_RECOGNIZED: String
  ): ArtyomGlobalEvents = {
    val __obj = js.Dynamic.literal(COMMAND_MATCHED = COMMAND_MATCHED.asInstanceOf[js.Any], COMMAND_RECOGNITION_END = COMMAND_RECOGNITION_END.asInstanceOf[js.Any], COMMAND_RECOGNITION_START = COMMAND_RECOGNITION_START.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], NOT_COMMAND_MATCHED = NOT_COMMAND_MATCHED.asInstanceOf[js.Any], SPEECH_SYNTHESIS_END = SPEECH_SYNTHESIS_END.asInstanceOf[js.Any], SPEECH_SYNTHESIS_START = SPEECH_SYNTHESIS_START.asInstanceOf[js.Any], TEXT_RECOGNIZED = TEXT_RECOGNIZED.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtyomGlobalEvents]
  }
  
  @scala.inline
  implicit class ArtyomGlobalEventsMutableBuilder[Self <: ArtyomGlobalEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCOMMAND_MATCHED(value: String): Self = StObject.set(x, "COMMAND_MATCHED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMMAND_RECOGNITION_END(value: String): Self = StObject.set(x, "COMMAND_RECOGNITION_END", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMMAND_RECOGNITION_START(value: String): Self = StObject.set(x, "COMMAND_RECOGNITION_START", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: String): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_COMMAND_MATCHED(value: String): Self = StObject.set(x, "NOT_COMMAND_MATCHED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPEECH_SYNTHESIS_END(value: String): Self = StObject.set(x, "SPEECH_SYNTHESIS_END", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPEECH_SYNTHESIS_START(value: String): Self = StObject.set(x, "SPEECH_SYNTHESIS_START", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEXT_RECOGNIZED(value: String): Self = StObject.set(x, "TEXT_RECOGNIZED", value.asInstanceOf[js.Any])
  }
}
