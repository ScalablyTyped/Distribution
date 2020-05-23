package typings.apolloEngineReporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionArgs extends js.Object {
  var executionArgs: typings.graphql.executeMod.ExecutionArgs
}

object ExecutionArgs {
  @scala.inline
  def apply(executionArgs: typings.graphql.executeMod.ExecutionArgs): ExecutionArgs = {
    val __obj = js.Dynamic.literal(executionArgs = executionArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionArgs]
  }
}

