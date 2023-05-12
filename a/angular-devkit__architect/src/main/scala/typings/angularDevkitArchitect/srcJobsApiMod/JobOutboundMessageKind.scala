package typings.angularDevkitArchitect.srcJobsApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JobOutboundMessageKind extends StObject
@JSImport("@angular-devkit/architect/src/jobs/api", "JobOutboundMessageKind")
@js.native
object JobOutboundMessageKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JobOutboundMessageKind & String] = js.native
  
  @js.native
  sealed trait ChannelComplete
    extends StObject
       with JobOutboundMessageKind
  /* "cc" */ val ChannelComplete: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelComplete & String = js.native
  
  @js.native
  sealed trait ChannelCreate
    extends StObject
       with JobOutboundMessageKind
  /* "cn" */ val ChannelCreate: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelCreate & String = js.native
  
  @js.native
  sealed trait ChannelError
    extends StObject
       with JobOutboundMessageKind
  /* "ce" */ val ChannelError: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelError & String = js.native
  
  @js.native
  sealed trait ChannelMessage
    extends StObject
       with JobOutboundMessageKind
  /* "cm" */ val ChannelMessage: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelMessage & String = js.native
  
  @js.native
  sealed trait End
    extends StObject
       with JobOutboundMessageKind
  /* "e" */ val End: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.End & String = js.native
  
  @js.native
  sealed trait OnReady
    extends StObject
       with JobOutboundMessageKind
  /* "c" */ val OnReady: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.OnReady & String = js.native
  
  @js.native
  sealed trait Output
    extends StObject
       with JobOutboundMessageKind
  /* "o" */ val Output: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.Output & String = js.native
  
  @js.native
  sealed trait Pong
    extends StObject
       with JobOutboundMessageKind
  /* "p" */ val Pong: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.Pong & String = js.native
  
  @js.native
  sealed trait Start
    extends StObject
       with JobOutboundMessageKind
  /* "s" */ val Start: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.Start & String = js.native
}
