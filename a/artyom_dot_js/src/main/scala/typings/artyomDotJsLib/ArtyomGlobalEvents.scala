package typings
package artyomDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtyomGlobalEvents extends js.Object {
  var COMMAND_MATCHED: java.lang.String
  var COMMAND_RECOGNITION_END: java.lang.String
  var COMMAND_RECOGNITION_START: java.lang.String
  var ERROR: java.lang.String
  var NOT_COMMAND_MATCHED: java.lang.String
  var SPEECH_SYNTHESIS_END: java.lang.String
  var SPEECH_SYNTHESIS_START: java.lang.String
  var TEXT_RECOGNIZED: java.lang.String
}

object ArtyomGlobalEvents {
  @scala.inline
  def apply(
    COMMAND_MATCHED: java.lang.String,
    COMMAND_RECOGNITION_END: java.lang.String,
    COMMAND_RECOGNITION_START: java.lang.String,
    ERROR: java.lang.String,
    NOT_COMMAND_MATCHED: java.lang.String,
    SPEECH_SYNTHESIS_END: java.lang.String,
    SPEECH_SYNTHESIS_START: java.lang.String,
    TEXT_RECOGNIZED: java.lang.String
  ): ArtyomGlobalEvents = {
    val __obj = js.Dynamic.literal(COMMAND_MATCHED = COMMAND_MATCHED, COMMAND_RECOGNITION_END = COMMAND_RECOGNITION_END, COMMAND_RECOGNITION_START = COMMAND_RECOGNITION_START, ERROR = ERROR, NOT_COMMAND_MATCHED = NOT_COMMAND_MATCHED, SPEECH_SYNTHESIS_END = SPEECH_SYNTHESIS_END, SPEECH_SYNTHESIS_START = SPEECH_SYNTHESIS_START, TEXT_RECOGNIZED = TEXT_RECOGNIZED)
  
    __obj.asInstanceOf[ArtyomGlobalEvents]
  }
}

