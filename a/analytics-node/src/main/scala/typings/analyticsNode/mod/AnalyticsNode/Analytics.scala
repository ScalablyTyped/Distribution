package typings.analyticsNode.mod.AnalyticsNode

import typings.analyticsNode.AnonAnonymousId
import typings.analyticsNode.AnonAnonymousIdCategory
import typings.analyticsNode.AnonAnonymousIdContext
import typings.analyticsNode.AnonAnonymousIdContextGroupId
import typings.analyticsNode.AnonAnonymousIdIntegrations
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analytics extends js.Object {
  /* alias is how you associate one identity with another. */
  def alias(message: AnonAnonymousIdIntegrations): Analytics = js.native
  def alias(
    message: AnonAnonymousIdIntegrations,
    callback: js.Function2[/* err */ Error, /* data */ Data, Unit]
  ): Analytics = js.native
  /* Flush batched calls to make sure nothing is left in the queue */
  def flush(): Analytics = js.native
  def flush(callback: js.Function2[/* err */ Error, /* data */ Data, Unit]): Analytics = js.native
  /* Group calls can be used to associate individual users with shared
    accounts or companies. */
  def group(message: AnonAnonymousIdContextGroupId): Analytics = js.native
  def group(
    message: AnonAnonymousIdContextGroupId,
    callback: js.Function2[/* err */ Error, /* data */ Data, Unit]
  ): Analytics = js.native
  /* The identify method lets you tie a user to their actions and record
    traits about them. */
  def identify(message: AnonAnonymousId): Analytics = js.native
  def identify(message: AnonAnonymousId, callback: js.Function2[/* err */ Error, /* data */ Data, Unit]): Analytics = js.native
  /* The page method lets you record page views on your website, along with
    optional extra information about the page being viewed. */
  def page(message: AnonAnonymousIdCategory): Analytics = js.native
  def page(message: AnonAnonymousIdCategory, callback: js.Function2[/* err */ Error, /* data */ Data, Unit]): Analytics = js.native
  /* The track method lets you record the actions your users perform. */
  def track(message: AnonAnonymousIdContext): Analytics = js.native
  def track(message: AnonAnonymousIdContext, callback: js.Function2[/* err */ Error, /* data */ Data, Unit]): Analytics = js.native
}

