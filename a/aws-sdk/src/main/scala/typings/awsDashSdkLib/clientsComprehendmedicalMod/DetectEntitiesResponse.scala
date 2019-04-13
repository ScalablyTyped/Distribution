package typings
package awsDashSdkLib.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectEntitiesResponse extends js.Object {
  /**
    *  The collection of medical entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of the entity are also returned.
    */
  var Entities: EntityList
  /**
    *  If the result of the previous request to DetectEntities was truncated, include the Paginationtoken to fetch the next page of entities.
    */
  var PaginationToken: js.UndefOr[String] = js.undefined
  /**
    *  Attributes extracted from the input text that we were unable to relate to an entity.
    */
  var UnmappedAttributes: js.UndefOr[UnmappedAttributeList] = js.undefined
}

object DetectEntitiesResponse {
  @scala.inline
  def apply(
    Entities: EntityList,
    PaginationToken: String = null,
    UnmappedAttributes: UnmappedAttributeList = null
  ): DetectEntitiesResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities)
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    if (UnmappedAttributes != null) __obj.updateDynamic("UnmappedAttributes")(UnmappedAttributes)
    __obj.asInstanceOf[DetectEntitiesResponse]
  }
}

