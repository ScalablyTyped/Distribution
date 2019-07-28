package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSuggestersResponse extends js.Object {
  /**
    * The suggesters configured for the domain specified in the request.
    */
  var Suggesters: SuggesterStatusList
}

object DescribeSuggestersResponse {
  @scala.inline
  def apply(Suggesters: SuggesterStatusList): DescribeSuggestersResponse = {
    val __obj = js.Dynamic.literal(Suggesters = Suggesters)
  
    __obj.asInstanceOf[DescribeSuggestersResponse]
  }
}

