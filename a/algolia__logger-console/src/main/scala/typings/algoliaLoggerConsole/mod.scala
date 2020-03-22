package typings.algoliaLoggerConsole

import typings.algoliaLoggerCommon.mod.LogLevelType
import typings.algoliaLoggerCommon.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/logger-console", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createConsoleLogger(logLevel: LogLevelType): Logger = js.native
}

