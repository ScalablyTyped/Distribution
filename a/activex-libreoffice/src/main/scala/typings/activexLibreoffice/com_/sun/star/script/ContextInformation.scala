package typings.activexLibreoffice.com_.sun.star.script

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides information about a certain stack frame.
  * @deprecated Deprecated
  */
trait ContextInformation extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ContextInformation] (val x: Self) extends AnyVal {
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "EndColumn", value.asInstanceOf[js.Any])
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "EndLine", value.asInstanceOf[js.Any])
    
    inline def setLocalVariableNames(value: SafeArray[String]): Self = StObject.set(x, "LocalVariableNames", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSourceCode(value: String): Self = StObject.set(x, "SourceCode", value.asInstanceOf[js.Any])
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "StartColumn", value.asInstanceOf[js.Any])
    
    inline def setStartLine(value: Double): Self = StObject.set(x, "StartLine", value.asInstanceOf[js.Any])
  }
}
