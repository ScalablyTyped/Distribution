package typings.apolloDashEngineDashReporting

import typings.apolloDashEngineDashReporting.distAgentMod.EngineReportingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting", JSImport.Namespace)
@js.native
object apolloDashEngineDashReportingMod extends js.Object {
  @js.native
  class EngineFederatedTracingExtension[TContext] protected ()
    extends typings.apolloDashEngineDashReporting.distFederatedExtensionMod.EngineFederatedTracingExtension[TContext] {
    def this(options: Anon_Err) = this()
  }
  
  @js.native
  class EngineReportingAgent[TContext] ()
    extends typings.apolloDashEngineDashReporting.distAgentMod.EngineReportingAgent[TContext] {
    def this(options: EngineReportingOptions[TContext]) = this()
  }
  
}

