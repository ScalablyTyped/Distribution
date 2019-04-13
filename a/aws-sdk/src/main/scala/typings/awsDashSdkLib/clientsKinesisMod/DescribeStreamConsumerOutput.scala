package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamConsumerOutput extends js.Object {
  /**
    * An object that represents the details of the consumer.
    */
  var ConsumerDescription: awsDashSdkLib.clientsKinesisMod.ConsumerDescription
}

object DescribeStreamConsumerOutput {
  @scala.inline
  def apply(ConsumerDescription: ConsumerDescription): DescribeStreamConsumerOutput = {
    val __obj = js.Dynamic.literal(ConsumerDescription = ConsumerDescription)
  
    __obj.asInstanceOf[DescribeStreamConsumerOutput]
  }
}

