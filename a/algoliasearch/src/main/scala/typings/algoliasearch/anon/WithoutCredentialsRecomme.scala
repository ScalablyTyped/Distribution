package typings.algoliasearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined algoliasearch.algoliasearch/dist/algoliasearch.WithoutCredentials<@algolia/client-recommendation.@algolia/client-recommendation.RecommendationClientOptions> */
@js.native
trait WithoutCredentialsRecomme extends js.Object {
  var region: js.UndefOr[String] = js.native
}

object WithoutCredentialsRecomme {
  @scala.inline
  def apply(): WithoutCredentialsRecomme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithoutCredentialsRecomme]
  }
  @scala.inline
  implicit class WithoutCredentialsRecommeOps[Self <: WithoutCredentialsRecomme] (val x: Self) extends AnyVal {
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
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

