package typings.angularDevkitCore

import typings.angularDevkitCore.srcAnalyticsApiMod.Analytics
import typings.angularDevkitCore.srcAnalyticsApiMod.EventOptions
import typings.angularDevkitCore.srcAnalyticsApiMod.PageviewOptions
import typings.angularDevkitCore.srcAnalyticsApiMod.ScreenviewOptions
import typings.angularDevkitCore.srcAnalyticsApiMod.TimingOptions
import typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Event
import typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Pageview
import typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Screenview
import typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Timing
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnalyticsForwarderMod {
  
  @js.native
  sealed trait AnalyticsReportKind extends StObject
  @JSImport("@angular-devkit/core/src/analytics/forwarder", "AnalyticsReportKind")
  @js.native
  object AnalyticsReportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AnalyticsReportKind & String] = js.native
    
    @js.native
    sealed trait Event
      extends StObject
         with AnalyticsReportKind
    /* "event" */ val Event: typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Event & String = js.native
    
    @js.native
    sealed trait Pageview
      extends StObject
         with AnalyticsReportKind
    /* "pageview" */ val Pageview: typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Pageview & String = js.native
    
    @js.native
    sealed trait Screenview
      extends StObject
         with AnalyticsReportKind
    /* "screenview" */ val Screenview: typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Screenview & String = js.native
    
    @js.native
    sealed trait Timing
      extends StObject
         with AnalyticsReportKind
    /* "timing" */ val Timing: typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Timing & String = js.native
  }
  
  @JSImport("@angular-devkit/core/src/analytics/forwarder", "AnalyticsReporter")
  @js.native
  open class AnalyticsReporter protected () extends StObject {
    def this(_analytics: Analytics) = this()
    
    /* protected */ var _analytics: Analytics = js.native
    
    def report(report: AnalyticsReport): Unit = js.native
  }
  
  @JSImport("@angular-devkit/core/src/analytics/forwarder", "ForwardingAnalytics")
  @js.native
  open class ForwardingAnalytics protected ()
    extends StObject
       with Analytics {
    def this(_fn: AnalyticsForwarderFn) = this()
    
    /* protected */ def _fn(report: JsonObject & AnalyticsReport): Unit = js.native
    /* protected */ @JSName("_fn")
    var _fn_Original: AnalyticsForwarderFn = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type AnalyticsForwarderFn = (report : @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonObject & @angular-devkit/core.@angular-devkit/core/src/analytics/forwarder.AnalyticsReport): void
  }}}
  to avoid circular code involving: 
  - @angular-devkit/core.@angular-devkit/core/src/analytics/forwarder.AnalyticsForwarderFn
  - @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonArray
  - @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonObject
  - @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonValue
  */
  @js.native
  trait AnalyticsForwarderFn extends StObject {
    
    def apply(report: JsonObject & AnalyticsReport): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportEvent
    - typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportScreenview
    - typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportPageview
    - typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportTiming
  */
  trait AnalyticsReport extends StObject
  object AnalyticsReport {
    
    inline def AnalyticsReportEvent(action: String, category: String, kind: Event, options: JsonObject & EventOptions): typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportEvent]
    }
    
    inline def AnalyticsReportPageview(kind: Pageview, options: JsonObject & PageviewOptions, path: String): typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportPageview = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportPageview]
    }
    
    inline def AnalyticsReportScreenview(appName: String, kind: Screenview, options: JsonObject & ScreenviewOptions, screenName: String): typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportScreenview = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportScreenview]
    }
    
    inline def AnalyticsReportTiming(
      category: String,
      kind: Timing,
      options: JsonObject & TimingOptions,
      time: String | Double,
      variable: String
    ): typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportTiming = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportTiming]
    }
  }
  
  trait AnalyticsReportBase
    extends StObject
       with JsonObject {
    
    var kind: AnalyticsReportKind
  }
  object AnalyticsReportBase {
    
    inline def apply(kind: AnalyticsReportKind): AnalyticsReportBase = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsReportBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsReportBase] (val x: Self) extends AnyVal {
      
      inline def setKind(value: AnalyticsReportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsReportEvent
    extends StObject
       with AnalyticsReportBase
       with AnalyticsReport {
    
    var action: String
    
    var category: String
    
    @JSName("kind")
    var kind_AnalyticsReportEvent: Event
    
    var options: JsonObject & EventOptions
  }
  object AnalyticsReportEvent {
    
    inline def apply(action: String, category: String, kind: Event, options: JsonObject & EventOptions): AnalyticsReportEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsReportEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsReportEvent] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Event): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: JsonObject & EventOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsReportPageview
    extends StObject
       with AnalyticsReportBase
       with AnalyticsReport {
    
    @JSName("kind")
    var kind_AnalyticsReportPageview: Pageview
    
    var options: JsonObject & PageviewOptions
    
    var path: String
  }
  object AnalyticsReportPageview {
    
    inline def apply(kind: Pageview, options: JsonObject & PageviewOptions, path: String): AnalyticsReportPageview = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsReportPageview]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsReportPageview] (val x: Self) extends AnyVal {
      
      inline def setKind(value: Pageview): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: JsonObject & PageviewOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsReportScreenview
    extends StObject
       with AnalyticsReportBase
       with AnalyticsReport {
    
    var appName: String
    
    @JSName("kind")
    var kind_AnalyticsReportScreenview: Screenview
    
    var options: JsonObject & ScreenviewOptions
    
    var screenName: String
  }
  object AnalyticsReportScreenview {
    
    inline def apply(appName: String, kind: Screenview, options: JsonObject & ScreenviewOptions, screenName: String): AnalyticsReportScreenview = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsReportScreenview]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsReportScreenview] (val x: Self) extends AnyVal {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Screenview): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: JsonObject & ScreenviewOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsReportTiming
    extends StObject
       with AnalyticsReportBase
       with AnalyticsReport {
    
    var category: String
    
    @JSName("kind")
    var kind_AnalyticsReportTiming: Timing
    
    var options: JsonObject & TimingOptions
    
    var time: String | Double
    
    var variable: String
  }
  object AnalyticsReportTiming {
    
    inline def apply(
      category: String,
      kind: Timing,
      options: JsonObject & TimingOptions,
      time: String | Double,
      variable: String
    ): AnalyticsReportTiming = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsReportTiming]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsReportTiming] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Timing): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: JsonObject & TimingOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String | Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    }
  }
}
