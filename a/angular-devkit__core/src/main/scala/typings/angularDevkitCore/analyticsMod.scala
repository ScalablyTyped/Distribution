package typings.angularDevkitCore

import typings.angularDevkitCore.apiMod.Analytics
import typings.angularDevkitCore.forwarderMod.AnalyticsForwarderFn
import typings.angularDevkitCore.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyticsMod {
  
  @JSImport("@angular-devkit/core/src/analytics", "AnalyticsReportKind")
  @js.native
  object AnalyticsReportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.angularDevkitCore.forwarderMod.AnalyticsReportKind & String] = js.native
    
    /* "event" */ val Event: typings.angularDevkitCore.forwarderMod.AnalyticsReportKind.Event & String = js.native
    
    /* "pageview" */ val Pageview: typings.angularDevkitCore.forwarderMod.AnalyticsReportKind.Pageview & String = js.native
    
    /* "screenview" */ val Screenview: typings.angularDevkitCore.forwarderMod.AnalyticsReportKind.Screenview & String = js.native
    
    /* "timing" */ val Timing: typings.angularDevkitCore.forwarderMod.AnalyticsReportKind.Timing & String = js.native
  }
  
  @JSImport("@angular-devkit/core/src/analytics", "AnalyticsReporter")
  @js.native
  open class AnalyticsReporter protected ()
    extends typings.angularDevkitCore.forwarderMod.AnalyticsReporter {
    def this(_analytics: Analytics) = this()
  }
  
  @JSImport("@angular-devkit/core/src/analytics", "ForwardingAnalytics")
  @js.native
  open class ForwardingAnalytics protected ()
    extends typings.angularDevkitCore.forwarderMod.ForwardingAnalytics {
    def this(_fn: AnalyticsForwarderFn) = this()
  }
  
  @JSImport("@angular-devkit/core/src/analytics", "LoggingAnalytics")
  @js.native
  open class LoggingAnalytics protected ()
    extends typings.angularDevkitCore.loggingMod.LoggingAnalytics {
    def this(_logger: Logger) = this()
  }
  
  @JSImport("@angular-devkit/core/src/analytics", "MultiAnalytics")
  @js.native
  open class MultiAnalytics ()
    extends typings.angularDevkitCore.multiMod.MultiAnalytics {
    def this(_backends: js.Array[Analytics]) = this()
  }
  
  @js.native
  sealed trait NgCliAnalyticsDimensions extends StObject
  @JSImport("@angular-devkit/core/src/analytics", "NgCliAnalyticsDimensions")
  @js.native
  object NgCliAnalyticsDimensions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NgCliAnalyticsDimensions & Double] = js.native
    
    @js.native
    sealed trait AngularCLIMajorVersion
      extends StObject
         with NgCliAnalyticsDimensions
    /* 8 */ val AngularCLIMajorVersion: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.AngularCLIMajorVersion & Double = js.native
    
    @js.native
    sealed trait BuildErrors
      extends StObject
         with NgCliAnalyticsDimensions
    /* 20 */ val BuildErrors: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.BuildErrors & Double = js.native
    
    @js.native
    sealed trait CpuCount
      extends StObject
         with NgCliAnalyticsDimensions
    /* 1 */ val CpuCount: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.CpuCount & Double = js.native
    
    @js.native
    sealed trait CpuSpeed
      extends StObject
         with NgCliAnalyticsDimensions
    /* 2 */ val CpuSpeed: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.CpuSpeed & Double = js.native
    
    @js.native
    sealed trait NgAddCollection
      extends StObject
         with NgCliAnalyticsDimensions
    /* 6 */ val NgAddCollection: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.NgAddCollection & Double = js.native
    
    @js.native
    sealed trait NodeVersion
      extends StObject
         with NgCliAnalyticsDimensions
    /* 4 */ val NodeVersion: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.NodeVersion & Double = js.native
    
    @js.native
    sealed trait RamInGigabytes
      extends StObject
         with NgCliAnalyticsDimensions
    /* 3 */ val RamInGigabytes: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsDimensions.RamInGigabytes & Double = js.native
  }
  
  @js.native
  sealed trait NgCliAnalyticsMetrics extends StObject
  @JSImport("@angular-devkit/core/src/analytics", "NgCliAnalyticsMetrics")
  @js.native
  object NgCliAnalyticsMetrics extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NgCliAnalyticsMetrics & Double] = js.native
    
    @js.native
    sealed trait AssetCount
      extends StObject
         with NgCliAnalyticsMetrics
    /* 12 */ val AssetCount: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.AssetCount & Double = js.native
    
    @js.native
    sealed trait AssetSize
      extends StObject
         with NgCliAnalyticsMetrics
    /* 13 */ val AssetSize: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.AssetSize & Double = js.native
    
    @js.native
    sealed trait BuildTime
      extends StObject
         with NgCliAnalyticsMetrics
    /* 5 */ val BuildTime: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.BuildTime & Double = js.native
    
    @js.native
    sealed trait CssSize
      extends StObject
         with NgCliAnalyticsMetrics
    /* 15 */ val CssSize: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.CssSize & Double = js.native
    
    @js.native
    sealed trait InitialChunkSize
      extends StObject
         with NgCliAnalyticsMetrics
    /* 7 */ val InitialChunkSize: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.InitialChunkSize & Double = js.native
    
    @js.native
    sealed trait LazyChunkCount
      extends StObject
         with NgCliAnalyticsMetrics
    /* 10 */ val LazyChunkCount: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.LazyChunkCount & Double = js.native
    
    @js.native
    sealed trait LazyChunkSize
      extends StObject
         with NgCliAnalyticsMetrics
    /* 11 */ val LazyChunkSize: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.LazyChunkSize & Double = js.native
    
    @js.native
    sealed trait NgComponentCount
      extends StObject
         with NgCliAnalyticsMetrics
    /* 1 */ val NgComponentCount: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.NgComponentCount & Double = js.native
    
    @js.native
    sealed trait NgOnInitCount
      extends StObject
         with NgCliAnalyticsMetrics
    /* 6 */ val NgOnInitCount: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.NgOnInitCount & Double = js.native
    
    @js.native
    sealed trait PolyfillSize
      extends StObject
         with NgCliAnalyticsMetrics
    /* 14 */ val PolyfillSize: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.PolyfillSize & Double = js.native
    
    @js.native
    sealed trait TotalChunkCount
      extends StObject
         with NgCliAnalyticsMetrics
    /* 8 */ val TotalChunkCount: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.TotalChunkCount & Double = js.native
    
    @js.native
    sealed trait TotalChunkSize
      extends StObject
         with NgCliAnalyticsMetrics
    /* 9 */ val TotalChunkSize: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.TotalChunkSize & Double = js.native
    
    @js.native
    sealed trait UNUSED_2
      extends StObject
         with NgCliAnalyticsMetrics
    /* 2 */ val UNUSED_2: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.UNUSED_2 & Double = js.native
    
    @js.native
    sealed trait UNUSED_3
      extends StObject
         with NgCliAnalyticsMetrics
    /* 3 */ val UNUSED_3: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.UNUSED_3 & Double = js.native
    
    @js.native
    sealed trait UNUSED_4
      extends StObject
         with NgCliAnalyticsMetrics
    /* 4 */ val UNUSED_4: typings.angularDevkitCore.analyticsMod.NgCliAnalyticsMetrics.UNUSED_4 & Double = js.native
  }
  
  @JSImport("@angular-devkit/core/src/analytics", "NoopAnalytics")
  @js.native
  open class NoopAnalytics ()
    extends typings.angularDevkitCore.noopMod.NoopAnalytics
}
