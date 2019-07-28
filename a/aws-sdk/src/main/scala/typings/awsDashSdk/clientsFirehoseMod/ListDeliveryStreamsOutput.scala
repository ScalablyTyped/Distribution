package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeliveryStreamsOutput extends js.Object {
  /**
    * The names of the delivery streams.
    */
  var DeliveryStreamNames: DeliveryStreamNameList
  /**
    * Indicates whether there are more delivery streams available to list.
    */
  var HasMoreDeliveryStreams: BooleanObject
}

object ListDeliveryStreamsOutput {
  @scala.inline
  def apply(DeliveryStreamNames: DeliveryStreamNameList, HasMoreDeliveryStreams: BooleanObject): ListDeliveryStreamsOutput = {
    val __obj = js.Dynamic.literal(DeliveryStreamNames = DeliveryStreamNames, HasMoreDeliveryStreams = HasMoreDeliveryStreams)
  
    __obj.asInstanceOf[ListDeliveryStreamsOutput]
  }
}

