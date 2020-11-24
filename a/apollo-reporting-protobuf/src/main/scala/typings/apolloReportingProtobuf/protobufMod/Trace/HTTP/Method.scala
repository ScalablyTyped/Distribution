package typings.apolloReportingProtobuf.protobufMod.Trace.HTTP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Method extends js.Object
/** Method enum. */
@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Method")
@js.native
object Method extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Method with Double] = js.native
  
  @js.native
  sealed trait CONNECT extends Method
  /* 8 */ @js.native
  object CONNECT extends TopLevel[CONNECT with Double]
  
  @js.native
  sealed trait DELETE extends Method
  /* 6 */ @js.native
  object DELETE extends TopLevel[DELETE with Double]
  
  @js.native
  sealed trait GET extends Method
  /* 2 */ @js.native
  object GET extends TopLevel[GET with Double]
  
  @js.native
  sealed trait HEAD extends Method
  /* 3 */ @js.native
  object HEAD extends TopLevel[HEAD with Double]
  
  @js.native
  sealed trait OPTIONS extends Method
  /* 1 */ @js.native
  object OPTIONS extends TopLevel[OPTIONS with Double]
  
  @js.native
  sealed trait PATCH extends Method
  /* 9 */ @js.native
  object PATCH extends TopLevel[PATCH with Double]
  
  @js.native
  sealed trait POST extends Method
  /* 4 */ @js.native
  object POST extends TopLevel[POST with Double]
  
  @js.native
  sealed trait PUT extends Method
  /* 5 */ @js.native
  object PUT extends TopLevel[PUT with Double]
  
  @js.native
  sealed trait TRACE extends Method
  /* 7 */ @js.native
  object TRACE extends TopLevel[TRACE with Double]
  
  @js.native
  sealed trait UNKNOWN extends Method
  /* 0 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
}
