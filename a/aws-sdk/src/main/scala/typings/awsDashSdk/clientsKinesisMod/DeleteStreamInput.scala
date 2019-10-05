package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteStreamInput extends js.Object {
  /**
    * If this parameter is unset (null) or if you set it to false, and the stream has registered consumers, the call to DeleteStream fails with a ResourceInUseException. 
    */
  var EnforceConsumerDeletion: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The name of the stream to delete.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisMod.StreamName
}

object DeleteStreamInput {
  @scala.inline
  def apply(StreamName: StreamName, EnforceConsumerDeletion: js.UndefOr[Boolean] = js.undefined): DeleteStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName)
    if (!js.isUndefined(EnforceConsumerDeletion)) __obj.updateDynamic("EnforceConsumerDeletion")(EnforceConsumerDeletion)
    __obj.asInstanceOf[DeleteStreamInput]
  }
}

