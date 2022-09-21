package typings.angularDevkitCore.mod

import typings.angularDevkitCore.apiMod.Analytics
import typings.angularDevkitCore.forwarderMod.AnalyticsForwarderFn
import typings.angularDevkitCore.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analytics {
  
  @JSImport("@angular-devkit/core", "analytics.AnalyticsReportKind")
  @js.native
  object AnalyticsReportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.angularDevkitCore.forwarderMod.AnalyticsReportKind & String] = js.native
    
    /* "event" */ val Event: typings.angularDevkitCore.forwarderMod.AnalyticsReportKind.Event & String = js.native
    
    /* "pageview" */ val Pageview: typings.angularDevkitCore.forwarderMod.AnalyticsReportKind.Pageview & String = js.native
    
    /* "screenview" */ val Screenview: typings.angularDevkitCore.forwarderMod.AnalyticsReportKind.Screenview & String = js.native
    
    /* "timing" */ val Timing: typings.angularDevkitCore.forwarderMod.AnalyticsReportKind.Timing & String = js.native
  }
  
  @JSImport("@angular-devkit/core", "analytics.AnalyticsReporter")
  @js.native
  open class AnalyticsReporter protected ()
    extends typings.angularDevkitCore.analyticsMod.AnalyticsReporter {
    def this(_analytics: Analytics) = this()
  }
  
  @JSImport("@angular-devkit/core", "analytics.ForwardingAnalytics")
  @js.native
  open class ForwardingAnalytics protected ()
    extends typings.angularDevkitCore.analyticsMod.ForwardingAnalytics {
    def this(_fn: AnalyticsForwarderFn) = this()
  }
  
  @JSImport("@angular-devkit/core", "analytics.LoggingAnalytics")
  @js.native
  open class LoggingAnalytics protected ()
    extends typings.angularDevkitCore.analyticsMod.LoggingAnalytics {
    def this(_logger: Logger) = this()
  }
  
  @JSImport("@angular-devkit/core", "analytics.MultiAnalytics")
  @js.native
  open class MultiAnalytics ()
    extends typings.angularDevkitCore.analyticsMod.MultiAnalytics {
    def this(_backends: js.Array[Analytics]) = this()
  }
  
  @JSImport("@angular-devkit/core", "analytics.NgCliAnalyticsDimensions")
  @js.native
  object NgCliAnalyticsDimensions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions & Double] = js.native
    
    /* 8 */ val AngularCLIMajorVersion: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.AngularCLIMajorVersion & Double = js.native
    
    /* 20 */ val BuildErrors: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.BuildErrors & Double = js.native
    
    /* 1 */ val CpuCount: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.CpuCount & Double = js.native
    
    /* 2 */ val CpuSpeed: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.CpuSpeed & Double = js.native
    
    /* 6 */ val NgAddCollection: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.NgAddCollection & Double = js.native
    
    /* 4 */ val NodeVersion: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.NodeVersion & Double = js.native
    
    /* 3 */ val RamInGigabytes: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.RamInGigabytes & Double = js.native
  }
  
  @JSImport("@angular-devkit/core", "analytics.NgCliAnalyticsMetrics")
  @js.native
  object NgCliAnalyticsMetrics extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics & Double] = js.native
    
    /* 12 */ val AssetCount: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.AssetCount & Double = js.native
    
    /* 13 */ val AssetSize: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.AssetSize & Double = js.native
    
    /* 5 */ val BuildTime: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.BuildTime & Double = js.native
    
    /* 15 */ val CssSize: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.CssSize & Double = js.native
    
    /* 7 */ val InitialChunkSize: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.InitialChunkSize & Double = js.native
    
    /* 10 */ val LazyChunkCount: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.LazyChunkCount & Double = js.native
    
    /* 11 */ val LazyChunkSize: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.LazyChunkSize & Double = js.native
    
    /* 1 */ val NgComponentCount: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.NgComponentCount & Double = js.native
    
    /* 6 */ val NgOnInitCount: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.NgOnInitCount & Double = js.native
    
    /* 14 */ val PolyfillSize: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.PolyfillSize & Double = js.native
    
    /* 8 */ val TotalChunkCount: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.TotalChunkCount & Double = js.native
    
    /* 9 */ val TotalChunkSize: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.TotalChunkSize & Double = js.native
    
    /* 2 */ val UNUSED_2: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.UNUSED_2 & Double = js.native
    
    /* 3 */ val UNUSED_3: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.UNUSED_3 & Double = js.native
    
    /* 4 */ val UNUSED_4: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.UNUSED_4 & Double = js.native
  }
  
  @JSImport("@angular-devkit/core", "analytics.NoopAnalytics")
  @js.native
  open class NoopAnalytics ()
    extends typings.angularDevkitCore.analyticsMod.NoopAnalytics
}
