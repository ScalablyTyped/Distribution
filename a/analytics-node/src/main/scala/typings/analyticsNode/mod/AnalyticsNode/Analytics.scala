package typings.analyticsNode.mod.AnalyticsNode

import typings.analyticsNode.anon.Category
import typings.analyticsNode.anon.Event
import typings.analyticsNode.anon.GroupId
import typings.analyticsNode.anon.PreviousId
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analytics extends js.Object {
  
  /* alias is how you associate one identity with another. */
  def alias(message: Identity with PreviousId): Analytics = js.native
  def alias(message: Identity with PreviousId, callback: js.Function1[/* err */ Error, Unit]): Analytics = js.native
  
  /* Flush batched calls to make sure nothing is left in the queue */
  def flush(): Analytics = js.native
  def flush(callback: js.Function2[/* err */ Error, /* data */ Data, Unit]): Analytics = js.native
  
  /* Group calls can be used to associate individual users with shared
    accounts or companies. */
  def group(message: Identity with GroupId): Analytics = js.native
  def group(message: Identity with GroupId, callback: js.Function1[/* err */ Error, Unit]): Analytics = js.native
  
  /* The identify method lets you tie a user to their actions and record
    traits about them. */
  def identify(message: Identity with typings.analyticsNode.anon.Integrations): Analytics = js.native
  def identify(
    message: Identity with typings.analyticsNode.anon.Integrations,
    callback: js.Function1[/* err */ Error, Unit]
  ): Analytics = js.native
  
  /* The page method lets you record page views on your website, along with
    optional extra information about the page being viewed. */
  def page(message: Identity with Category): Analytics = js.native
  def page(message: Identity with Category, callback: js.Function1[/* err */ Error, Unit]): Analytics = js.native
  
  /* The track method lets you record the actions your users perform. */
  def track(message: Identity with Event): Analytics = js.native
  def track(message: Identity with Event, callback: js.Function1[/* err */ Error, Unit]): Analytics = js.native
}
