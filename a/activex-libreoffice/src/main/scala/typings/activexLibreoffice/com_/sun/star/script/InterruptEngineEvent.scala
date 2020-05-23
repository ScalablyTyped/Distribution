package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes an interrupt which occurs in the scripting engine.
  * @deprecated Deprecated
  */
trait InterruptEngineEvent extends EventObject {
  /** contains the first column in the "EndLine" which is NOT affected by the event that took place. */
  var EndColumn: Double
  /** contains the last line in the module's source code that is affected by the event that took place. */
  var EndLine: Double
  /**
    * error message.
    *
    * Only valid if Reason is RuntimeError or CompileError.
    */
  var ErrorMessage: String
  /**
    * fully qualified name to address the module or function affected by the event that took place.
    *
    * If the module or function can't be addressed by name (for example, in case that a runtime-generated eval-module is executed), this string is empty.
    */
  var Name: String
  /** contains the interrupt reason. */
  var Reason: InterruptReason
  /**
    * source code of the Module affected by the event that took place.
    *
    * If the source can be accessed using the ModuleName, or if the source is unknown (executing compiled code), this string can be empty.
    */
  var SourceCode: String
  /** contains the first column in the "StartLine" that is affected by the event that took place. */
  var StartColumn: Double
  /**
    * contains the first line in the module's source code that is affected by the event that took place.
    *
    * If "name" addresses a function, all line and column values are nevertheless given relative to the module's source. If source code is not available,
    * this value addresses a binary position in the compiled code.
    * @see XLibraryAccess.getModuleCode
    * @see XLibraryAccess.getFunctionCode
    */
  var StartLine: Double
}

object InterruptEngineEvent {
  @scala.inline
  def apply(
    EndColumn: Double,
    EndLine: Double,
    ErrorMessage: String,
    Name: String,
    Reason: InterruptReason,
    Source: XInterface,
    SourceCode: String,
    StartColumn: Double,
    StartLine: Double
  ): InterruptEngineEvent = {
    val __obj = js.Dynamic.literal(EndColumn = EndColumn.asInstanceOf[js.Any], EndLine = EndLine.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], SourceCode = SourceCode.asInstanceOf[js.Any], StartColumn = StartColumn.asInstanceOf[js.Any], StartLine = StartLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterruptEngineEvent]
  }
}

