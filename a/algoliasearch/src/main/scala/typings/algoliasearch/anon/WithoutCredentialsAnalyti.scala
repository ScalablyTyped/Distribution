package typings.algoliasearch.anon

import typings.algoliasearch.algoliasearchStrings.de
import typings.algoliasearch.algoliasearchStrings.us
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined algoliasearch.algoliasearch/dist/algoliasearch.WithoutCredentials<@algolia/client-analytics.@algolia/client-analytics.AnalyticsClientOptions> */
@js.native
trait WithoutCredentialsAnalyti extends js.Object {
  var region: js.UndefOr[de | us] = js.native
}

object WithoutCredentialsAnalyti {
  @scala.inline
  def apply(): WithoutCredentialsAnalyti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithoutCredentialsAnalyti]
  }
  @scala.inline
  implicit class WithoutCredentialsAnalytiOps[Self <: WithoutCredentialsAnalyti] (val x: Self) extends AnyVal {
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
    def setRegion(value: de | us): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

