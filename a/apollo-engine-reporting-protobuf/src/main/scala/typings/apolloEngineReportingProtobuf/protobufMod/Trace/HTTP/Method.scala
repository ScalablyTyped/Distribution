package typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Method with Double] = js.native
  /* 8 */ @js.native
  object CONNECT extends TopLevel[CONNECT with Double]
  
  /* 6 */ @js.native
  object DELETE extends TopLevel[DELETE with Double]
  
  /* 2 */ @js.native
  object GET extends TopLevel[GET with Double]
  
  /* 3 */ @js.native
  object HEAD extends TopLevel[HEAD with Double]
  
  /* 1 */ @js.native
  object OPTIONS extends TopLevel[OPTIONS with Double]
  
  /* 9 */ @js.native
  object PATCH extends TopLevel[PATCH with Double]
  
  /* 4 */ @js.native
  object POST extends TopLevel[POST with Double]
  
  /* 5 */ @js.native
  object PUT extends TopLevel[PUT with Double]
  
  /* 7 */ @js.native
  object TRACE extends TopLevel[TRACE with Double]
  
  /* 0 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
}

