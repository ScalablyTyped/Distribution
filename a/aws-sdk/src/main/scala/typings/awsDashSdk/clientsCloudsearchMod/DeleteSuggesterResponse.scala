package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSuggesterResponse extends js.Object {
  /**
    * The status of the suggester being deleted.
    */
  var Suggester: SuggesterStatus
}

object DeleteSuggesterResponse {
  @scala.inline
  def apply(Suggester: SuggesterStatus): DeleteSuggesterResponse = {
    val __obj = js.Dynamic.literal(Suggester = Suggester)
  
    __obj.asInstanceOf[DeleteSuggesterResponse]
  }
}

