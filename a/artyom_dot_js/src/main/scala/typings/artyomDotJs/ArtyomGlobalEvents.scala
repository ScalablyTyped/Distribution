package typings.artyomDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtyomGlobalEvents extends js.Object {
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
    val __obj = js.Dynamic.literal(COMMAND_MATCHED = COMMAND_MATCHED, COMMAND_RECOGNITION_END = COMMAND_RECOGNITION_END, COMMAND_RECOGNITION_START = COMMAND_RECOGNITION_START, ERROR = ERROR, NOT_COMMAND_MATCHED = NOT_COMMAND_MATCHED, SPEECH_SYNTHESIS_END = SPEECH_SYNTHESIS_END, SPEECH_SYNTHESIS_START = SPEECH_SYNTHESIS_START, TEXT_RECOGNIZED = TEXT_RECOGNIZED)
  
    __obj.asInstanceOf[ArtyomGlobalEvents]
  }
}

