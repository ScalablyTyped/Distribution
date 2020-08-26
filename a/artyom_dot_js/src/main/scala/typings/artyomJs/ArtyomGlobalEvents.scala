package typings.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtyomGlobalEvents extends js.Object {
  var COMMAND_MATCHED: String = js.native
  var COMMAND_RECOGNITION_END: String = js.native
  var COMMAND_RECOGNITION_START: String = js.native
  var ERROR: String = js.native
  var NOT_COMMAND_MATCHED: String = js.native
  var SPEECH_SYNTHESIS_END: String = js.native
  var SPEECH_SYNTHESIS_START: String = js.native
  var TEXT_RECOGNIZED: String = js.native
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
  implicit class ArtyomGlobalEventsOps[Self <: ArtyomGlobalEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCOMMAND_MATCHED(value: String): Self = this.set("COMMAND_MATCHED", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMMAND_RECOGNITION_END(value: String): Self = this.set("COMMAND_RECOGNITION_END", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMMAND_RECOGNITION_START(value: String): Self = this.set("COMMAND_RECOGNITION_START", value.asInstanceOf[js.Any])
    @scala.inline
    def setERROR(value: String): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_COMMAND_MATCHED(value: String): Self = this.set("NOT_COMMAND_MATCHED", value.asInstanceOf[js.Any])
    @scala.inline
    def setSPEECH_SYNTHESIS_END(value: String): Self = this.set("SPEECH_SYNTHESIS_END", value.asInstanceOf[js.Any])
    @scala.inline
    def setSPEECH_SYNTHESIS_START(value: String): Self = this.set("SPEECH_SYNTHESIS_START", value.asInstanceOf[js.Any])
    @scala.inline
    def setTEXT_RECOGNIZED(value: String): Self = this.set("TEXT_RECOGNIZED", value.asInstanceOf[js.Any])
  }
  
}

