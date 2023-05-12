package typings.angularDevkitArchitect.srcJobsApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JobInboundMessageKind extends StObject
@JSImport("@angular-devkit/architect/src/jobs/api", "JobInboundMessageKind")
@js.native
object JobInboundMessageKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JobInboundMessageKind & String] = js.native
  
  @js.native
  sealed trait Input
    extends StObject
       with JobInboundMessageKind
  /* "in" */ val Input: typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind.Input & String = js.native
  
  @js.native
  sealed trait Ping
    extends StObject
       with JobInboundMessageKind
  /* "ip" */ val Ping: typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind.Ping & String = js.native
  
  @js.native
  sealed trait Stop
    extends StObject
       with JobInboundMessageKind
  /* "is" */ val Stop: typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind.Stop & String = js.native
}
