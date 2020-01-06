package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssetRequest extends js.Object {
  /**
    * The ID of an MediaPackage VOD Asset resource.
    */
  var Id: __string = js.native
}

object DescribeAssetRequest {
  @scala.inline
  def apply(Id: __string): DescribeAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAssetRequest]
  }
}

