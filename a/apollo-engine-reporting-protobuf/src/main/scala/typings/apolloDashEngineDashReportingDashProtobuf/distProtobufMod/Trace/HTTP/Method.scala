package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Method extends js.Object

/** Method enum. */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.HTTP.Method")
@js.native
object Method extends js.Object {
  @js.native
  sealed trait CONNECT extends Method
  
  @js.native
  sealed trait DELETE extends Method
  
  @js.native
  sealed trait GET extends Method
  
  @js.native
  sealed trait HEAD extends Method
  
  @js.native
  sealed trait OPTIONS extends Method
  
  @js.native
  sealed trait PATCH extends Method
  
  @js.native
  sealed trait POST extends Method
  
  @js.native
  sealed trait PUT extends Method
  
  @js.native
  sealed trait TRACE extends Method
  
  @js.native
  sealed trait UNKNOWN extends Method
  
  /* 8 */ val CONNECT: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP.Method.CONNECT with Double = js.native
  /* 6 */ val DELETE: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP.Method.DELETE with Double = js.native
  /* 2 */ val GET: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP.Method.GET with Double = js.native
  /* 3 */ val HEAD: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP.Method.HEAD with Double = js.native
  /* 1 */ val OPTIONS: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP.Method.OPTIONS with Double = js.native
  /* 9 */ val PATCH: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP.Method.PATCH with Double = js.native
  /* 4 */ val POST: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP.Method.POST with Double = js.native
  /* 5 */ val PUT: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP.Method.PUT with Double = js.native
  /* 7 */ val TRACE: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP.Method.TRACE with Double = js.native
  /* 0 */ val UNKNOWN: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP.Method.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Method with Double] = js.native
}

