package typings.apolloEngineReporting.agentMod

import typings.apolloServerTypes.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/agent", "getEngineGraphVariant")
@js.native
object getEngineGraphVariant extends js.Object {
  def apply(): js.UndefOr[String] = js.native
  def apply(engine: Boolean): js.UndefOr[String] = js.native
  def apply(engine: Boolean, logger: Logger): js.UndefOr[String] = js.native
  def apply(engine: EngineReportingOptions[_]): js.UndefOr[String] = js.native
  def apply(engine: EngineReportingOptions[_], logger: Logger): js.UndefOr[String] = js.native
}

