package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityRecognizerInputDataConfig extends js.Object {
  /**
    * S3 location of the annotations file for an entity recognizer.
    */
  var Annotations: js.UndefOr[EntityRecognizerAnnotations] = js.undefined
  /**
    * S3 location of the documents folder for an entity recognizer
    */
  var Documents: EntityRecognizerDocuments
  /**
    * S3 location of the entity list for an entity recognizer.
    */
  var EntityList: js.UndefOr[EntityRecognizerEntityList] = js.undefined
  /**
    * The entity types in the input data for an entity recognizer. A maximum of 12 entity types can be used at one time to train an entity recognizer.
    */
  var EntityTypes: EntityTypesList
}

object EntityRecognizerInputDataConfig {
  @scala.inline
  def apply(
    Documents: EntityRecognizerDocuments,
    EntityTypes: EntityTypesList,
    Annotations: EntityRecognizerAnnotations = null,
    EntityList: EntityRecognizerEntityList = null
  ): EntityRecognizerInputDataConfig = {
    val __obj = js.Dynamic.literal(Documents = Documents, EntityTypes = EntityTypes)
    if (Annotations != null) __obj.updateDynamic("Annotations")(Annotations)
    if (EntityList != null) __obj.updateDynamic("EntityList")(EntityList)
    __obj.asInstanceOf[EntityRecognizerInputDataConfig]
  }
}

