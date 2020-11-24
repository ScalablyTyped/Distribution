package typings.activexLibreoffice.com_.sun.star.script

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides information about a certain stack frame.
  * @deprecated Deprecated
  */
@js.native
trait ContextInformation extends js.Object {
  
  /** contains the first column in the **EndLine** that is NOT associated with the context. */
  var EndColumn: Double = js.native
  
  /** contains the last line in the module's source code associated with the context. */
  var EndLine: Double = js.native
  
  /** Get all names of the local variable in this context. */
  var LocalVariableNames: SafeArray[String] = js.native
  
  /**
    * Full qualified name to address the module or function associated with the context. If the module or function can't be addressed by name, e.g., in case
    * that a runtime generated eval-module is executed, this string is empty
    */
  var Name: String = js.native
  
  /**
    * Source code of the Module, that is associated with the context. If the source can be accessed using the ModuleName or if the source is unknown
    * (executing compiled code) this string can be empty.
    */
  var SourceCode: String = js.native
  
  /** contains the first column in the **StartLine** associated with the context. */
  var StartColumn: Double = js.native
  
  /**
    * contains the first line in the module's source code associated with the context.
    *
    * If "name" addresses a function, all line and column values are nevertheless given relative to the module's source. If source code is not available,
    * this value addresses a binary position in the compiled code.
    * @see XLibraryAccess.getModuleCode
    * @see XLibraryAccess.getFunctionCode
    */
  var StartLine: Double = js.native
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
    val __obj = js.Dynamic.literal(EndColumn = EndColumn.asInstanceOf[js.Any], EndLine = EndLine.asInstanceOf[js.Any], LocalVariableNames = LocalVariableNames.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourceCode = SourceCode.asInstanceOf[js.Any], StartColumn = StartColumn.asInstanceOf[js.Any], StartLine = StartLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextInformation]
  }
  
  @scala.inline
  implicit class ContextInformationOps[Self <: ContextInformation] (val x: Self) extends AnyVal {
    
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
    def setEndColumn(value: Double): Self = this.set("EndColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLine(value: Double): Self = this.set("EndLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalVariableNames(value: SafeArray[String]): Self = this.set("LocalVariableNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCode(value: String): Self = this.set("SourceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("StartColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLine(value: Double): Self = this.set("StartLine", value.asInstanceOf[js.Any])
  }
}
