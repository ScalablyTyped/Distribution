package typings.apolloClient.apolloClientMod

import typings.apolloCache.mod.ApolloCache
import typings.apolloClient.localStateMod.FragmentMatcher
import typings.apolloClient.typesMod.Resolvers
import typings.apolloLink.mod.ApolloLink
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloClientOptions[TCacheShape] extends js.Object {
  var assumeImmutableResults: js.UndefOr[Boolean] = js.native
  var cache: ApolloCache[TCacheShape] = js.native
  var connectToDevTools: js.UndefOr[Boolean] = js.native
  var defaultOptions: js.UndefOr[DefaultOptions] = js.native
  var fragmentMatcher: js.UndefOr[FragmentMatcher] = js.native
  var link: js.UndefOr[ApolloLink] = js.native
  var name: js.UndefOr[String] = js.native
  var queryDeduplication: js.UndefOr[Boolean] = js.native
  var resolvers: js.UndefOr[Resolvers | js.Array[Resolvers]] = js.native
  var ssrForceFetchDelay: js.UndefOr[Double] = js.native
  var ssrMode: js.UndefOr[Boolean] = js.native
  var typeDefs: js.UndefOr[String | (js.Array[DocumentNode | String]) | DocumentNode] = js.native
  var version: js.UndefOr[String] = js.native
}

object ApolloClientOptions {
  @scala.inline
  def apply[TCacheShape](cache: ApolloCache[TCacheShape]): ApolloClientOptions[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloClientOptions[TCacheShape]]
  }
  @scala.inline
  implicit class ApolloClientOptionsOps[Self <: ApolloClientOptions[_], TCacheShape] (val x: Self with ApolloClientOptions[TCacheShape]) extends AnyVal {
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
    def setAssumeImmutableResults(value: Boolean): Self = this.set("assumeImmutableResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumeImmutableResults: Self = this.set("assumeImmutableResults", js.undefined)
    @scala.inline
    def setConnectToDevTools(value: Boolean): Self = this.set("connectToDevTools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectToDevTools: Self = this.set("connectToDevTools", js.undefined)
    @scala.inline
    def setDefaultOptions(value: DefaultOptions): Self = this.set("defaultOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOptions: Self = this.set("defaultOptions", js.undefined)
    @scala.inline
    def setFragmentMatcher(value: (/* rootValue */ js.Any, /* typeCondition */ String, /* context */ js.Any) => Boolean): Self = this.set("fragmentMatcher", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFragmentMatcher: Self = this.set("fragmentMatcher", js.undefined)
    @scala.inline
    def setLink(value: ApolloLink): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setQueryDeduplication(value: Boolean): Self = this.set("queryDeduplication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryDeduplication: Self = this.set("queryDeduplication", js.undefined)
    @scala.inline
    def setResolversVarargs(value: Resolvers*): Self = this.set("resolvers", js.Array(value :_*))
    @scala.inline
    def setResolvers(value: Resolvers | js.Array[Resolvers]): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvers: Self = this.set("resolvers", js.undefined)
    @scala.inline
    def setSsrForceFetchDelay(value: Double): Self = this.set("ssrForceFetchDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsrForceFetchDelay: Self = this.set("ssrForceFetchDelay", js.undefined)
    @scala.inline
    def setSsrMode(value: Boolean): Self = this.set("ssrMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsrMode: Self = this.set("ssrMode", js.undefined)
    @scala.inline
    def setTypeDefsVarargs(value: (DocumentNode | String)*): Self = this.set("typeDefs", js.Array(value :_*))
    @scala.inline
    def setTypeDefs(value: String | (js.Array[DocumentNode | String]) | DocumentNode): Self = this.set("typeDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeDefs: Self = this.set("typeDefs", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

