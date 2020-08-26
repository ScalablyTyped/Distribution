package typings.apolloClient.localStateMod

import typings.apolloUtilities.getFromASTMod.FragmentMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecContext extends js.Object {
  var context: js.Any = js.native
  var defaultOperationType: String = js.native
  var exportedVariables: Record[String, _] = js.native
  var fragmentMap: FragmentMap = js.native
  var fragmentMatcher: FragmentMatcher = js.native
  var onlyRunForcedResolvers: Boolean = js.native
  var variables: VariableMap = js.native
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
  @scala.inline
  implicit class ExecContextOps[Self <: ExecContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultOperationType(value: String): Self = this.set("defaultOperationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportedVariables(value: Record[String, _]): Self = this.set("exportedVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentMap(value: FragmentMap): Self = this.set("fragmentMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentMatcher(value: (/* rootValue */ js.Any, /* typeCondition */ String, /* context */ js.Any) => Boolean): Self = this.set("fragmentMatcher", js.Any.fromFunction3(value))
    @scala.inline
    def setOnlyRunForcedResolvers(value: Boolean): Self = this.set("onlyRunForcedResolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: VariableMap): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

