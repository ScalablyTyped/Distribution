package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEndpointWeightsAndCapacitiesInput extends js.Object {
  /**
    * An object that provides new capacity and weight values for a variant.
    */
  var DesiredWeightsAndCapacities: DesiredWeightAndCapacityList
  /**
    * The name of an existing Amazon SageMaker endpoint.
    */
  var EndpointName: typings.awsDashSdk.clientsSagemakerMod.EndpointName
}

object UpdateEndpointWeightsAndCapacitiesInput {
  @scala.inline
  def apply(DesiredWeightsAndCapacities: DesiredWeightAndCapacityList, EndpointName: EndpointName): UpdateEndpointWeightsAndCapacitiesInput = {
    val __obj = js.Dynamic.literal(DesiredWeightsAndCapacities = DesiredWeightsAndCapacities, EndpointName = EndpointName)
  
    __obj.asInstanceOf[UpdateEndpointWeightsAndCapacitiesInput]
  }
}

