package typings.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lambdaMod {
  type LambdaHandler = js.Function3[
    /* event */ typings.actionsOnGoogle.commonMod.JsonObject, 
    /* context */ typings.awsLambda.handlerMod.Context, 
    /* callback */ typings.awsLambda.handlerMod.Callback[js.Any], 
    js.Promise[scala.Unit]
  ]
}
