package typings.apolloServerCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext[TContext] extends js.Object {
  var context: TContext
}

object AnonContext {
  @scala.inline
  def apply[TContext](context: TContext): AnonContext[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext[TContext]]
  }
}

