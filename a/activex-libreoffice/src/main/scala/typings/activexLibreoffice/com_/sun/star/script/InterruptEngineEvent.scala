package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes an interrupt which occurs in the scripting engine.
  * @deprecated Deprecated
  */
@js.native
trait InterruptEngineEvent extends EventObject {
  
  /** contains the first column in the "EndLine" which is NOT affected by the event that took place. */
  var EndColumn: Double = js.native
  
  /** contains the last line in the module's source code that is affected by the event that took place. */
  var EndLine: Double = js.native
  
  /**
    * error message.
    *
    * Only valid if Reason is RuntimeError or CompileError.
    */
  var ErrorMessage: String = js.native
  
  /**
    * fully qualified name to address the module or function affected by the event that took place.
    *
    * If the module or function can't be addressed by name (for example, in case that a runtime-generated eval-module is executed), this string is empty.
    */
  var Name: String = js.native
  
  /** contains the interrupt reason. */
  var Reason: InterruptReason = js.native
  
  /**
    * source code of the Module affected by the event that took place.
    *
    * If the source can be accessed using the ModuleName, or if the source is unknown (executing compiled code), this string can be empty.
    */
  var SourceCode: String = js.native
  
  /** contains the first column in the "StartLine" that is affected by the event that took place. */
  var StartColumn: Double = js.native
  
  /**
    * contains the first line in the module's source code that is affected by the event that took place.
    *
    * If "name" addresses a function, all line and column values are nevertheless given relative to the module's source. If source code is not available,
    * this value addresses a binary position in the compiled code.
    * @see XLibraryAccess.getModuleCode
    * @see XLibraryAccess.getFunctionCode
    */
  var StartLine: Double = js.native
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
  
  @scala.inline
  implicit class InterruptEngineEventMutableBuilder[Self <: InterruptEngineEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "EndColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLine(value: Double): Self = StObject.set(x, "EndLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: InterruptReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCode(value: String): Self = StObject.set(x, "SourceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "StartColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLine(value: Double): Self = StObject.set(x, "StartLine", value.asInstanceOf[js.Any])
  }
}
