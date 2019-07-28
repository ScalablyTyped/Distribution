package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLayerVersionRequest extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsDashSdk.clientsLambdaMod.LayerName
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber
}

object DeleteLayerVersionRequest {
  @scala.inline
  def apply(LayerName: LayerName, VersionNumber: LayerVersionNumber): DeleteLayerVersionRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName, VersionNumber = VersionNumber)
  
    __obj.asInstanceOf[DeleteLayerVersionRequest]
  }
}

