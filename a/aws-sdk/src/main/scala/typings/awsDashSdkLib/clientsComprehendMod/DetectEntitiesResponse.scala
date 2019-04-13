package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectEntitiesResponse extends js.Object {
  /**
    * A collection of entities identified in the input text. For each entity, the response provides the entity text, entity type, where the entity text begins and ends, and the level of confidence that Amazon Comprehend has in the detection. For a list of entity types, see how-entities. 
    */
  var Entities: js.UndefOr[ListOfEntities] = js.undefined
}

object DetectEntitiesResponse {
  @scala.inline
  def apply(Entities: ListOfEntities = null): DetectEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (Entities != null) __obj.updateDynamic("Entities")(Entities)
    __obj.asInstanceOf[DetectEntitiesResponse]
  }
}

