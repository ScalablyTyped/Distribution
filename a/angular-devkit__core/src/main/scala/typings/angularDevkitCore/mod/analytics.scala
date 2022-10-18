package typings.angularDevkitCore.mod

import typings.angularDevkitCore.srcAnalyticsApiMod.Analytics
import typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsForwarderFn
import typings.angularDevkitCore.srcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analytics {
  
  @JSImport("@angular-devkit/core", "analytics.AnalyticsReportKind")
  @js.native
  object AnalyticsReportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind & String] = js.native
    
    /* "event" */ val Event: typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Event & String = js.native
    
    /* "pageview" */ val Pageview: typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Pageview & String = js.native
    
    /* "screenview" */ val Screenview: typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Screenview & String = js.native
    
    /* "timing" */ val Timing: typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Timing & String = js.native
  }
  
  @JSImport("@angular-devkit/core", "analytics.AnalyticsReporter")
  @js.native
  open class AnalyticsReporter protected ()
    extends typings.angularDevkitCore.srcAnalyticsMod.AnalyticsReporter {
    def this(_analytics: Analytics) = this()
  }
  
  @JSImport("@angular-devkit/core", "analytics.ForwardingAnalytics")
  @js.native
  open class ForwardingAnalytics protected ()
    extends typings.angularDevkitCore.srcAnalyticsMod.ForwardingAnalytics {
    def this(_fn: AnalyticsForwarderFn) = this()
  }
  
  @JSImport("@angular-devkit/core", "analytics.LoggingAnalytics")
  @js.native
  open class LoggingAnalytics protected ()
    extends typings.angularDevkitCore.srcAnalyticsMod.LoggingAnalytics {
    def this(_logger: Logger) = this()
  }
  
  @JSImport("@angular-devkit/core", "analytics.MultiAnalytics")
  @js.native
  open class MultiAnalytics ()
    extends typings.angularDevkitCore.srcAnalyticsMod.MultiAnalytics {
    def this(_backends: js.Array[Analytics]) = this()
  }
  
  @JSImport("@angular-devkit/core", "analytics.NgCliAnalyticsDimensions")
  @js.native
  object NgCliAnalyticsDimensions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions & Double] = js.native
    
    /* 8 */ val AngularCLIMajorVersion: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.AngularCLIMajorVersion & Double = js.native
    
    /* 20 */ val BuildErrors: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.BuildErrors & Double = js.native
    
    /* 1 */ val CpuCount: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.CpuCount & Double = js.native
    
    /* 2 */ val CpuSpeed: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.CpuSpeed & Double = js.native
    
    /* 6 */ val NgAddCollection: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.NgAddCollection & Double = js.native
    
    /* 4 */ val NodeVersion: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.NodeVersion & Double = js.native
    
    /* 3 */ val RamInGigabytes: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.RamInGigabytes & Double = js.native
  }
  
  @JSImport("@angular-devkit/core", "analytics.NgCliAnalyticsMetrics")
  @js.native
  object NgCliAnalyticsMetrics extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics & Double] = js.native
    
    /* 12 */ val AssetCount: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.AssetCount & Double = js.native
    
    /* 13 */ val AssetSize: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.AssetSize & Double = js.native
    
    /* 5 */ val BuildTime: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.BuildTime & Double = js.native
    
    /* 15 */ val CssSize: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.CssSize & Double = js.native
    
    /* 7 */ val InitialChunkSize: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.InitialChunkSize & Double = js.native
    
    /* 10 */ val LazyChunkCount: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.LazyChunkCount & Double = js.native
    
    /* 11 */ val LazyChunkSize: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.LazyChunkSize & Double = js.native
    
    /* 1 */ val NgComponentCount: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.NgComponentCount & Double = js.native
    
    /* 6 */ val NgOnInitCount: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.NgOnInitCount & Double = js.native
    
    /* 14 */ val PolyfillSize: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.PolyfillSize & Double = js.native
    
    /* 8 */ val TotalChunkCount: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.TotalChunkCount & Double = js.native
    
    /* 9 */ val TotalChunkSize: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.TotalChunkSize & Double = js.native
    
    /* 2 */ val UNUSED_2: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.UNUSED_2 & Double = js.native
    
    /* 3 */ val UNUSED_3: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.UNUSED_3 & Double = js.native
    
    /* 4 */ val UNUSED_4: typings.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.UNUSED_4 & Double = js.native
  }
  
  @JSImport("@angular-devkit/core", "analytics.NoopAnalytics")
  @js.native
  open class NoopAnalytics ()
    extends typings.angularDevkitCore.srcAnalyticsMod.NoopAnalytics
}
