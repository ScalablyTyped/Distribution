package typings.apolloReactComponents.typesMod

import typings.apolloReactCommon.typesMod.BaseMutationOptions
import typings.apolloReactCommon.typesMod.MutationFunction
import typings.apolloReactCommon.typesMod.MutationResult
import typings.graphql.astMod.DocumentNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationComponentOptions[TData, TVariables] extends BaseMutationOptions[TData, TVariables] {
  var mutation: DocumentNode = js.native
  def children(mutateFunction: MutationFunction[TData, TVariables], result: MutationResult[TData]): Element | Null = js.native
}

object MutationComponentOptions {
  @scala.inline
  def apply[TData, TVariables](
    children: (MutationFunction[TData, TVariables], MutationResult[TData]) => Element | Null,
    mutation: DocumentNode
  ): MutationComponentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), mutation = mutation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationComponentOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class MutationComponentOptionsOps[Self <: MutationComponentOptions[_, _], TData, TVariables] (val x: Self with (MutationComponentOptions[TData, TVariables])) extends AnyVal {
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
    def setChildren(value: (MutationFunction[TData, TVariables], MutationResult[TData]) => Element | Null): Self = this.set("children", js.Any.fromFunction2(value))
    @scala.inline
    def setMutation(value: DocumentNode): Self = this.set("mutation", value.asInstanceOf[js.Any])
  }
  
}

