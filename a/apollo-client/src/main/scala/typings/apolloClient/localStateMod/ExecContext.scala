package typings.apolloClient.localStateMod

import typings.apolloUtilities.getFromASTMod.FragmentMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecContext extends js.Object {
  var context: js.Any
  var defaultOperationType: String
  var exportedVariables: Record[String, _]
  var fragmentMap: FragmentMap
  var fragmentMatcher: FragmentMatcher
  var onlyRunForcedResolvers: Boolean
  var variables: VariableMap
}

object ExecContext {
  @scala.inline
  def apply(
    context: js.Any,
    defaultOperationType: String,
    exportedVariables: Record[String, _],
    fragmentMap: FragmentMap,
    fragmentMatcher: (/* rootValue */ js.Any, /* typeCondition */ String, /* context */ js.Any) => Boolean,
    onlyRunForcedResolvers: Boolean,
    variables: VariableMap
  ): ExecContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], defaultOperationType = defaultOperationType.asInstanceOf[js.Any], exportedVariables = exportedVariables.asInstanceOf[js.Any], fragmentMap = fragmentMap.asInstanceOf[js.Any], fragmentMatcher = js.Any.fromFunction3(fragmentMatcher), onlyRunForcedResolvers = onlyRunForcedResolvers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExecContext]
  }
}

