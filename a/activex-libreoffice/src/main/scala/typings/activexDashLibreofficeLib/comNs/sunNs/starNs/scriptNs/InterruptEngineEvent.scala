package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes an interrupt which occurs in the scripting engine.
  * @deprecated Deprecated
  */
trait InterruptEngineEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** contains the first column in the "EndLine" which is NOT affected by the event that took place. */
  var EndColumn: scala.Double
  /** contains the last line in the module's source code that is affected by the event that took place. */
  var EndLine: scala.Double
  /**
    * error message.
    *
    * Only valid if Reason is RuntimeError or CompileError.
    */
  var ErrorMessage: java.lang.String
  /**
    * fully qualified name to address the module or function affected by the event that took place.
    *
    * If the module or function can't be addressed by name (for example, in case that a runtime-generated eval-module is executed), this string is empty.
    */
  var Name: java.lang.String
  /** contains the interrupt reason. */
  var Reason: InterruptReason
  /**
    * source code of the Module affected by the event that took place.
    *
    * If the source can be accessed using the ModuleName, or if the source is unknown (executing compiled code), this string can be empty.
    */
  var SourceCode: java.lang.String
  /** contains the first column in the "StartLine" that is affected by the event that took place. */
  var StartColumn: scala.Double
  /**
    * contains the first line in the module's source code that is affected by the event that took place.
    *
    * If "name" addresses a function, all line and column values are nevertheless given relative to the module's source. If source code is not available,
    * this value addresses a binary position in the compiled code.
    * @see XLibraryAccess.getModuleCode
    * @see XLibraryAccess.getFunctionCode
    */
  var StartLine: scala.Double
}

object InterruptEngineEvent {
  @scala.inline
  def apply(
    EndColumn: scala.Double,
    EndLine: scala.Double,
    ErrorMessage: java.lang.String,
    Name: java.lang.String,
    Reason: InterruptReason,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    SourceCode: java.lang.String,
    StartColumn: scala.Double,
    StartLine: scala.Double
  ): InterruptEngineEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EndColumn")(EndColumn)
    __obj.updateDynamic("EndLine")(EndLine)
    __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Reason")(Reason)
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("SourceCode")(SourceCode)
    __obj.updateDynamic("StartColumn")(StartColumn)
    __obj.updateDynamic("StartLine")(StartLine)
    __obj.asInstanceOf[InterruptEngineEvent]
  }
}

