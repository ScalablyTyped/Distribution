package typings.algoliasearch.anon

import typings.algoliaClientCommon.mod.AuthModeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined algoliasearch.algoliasearch/dist/algoliasearch.WithoutCredentials<@algolia/client-search.@algolia/client-search.SearchClientOptions> */
@js.native
trait WithoutCredentialsSearchC extends js.Object {
  var authMode: js.UndefOr[AuthModeType] = js.native
}

object WithoutCredentialsSearchC {
  @scala.inline
  def apply(): WithoutCredentialsSearchC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithoutCredentialsSearchC]
  }
  @scala.inline
  implicit class WithoutCredentialsSearchCOps[Self <: WithoutCredentialsSearchC] (val x: Self) extends AnyVal {
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
    def setAuthMode(value: AuthModeType): Self = this.set("authMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthMode: Self = this.set("authMode", js.undefined)
  }
  
}

