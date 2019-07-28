package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCollectionRequest extends js.Object {
  /**
    * ID for the collection that you are creating.
    */
  var CollectionId: typings.awsDashSdk.clientsRekognitionMod.CollectionId
}

object CreateCollectionRequest {
  @scala.inline
  def apply(CollectionId: CollectionId): CreateCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId)
  
    __obj.asInstanceOf[CreateCollectionRequest]
  }
}

