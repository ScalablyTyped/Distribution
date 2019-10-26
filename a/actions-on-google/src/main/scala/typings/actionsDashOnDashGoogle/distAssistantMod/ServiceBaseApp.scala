package typings.actionsDashOnDashGoogle.distAssistantMod

import typings.actionsDashOnDashGoogle.distCommonMod.JsonObject
import typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod.BuiltinFrameworkMetadata
import typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod.Headers
import typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod.StandardHandler
import typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod.StandardResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceBaseApp extends js.Object {
  /** @public */
  @JSName("handler")
  var handler_Original: StandardHandler = js.native
  /** @public */
  def handler(/** @public */
  body: JsonObject, /** @public */
  headers: Headers): js.Promise[StandardResponse] = js.native
  def handler(
    /** @public */
  body: JsonObject,
    /** @public */
  headers: Headers,
    /** @public */
  metadata: BuiltinFrameworkMetadata
  ): js.Promise[StandardResponse] = js.native
}

