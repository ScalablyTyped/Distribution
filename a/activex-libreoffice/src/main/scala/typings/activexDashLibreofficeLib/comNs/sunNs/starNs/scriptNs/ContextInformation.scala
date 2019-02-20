package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides information about a certain stack frame.
  * @deprecated Deprecated
  */
trait ContextInformation extends js.Object {
  /** contains the first column in the **EndLine** that is NOT associated with the context. */
  var EndColumn: scala.Double
  /** contains the last line in the module's source code associated with the context. */
  var EndLine: scala.Double
  /** Get all names of the local variable in this context. */
  var LocalVariableNames: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Full qualified name to address the module or function associated with the context. If the module or function can't be addressed by name, e.g., in case
    * that a runtime generated eval-module is executed, this string is empty
    */
  var Name: java.lang.String
  /**
    * Source code of the Module, that is associated with the context. If the source can be accessed using the ModuleName or if the source is unknown
    * (executing compiled code) this string can be empty.
    */
  var SourceCode: java.lang.String
  /** contains the first column in the **StartLine** associated with the context. */
  var StartColumn: scala.Double
  /**
    * contains the first line in the module's source code associated with the context.
    *
    * If "name" addresses a function, all line and column values are nevertheless given relative to the module's source. If source code is not available,
    * this value addresses a binary position in the compiled code.
    * @see XLibraryAccess.getModuleCode
    * @see XLibraryAccess.getFunctionCode
    */
  var StartLine: scala.Double
}

