package typings.apolloDashServerDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[TContext] extends js.Object {
  var context: TContext
}

object Anon_Context {
  @scala.inline
  def apply[TContext](context: TContext): Anon_Context[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Context[TContext]]
  }
}

