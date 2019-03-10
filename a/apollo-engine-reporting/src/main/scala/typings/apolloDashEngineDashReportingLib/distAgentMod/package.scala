package typings
package apolloDashEngineDashReportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distAgentMod {
  type GenerateClientInfo[TContext] = js.Function1[
    /* requestContext */ apolloDashServerDashCoreLib.distRequestPipelineAPIMod.GraphQLRequestContext[TContext], 
    ClientInfo
  ]
}
