package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformLoggerMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/logger/transform-logger", "TransformLogger")
  @js.native
  open class TransformLogger protected () extends Logger {
    def this(
      name: String,
      transform: js.Function1[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<LogEntry> */ /* stream */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<LogEntry> */ Any
          ]
    ) = this()
    def this(
      name: String,
      transform: js.Function1[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<LogEntry> */ /* stream */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<LogEntry> */ Any
          ],
      parent: Logger
    ) = this()
  }
}
