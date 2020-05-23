package typings.apolloEngineReporting.anon

import typings.apolloEngineReporting.agentMod.EngineReportingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Engine extends js.Object {
  var engine: js.UndefOr[EngineReportingOptions[_] | Boolean] = js.undefined
  var logger: js.UndefOr[typings.apolloServerTypes.mod.Logger] = js.undefined
  var skipWarn: js.UndefOr[Boolean] = js.undefined
}

object Engine {
  @scala.inline
  def apply(
    engine: EngineReportingOptions[_] | Boolean = null,
    logger: typings.apolloServerTypes.mod.Logger = null,
    skipWarn: js.UndefOr[Boolean] = js.undefined
  ): Engine = {
    val __obj = js.Dynamic.literal()
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(skipWarn)) __obj.updateDynamic("skipWarn")(skipWarn.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine]
  }
}

