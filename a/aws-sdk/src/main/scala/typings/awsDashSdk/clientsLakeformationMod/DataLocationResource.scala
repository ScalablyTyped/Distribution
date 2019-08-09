package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLocationResource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
    */
  var ResourceArn: ResourceArnString
}

object DataLocationResource {
  @scala.inline
  def apply(ResourceArn: ResourceArnString): DataLocationResource = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[DataLocationResource]
  }
}

