package typings.angularDevkitBuildWebpack.srcMod

import typings.angularDevkitBuildWebpack.apiMod.Analytics
import typings.angularDevkitBuildWebpack.forwarderMod.AnalyticsForwarderFn
import typings.angularDevkitBuildWebpack.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analytics {
  
  @JSImport("@angular-devkit/build-webpack/core/src", "analytics.AnalyticsReportKind")
  @js.native
  object AnalyticsReportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.angularDevkitBuildWebpack.forwarderMod.AnalyticsReportKind & String] = js.native
    
    /* "event" */ val Event: typings.angularDevkitBuildWebpack.forwarderMod.AnalyticsReportKind.Event & String = js.native
    
    /* "pageview" */ val Pageview: typings.angularDevkitBuildWebpack.forwarderMod.AnalyticsReportKind.Pageview & String = js.native
    
    /* "screenview" */ val Screenview: typings.angularDevkitBuildWebpack.forwarderMod.AnalyticsReportKind.Screenview & String = js.native
    
    /* "timing" */ val Timing: typings.angularDevkitBuildWebpack.forwarderMod.AnalyticsReportKind.Timing & String = js.native
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "analytics.AnalyticsReporter")
  @js.native
  open class AnalyticsReporter protected ()
    extends typings.angularDevkitBuildWebpack.analyticsMod.AnalyticsReporter {
    def this(_analytics: Analytics) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "analytics.ForwardingAnalytics")
  @js.native
  open class ForwardingAnalytics protected ()
    extends typings.angularDevkitBuildWebpack.analyticsMod.ForwardingAnalytics {
    def this(_fn: AnalyticsForwarderFn) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "analytics.LoggingAnalytics")
  @js.native
  open class LoggingAnalytics protected ()
    extends typings.angularDevkitBuildWebpack.analyticsMod.LoggingAnalytics {
    def this(_logger: Logger) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "analytics.MultiAnalytics")
  @js.native
  open class MultiAnalytics ()
    extends typings.angularDevkitBuildWebpack.analyticsMod.MultiAnalytics {
    def this(_backends: js.Array[Analytics]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "analytics.NgCliAnalyticsDimensions")
  @js.native
  object NgCliAnalyticsDimensions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions & Double] = js.native
    
    /* 8 */ val AngularCLIMajorVersion: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.AngularCLIMajorVersion & Double = js.native
    
    /* 20 */ val BuildErrors: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.BuildErrors & Double = js.native
    
    /* 1 */ val CpuCount: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.CpuCount & Double = js.native
    
    /* 2 */ val CpuSpeed: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.CpuSpeed & Double = js.native
    
    /* 6 */ val NgAddCollection: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.NgAddCollection & Double = js.native
    
    /* 4 */ val NodeVersion: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.NodeVersion & Double = js.native
    
    /* 3 */ val RamInGigabytes: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.RamInGigabytes & Double = js.native
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "analytics.NgCliAnalyticsMetrics")
  @js.native
  object NgCliAnalyticsMetrics extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics & Double] = js.native
    
    /* 12 */ val AssetCount: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.AssetCount & Double = js.native
    
    /* 13 */ val AssetSize: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.AssetSize & Double = js.native
    
    /* 5 */ val BuildTime: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.BuildTime & Double = js.native
    
    /* 15 */ val CssSize: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.CssSize & Double = js.native
    
    /* 7 */ val InitialChunkSize: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.InitialChunkSize & Double = js.native
    
    /* 10 */ val LazyChunkCount: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.LazyChunkCount & Double = js.native
    
    /* 11 */ val LazyChunkSize: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.LazyChunkSize & Double = js.native
    
    /* 1 */ val NgComponentCount: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.NgComponentCount & Double = js.native
    
    /* 6 */ val NgOnInitCount: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.NgOnInitCount & Double = js.native
    
    /* 14 */ val PolyfillSize: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.PolyfillSize & Double = js.native
    
    /* 8 */ val TotalChunkCount: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.TotalChunkCount & Double = js.native
    
    /* 9 */ val TotalChunkSize: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.TotalChunkSize & Double = js.native
    
    /* 2 */ val UNUSED_2: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.UNUSED_2 & Double = js.native
    
    /* 3 */ val UNUSED_3: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.UNUSED_3 & Double = js.native
    
    /* 4 */ val UNUSED_4: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.UNUSED_4 & Double = js.native
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "analytics.NoopAnalytics")
  @js.native
  open class NoopAnalytics ()
    extends typings.angularDevkitBuildWebpack.analyticsMod.NoopAnalytics
}
