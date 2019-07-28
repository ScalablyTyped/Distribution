package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpekeKeyProvider extends js.Object {
  /**
    * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
  MediaPackage will assume when accessing the key provider service.
    */
  var RoleArn: __string
  /**
    * The system IDs to include in key requests.
    */
  var SystemIds: __listOf__string
  /**
    * The URL of the external key provider service.
    */
  var Url: __string
}

object SpekeKeyProvider {
  @scala.inline
  def apply(RoleArn: __string, SystemIds: __listOf__string, Url: __string): SpekeKeyProvider = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn, SystemIds = SystemIds, Url = Url)
  
    __obj.asInstanceOf[SpekeKeyProvider]
  }
}

