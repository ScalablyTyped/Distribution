package typings.applicationinsightsJs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AI")
@js.native
object AI extends js.Object {
  @js.native
  class DataPoint ()
    extends typings.applicationinsightsJs.AI.DataPoint
  
  @js.native
  class EventData ()
    extends typings.applicationinsightsJs.AI.EventData
  
  @js.native
  class ExceptionDetails ()
    extends typings.applicationinsightsJs.AI.ExceptionDetails
  
  @js.native
  class MessageData ()
    extends typings.applicationinsightsJs.AI.MessageData
  
  @js.native
  class PageViewData ()
    extends typings.applicationinsightsJs.AI.PageViewData
  
  @js.native
  class PageViewPerfData ()
    extends typings.applicationinsightsJs.AI.PageViewPerfData
  
  @js.native
  class RemoteDependencyData ()
    extends typings.applicationinsightsJs.AI.RemoteDependencyData
  
  @js.native
  class StackFrame ()
    extends typings.applicationinsightsJs.AI.StackFrame
  
  @js.native
  object DataPointType extends js.Object {
    /* 1 */ val Aggregation: typings.applicationinsightsJs.AI.DataPointType.Aggregation with Double = js.native
    /* 0 */ val Measurement: typings.applicationinsightsJs.AI.DataPointType.Measurement with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.applicationinsightsJs.AI.DataPointType with Double] = js.native
  }
  
  @js.native
  object DependencyKind extends js.Object {
    /* 1 */ val Http: typings.applicationinsightsJs.AI.DependencyKind.Http with Double = js.native
    /* 2 */ val Other: typings.applicationinsightsJs.AI.DependencyKind.Other with Double = js.native
    /* 0 */ val SQL: typings.applicationinsightsJs.AI.DependencyKind.SQL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.applicationinsightsJs.AI.DependencyKind with Double] = js.native
  }
  
  @js.native
  object DependencySourceType extends js.Object {
    /* 1 */ val Aic: typings.applicationinsightsJs.AI.DependencySourceType.Aic with Double = js.native
    /* 2 */ val Apmc: typings.applicationinsightsJs.AI.DependencySourceType.Apmc with Double = js.native
    /* 0 */ val Undefined: typings.applicationinsightsJs.AI.DependencySourceType.Undefined with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.applicationinsightsJs.AI.DependencySourceType with Double] = js.native
  }
  
  @js.native
  object SeverityLevel extends js.Object {
    /* 4 */ val Critical: typings.applicationinsightsJs.AI.SeverityLevel.Critical with Double = js.native
    /* 3 */ val Error: typings.applicationinsightsJs.AI.SeverityLevel.Error with Double = js.native
    /* 1 */ val Information: typings.applicationinsightsJs.AI.SeverityLevel.Information with Double = js.native
    /* 0 */ val Verbose: typings.applicationinsightsJs.AI.SeverityLevel.Verbose with Double = js.native
    /* 2 */ val Warning: typings.applicationinsightsJs.AI.SeverityLevel.Warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.applicationinsightsJs.AI.SeverityLevel with Double] = js.native
  }
  
}

