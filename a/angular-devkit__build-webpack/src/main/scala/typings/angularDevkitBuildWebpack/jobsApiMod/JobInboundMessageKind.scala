package typings.angularDevkitBuildWebpack.jobsApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JobInboundMessageKind extends StObject
@JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs/api", "JobInboundMessageKind")
@js.native
object JobInboundMessageKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JobInboundMessageKind & String] = js.native
  
  @js.native
  sealed trait Input
    extends StObject
       with JobInboundMessageKind
  /* "in" */ val Input: typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageKind.Input & String = js.native
  
  @js.native
  sealed trait Ping
    extends StObject
       with JobInboundMessageKind
  /* "ip" */ val Ping: typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageKind.Ping & String = js.native
  
  @js.native
  sealed trait Stop
    extends StObject
       with JobInboundMessageKind
  /* "is" */ val Stop: typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageKind.Stop & String = js.native
}
