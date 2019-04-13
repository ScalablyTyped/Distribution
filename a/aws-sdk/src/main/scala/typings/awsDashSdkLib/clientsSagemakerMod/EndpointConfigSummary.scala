package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointConfigSummary extends js.Object {
  /**
    * A timestamp that shows when the endpoint configuration was created.
    */
  var CreationTime: Timestamp
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration.
    */
  var EndpointConfigArn: awsDashSdkLib.clientsSagemakerMod.EndpointConfigArn
  /**
    * The name of the endpoint configuration.
    */
  var EndpointConfigName: awsDashSdkLib.clientsSagemakerMod.EndpointConfigName
}

object EndpointConfigSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    EndpointConfigArn: EndpointConfigArn,
    EndpointConfigName: EndpointConfigName
  ): EndpointConfigSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, EndpointConfigArn = EndpointConfigArn, EndpointConfigName = EndpointConfigName)
  
    __obj.asInstanceOf[EndpointConfigSummary]
  }
}

