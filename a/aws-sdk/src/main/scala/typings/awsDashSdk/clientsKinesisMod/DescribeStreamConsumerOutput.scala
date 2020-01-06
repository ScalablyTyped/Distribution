package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamConsumerOutput extends js.Object {
  /**
    * An object that represents the details of the consumer.
    */
  var ConsumerDescription: typings.awsDashSdk.clientsKinesisMod.ConsumerDescription = js.native
}

object DescribeStreamConsumerOutput {
  @scala.inline
  def apply(ConsumerDescription: ConsumerDescription): DescribeStreamConsumerOutput = {
    val __obj = js.Dynamic.literal(ConsumerDescription = ConsumerDescription.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeStreamConsumerOutput]
  }
}

