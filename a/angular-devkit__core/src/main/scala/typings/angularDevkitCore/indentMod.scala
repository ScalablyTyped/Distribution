package typings.angularDevkitCore

import typings.angularDevkitCore.loggerLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indentMod {
  
  @JSImport("@angular-devkit/core/src/logger/indent", "IndentLogger")
  @js.native
  open class IndentLogger protected () extends Logger {
    def this(name: String) = this()
    def this(name: String, parent: Logger) = this()
    def this(name: String, parent: Null, indentation: String) = this()
    def this(name: String, parent: Unit, indentation: String) = this()
    def this(name: String, parent: Logger, indentation: String) = this()
  }
}
