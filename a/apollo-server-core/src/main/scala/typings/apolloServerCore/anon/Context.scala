package typings.apolloServerCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[TContext] extends js.Object {
  var context: TContext
}

object Context {
  @scala.inline
  def apply[TContext](context: TContext): Context[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TContext]]
  }
}

