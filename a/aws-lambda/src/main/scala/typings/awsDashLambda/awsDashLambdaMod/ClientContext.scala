package typings.awsDashLambda.awsDashLambdaMod

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
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
    if (Custom != null) __obj.updateDynamic("Custom")(Custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientContext]
  }
}

