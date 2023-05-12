package typings.angularCli

import typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomDimension
import typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomMetric
import typings.angularCli.srcAnalyticsAnalyticsParametersMod.PrimitiveTypes
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnalyticsAnalyticsCollectorMod {
  
  @JSImport("@angular/cli/src/analytics/analytics-collector", "AnalyticsCollector")
  @js.native
  open class AnalyticsCollector protected () extends StObject {
    def this(context: CommandContext, userId: String) = this()
    
    /* private */ var context: Any = js.native
    
    /* private */ var event: Any = js.native
    
    def flush(): js.Promise[Unit] = js.native
    
    /**
      * Flush on an interval (if the event loop is waiting).
      *
      * @returns a method that when called will terminate the periodic
      * flush and call flush one last time.
      */
    def periodFlush(): js.Function0[js.Promise[Unit]] = js.native
    
    def reportArchitectRunEvent(parameters: Partial[Record[EventCustomDimension, PrimitiveTypes]]): Unit = js.native
    
    def reportBuildRunEvent(
      parameters: Partial[
          Record[EventCustomMetric & EventCustomDimension, js.UndefOr[String | Boolean | Double]]
        ]
    ): Unit = js.native
    
    def reportCommandRunEvent(command: String): Unit = js.native
    
    def reportRebuildRunEvent(
      parameters: Partial[
          Record[EventCustomMetric & EventCustomDimension, js.UndefOr[String | Boolean | Double]]
        ]
    ): Unit = js.native
    
    def reportSchematicRunEvent(parameters: Partial[Record[EventCustomDimension, PrimitiveTypes]]): Unit = js.native
    
    def reportWorkspaceInfoEvent(parameters: Partial[Record[EventCustomMetric, js.UndefOr[String | Boolean | Double]]]): Unit = js.native
    
    /* private */ val requestParameterStringified: Any = js.native
    
    /* private */ var send: Any = js.native
    
    /* private */ var trackingEventsQueue: Any = js.native
    
    /* private */ val userParameters: Any = js.native
  }
}
