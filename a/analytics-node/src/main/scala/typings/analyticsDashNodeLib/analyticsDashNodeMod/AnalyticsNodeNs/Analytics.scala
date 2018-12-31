package typings
package analyticsDashNodeLib.analyticsDashNodeMod.AnalyticsNodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analytics extends js.Object {
  /* alias is how you associate one identity with another. */
  def alias(message: analyticsDashNodeLib.Anon_AnonymousId): Analytics = js.native
  def alias(
    message: analyticsDashNodeLib.Anon_AnonymousId,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ Data, scala.Unit]
  ): Analytics = js.native
  /* Flush batched calls to make sure nothing is left in the queue */
  def flush(): Analytics = js.native
  def flush(callback: js.Function2[/* err */ stdLib.Error, /* data */ Data, scala.Unit]): Analytics = js.native
  /* Group calls can be used to associate individual users with shared
    accounts or companies. */
  def group(message: analyticsDashNodeLib.Anon_TimestampContextIntegrations): Analytics = js.native
  def group(
    message: analyticsDashNodeLib.Anon_TimestampContextIntegrations,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ Data, scala.Unit]
  ): Analytics = js.native
  /* The identify method lets you tie a user to their actions and record
    traits about them. */
  def identify(message: analyticsDashNodeLib.Anon_TimestampContext): Analytics = js.native
  def identify(
    message: analyticsDashNodeLib.Anon_TimestampContext,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ Data, scala.Unit]
  ): Analytics = js.native
  /* The page method lets you record page views on your website, along with
    optional extra information about the page being viewed. */
  def page(message: analyticsDashNodeLib.Anon_NameTimestamp): Analytics = js.native
  def page(
    message: analyticsDashNodeLib.Anon_NameTimestamp,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ Data, scala.Unit]
  ): Analytics = js.native
  /* The track method lets you record the actions your users perform. */
  def track(message: analyticsDashNodeLib.Anon_Timestamp): Analytics = js.native
  def track(
    message: analyticsDashNodeLib.Anon_Timestamp,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ Data, scala.Unit]
  ): Analytics = js.native
}

