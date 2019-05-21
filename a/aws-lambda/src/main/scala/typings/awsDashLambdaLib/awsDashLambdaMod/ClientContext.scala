package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientContext extends js.Object {
  var Custom: js.UndefOr[js.Any] = js.undefined
  var client: ClientContextClient
  var env: ClientContextEnv
}

object ClientContext {
  @scala.inline
  def apply(client: ClientContextClient, env: ClientContextEnv, Custom: js.Any = null): ClientContext = {
    val __obj = js.Dynamic.literal(client = client, env = env)
    if (Custom != null) __obj.updateDynamic("Custom")(Custom)
    __obj.asInstanceOf[ClientContext]
  }
}

