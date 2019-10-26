package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFrameworkLambdaMod {
  import typings.actionsDashOnDashGoogle.distCommonMod.JsonObject
  import typings.awsDashLambda.awsDashLambdaMod.Callback
  import typings.awsDashLambda.awsDashLambdaMod.Context

  type LambdaHandler = js.Function3[
    /* event */ JsonObject, 
    /* context */ Context, 
    /* callback */ Callback[js.Any], 
    js.Promise[Unit]
  ]
}
