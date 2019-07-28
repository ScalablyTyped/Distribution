package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCollectionRequest extends js.Object {
  /**
    * The ID of the collection to describe.
    */
  var CollectionId: typings.awsDashSdk.clientsRekognitionMod.CollectionId
}

object DescribeCollectionRequest {
  @scala.inline
  def apply(CollectionId: CollectionId): DescribeCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId)
  
    __obj.asInstanceOf[DescribeCollectionRequest]
  }
}

