package typings.apolloReactHooks.typesMod

import typings.apolloReactCommon.typesMod.BaseMutationOptions
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationOptions[TData, TVariables] extends BaseMutationOptions[TData, TVariables] {
  var mutation: DocumentNode = js.native
}

object MutationOptions {
  @scala.inline
  def apply[TData, TVariables](mutation: DocumentNode): MutationOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class MutationOptionsOps[Self <: MutationOptions[_, _], TData, TVariables] (val x: Self with (MutationOptions[TData, TVariables])) extends AnyVal {
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
    def setMutation(value: DocumentNode): Self = this.set("mutation", value.asInstanceOf[js.Any])
  }
  
}

