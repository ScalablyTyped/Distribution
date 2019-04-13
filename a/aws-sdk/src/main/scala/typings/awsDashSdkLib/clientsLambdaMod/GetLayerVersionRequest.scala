package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLayerVersionRequest extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: awsDashSdkLib.clientsLambdaMod.LayerName
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber
}

object GetLayerVersionRequest {
  @scala.inline
  def apply(LayerName: LayerName, VersionNumber: LayerVersionNumber): GetLayerVersionRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName, VersionNumber = VersionNumber)
  
    __obj.asInstanceOf[GetLayerVersionRequest]
  }
}

