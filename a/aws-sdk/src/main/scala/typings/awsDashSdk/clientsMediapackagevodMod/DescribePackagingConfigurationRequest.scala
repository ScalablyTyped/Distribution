package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePackagingConfigurationRequest extends js.Object {
  /**
    * The ID of a MediaPackage VOD PackagingConfiguration resource.
    */
  var Id: __string
}

object DescribePackagingConfigurationRequest {
  @scala.inline
  def apply(Id: __string): DescribePackagingConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DescribePackagingConfigurationRequest]
  }
}

