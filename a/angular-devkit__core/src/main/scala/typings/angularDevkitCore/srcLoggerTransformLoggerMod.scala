package typings.angularDevkitCore

import typings.angularDevkitCore.srcLoggerLoggerMod.LogEntry
import typings.angularDevkitCore.srcLoggerLoggerMod.Logger
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoggerTransformLoggerMod {
  
  @JSImport("@angular-devkit/core/src/logger/transform-logger", "TransformLogger")
  @js.native
  open class TransformLogger protected () extends Logger {
    def this(name: String, transform: js.Function1[/* stream */ Observable_[LogEntry], Observable_[LogEntry]]) = this()
    def this(
      name: String,
      transform: js.Function1[/* stream */ Observable_[LogEntry], Observable_[LogEntry]],
      parent: Logger
    ) = this()
  }
}
