package typings.analyticsDashNode.analyticsDashNodeMod.AnalyticsNode

import typings.analyticsDashNode.Anon_AnonymousId
import typings.analyticsDashNode.Anon_AnonymousIdCategory
import typings.analyticsDashNode.Anon_AnonymousIdContext
import typings.analyticsDashNode.Anon_AnonymousIdContextGroupId
import typings.analyticsDashNode.Anon_AnonymousIdIntegrations
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analytics extends js.Object {
  /* alias is how you associate one identity with another. */
  def alias(message: Anon_AnonymousIdIntegrations): Analytics = js.native
  def alias(
    message: Anon_AnonymousIdIntegrations,
    callback: js.Function2[/* err */ Error, /* data */ Data, Unit]
  ): Analytics = js.native
  /* Flush batched calls to make sure nothing is left in the queue */
  def flush(): Analytics = js.native
  def flush(callback: js.Function2[/* err */ Error, /* data */ Data, Unit]): Analytics = js.native
  /* Group calls can be used to associate individual users with shared
    accounts or companies. */
  def group(message: Anon_AnonymousIdContextGroupId): Analytics = js.native
  def group(
    message: Anon_AnonymousIdContextGroupId,
    callback: js.Function2[/* err */ Error, /* data */ Data, Unit]
  ): Analytics = js.native
  /* The identify method lets you tie a user to their actions and record
    traits about them. */
  def identify(message: Anon_AnonymousId): Analytics = js.native
  def identify(message: Anon_AnonymousId, callback: js.Function2[/* err */ Error, /* data */ Data, Unit]): Analytics = js.native
  /* The page method lets you record page views on your website, along with
    optional extra information about the page being viewed. */
  def page(message: Anon_AnonymousIdCategory): Analytics = js.native
  def page(message: Anon_AnonymousIdCategory, callback: js.Function2[/* err */ Error, /* data */ Data, Unit]): Analytics = js.native
  /* The track method lets you record the actions your users perform. */
  def track(message: Anon_AnonymousIdContext): Analytics = js.native
  def track(message: Anon_AnonymousIdContext, callback: js.Function2[/* err */ Error, /* data */ Data, Unit]): Analytics = js.native
}

