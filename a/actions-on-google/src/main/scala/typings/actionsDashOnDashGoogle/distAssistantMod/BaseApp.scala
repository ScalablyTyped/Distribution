package typings.actionsDashOnDashGoogle.distAssistantMod

import typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod.BuiltinFrameworks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseApp extends ServiceBaseApp {
  /** @public */
  var debug: Boolean = js.native
  /** @public */
  var frameworks: BuiltinFrameworks = js.native
  /** @public */
  def use[TService, TPlugin](plugin: Plugin[TService, TPlugin]): this.type with TPlugin = js.native
}

