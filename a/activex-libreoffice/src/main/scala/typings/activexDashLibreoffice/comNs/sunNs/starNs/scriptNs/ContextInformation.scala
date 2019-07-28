package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides information about a certain stack frame.
  * @deprecated Deprecated
  */
trait ContextInformation extends js.Object {
  /** contains the first column in the **EndLine** that is NOT associated with the context. */
  var EndColumn: Double
  /** contains the last line in the module's source code associated with the context. */
  var EndLine: Double
  /** Get all names of the local variable in this context. */
  var LocalVariableNames: SafeArray[String]
  /**
    * Full qualified name to address the module or function associated with the context. If the module or function can't be addressed by name, e.g., in case
    * that a runtime generated eval-module is executed, this string is empty
    */
  var Name: String
  /**
    * Source code of the Module, that is associated with the context. If the source can be accessed using the ModuleName or if the source is unknown
    * (executing compiled code) this string can be empty.
    */
  var SourceCode: String
  /** contains the first column in the **StartLine** associated with the context. */
  var StartColumn: Double
  /**
    * contains the first line in the module's source code associated with the context.
    *
    * If "name" addresses a function, all line and column values are nevertheless given relative to the module's source. If source code is not available,
    * this value addresses a binary position in the compiled code.
    * @see XLibraryAccess.getModuleCode
    * @see XLibraryAccess.getFunctionCode
    */
  var StartLine: Double
}

object ContextInformation {
  @scala.inline
  def apply(
    EndColumn: Double,
    EndLine: Double,
    LocalVariableNames: SafeArray[String],
    Name: String,
    SourceCode: String,
    StartColumn: Double,
    StartLine: Double
  ): ContextInformation = {
    val __obj = js.Dynamic.literal(EndColumn = EndColumn, EndLine = EndLine, LocalVariableNames = LocalVariableNames, Name = Name, SourceCode = SourceCode, StartColumn = StartColumn, StartLine = StartLine)
  
    __obj.asInstanceOf[ContextInformation]
  }
}

