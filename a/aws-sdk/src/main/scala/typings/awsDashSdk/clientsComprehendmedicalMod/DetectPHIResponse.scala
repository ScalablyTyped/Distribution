package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectPHIResponse extends js.Object {
  /**
    *  The collection of PHI entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence that Comprehend Medical has in its detection. 
    */
  var Entities: EntityList
  /**
    *  If the result of the previous request to DetectPHI was truncated, include the Paginationtoken to fetch the next page of PHI entities. 
    */
  var PaginationToken: js.UndefOr[String] = js.undefined
}

object DetectPHIResponse {
  @scala.inline
  def apply(Entities: EntityList, PaginationToken: String = null): DetectPHIResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities)
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    __obj.asInstanceOf[DetectPHIResponse]
  }
}

