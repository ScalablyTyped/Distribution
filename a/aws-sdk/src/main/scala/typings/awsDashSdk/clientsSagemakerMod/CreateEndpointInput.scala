package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEndpointInput extends js.Object {
  /**
    * The name of an endpoint configuration. For more information, see CreateEndpointConfig. 
    */
  var EndpointConfigName: typings.awsDashSdk.clientsSagemakerMod.EndpointConfigName
  /**
    * The name of the endpoint. The name must be unique within an AWS Region in your AWS account.
    */
  var EndpointName: typings.awsDashSdk.clientsSagemakerMod.EndpointName
  /**
    * An array of key-value pairs. For more information, see Using Cost Allocation Tagsin the AWS Billing and Cost Management User Guide. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateEndpointInput {
  @scala.inline
  def apply(EndpointConfigName: EndpointConfigName, EndpointName: EndpointName, Tags: TagList = null): CreateEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName, EndpointName = EndpointName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateEndpointInput]
  }
}

