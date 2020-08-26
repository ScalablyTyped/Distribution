package typings.apolloReactHooks.typesMod

import typings.apolloReactCommon.typesMod.BaseMutationOptions
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationHookOptions[TData, TVariables] extends BaseMutationOptions[TData, TVariables] {
  var mutation: js.UndefOr[DocumentNode] = js.native
}

object MutationHookOptions {
  @scala.inline
  def apply[TData, TVariables](): MutationHookOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationHookOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class MutationHookOptionsOps[Self <: MutationHookOptions[_, _], TData, TVariables] (val x: Self with (MutationHookOptions[TData, TVariables])) extends AnyVal {
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
    @scala.inline
    def deleteMutation: Self = this.set("mutation", js.undefined)
  }
  
}

