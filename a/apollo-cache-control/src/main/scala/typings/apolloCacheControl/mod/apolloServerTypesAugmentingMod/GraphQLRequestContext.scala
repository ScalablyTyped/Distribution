package typings.apolloCacheControl.mod.apolloServerTypesAugmentingMod

import typings.apolloCacheControl.anon.RequiredCacheHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLRequestContext[TContext] extends js.Object {
  var overallCachePolicy: js.UndefOr[RequiredCacheHint] = js.native
}

object GraphQLRequestContext {
  @scala.inline
  def apply[TContext](): GraphQLRequestContext[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLRequestContext[TContext]]
  }
  @scala.inline
  implicit class GraphQLRequestContextOps[Self <: GraphQLRequestContext[_], TContext] (val x: Self with GraphQLRequestContext[TContext]) extends AnyVal {
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
    def setOverallCachePolicy(value: RequiredCacheHint): Self = this.set("overallCachePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverallCachePolicy: Self = this.set("overallCachePolicy", js.undefined)
  }
  
}

