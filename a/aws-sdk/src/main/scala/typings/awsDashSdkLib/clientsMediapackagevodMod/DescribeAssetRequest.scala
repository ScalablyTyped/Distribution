package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAssetRequest extends js.Object {
  /**
    * The ID of an MediaPackage VOD Asset resource.
    */
  var Id: __string
}

object DescribeAssetRequest {
  @scala.inline
  def apply(Id: __string): DescribeAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DescribeAssetRequest]
  }
}

