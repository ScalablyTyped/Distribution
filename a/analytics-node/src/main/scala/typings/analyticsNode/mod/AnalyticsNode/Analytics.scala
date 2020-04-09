package typings.analyticsNode.mod.AnalyticsNode

import typings.analyticsNode.AnonCategory
import typings.analyticsNode.AnonEvent
import typings.analyticsNode.AnonGroupId
import typings.analyticsNode.AnonIntegrations
import typings.analyticsNode.AnonPreviousId
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analytics extends js.Object {
  /* alias is how you associate one identity with another. */
  def alias(message: Identity with AnonPreviousId): Analytics = js.native
  def alias(
    message: Identity with AnonPreviousId,
    callback: js.Function2[/* err */ Error, /* data */ Data, Unit]
  ): Analytics = js.native
  /* Flush batched calls to make sure nothing is left in the queue */
  def flush(): Analytics = js.native
  def flush(callback: js.Function2[/* err */ Error, /* data */ Data, Unit]): Analytics = js.native
  /* Group calls can be used to associate individual users with shared
    accounts or companies. */
  def group(message: Identity with AnonGroupId): Analytics = js.native
  def group(message: Identity with AnonGroupId, callback: js.Function2[/* err */ Error, /* data */ Data, Unit]): Analytics = js.native
  /* The identify method lets you tie a user to their actions and record
    traits about them. */
  def identify(message: Identity with AnonIntegrations): Analytics = js.native
  def identify(
    message: Identity with AnonIntegrations,
    callback: js.Function2[/* err */ Error, /* data */ Data, Unit]
  ): Analytics = js.native
  /* The page method lets you record page views on your website, along with
    optional extra information about the page being viewed. */
  def page(message: Identity with AnonCategory): Analytics = js.native
  def page(
    message: Identity with AnonCategory,
    callback: js.Function2[/* err */ Error, /* data */ Data, Unit]
  ): Analytics = js.native
  /* The track method lets you record the actions your users perform. */
  def track(message: Identity with AnonEvent): Analytics = js.native
  def track(message: Identity with AnonEvent, callback: js.Function2[/* err */ Error, /* data */ Data, Unit]): Analytics = js.native
}

