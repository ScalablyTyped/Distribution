package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLocationResource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
    */
  var ResourceArn: ResourceArnString = js.native
}

object DataLocationResource {
  @scala.inline
  def apply(ResourceArn: ResourceArnString): DataLocationResource = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataLocationResource]
  }
}

