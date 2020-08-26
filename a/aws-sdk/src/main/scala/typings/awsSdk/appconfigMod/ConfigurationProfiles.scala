package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationProfiles extends js.Object {
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[ConfigurationProfileSummaryList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.appconfigMod.NextToken] = js.native
}

object ConfigurationProfiles {
  @scala.inline
  def apply(): ConfigurationProfiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationProfiles]
  }
  @scala.inline
  implicit class ConfigurationProfilesOps[Self <: ConfigurationProfiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemsVarargs(value: ConfigurationProfileSummary*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: ConfigurationProfileSummaryList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

