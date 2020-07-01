package typings.apolloEngineReporting.federatedPluginMod

import typings.apolloEngineReporting.agentMod.EngineReportingOptions
import typings.apolloEngineReporting.apolloEngineReportingStrings.rewriteError
import typings.apolloServerPluginBase.mod.ApolloServerPlugin
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/federatedPlugin", JSImport.Default)
@js.native
object default_rewriteError extends js.Object {
  def apply[TContext](options: Pick[EngineReportingOptions[TContext], rewriteError]): ApolloServerPlugin[TContext] = js.native
}

