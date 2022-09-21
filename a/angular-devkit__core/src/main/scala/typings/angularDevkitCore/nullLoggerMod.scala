package typings.angularDevkitCore

import typings.angularDevkitCore.loggerLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nullLoggerMod {
  
  @JSImport("@angular-devkit/core/src/logger/null-logger", "NullLogger")
  @js.native
  open class NullLogger () extends Logger {
    def this(parent: Logger) = this()
  }
}
