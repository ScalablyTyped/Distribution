package typings.angularDevkitBuildWebpack.jobsApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JobOutboundMessageKind extends StObject
@JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs/api", "JobOutboundMessageKind")
@js.native
object JobOutboundMessageKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JobOutboundMessageKind & String] = js.native
  
  @js.native
  sealed trait ChannelComplete
    extends StObject
       with JobOutboundMessageKind
  /* "cc" */ val ChannelComplete: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.ChannelComplete & String = js.native
  
  @js.native
  sealed trait ChannelCreate
    extends StObject
       with JobOutboundMessageKind
  /* "cn" */ val ChannelCreate: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.ChannelCreate & String = js.native
  
  @js.native
  sealed trait ChannelError
    extends StObject
       with JobOutboundMessageKind
  /* "ce" */ val ChannelError: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.ChannelError & String = js.native
  
  @js.native
  sealed trait ChannelMessage
    extends StObject
       with JobOutboundMessageKind
  /* "cm" */ val ChannelMessage: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.ChannelMessage & String = js.native
  
  @js.native
  sealed trait End
    extends StObject
       with JobOutboundMessageKind
  /* "e" */ val End: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.End & String = js.native
  
  @js.native
  sealed trait OnReady
    extends StObject
       with JobOutboundMessageKind
  /* "c" */ val OnReady: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.OnReady & String = js.native
  
  @js.native
  sealed trait Output
    extends StObject
       with JobOutboundMessageKind
  /* "o" */ val Output: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.Output & String = js.native
  
  @js.native
  sealed trait Pong
    extends StObject
       with JobOutboundMessageKind
  /* "p" */ val Pong: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.Pong & String = js.native
  
  @js.native
  sealed trait Start
    extends StObject
       with JobOutboundMessageKind
  /* "s" */ val Start: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.Start & String = js.native
}
