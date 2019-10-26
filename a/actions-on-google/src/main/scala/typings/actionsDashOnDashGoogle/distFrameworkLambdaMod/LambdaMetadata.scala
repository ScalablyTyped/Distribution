package typings.actionsDashOnDashGoogle.distFrameworkLambdaMod

import typings.actionsDashOnDashGoogle.distCommonMod.JsonObject
import typings.awsDashLambda.awsDashLambdaMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaMetadata extends js.Object {
  /** @public */
  var context: Context
  /** @public */
  var event: JsonObject
}

object LambdaMetadata {
  @scala.inline
  def apply(context: Context, event: JsonObject): LambdaMetadata = {
    val __obj = js.Dynamic.literal(context = context, event = event)
  
    __obj.asInstanceOf[LambdaMetadata]
  }
}

