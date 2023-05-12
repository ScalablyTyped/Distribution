package typings.angularCli.srcAnalyticsAnalyticsParametersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventCustomMetric extends StObject
@JSImport("@angular/cli/src/analytics/analytics-parameters", "EventCustomMetric")
@js.native
object EventCustomMetric extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventCustomMetric & String] = js.native
  
  @js.native
  sealed trait AllChunksCount
    extends StObject
       with EventCustomMetric
  /* "epn.ng_all_chunks_count" */ val AllChunksCount: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomMetric.AllChunksCount & String = js.native
  
  @js.native
  sealed trait AllProjectsCount
    extends StObject
       with EventCustomMetric
  /* "epn.all_projects_count" */ val AllProjectsCount: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomMetric.AllProjectsCount & String = js.native
  
  @js.native
  sealed trait ApplicationProjectsCount
    extends StObject
       with EventCustomMetric
  /* "epn.apps_projects_count" */ val ApplicationProjectsCount: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomMetric.ApplicationProjectsCount & String = js.native
  
  @js.native
  sealed trait ChangedChunksCount
    extends StObject
       with EventCustomMetric
  /* "epn.ng_changed_chunks_count" */ val ChangedChunksCount: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomMetric.ChangedChunksCount & String = js.native
  
  @js.native
  sealed trait CssSizeInBytes
    extends StObject
       with EventCustomMetric
  /* "epn.ng_css_size_bytes" */ val CssSizeInBytes: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomMetric.CssSizeInBytes & String = js.native
  
  @js.native
  sealed trait DurationInMs
    extends StObject
       with EventCustomMetric
  /* "epn.ng_duration_ms" */ val DurationInMs: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomMetric.DurationInMs & String = js.native
  
  @js.native
  sealed trait InitialChunksCount
    extends StObject
       with EventCustomMetric
  /* "epn.ng_initial_chunks_count" */ val InitialChunksCount: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomMetric.InitialChunksCount & String = js.native
  
  @js.native
  sealed trait JsSizeInBytes
    extends StObject
       with EventCustomMetric
  /* "epn.ng_js_size_bytes" */ val JsSizeInBytes: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomMetric.JsSizeInBytes & String = js.native
  
  @js.native
  sealed trait LazyChunksCount
    extends StObject
       with EventCustomMetric
  /* "epn.ng_lazy_chunks_count" */ val LazyChunksCount: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomMetric.LazyChunksCount & String = js.native
  
  @js.native
  sealed trait LibraryProjectsCount
    extends StObject
       with EventCustomMetric
  /* "epn.libs_projects_count" */ val LibraryProjectsCount: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomMetric.LibraryProjectsCount & String = js.native
  
  @js.native
  sealed trait NgComponentCount
    extends StObject
       with EventCustomMetric
  /* "epn.ng_component_count" */ val NgComponentCount: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomMetric.NgComponentCount & String = js.native
}
