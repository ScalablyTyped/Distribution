package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCollectionRequest extends js.Object {
  /**
    * ID of the collection to delete.
    */
  var CollectionId: awsDashSdkLib.clientsRekognitionMod.CollectionId
}

object DeleteCollectionRequest {
  @scala.inline
  def apply(CollectionId: CollectionId): DeleteCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId)
  
    __obj.asInstanceOf[DeleteCollectionRequest]
  }
}

