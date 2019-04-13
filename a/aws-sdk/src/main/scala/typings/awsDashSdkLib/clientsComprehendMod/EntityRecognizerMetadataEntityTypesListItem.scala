package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityRecognizerMetadataEntityTypesListItem extends js.Object {
  /**
    * Type of entity from the list of entity types in the metadata of an entity recognizer. 
    */
  var Type: js.UndefOr[AnyLengthString] = js.undefined
}

object EntityRecognizerMetadataEntityTypesListItem {
  @scala.inline
  def apply(Type: AnyLengthString = null): EntityRecognizerMetadataEntityTypesListItem = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[EntityRecognizerMetadataEntityTypesListItem]
  }
}

