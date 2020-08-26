package typings.apolloClient.localStateMod

import typings.apolloCache.mod.ApolloCache
import typings.apolloClient.apolloClientMod.default
import typings.apolloClient.typesMod.Resolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalStateOptions[TCacheShape] extends js.Object {
  var cache: ApolloCache[TCacheShape] = js.native
  var client: js.UndefOr[default[TCacheShape]] = js.native
  var fragmentMatcher: js.UndefOr[FragmentMatcher] = js.native
  var resolvers: js.UndefOr[Resolvers | js.Array[Resolvers]] = js.native
}

object LocalStateOptions {
  @scala.inline
  def apply[TCacheShape](cache: ApolloCache[TCacheShape]): LocalStateOptions[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStateOptions[TCacheShape]]
  }
  @scala.inline
  implicit class LocalStateOptionsOps[Self <: LocalStateOptions[_], TCacheShape] (val x: Self with LocalStateOptions[TCacheShape]) extends AnyVal {
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
    def setCache(value: ApolloCache[TCacheShape]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient(value: default[TCacheShape]): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setFragmentMatcher(value: (/* rootValue */ js.Any, /* typeCondition */ String, /* context */ js.Any) => Boolean): Self = this.set("fragmentMatcher", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFragmentMatcher: Self = this.set("fragmentMatcher", js.undefined)
    @scala.inline
    def setResolversVarargs(value: Resolvers*): Self = this.set("resolvers", js.Array(value :_*))
    @scala.inline
    def setResolvers(value: Resolvers | js.Array[Resolvers]): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvers: Self = this.set("resolvers", js.undefined)
  }
  
}

