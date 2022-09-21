package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.apiMod.Analytics
import typings.angularDevkitBuildWebpack.forwarderMod.AnalyticsForwarderFn
import typings.angularDevkitBuildWebpack.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyticsMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/analytics", "AnalyticsReportKind")
  @js.native
  object AnalyticsReportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.angularDevkitBuildWebpack.forwarderMod.AnalyticsReportKind & String] = js.native
    
    /* "event" */ val Event: typings.angularDevkitBuildWebpack.forwarderMod.AnalyticsReportKind.Event & String = js.native
    
    /* "pageview" */ val Pageview: typings.angularDevkitBuildWebpack.forwarderMod.AnalyticsReportKind.Pageview & String = js.native
    
    /* "screenview" */ val Screenview: typings.angularDevkitBuildWebpack.forwarderMod.AnalyticsReportKind.Screenview & String = js.native
    
    /* "timing" */ val Timing: typings.angularDevkitBuildWebpack.forwarderMod.AnalyticsReportKind.Timing & String = js.native
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/analytics", "AnalyticsReporter")
  @js.native
  open class AnalyticsReporter protected ()
    extends typings.angularDevkitBuildWebpack.forwarderMod.AnalyticsReporter {
    def this(_analytics: Analytics) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/analytics", "ForwardingAnalytics")
  @js.native
  open class ForwardingAnalytics protected ()
    extends typings.angularDevkitBuildWebpack.forwarderMod.ForwardingAnalytics {
    def this(_fn: AnalyticsForwarderFn) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/analytics", "LoggingAnalytics")
  @js.native
  open class LoggingAnalytics protected ()
    extends typings.angularDevkitBuildWebpack.loggingMod.LoggingAnalytics {
    def this(_logger: Logger) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/analytics", "MultiAnalytics")
  @js.native
  open class MultiAnalytics ()
    extends typings.angularDevkitBuildWebpack.multiMod.MultiAnalytics {
    def this(_backends: js.Array[Analytics]) = this()
  }
  
  @js.native
  sealed trait NgCliAnalyticsDimensions extends StObject
  @JSImport("@angular-devkit/build-webpack/core/src/analytics", "NgCliAnalyticsDimensions")
  @js.native
  object NgCliAnalyticsDimensions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NgCliAnalyticsDimensions & Double] = js.native
    
    @js.native
    sealed trait AngularCLIMajorVersion
      extends StObject
         with NgCliAnalyticsDimensions
    /* 8 */ val AngularCLIMajorVersion: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.AngularCLIMajorVersion & Double = js.native
    
    @js.native
    sealed trait BuildErrors
      extends StObject
         with NgCliAnalyticsDimensions
    /* 20 */ val BuildErrors: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.BuildErrors & Double = js.native
    
    @js.native
    sealed trait CpuCount
      extends StObject
         with NgCliAnalyticsDimensions
    /* 1 */ val CpuCount: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.CpuCount & Double = js.native
    
    @js.native
    sealed trait CpuSpeed
      extends StObject
         with NgCliAnalyticsDimensions
    /* 2 */ val CpuSpeed: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.CpuSpeed & Double = js.native
    
    @js.native
    sealed trait NgAddCollection
      extends StObject
         with NgCliAnalyticsDimensions
    /* 6 */ val NgAddCollection: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.NgAddCollection & Double = js.native
    
    @js.native
    sealed trait NodeVersion
      extends StObject
         with NgCliAnalyticsDimensions
    /* 4 */ val NodeVersion: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.NodeVersion & Double = js.native
    
    @js.native
    sealed trait RamInGigabytes
      extends StObject
         with NgCliAnalyticsDimensions
    /* 3 */ val RamInGigabytes: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsDimensions.RamInGigabytes & Double = js.native
  }
  
  @js.native
  sealed trait NgCliAnalyticsMetrics extends StObject
  @JSImport("@angular-devkit/build-webpack/core/src/analytics", "NgCliAnalyticsMetrics")
  @js.native
  object NgCliAnalyticsMetrics extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NgCliAnalyticsMetrics & Double] = js.native
    
    @js.native
    sealed trait AssetCount
      extends StObject
         with NgCliAnalyticsMetrics
    /* 12 */ val AssetCount: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.AssetCount & Double = js.native
    
    @js.native
    sealed trait AssetSize
      extends StObject
         with NgCliAnalyticsMetrics
    /* 13 */ val AssetSize: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.AssetSize & Double = js.native
    
    @js.native
    sealed trait BuildTime
      extends StObject
         with NgCliAnalyticsMetrics
    /* 5 */ val BuildTime: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.BuildTime & Double = js.native
    
    @js.native
    sealed trait CssSize
      extends StObject
         with NgCliAnalyticsMetrics
    /* 15 */ val CssSize: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.CssSize & Double = js.native
    
    @js.native
    sealed trait InitialChunkSize
      extends StObject
         with NgCliAnalyticsMetrics
    /* 7 */ val InitialChunkSize: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.InitialChunkSize & Double = js.native
    
    @js.native
    sealed trait LazyChunkCount
      extends StObject
         with NgCliAnalyticsMetrics
    /* 10 */ val LazyChunkCount: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.LazyChunkCount & Double = js.native
    
    @js.native
    sealed trait LazyChunkSize
      extends StObject
         with NgCliAnalyticsMetrics
    /* 11 */ val LazyChunkSize: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.LazyChunkSize & Double = js.native
    
    @js.native
    sealed trait NgComponentCount
      extends StObject
         with NgCliAnalyticsMetrics
    /* 1 */ val NgComponentCount: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.NgComponentCount & Double = js.native
    
    @js.native
    sealed trait NgOnInitCount
      extends StObject
         with NgCliAnalyticsMetrics
    /* 6 */ val NgOnInitCount: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.NgOnInitCount & Double = js.native
    
    @js.native
    sealed trait PolyfillSize
      extends StObject
         with NgCliAnalyticsMetrics
    /* 14 */ val PolyfillSize: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.PolyfillSize & Double = js.native
    
    @js.native
    sealed trait TotalChunkCount
      extends StObject
         with NgCliAnalyticsMetrics
    /* 8 */ val TotalChunkCount: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.TotalChunkCount & Double = js.native
    
    @js.native
    sealed trait TotalChunkSize
      extends StObject
         with NgCliAnalyticsMetrics
    /* 9 */ val TotalChunkSize: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.TotalChunkSize & Double = js.native
    
    @js.native
    sealed trait UNUSED_2
      extends StObject
         with NgCliAnalyticsMetrics
    /* 2 */ val UNUSED_2: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.UNUSED_2 & Double = js.native
    
    @js.native
    sealed trait UNUSED_3
      extends StObject
         with NgCliAnalyticsMetrics
    /* 3 */ val UNUSED_3: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.UNUSED_3 & Double = js.native
    
    @js.native
    sealed trait UNUSED_4
      extends StObject
         with NgCliAnalyticsMetrics
    /* 4 */ val UNUSED_4: typings.angularDevkitBuildWebpack.analyticsMod.NgCliAnalyticsMetrics.UNUSED_4 & Double = js.native
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/analytics", "NoopAnalytics")
  @js.native
  open class NoopAnalytics ()
    extends typings.angularDevkitBuildWebpack.noopMod.NoopAnalytics
}
